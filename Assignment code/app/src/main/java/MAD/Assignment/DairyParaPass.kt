package MAD.Assignment

/**
 * Here is where the data is getting passed using the functions below
 */
interface DairyParaPass {
        fun onDataPass(page: Int)

        fun newEntry(date: String, entry: String)

        fun onDeletion()

        fun getEntries():List<DiaryDataStore>

        fun deleteEntry(date_id:String)

        fun containsPrimaryKey(date_id:String):Boolean

        fun loadAllByIds(date:String): List<DiaryDataStore>

}