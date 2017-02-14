package com.example.sahso.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sahso on 14/02/2017.
 */

public class DataBaseClass extends SQLiteOpenHelper {
    public static final String DATA_NAME="user accounts_data" ;
    public static final String TABLE_NAME="user_accounts_table" ;
    public static final String COL1="nom" ;
    public static final String COL2="prenom" ;
    public static final String COL3="mail" ;
    public static final String COL4="password" ;
    public static final String COL5="travail" ;
    public static final String COL6="local" ;


    public DataBaseClass(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
