package MAD.Assignment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020/H\u0002J\b\u00102\u001a\u00020+H\u0002J\b\u00103\u001a\u00020+H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020:H\u0016J$\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J*\u0010C\u001a\u00020+2\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010\'\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010F\u001a\u00020+H\u0016J\u001a\u0010G\u001a\u00020+2\u0006\u0010H\u001a\u00020<2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010I\u001a\u00020+2\u0006\u0010J\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010\'\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014\u00a8\u0006K"}, d2 = {"LMAD/Assignment/DiaryLogPage3;", "Landroidx/fragment/app/Fragment;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "_binding", "LMAD/Assignment/databinding/DiaryentrylogBinding;", "binding", "getBinding", "()LMAD/Assignment/databinding/DiaryentrylogBinding;", "dataPasser", "LMAD/Assignment/DairyParaPass;", "getDataPasser", "()LMAD/Assignment/DairyParaPass;", "setDataPasser", "(LMAD/Assignment/DairyParaPass;)V", "day", "", "getDay", "()I", "setDay", "(I)V", "model", "LMAD/Assignment/SharedViewModel;", "getModel", "()LMAD/Assignment/SharedViewModel;", "setModel", "(LMAD/Assignment/SharedViewModel;)V", "month", "getMonth", "setMonth", "savedDay", "getSavedDay", "setSavedDay", "savedMonth", "getSavedMonth", "setSavedMonth", "savedYear", "getSavedYear", "setSavedYear", "year", "getYear", "setYear", "clearNotes", "", "containsPrimaryKey", "", "date", "", "deleteEntry", "date_id", "displayFilters", "getDateCalendar", "getEntries", "", "LMAD/Assignment/DiaryDataStore;", "loadAllByIds", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "datePick", "Landroid/widget/DatePicker;", "onDestroy", "onViewCreated", "view", "passData", "data", "app_debug"})
public final class DiaryLogPage3 extends androidx.fragment.app.Fragment implements android.app.DatePickerDialog.OnDateSetListener {
    private MAD.Assignment.databinding.DiaryentrylogBinding _binding;
    public MAD.Assignment.SharedViewModel model;
    public MAD.Assignment.DairyParaPass dataPasser;
    private int day = 0;
    private int month = 0;
    private int year = 0;
    private int savedDay = 0;
    private int savedMonth = 1;
    private int savedYear = 0;
    
    public DiaryLogPage3() {
        super();
    }
    
    private final MAD.Assignment.databinding.DiaryentrylogBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final MAD.Assignment.SharedViewModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    MAD.Assignment.SharedViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final MAD.Assignment.DairyParaPass getDataPasser() {
        return null;
    }
    
    public final void setDataPasser(@org.jetbrains.annotations.NotNull()
    MAD.Assignment.DairyParaPass p0) {
    }
    
    public final int getDay() {
        return 0;
    }
    
    public final void setDay(int p0) {
    }
    
    public final int getMonth() {
        return 0;
    }
    
    public final void setMonth(int p0) {
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final void setYear(int p0) {
    }
    
    public final int getSavedDay() {
        return 0;
    }
    
    public final void setSavedDay(int p0) {
    }
    
    public final int getSavedMonth() {
        return 0;
    }
    
    public final void setSavedMonth(int p0) {
    }
    
    public final int getSavedYear() {
        return 0;
    }
    
    public final void setSavedYear(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * The function here is used for the date of the calender
     */
    private final void getDateCalendar() {
    }
    
    /**
     * This function is used to destroy the binding when activity ends
     */
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * the function here is used to attach datapasser to context
     * for DairyParaPass
     */
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * The function here is to delete date and diary entry
     */
    private final void deleteEntry(java.lang.String date_id) {
    }
    
    /**
     * Data is passed to datapasser
     */
    private final void passData(int data) {
    }
    
    /**
     * Function to get all the notes currently stored in the database
     * This function is used to get all the entries in the database
     * @return List<DiaryDataStore> - This is the list of all the diary entries from the database
     */
    private final java.util.List<MAD.Assignment.DiaryDataStore> getEntries() {
        return null;
    }
    
    private final boolean containsPrimaryKey(java.lang.String date) {
        return false;
    }
    
    private final java.util.List<MAD.Assignment.DiaryDataStore> loadAllByIds(java.lang.String date) {
        return null;
    }
    
    /**
     * The function here is to delete all entries in database
     */
    private final void clearNotes() {
    }
    
    /**
     * Function that runs when the date is selected
     *
     * @param datePick - The datepicker
     * @param year - the year selected
     * @param month - the month selected
     * @param day - the day selected
     */
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    android.widget.DatePicker datePick, int year, int month, int day) {
    }
    
    /**
     * the function below will only display the diary entry specified by selected date
     */
    private final void displayFilters() {
    }
}