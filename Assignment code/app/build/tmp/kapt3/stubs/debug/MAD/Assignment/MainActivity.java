package MAD.Assignment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"LMAD/Assignment/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LMAD/Assignment/DairyParaPass;", "()V", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "containsPrimaryKey", "", "date_id", "", "deleteEntry", "", "getEntries", "", "LMAD/Assignment/DiaryDataStore;", "loadAllByIds", "date", "newEntry", "entry", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDataPass", "page", "", "onDeletion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements MAD.Assignment.DairyParaPass {
    private androidx.viewpager2.widget.ViewPager2 viewPager;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * This function is used to change the view between each fragment
     * @param page - The page number that has to be switched also
     */
    @java.lang.Override()
    public void onDataPass(int page) {
    }
    
    /**
     * The function here is for adding a new diary entry to the database
     * @param date - The date selected to add entry
     * @param entry - The diary entry body is added here
     */
    @java.lang.Override()
    public void newEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String entry) {
    }
    
    /**
     * This function is used to delete all entries in database
     */
    @java.lang.Override()
    public void onDeletion() {
    }
    
    /**
     * This function is used to get all entries in the database
     * @return List<DiaryDataStore> - The list of diary entries stored
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<MAD.Assignment.DiaryDataStore> getEntries() {
        return null;
    }
    
    @java.lang.Override()
    public void deleteEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String date_id) {
    }
    
    /**
     * This function is used to delete an entry by selected ID
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<MAD.Assignment.DiaryDataStore> loadAllByIds(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    /**
     * This function is usd to check if an entry for selected date already exists in database
     */
    @java.lang.Override()
    public boolean containsPrimaryKey(@org.jetbrains.annotations.NotNull()
    java.lang.String date_id) {
        return false;
    }
}