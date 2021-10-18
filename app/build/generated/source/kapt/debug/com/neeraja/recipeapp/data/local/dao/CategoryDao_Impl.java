package com.neeraja.recipeapp.data.local.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.neeraja.recipeapp.data.model.db.Category;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CategoryDao_Impl implements CategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Category> __insertionAdapterOfCategory;

  public CategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCategory = new EntityInsertionAdapter<Category>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `categories` (`id`,`categoryName`,`thumbnail`,`description`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Category value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getCategoryName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCategoryName());
        }
        if (value.getThumbnail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnail());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
      }
    };
  }

  @Override
  public void insertAll(final List<Category> options) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCategory.insert(options);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Category> loadAll() {
    final String _sql = "SELECT * FROM categories";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryName");
      final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final List<Category> _result = new ArrayList<Category>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Category _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpCategoryName;
        _tmpCategoryName = _cursor.getString(_cursorIndexOfCategoryName);
        final String _tmpThumbnail;
        _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item = new Category(_tmpId,_tmpCategoryName,_tmpThumbnail,_tmpDescription);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
