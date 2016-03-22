package com.example.com1test.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyManage {
    //Explicitคือการประกาศตัวแปร
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writSqLiteDatabase, readSqLiteDatabase;


    public MyManage(Context context) {


        //Create & Connected SQLite
        myOpenHelper = new MyOpenHelper(context);
        writSqLiteDatabase = myOpenHelper.getWritableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();


    }//constructor

}//Main class
