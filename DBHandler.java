package com.example.truegg;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    public final Context mContext;
    DBHandler db;
    public DBHandler(Context context){
        super (context, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION);
        this.mContext = context;
      DBHandler db = new DBHandler(mContext);

    }


    @Override
    public void onCreate(SQLiteDatabase dba){



       db =  new DBHandler(mContext);






        dba.execSQL("CREATE TABLE " +
                  Constants.TABLE_NAME + "("
                + Constants.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Constants.FOOD_NAME + " TEXT, "
                + Constants.CALORIES + " INT,"
                + Constants.DATE_ADDED + " LONG," +
                ")");


        DBHandler db = new DBHandler(mContext);


    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " +Constants.TABLE_NAME);
        onCreate(db);

    }

    public void addFood(Foods foods){


        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(Constants.FOOD_NAME, foods.getFoodName());
        values.put(Constants.CALORIES, foods.getCalories());
        values.put(Constants.DATE_ADDED, foods.getRecDate());
        database.insert(Constants.TABLE_NAME, null, values);

    }


}
