package MAD.Assignment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"LMAD/Assignment/DiaryAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "mNumOfTabs", "", "(Landroidx/fragment/app/FragmentActivity;I)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "getItemCount", "app_debug"})
public final class DiaryAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final int mNumOfTabs = 0;
    
    public DiaryAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fa, int mNumOfTabs) {
        super(null);
    }
    
    /**
     * Used to get the number of pages
     */
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    /**
     * Assigning position to fragments
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
}