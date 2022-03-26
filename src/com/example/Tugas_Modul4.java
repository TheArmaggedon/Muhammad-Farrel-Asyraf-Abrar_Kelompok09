package com.example;

import java.sql.SQLOutput;
import java.util.*;
import com.example.feature;

public class Tugas_Modul4 {
    public static void main(String[] args) {
        int input, jenisPinjaman, tahun;
        float hutang, angsuran, deposit, total = 0;
        Scanner sc = new Scanner(System.in);
        feature object = new feature();

        object.awalan();
        System.out.print("Masukkan angka untuk melanjutkan: ");
        while (true) {


            input = sc.nextInt();

            if (input == 1) {
                object.pinjaman();
                System.out.println("Masukkan Jumlah Pinjaman yang akan diajukan : ");
                jenisPinjaman = sc.nextInt();
                if (jenisPinjaman == 1){
                    System.out.println("Apakah kamu yakin akan meminjam 2 juta? (y/t) : ");
                }
            } else if (input == 2) {
                System.out.print("Masukkan hutang: ");
                hutang = sc.nextFloat();
                System.out.print("Masukkan banyak angsuran: ");
                angsuran = sc.nextFloat();

                hutang = object.sisahutangSetelahAngsuran(hutang, angsuran);

                System.out.println("Sisa hutang anda sekarang " + hutang);
                if (hutang == 0){
                    System.out.println("HUTANG ANDA SUDAH LUNAS!!");
                }
                return;

            } else if (input == 3) {
                System.out.println("=============================");
                System.out.println("KALKULATOR KEUNTUNGAN DEPOSIT");
                System.out.println("=============================");
                object.keuntunganDeposit();
                System.out.print("Masukkan jumlah deposit: ");
                deposit = sc.nextFloat();
                System.out.print("Masukkan lama tahun: ");
                tahun = sc.nextInt();

                System.out.println("Deposit setelah " + tahun + " tahun adalah: IDR " + object.kalkulasikeuntunganDeposit(deposit, tahun));

                return;
            }
        }
    }
}
