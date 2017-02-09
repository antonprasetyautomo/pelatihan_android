package com.example.d2j_00.antonshopreceipt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReciptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipt);
        Intent intent =getIntent();
        int [] num_barang = new int[6];
        num_barang[0] = intent.getIntExtra("main.plasma.num", 0);
        num_barang[1] = intent.getIntExtra("main.microwave.num", 0);
        num_barang[2] = intent.getIntExtra("main.plasma.num", 0);
        num_barang[3] = intent.getIntExtra("main.microwave.num", 0);
        num_barang[4] = intent.getIntExtra("main.plasma.num", 0);
        num_barang[5] = intent.getIntExtra("main.microwave.num", 0);

   int [] harga_barang = new int[6];
        harga_barang[0] = 3000000;
        harga_barang[1] = 1500000;
        harga_barang[2] = 1000000;
        harga_barang[3] = 3500000;
        harga_barang[4] = 5000000;
        harga_barang[5] = 5000000;

        int total = 0;
        for(int i =0; i <6;i ++){
            total += harga_barang[i] * num_barang[i];
        }
        ((TextView) findViewById(R.id.plasma2_num))
                .setText(Integer.toString(num_barang[0]));
        ((TextView) findViewById(R.id.plasma2_total))
                .setText(Integer.toString(num_barang[0] * harga_barang[0]));

        ((TextView) findViewById(R.id.microwave2_total))
                .setText(Integer.toString(num_barang[1] * harga_barang[1]));



        ((TextView) findViewById(R.id.air_total))
                .setText(Integer.toString(num_barang[2] * harga_barang[2]));


    }
}
