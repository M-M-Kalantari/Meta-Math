package persian.googolplexian.metamath.MainFragments.Calculator.Notepad;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

import persian.googolplexian.metamath.DataBase.Class_DataBaseManager;
import persian.googolplexian.metamath.DataBase.Class_DataBaseTypes;

public class Class_Notepad {

    private int ID;
    private String Title;
    private String Number;
    private String DateTime;

    ///// Create Table /////
    public static String TABLE_NAME_N = "TABLE_Notepad";
    public static String COL_N_ID = "ID";
    public static String COL_N_Title = "Title";
    public static String COL_N_Number = "Number";
    public static String COL_N_DateTime = "DateTime";

    static String[] params = {
            TABLE_NAME_N,
            COL_N_ID, Class_DataBaseTypes.type_integer_auto,
            COL_N_Title, Class_DataBaseTypes.type_text,
            COL_N_Number, Class_DataBaseTypes.type_text,
            COL_N_DateTime, Class_DataBaseTypes.type_text,
    };

    public static String query_N = String.format("CREATE TABLE %s(%s %s , %s %s , %s %s, %s %s)", params);
    ////////////////////////


    ///// CRUD or ISUD /////
    public static long NotepadDataBaseInsert(Context context, Class_Notepad item) {
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL_N_Title, item.getTitle());
            contentValues.put(COL_N_Number, item.getNumber());
            contentValues.put(COL_N_DateTime, item.getDateTime());
            long Result = sqLiteDatabase.insert(TABLE_NAME_N, null, contentValues);
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!NotepadDataBaseInsert!!! ");
            return -1;
        }
    }

    @SuppressLint("Range")
    public static ArrayList<Class_Notepad> NotepadDataBaseSelectAll(Context context, String[] cols, String whereclause, String[] args) {
        ArrayList<Class_Notepad> Result = new ArrayList<>();
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            Cursor cursor = sqLiteDatabase.query(TABLE_NAME_N, cols, whereclause, args, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                for (int i = 0; i < cursor.getCount(); i++) {
                    Class_Notepad temp = new Class_Notepad();
                    temp.setID(cursor.getInt(cursor.getColumnIndex(COL_N_ID)));
                    temp.setTitle(cursor.getString(cursor.getColumnIndex(COL_N_Title)));
                    temp.setNumber(cursor.getString(cursor.getColumnIndex(COL_N_Number)));
                    temp.setDateTime(cursor.getString(cursor.getColumnIndex(COL_N_DateTime)));
                    Result.add(temp);
                    cursor.moveToNext();
                }
            }
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!NotepadDataBaseSelectAll!!! ");
            return Result;
        }
    }

    public static int NotepadDataBaseUpdate(Context context, String whereclause, String[] args, Class_Notepad NewItem) {
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL_N_Title, NewItem.getTitle());
            contentValues.put(COL_N_Number, NewItem.getNumber());
            contentValues.put(COL_N_DateTime, NewItem.getDateTime());
            int Result = sqLiteDatabase.update(TABLE_NAME_N, contentValues, whereclause, args);
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!NotepadDataBaseUpdate!!! ");
            return -1;
        }
    }

    public static int NotepadDataBaseDelete(Context context, String whereclause, String[] args) {
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            int Result = sqLiteDatabase.delete(TABLE_NAME_N, whereclause, args);
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!NotepadDataBaseDelete!!! ");
            return -1;
        }
    }

    public static int NotepadDataBaseDeleteAll(Context context) {
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            int Result = sqLiteDatabase.delete(TABLE_NAME_N, null, null);
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!NotepadDataBaseDeleteAll!!! ");
            return -1;
        }
    }
    ////////////////////////


    ///// Getter & Setter /////
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }
    ///////////////////////////
}
