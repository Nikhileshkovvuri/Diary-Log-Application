package MAD.Assignment;

import java.lang.System;

/**
 * Here is where the data is getting passed using the functions below
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0007H&\u00a8\u0006\u0013"}, d2 = {"LMAD/Assignment/DairyParaPass;", "", "containsPrimaryKey", "", "date_id", "", "deleteEntry", "", "getEntries", "", "LMAD/Assignment/DiaryDataStore;", "loadAllByIds", "date", "newEntry", "entry", "onDataPass", "page", "", "onDeletion", "app_debug"})
public abstract interface DairyParaPass {
    
    public abstract void onDataPass(int page);
    
    public abstract void newEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String entry);
    
    public abstract void onDeletion();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<MAD.Assignment.DiaryDataStore> getEntries();
    
    public abstract void deleteEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String date_id);
    
    public abstract boolean containsPrimaryKey(@org.jetbrains.annotations.NotNull()
    java.lang.String date_id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<MAD.Assignment.DiaryDataStore> loadAllByIds(@org.jetbrains.annotations.NotNull()
    java.lang.String date);
}