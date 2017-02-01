package com.example.d2j_00.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class transaksi {
    private ArrayList<barang>listbarang = new ArrayList<>();

    public void addbarang (barang barang){
        this.listbarang.add(barang);
    }

    public int totalTransaksi(){
        int hasil = 0;
        for (int i=0; i<listbarang.size(); i++){
            hasil += listbarang.get(i).getHarga();
        }
        return hasil;
    }

    public String printTransaksi(){
        String text = "barang yang di beli di transaksi ini adalah : \n";
        text +="-----------------------------------------------\n";
        for (int i = 0; i<listbarang.size(); i++){
            text += listbarang.get(i).toString();
        }
        text += "---------------------------------------\n";
        text += "total pembelian" +totalTransaksi()+"\n";
        text += "---------------------------------------\n";
        return text;
    }

    public double averageTransaksi(){
        double hasil = 0;
        for (int i=0; i< listbarang.size(); i++){
            hasil +=listbarang.get(i).getHarga();
        }
        hasil = hasil/listbarang.size();

        //isi dengan kode untuk mendapatkan rata2 dari transaksi

        return hasil;
    }

    public String maxbarang(){
        barang max;
        // isi dengan kode untuk mencari barang dengan harga termahal
        // kemudian masukan nama barangnya pada variabel dibawah ini
        max= listbarang.get(0);
        for (int i = 0; i<listbarang.size(); i++){
            if (listbarang.get(i).getHarga()>max.getHarga()){
                max = listbarang.get(i);
            }
        }

        String namabarang=max.getNama();
        String text = "\nbarang termahal pada transaksi adalah"+namabarang;

        return text;
    }
}
