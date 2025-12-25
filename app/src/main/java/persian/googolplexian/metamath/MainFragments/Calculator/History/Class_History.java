package persian.googolplexian.metamath.MainFragments.Calculator.History;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import persian.googolplexian.metamath.DataBase.Class_DataBaseManager;
import persian.googolplexian.metamath.DataBase.Class_DataBaseTypes;

public class Class_History {

    private int ID;
    private String Text;
    private String Result;
    private String DateTime;

    ///// Create Table /////
    public static String TABLE_NAME_H = "TABLE_History";
    public static String COL_H_ID = "ID";
    public static String COL_H_Text = "Text";
    public static String COL_H_Result = "Result";
    public static String COL_H_DateTime = "DateTime";

    static String[] params = {
            TABLE_NAME_H,
            COL_H_ID, Class_DataBaseTypes.type_integer_auto,
            COL_H_Text, Class_DataBaseTypes.type_text,
            COL_H_Result, Class_DataBaseTypes.type_text,
            COL_H_DateTime, Class_DataBaseTypes.type_text,
    };

    public static String query_H = String.format("CREATE TABLE %s(%s %s , %s %s , %s %s , %s %s)", params);
    ////////////////////////


    ///// CRUD or ISUD /////
    public static long HistoryDataBaseInsert(Context context, Class_History item) {
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL_H_Text, item.getText());
            contentValues.put(COL_H_Result, item.getResult());
            contentValues.put(COL_H_DateTime, item.getDateTime());
            long Result = sqLiteDatabase.insert(TABLE_NAME_H, null, contentValues);
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!HistoryDataBaseInsert!!! ");
            return -1;
        }
    }

    @SuppressLint("Range")
    public static ArrayList<Class_History> HistoryDataBaseSelectAll(Context context, String[] cols, String whereclause, String[] args) {
        ArrayList<Class_History> Result = new ArrayList<>();
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            Cursor cursor = sqLiteDatabase.query(TABLE_NAME_H, cols, whereclause, args, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                for (int i = 0; i < cursor.getCount(); i++) {
                    Class_History temp = new Class_History();
                    temp.setID(cursor.getInt(cursor.getColumnIndex(COL_H_ID)));
                    temp.setText(cursor.getString(cursor.getColumnIndex(COL_H_Text)));
                    temp.setResult(cursor.getString(cursor.getColumnIndex(COL_H_Result)));
                    temp.setDateTime(cursor.getString(cursor.getColumnIndex(COL_H_DateTime)));
                    Result.add(temp);
                    cursor.moveToNext();
                }
            }
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!HistoryDataBaseSelectAll!!! ");
            return Result;
        }
    }

    public static int HistoryDataBaseUpdate(Context context, String whereclause, String[] args, Class_History NewItem) {
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL_H_Text, NewItem.getText());
            contentValues.put(COL_H_Result, NewItem.getResult());
            contentValues.put(COL_H_DateTime, NewItem.getDateTime());
            int Result = sqLiteDatabase.update(TABLE_NAME_H, contentValues, whereclause, args);
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!HistoryDataBaseUpdate!!! ");
            return -1;
        }
    }

    public static int HistoryDataBaseDelete(Context context, String whereclause, String[] args) {
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            int Result = sqLiteDatabase.delete(TABLE_NAME_H, whereclause, args);
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!HistoryDataBaseDelete!!! ");
            return -1;
        }
    }

    public static int HistoryDataBaseDeleteAll(Context context) {
        try {
            SQLiteDatabase sqLiteDatabase = new Class_DataBaseManager(context).getWritableDatabase();
            int Result = sqLiteDatabase.delete(TABLE_NAME_H, null, null);
            sqLiteDatabase.close();
            return Result;
        } catch (SQLException e) {
            Log.e("Class SQLite :: ", e.getMessage() + " !!!HistoryDataBaseDeleteAll!!! ");
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

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    ///////////////////////////

}
