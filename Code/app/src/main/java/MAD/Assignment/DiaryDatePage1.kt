package MAD.Assignment

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.lifecycle.ViewModelProvider
import MAD.Assignment.databinding.DiarydateBinding
import java.util.*


class DiaryDatePage1 : Fragment(R.layout.diarydate), DatePickerDialog.OnDateSetListener{

    //Fragments are bound here to gain access to elements
    private var _binding : DiarydateBinding? = null
    private val binding get() = _binding!!

    //Variables for the Date
    var day = 0
    var month = 0
    var year = 0

    //Values saved for when date is needed to be displayed
    var savedDay = 0
    var savedMonth = 0
    var savedYear = 0

    //Date is inserted here
    lateinit var model: SharedViewModel
    //data is passed from here
    lateinit var dataPasser: DairyParaPass

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = DiarydateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        //Disabled confirm button until date is selected
        binding.confirmDate.alpha = .4f
        binding.confirmDate.isClickable = false

        //Provides a calender to allow client to select date
        binding.pickDateButton.setOnClickListener {
            getDateCalendar()
            DatePickerDialog(requireContext(), this, year, month, day).show()
            //below method is to confirm the date is picked
            pickDate()
        }
        //View entry button goes to diary entry log page
        binding.viewEntryButton.setOnClickListener {
            passData(2)
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
     *The function here is used to confirm the date
     */
    private fun pickDate(){
            binding.confirmDate.setOnClickListener {
                //Date is saved in ViewModel and the displayed on diaryentry page
                model.saveDate(savedDay, savedMonth, savedYear)
                binding.confirmDate.alpha = .4f
                binding.confirmDate.isClickable = false

                //Reset the date to nothing
                savedDay=0
                savedMonth=0
                savedYear=0

                //goes back to default values and goes to diary entry page
                binding.showDate.text="DD-MM-YY"
                binding.returnDate.text="No Date Selected"
                passData(1)
            }
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
     * Data is passed to datapasser
     */
    private fun passData(data: Int){
        dataPasser.onDataPass(data)
    }

    /**
     * This function will run once the date is selected
     *
     * @param datePick - The datepicker
     * @param year - the year selected
     * @param month - the month selected
     * @param day - the day selected
     */
    override fun onDateSet(datePick: DatePicker?, year: Int, month: Int, day: Int) {
        //the selected dates are saved here
        savedDay = day
        savedMonth = month+1
        savedYear = year

        //Disables confirm button
        binding.confirmDate.alpha = 1f;
        binding.confirmDate.isClickable = true;

        //Shows the selected date
        binding.returnDate.text="Date Selected"
        binding.showDate.text = "$savedDay-$savedMonth-$savedYear"
    }
}
