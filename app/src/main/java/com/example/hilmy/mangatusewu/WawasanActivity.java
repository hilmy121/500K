package com.example.hilmy.mangatusewu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class WawasanActivity extends AppCompatActivity {
    CardView cvWawasan1,cvWawasan2,cvWawasan3,cvWawasan4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wawasan);
        cvWawasan1 = findViewById(R.id.cvWawasan1);
        cvWawasan2 = findViewById(R.id.cvWawasan2);
        cvWawasan3 = findViewById(R.id.cvWawasan3);
        cvWawasan4 = findViewById(R.id.cvWawasan4);

        cvWawasan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,Alat.class);
                startActivity(goToX);
               WawasanActivity.this.onDestroy();
            }
        });

        cvWawasan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,tari.class);
                startActivity(goToX);
                WawasanActivity.this.onDestroy();
            }
        });
        cvWawasan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,suku.class);
                startActivity(goToX);
                WawasanActivity.this.onDestroy();
            }
        });
        cvWawasan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,rumah.class);
                startActivity(goToX);
                WawasanActivity.this.onDestroy();
            }
        });
    }
}
