package MAD.Assignment;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DiaryDataQuery_Impl implements DiaryDataQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DiaryDataStore> __insertionAdapterOfDiaryDataStore;

  private final SharedSQLiteStatement __preparedStmtOfDeleteNote;

  private final SharedSQLiteStatement __preparedStmtOfUpdateNote;

  private final SharedSQLiteStatement __preparedStmtOfNukeTable;

  public DiaryDataQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDiaryDataStore = new EntityInsertionAdapter<DiaryDataStore>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `DiaryDataStore` (`date`,`note_body`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DiaryDataStore value) {
        if (value.getDate() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getDate());
        }
        if (value.getNoteBody() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNoteBody());
        }
      }
    };
    this.__preparedStmtOfDeleteNote = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM DiaryDataStore WHERE date = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateNote = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE DiaryDataStore SET note_Body=? WHERE date=?";
        return _query;
      }
    };
    this.__preparedStmtOfNukeTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM DiaryDataStore";
        return _query;
      }
    };
  }

  @Override
  public void insert(final DiaryDataStore diaryDataStore) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDiaryDataStore.insert(diaryDataStore);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteNote(final String date_id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteNote.acquire();
    int _argIndex = 1;
    if (date_id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, date_id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteNote.release(_stmt);
    }
  }

  @Override
  public void updateNote(final String dateID, final String newNote) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateNote.acquire();
    int _argIndex = 1;
    if (newNote == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, newNote);
    }
    _argIndex = 2;
    if (dateID == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, dateID);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateNote.release(_stmt);
    }
  }

  @Override
  public void nukeTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfNukeTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfNukeTable.release(_stmt);
    }
  }

  @Override
  public List<DiaryDataStore> getAll() {
    final String _sql = "SELECT * FROM DiaryDataStore";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfNoteBody = CursorUtil.getColumnIndexOrThrow(_cursor, "note_body");
      final List<DiaryDataStore> _result = new ArrayList<DiaryDataStore>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DiaryDataStore _item;
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final String _tmpNoteBody;
        if (_cursor.isNull(_cursorIndexOfNoteBody)) {
          _tmpNoteBody = null;
        } else {
          _tmpNoteBody = _cursor.getString(_cursorIndexOfNoteBody);
        }
        _item = new DiaryDataStore(_tmpDate,_tmpNoteBody);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DiaryDataStore> loadAllByIds(final String date_id) {
    final String _sql = "SELECT * FROM DiaryDataStore WHERE date IN (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (date_id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, date_id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfNoteBody = CursorUtil.getColumnIndexOrThrow(_cursor, "note_body");
      final List<DiaryDataStore> _result = new ArrayList<DiaryDataStore>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DiaryDataStore _item;
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final String _tmpNoteBody;
        if (_cursor.isNull(_cursorIndexOfNoteBody)) {
          _tmpNoteBody = null;
        } else {
          _tmpNoteBody = _cursor.getString(_cursorIndexOfNoteBody);
        }
        _item = new DiaryDataStore(_tmpDate,_tmpNoteBody);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean containsPrimaryKey(final String date_id) {
    final String _sql = "SELECT count(*)!=0 FROM DiaryDataStore WHERE date IN (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (date_id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, date_id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
