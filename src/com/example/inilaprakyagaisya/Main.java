package com.example.inilaprakyagaisya;
import java.sql.SQLOutput;
import java.util.*;
import com.example.inilaprakyagaisya.Features;

public class Main {

    public static void main(String[] args) {
	int input, jenisPinjaman, tahun;
    float hutang, angsuran, deposit, total = 0;
    Scanner sc = new Scanner(System.in);
    Features object = new Features();


        while (true) {

            System.out.print("Enter something to call the function: ");

            input = sc.nextInt();

            if (input == 1) {
                object.pinjaman();
            } else if (input == 2) {
                System.out.print("Masukkan hutang: ");
                hutang = sc.nextFloat();
                System.out.println("Masukkan banyak angsuran");
                angsuran = sc.nextFloat();

                hutang = object.sisahutangSetelahAngsuran(hutang, angsuran);

                System.out.println("Sisa hutang anda sekarang " + hutang);

            } else if (input == 3) {
                System.out.println("Kalkulator Keuntungan Test");
                System.out.print("Masukkan jumlah deposit: ");
                deposit = sc.nextFloat();
                System.out.print("Masukkan lama tahun: ");
                tahun = sc.nextInt();

                System.out.println("Deposit setelah " + tahun + " tahun adalah: IDR " + object.kalkulasikeuntunganDeposit(deposit, tahun));


            }
        }
    }
}
