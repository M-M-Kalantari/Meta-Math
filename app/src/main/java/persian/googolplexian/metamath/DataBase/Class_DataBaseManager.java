package persian.googolplexian.metamath.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import persian.googolplexian.metamath.MainFragments.Calculator.History.Class_History;
import persian.googolplexian.metamath.MainFragments.Calculator.Notepad.Class_Notepad;

public class Class_DataBaseManager extends SQLiteOpenHelper {

    private static final String DatabaseName = "MetaMathDataBase.db";
    private static final int DatabaseVersion = 1;

    public Class_DataBaseManager(Context context) {
        super(context, DatabaseName, null, DatabaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Class_History.query_H);
        sqLiteDatabase.execSQL(Class_Notepad.query_N);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
