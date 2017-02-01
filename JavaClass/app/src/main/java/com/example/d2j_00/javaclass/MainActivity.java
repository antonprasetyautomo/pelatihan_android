package com.example.d2j_00.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public barang [] arrBarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);

        showString = "Manipulasi class java android";
        addSeparate();

        initBarang();
     //   showString+= arrBarang[5].toString();
     //   addSeparate();
     //   showString += arrBarang[1].toString();
        showText.setText(showString);

            transaksi trans1 = new transaksi();
            trans1.addbarang(arrBarang[3]);
        trans1.addbarang(arrBarang[6]);
        trans1.addbarang(arrBarang[9]);
        showString += trans1.printTransaksi();
        showString += "rata-rata harga barang yang di beli"+
                trans1.averageTransaksi();
        showString += trans1.maxbarang();
        showText.setText(showString);

    }

    public void addSeparate(){
        showString+= "\n-----------------------\n";
    }

    public void initBarang(){
        arrBarang[0]= new barang("laptop", 1, 7000000);
        arrBarang[1]= new barang("laptop", barang.ELEKTRONIK, 2500000);
        arrBarang[2]= new barang("Monitor", barang.ELEKTRONIK, 1500000);
        arrBarang[3]= new barang("Scanner", barang.ELEKTRONIK, 1000000);
        arrBarang[4]= new barang("Meja",barang.Non_ELECTRONIK, 700000);
        arrBarang[5]= new barang("Mouse", barang.ELEKTRONIK, 200000);
        arrBarang[6]= new barang("Kursi", barang.Non_ELECTRONIK, 2000000);
        arrBarang[7]= new barang("RAM", barang.ELEKTRONIK, 1000000);
        arrBarang[8]= new barang("Almari", barang.Non_ELECTRONIK, 10000000);
        arrBarang[9]= new barang("Pintu", barang.Non_ELECTRONIK, 15000000);
    }
}
