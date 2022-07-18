package com.example.examdawd.Database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Employee.class},version = 1)
public  abstract class  AppDatabase extends RoomDatabase {
    private static AppDatabase appDatabase;

    public static EmployeeDao userDao() {
        return null;
    }

    public static AppDatabase getAppDatabase(Context context){
        if (appDatabase == null){
            appDatabase = Room.databaseBuilder(context,AppDatabase.class,"employee.db").allowMainThreadQueries().build();
        }
        return appDatabase;
    }


    public abstract EmployeeDao EmployeeDao();
}


