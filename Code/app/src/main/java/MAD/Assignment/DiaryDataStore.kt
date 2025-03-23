package MAD.Assignment

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * the data class is used to store the date and the diary entry
 * @param date - The date is stored here
 * @param noteBody - The diary entry is stored here
 */
@Entity
data class DiaryDataStore(
    @PrimaryKey val date: String,
    @ColumnInfo(name = "note_body") val noteBody: String?
)

/**
 * The toString method below is used to print the diary entry in diaryentrylog
 * @return - prints the string of for the diary entry
 */
{
    override fun toString(): String = "$date - $noteBody\n\n"

}
