package com.example.roomcobangurahsuwijaya;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Menu.class}, version  = 1)
public abstract class DatabaseJ extends RoomDatabase {

    public abstract QueryMakananDao QueryMakananDao();

    private static DatabaseJ INSTANCE;

    public static DatabaseJ getDbInstance(Context context) {

        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    DatabaseJ.class, "DB_NAME")
                    .allowMainThreadQueries()
                    .build();

        }
        return INSTANCE;
    }
}
