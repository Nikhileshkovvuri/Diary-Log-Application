package MAD.Assignment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import MAD.Assignment.databinding.DiaryentryBinding


class DiaryEntryPage2 : Fragment() {

    //Variables for binding, viewModel and dataPasser here
    private var _binding : DiaryentryBinding? = null
    private val binding get() = _binding!!
    lateinit var model: SharedViewModel
    lateinit var dataPasser: DairyParaPass

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = DiaryentryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        model.date.observe(viewLifecycleOwner, Observer {
            //Shows the observed date
            binding.dateText.text= it.toString()
        })
        //Add Entry button actions here
        binding.addEntryButton.setOnClickListener {

            //This checks if there is text in the entryDetail
            if (binding.entryDetail.text.isEmpty()) {
                //If there is no input
                //Toast message if the entry is empty
                Toast.makeText(activity, "Your Diary Entry cannot be empty!", Toast.LENGTH_LONG).show()

            }else{
                //If there is an input
                //takes date and diary entry to newNote class
                newEntry(binding.dateText.text.toString(), binding.entryDetail.text.toString())
                binding.entryDetail.setText("")
                //Change screen to diaryentrylog
                passData(2)
            }
        }
        binding.backButton.setOnClickListener {
            //Deletes the text input by client and changes view to diarydate
            binding.entryDetail.setText("")
            passData(0)
        }
        binding.clearEntryButton.setOnClickListener {
            //Clear button used to delete input text and show toast message
            binding.entryDetail.setText("")
            Toast.makeText(activity, "Diary Entry Cleared", Toast.LENGTH_LONG).show()
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
     * This function adds diary entry into the database
     * @param date - selected date
     * @param entry - entered DiaryDataStore
     */
    private fun newEntry(date:String, entry:String){
        dataPasser.newEntry(date, entry)
    }

}