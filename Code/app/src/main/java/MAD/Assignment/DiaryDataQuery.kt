package MAD.Assignment

import androidx.room.*

/**
 * Here are database interactions needed for functioning
 */
@Dao
interface DiaryDataQuery{

    //Query to get list of all diary entries
    @Query("SELECT * FROM DiaryDataStore")
    fun getAll(): List<DiaryDataStore>

    //For inserting a new diaryDataStore
    @Insert
    fun insert(diaryDataStore:DiaryDataStore)

    //Getting entry from a selected date for filtered function
    @Query("SELECT * FROM DiaryDataStore WHERE date IN (:date_id)")
    fun loadAllByIds(date_id: String): List<DiaryDataStore>

    //Delete filtered entry from the database
    @Query("DELETE FROM DiaryDataStore WHERE date = :date_id")
    fun deleteNote(date_id: String);

    //The query used here is to find diary entry of specified date
    @Query("SELECT count(*)!=0 FROM DiaryDataStore WHERE date IN (:date_id)")
    fun containsPrimaryKey(date_id: String): Boolean

    @Query("UPDATE DiaryDataStore SET note_Body=:newNote WHERE date=:dateID")
    fun updateNote(dateID: String, newNote: String)

    //Delete all diary entries stored in database
    @Query("DELETE FROM DiaryDataStore")
    fun nukeTable()
}