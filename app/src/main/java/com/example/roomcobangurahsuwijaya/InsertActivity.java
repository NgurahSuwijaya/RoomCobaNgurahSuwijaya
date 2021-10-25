package com.example.roomcobangurahsuwijaya;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class InsertActivity extends AppCompatActivity {

    EditText makanan, rasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        makanan = findViewById(R.id.editTextMakanan);
        rasa = findViewById(R.id.editTextRasa);
        Button saveButton = findViewById(R.id.buttonSave);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveMenu(makanan.getText().toString(), rasa.getText().toString());
            }
        });
    }

    private void saveMenu(String makanan, String rasa) {
        DatabaseJ db  = DatabaseJ.getDbInstance(this.getApplicationContext());

        Menu menu = new Menu(makanan,rasa);
        db.QueryMakananDao().insertMenu(menu);
        finish();

    }
}