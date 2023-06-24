package com.example.ALI.DWAJI;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_sqlite extends SQLiteOpenHelper {
    public static final String DBname ="data,db";

    public DB_sqlite(@Nullable Context context) {
        super(context, DBname, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table customer (customer_id INTEGER PRIMARY KEY AUTOINCREMENT,customer_name ,customer_product) ");
        db.execSQL("create table PRODUCT ( product_id INTEGER PRIMARY KEY AUTOINCREMENT,product_name,product_price )");
        db.execSQL("create table resource(resource_id INTEGER PRIMARY KEY AUTOINCREMENT ,resource_name,resorce_product )");
        db.execSQL("create table sales(product_id ,product_name,product_price)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS customer");
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS PRODUCT");
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS resource");
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS sales");
        onCreate(db);






    }
}
