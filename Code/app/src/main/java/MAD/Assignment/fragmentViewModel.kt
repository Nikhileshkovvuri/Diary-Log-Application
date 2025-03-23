package MAD.Assignment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

/**
 * ViewModel class used for storing and observing the date from page 1 fragment to page 2 using LiveData
 */
class SharedViewModel: ViewModel() {

    private var _date = MutableLiveData("")
    val date: LiveData<String> = _date

    /**
     * This function is used for saving the data in a suitable format to the liveData variable
     * @param newDay - Day being added here
     * @param newMonth - Month being added here
     * @param newYear - Year being added here
     */
    fun saveDate(newDay: Int, newMonth:Int, newYear:Int){
        _date.value = ("$newDay-$newMonth-$newYear")
    }
}
