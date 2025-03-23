package MAD.Assignment;

import java.lang.System;

/**
 * The database here is used to store the diary entries by the client
 */
@androidx.room.Database(entities = {MAD.Assignment.DiaryDataStore.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"LMAD/Assignment/DiaryDatabase;", "Landroidx/room/RoomDatabase;", "()V", "noteDao", "LMAD/Assignment/DiaryDataQuery;", "Companion", "app_debug"})
public abstract class DiaryDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final MAD.Assignment.DiaryDatabase.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static MAD.Assignment.DiaryDatabase INSTANCE;
    
    public DiaryDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract MAD.Assignment.DiaryDataQuery noteDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"LMAD/Assignment/DiaryDatabase$Companion;", "", "()V", "INSTANCE", "LMAD/Assignment/DiaryDatabase;", "getINSTANCE", "()LMAD/Assignment/DiaryDatabase;", "setINSTANCE", "(LMAD/Assignment/DiaryDatabase;)V", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final MAD.Assignment.DiaryDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.Nullable()
        MAD.Assignment.DiaryDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final MAD.Assignment.DiaryDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}