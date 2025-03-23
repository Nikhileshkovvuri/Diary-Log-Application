package MAD.Assignment

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


/**
 * The database here is used to store the diary entries by the client
 */
@Database(entities = [DiaryDataStore::class], version = 1)
abstract class DiaryDatabase : RoomDatabase() {
    abstract fun noteDao(): DiaryDataQuery //Database Access Object for database interactions
    companion object{
        var INSTANCE: DiaryDatabase?=null
        fun getInstance(context: Context):DiaryDatabase
        {
            if(INSTANCE==null){ //If an instance of this class doesn't already exist
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    DiaryDatabase::class.java, "note_database"   //Name of database
                ).allowMainThreadQueries().build()
            }
            return INSTANCE!!   //Return this instance
        }
    }
}
