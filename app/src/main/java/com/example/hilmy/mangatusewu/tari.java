package com.example.hilmy.mangatusewu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class tari extends AppCompatActivity {
    ImageButton guel, barong, topeng, inai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari);
        inai = findViewById(R.id.inai);
        guel = findViewById(R.id.guel);

    }
}
