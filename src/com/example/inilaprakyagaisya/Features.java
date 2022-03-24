package com.example.inilaprakyagaisya;

public class Features {




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
