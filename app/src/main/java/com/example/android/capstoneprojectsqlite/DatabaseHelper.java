package com.example.android.capstoneprojectsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TABLE_NAME = "Users";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "username";
    private static final String COL_3 = "password";

    DatabaseHelper(@Nullable Context context){
        super(context, "user_login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE "+TABLE_NAME+" ("
                +COL_1+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +COL_2+" TEXT, "
                +COL_3+" TEXT)";

        db.execSQL((createTableStatement));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // a method to add a user to the database.
    public boolean addUser (UserModel userModel){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, userModel.getUsername());
        contentValues.put(COL_3, userModel.getPassword());

        long result = db.insert(TABLE_NAME,null, contentValues);

        if (result == -1){
            return false;
        }
        else {
            return true;
        }
    }

    // checking if the password matches the one for the username in the database
    public boolean checkPassword(String username, String password){

        boolean match = false;

        String queryString = "SELECT * FROM " + TABLE_NAME + " WHERE " + COL_2 + " = '" + username + "'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToFirst()){

            String logged_password = cursor.getString(2);

            if (password.equals(logged_password)){
                match = true;
            }
        }

        cursor.close();
        db.close();
        return match;
    }
}
