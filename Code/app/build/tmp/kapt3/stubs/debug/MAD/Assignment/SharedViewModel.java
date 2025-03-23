package MAD.Assignment;

import java.lang.System;

/**
 * ViewModel class used for storing and observing the date from page 1 fragment to page 2 using LiveData
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"LMAD/Assignment/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_date", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "date", "Landroidx/lifecycle/LiveData;", "getDate", "()Landroidx/lifecycle/LiveData;", "saveDate", "", "newDay", "", "newMonth", "newYear", "app_debug"})
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.String> _date;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> date = null;
    
    public SharedViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDate() {
        return null;
    }
    
    /**
     * Function for saving the data in a suitable format to the liveData variable
     * @param newDay - Day being added
     * @param newMonth - Month being added
     * @param newYear - Year being added
     */
    public final void saveDate(int newDay, int newMonth, int newYear) {
    }
}