package MAD.Assignment

import MAD.Assignment.databinding.DiaryentrylogBinding
import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.text.method.ScrollingMovementMethod
import android.widget.DatePicker
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import java.util.*


class DiaryLogPage3 : Fragment(), DatePickerDialog.OnDateSetListener {

    private var _binding : DiaryentrylogBinding? = null
    private val binding get() = _binding!!
    lateinit var model: SharedViewModel
    lateinit var dataPasser: DairyParaPass

    //date variables
    var day = 0
    var month = 0
    var year = 0

    //values for date saved here
    var savedDay = 0
    var savedMonth = 1
    var savedYear = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = DiaryentrylogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        //Scroll wheel option if there are several diary entries
        binding.entryLogText.movementMethod = ScrollingMovementMethod()

        val notes = getEntries()
        //Below brackets and colons are removed when printing diary entry
        val notesString = notes.toString().replace("[", "").replace("]", "").replace(",","").trim()
        binding.entryLogText.text=notesString
        //Refresh button actions below
        binding.refreshButton.setOnClickListener {
            //deleteDateButton is active when diary entry is filtered
            binding.deleteDateButton.alpha = .4f
            //Client may refresh when on filter, so deleteDateButton is set to not clickable if this happens
            binding.deleteDateButton.isClickable = false
            //Toast message here for client
            Toast.makeText(activity, "Refreshing Entries...", Toast.LENGTH_LONG).show()
            //Here the entries are changed to a printable form
            val notes = getEntries()
            var notesString = notes.toString()
            if (notesString == "[]"){
                //If no entries are found
                binding.entryLogText.text="No Entries Found"
            }else{
                notesString = notesString.replace("[", "").replace("]", "").replace(",","").trim()
                binding.entryLogText.text=notesString
            }
        }
        //Clear diary entry button below
        binding.deleteAllEntry.setOnClickListener {
            binding.deleteDateButton.alpha = .4f
            binding.deleteDateButton.isClickable = false
            // Method below delete all diary entries in the database
            clearNotes()
            //Shows message to tell client
            binding.entryLogText.text="All Entries Deleted"
            //toast message to tell client
            Toast.makeText(activity, "All entries have been deleted", Toast.LENGTH_SHORT).show()
        }
        binding.dateFilterButton.setOnClickListener {
            getDateCalendar()
            DatePickerDialog(requireContext(), this, year, month, day).show()
        }
        //New Diary Entry button
        binding.newEntryButton.setOnClickListener {
            binding.deleteDateButton.alpha = .4f
            binding.deleteDateButton.isClickable = false
            //goes back to diarydate page
            passData(0)
        }
    }

    /**
     *The function here is used for the date of the calender
     */
    private fun getDateCalendar(){
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
    }

    /**
     * This function is used to destroy the binding when activity ends
     */
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    /**
     * the function here is used to attach datapasser to context
     * for DairyParaPass
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        dataPasser = context as DairyParaPass
    }

    /**
     * The function here is to delete date and diary entry
     */
     private fun deleteEntry(date_id: String) {
        dataPasser.deleteEntry(date_id)
    }

    /**
     * Data is passed to datapasser
     */
    private fun passData(data: Int){
        dataPasser.onDataPass(data)
    }

    /**
     * Function to get all the notes currently stored in the database
     * This function is used to get all the entries in the database
     * @return List<DiaryDataStore> - This is the list of all the diary entries from the database
     */
    private fun getEntries():List<DiaryDataStore>{
        return dataPasser.getEntries()
    }

    private fun containsPrimaryKey(date: String): Boolean {
        return dataPasser.containsPrimaryKey(date)
    }

    private fun loadAllByIds(date: String): List<DiaryDataStore> {
        return dataPasser.loadAllByIds(date)
    }

    /**
     * The function here is to delete all entries in database
     */
    private fun clearNotes(){
        dataPasser.onDeletion()
    }

    /**
     * Function that runs when the date is selected
     *
     * @param datePick - The datepicker
     * @param year - the year selected
     * @param month - the month selected
     * @param day - the day selected
     */
    override fun onDateSet(datePick: DatePicker?, year: Int, month: Int, day: Int) {
        savedDay = day
        savedMonth = month+1
        savedYear = year
        displayFilters()
    }

    /**
     * the function below will only display the diary entry specified by selected date
     */
    private fun displayFilters(){
        var dateFilter = "$savedDay-$savedMonth-$savedYear"

        //Checks if there are any entries for the specified date
        if (containsPrimaryKey(dateFilter)){
            //If DiaryDataStore found
            //Toast message telling client that entry has been found
            Toast.makeText(activity, "Diary Entry for $dateFilter have been found", Toast.LENGTH_SHORT).show()
            //Gets entries for this date
            val notesDate = loadAllByIds(dateFilter)
            val notesString = notesDate.toString().replace("[", "").replace("]", "").replace(",","").trim()
            //Display the entries
            binding.entryLogText.text=notesString
            binding.deleteDateButton.alpha = 1f
            //delete button active here
            binding.deleteDateButton.isClickable = true
            binding.deleteDateButton.setOnClickListener {
                //Disable delete button so the client cant edit
                binding.deleteDateButton.alpha = .4f
                binding.deleteDateButton.isClickable = false
                deleteEntry(dateFilter)
                binding.entryLogText.text="No entries for $dateFilter have been found"
                Toast.makeText(activity, "Entries for $dateFilter have been deleted", Toast.LENGTH_SHORT).show()

            }

        }else if(!containsPrimaryKey(dateFilter)) {
            // Error message when no entry is found
            binding.entryLogText.text="No Entry Found"
            Toast.makeText(activity, "No entries have been found for $dateFilter", Toast.LENGTH_SHORT).show()
        }
    }
}