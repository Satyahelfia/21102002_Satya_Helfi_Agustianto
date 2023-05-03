package com.satyahelfi.pbo.pertemuan5;

public class Barang {
    //Attribute
    String nama;
    int harga;

    //Constructor
    public Barang(){}

    public Barang(String nama, int hargaa){
        this.nama = nama;
        this.harga = harga;
    }

    //Methods
    public void showInfo(){
        System.out.println("Nama Barang : " + this.nama);
        System.out.println("Harga Barang : " + this.harga);
        System.out.println();
    }
}
