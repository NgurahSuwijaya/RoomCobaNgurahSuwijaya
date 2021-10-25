package com.example.roomcobangurahsuwijaya;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QueryMakananDao {

    @Query("SELECT * FROM Menu")
    List<Menu> getAllMenu();

    @Insert
    void insertMenu(Menu... menus);

    @Delete
    void delete(Menu menu);
}
