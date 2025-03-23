package MAD.Assignment;

import java.lang.System;

/**
 * Here are database interactions needed for functioning
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\nH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u000e\u001a\u00020\u0007H\'J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\'\u00a8\u0006\u0012"}, d2 = {"LMAD/Assignment/DiaryDataQuery;", "", "containsPrimaryKey", "", "date_id", "", "deleteNote", "", "getAll", "", "LMAD/Assignment/DiaryDataStore;", "insert", "diaryDataStore", "loadAllByIds", "nukeTable", "updateNote", "dateID", "newNote", "app_debug"})
public abstract interface DiaryDataQuery {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM DiaryDataStore")
    public abstract java.util.List<MAD.Assignment.DiaryDataStore> getAll();
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    MAD.Assignment.DiaryDataStore diaryDataStore);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM DiaryDataStore WHERE date IN (:date_id)")
    public abstract java.util.List<MAD.Assignment.DiaryDataStore> loadAllByIds(@org.jetbrains.annotations.NotNull()
    java.lang.String date_id);
    
    @androidx.room.Query(value = "DELETE FROM DiaryDataStore WHERE date = :date_id")
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull()
    java.lang.String date_id);
    
    @androidx.room.Query(value = "SELECT count(*)!=0 FROM DiaryDataStore WHERE date IN (:date_id)")
    public abstract boolean containsPrimaryKey(@org.jetbrains.annotations.NotNull()
    java.lang.String date_id);
    
    @androidx.room.Query(value = "UPDATE DiaryDataStore SET note_Body=:newNote WHERE date=:dateID")
    public abstract void updateNote(@org.jetbrains.annotations.NotNull()
    java.lang.String dateID, @org.jetbrains.annotations.NotNull()
    java.lang.String newNote);
    
    @androidx.room.Query(value = "DELETE FROM DiaryDataStore")
    public abstract void nukeTable();
}