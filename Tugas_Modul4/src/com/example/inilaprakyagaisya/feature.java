/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inilaprakyagaisya;

public class feature {
    public void judul(){
        System.out.println("=======SELAMAT DATANG DI PROGRAM KOPERASI SIMPAN PINJAM=======");
        System.out.println("");
    }
    public void awalan(){
        System.out.println("ANGKA KUNCI:");
        System.out.println("1. Peminjaman");
        System.out.println("2. Setoran");
        System.out.println("3. Cek Deposit");
    }
    public void pinjaman() {

        System.out.println("========Jenis Pinjaman=========");
        System.out.println("1. IDR 2 Juta");
        System.out.println("2. IDR 4 Juta");
        System.out.println("3. IDR 8 Juta");

    }

    public void keuntunganDeposit() {

        System.out.println("Keuntungan deposit per tahun = 2.5%");

    }

    public float kalkulasikeuntunganDeposit(float deposit, int tahun) {

        final float persentaseKeuntungan = 1.025f;
        float pengaliKeuntungantotal = 1;
        float keuntunganTotal;

        for (int i = 1; i <= tahun; i++) {

            pengaliKeuntungantotal *= persentaseKeuntungan;


        }

        keuntunganTotal = deposit * pengaliKeuntungantotal;

        return keuntunganTotal;
    }

    public float deposit(float Deposit) {
        float hasilAkhir = 0;
        hasilAkhir += Deposit;

        return hasilAkhir;

    }


    public float sisahutangSetelahAngsuran(float hutang, float angsuran) {

        hutang = hutang - angsuran;

        return hutang;
    }
}