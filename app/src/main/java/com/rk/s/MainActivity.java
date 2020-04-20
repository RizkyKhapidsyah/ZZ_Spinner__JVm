package com.rk.s;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner Sp_1_IDJAVA;
    TextView TV_3_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Inisialisasi Spinner dan Variabel */
        Sp_1_IDJAVA = findViewById(R.id.Sp_1_IDXML);
        TV_3_IDJAVA = findViewById(R.id.TV_3_IDXML);
        String[] NegaraNegara = {"Indonesia", "Malaysia", "Singapore", "Iraq", "Arab Saudi", "Kanada"};

        ArrayAdapter<String> Pencocok = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, NegaraNegara);
        Sp_1_IDJAVA.setAdapter(Pencocok);

        /* On item select event handling */
        Sp_1_IDJAVA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        TV_3_IDJAVA.setText("Jakarta");
                        break;
                    case 1:
                        TV_3_IDJAVA.setText("Kuala Lumpur");
                        break;
                    case 2:
                        TV_3_IDJAVA.setText("Singapore City");
                        break;
                    case 3:
                        TV_3_IDJAVA.setText("Baghdad");
                        break;
                    case 4:
                        TV_3_IDJAVA.setText("Riyadh");
                        break;
                    case 5:
                        TV_3_IDJAVA.setText("Ottawa");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                /* Biarkan Kosong */
            }
        });

    }
}
