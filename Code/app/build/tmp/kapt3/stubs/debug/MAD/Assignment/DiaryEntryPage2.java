package MAD.Assignment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0015H\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006*"}, d2 = {"LMAD/Assignment/DiaryEntryPage2;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "LMAD/Assignment/databinding/DiaryentryBinding;", "binding", "getBinding", "()LMAD/Assignment/databinding/DiaryentryBinding;", "dataPasser", "LMAD/Assignment/DairyParaPass;", "getDataPasser", "()LMAD/Assignment/DairyParaPass;", "setDataPasser", "(LMAD/Assignment/DairyParaPass;)V", "model", "LMAD/Assignment/SharedViewModel;", "getModel", "()LMAD/Assignment/SharedViewModel;", "setModel", "(LMAD/Assignment/SharedViewModel;)V", "newEntry", "", "date", "", "entry", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "passData", "data", "", "app_debug"})
public final class DiaryEntryPage2 extends androidx.fragment.app.Fragment {
    private MAD.Assignment.databinding.DiaryentryBinding _binding;
    public MAD.Assignment.SharedViewModel model;
    public MAD.Assignment.DairyParaPass dataPasser;
    
    public DiaryEntryPage2() {
        super();
    }
    
    private final MAD.Assignment.databinding.DiaryentryBinding getBinding() {
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
     * Data is passed to datapasser
     */
    private final void passData(int data) {
    }
    
    /**
     * This function adds diary entry into the database
     * @param date - selected date
     * @param entry - entered DiaryDataStore
     */
    private final void newEntry(java.lang.String date, java.lang.String entry) {
    }
}