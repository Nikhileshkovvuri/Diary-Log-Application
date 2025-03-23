package MAD.Assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity(), DairyParaPass{
    private lateinit var viewPager : ViewPager2
    //ViewPager here is used for setting view

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toolbar is placed at top of page for the fragments
        val toolbar = findViewById<Toolbar>(R.id.toolsBar)
        setSupportActionBar(toolbar)

        viewPager = findViewById<ViewPager2>(R.id.pagerView)

        viewPager.isUserInputEnabled = false
        val adapter = DiaryAdapter(this,3)
        viewPager.adapter = adapter
        //Wipe the database on start up
        DiaryDatabase.getInstance(this@MainActivity).noteDao().nukeTable()
          }

    /**
     * This function is used to change the view between each fragment
     * @param page - The page number that has to be switched also
     */
    override fun onDataPass(page: Int) {
        viewPager.currentItem = page
    }

    /**
     * The function here is for adding a new diary entry to the database
     * @param date - The date selected to add entry
     * @param entry - The diary entry body is added here
     */
    override fun newEntry(date: String, entry: String) {
        val newN = DiaryDataStore(date, entry)

        //Here it is checked if a entry for date selected exists
        if(!containsPrimaryKey(date)){
            //If entry doesn't exist, create new entry and add it to the database
            //shows toast message also
            DiaryDatabase.getInstance(this@MainActivity).noteDao().insert(newN)
            Toast.makeText(this@MainActivity, "New entry for $date added, please refresh entry list", Toast.LENGTH_LONG).show()
        }
        else {

            //If entry for this date already exists
            // Also add to existing entry
            val noteFound = DiaryDatabase.getInstance(this@MainActivity).noteDao().loadAllByIds(date)
            //Remove the date from the not found.
            // Else entry toString would contains 2 same dates
            val notesString = noteFound.toString().drop(date.length+3).replace("[", "").replace("]", "").replace(",","").trim()
            val updatedNote = ("$notesString. $entry")
            DiaryDatabase.getInstance(this@MainActivity).noteDao().updateNote(date, updatedNote)
            Toast.makeText(this@MainActivity, "DiaryDataStore for $date already exists, adding to your entry ...", Toast.LENGTH_LONG).show()

        }
    }

    /**
     * This function is used to delete all entries in database
     */
    override fun onDeletion()
    {
        DiaryDatabase.getInstance(this@MainActivity).noteDao().nukeTable()
    }

    /**
     * This function is used to get all entries in the database
     * @return List<DiaryDataStore> - The list of diary entries stored
     */
    override fun getEntries(): List<DiaryDataStore> {
        return DiaryDatabase.getInstance(this@MainActivity).noteDao().getAll()
    }

    override fun deleteEntry(date_id: String) {
        DiaryDatabase.getInstance(this@MainActivity).noteDao().deleteNote(date_id)
    }


    /**
     * This function is used to delete an entry by selected ID
     */
    override fun loadAllByIds(date: String): List<DiaryDataStore> {
        return DiaryDatabase.getInstance(this@MainActivity).noteDao().loadAllByIds(date)
    }

    /**
     * This function is usd to check if an entry for selected date already exists in database
     */
    override fun containsPrimaryKey(date_id:String): Boolean {
        return DiaryDatabase.getInstance(this@MainActivity).noteDao().containsPrimaryKey(date_id)
    }


}