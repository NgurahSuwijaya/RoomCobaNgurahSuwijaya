package com.example.roomcobangurahsuwijaya;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Menu")
public class Menu {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "makanan")
    public String makanan;

    @ColumnInfo(name = "rasa")
    public String rasa;

    public Menu(int id, String makanan, String rasa){
        this.makanan= makanan;
        this.rasa = rasa;
        this.id = id;
    }
    @Ignore
    public Menu(String makanan, String rasa){
        this.makanan=makanan;
        this.rasa=rasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
