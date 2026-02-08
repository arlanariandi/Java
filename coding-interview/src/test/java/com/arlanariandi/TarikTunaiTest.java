package com.arlanariandi;

import org.junit.jupiter.api.Test;

public class TarikTunaiTest {

    public int tarikTunai(int saldoAwal, int jumlahTarik) {
        if (saldoAwal <= 0) {
            System.out.println("Saldo awal tidak valid.");
            return saldoAwal;
        }

        if (jumlahTarik <= 0) {
            System.out.println("Jumlah tarik tidak valid.");
            return saldoAwal;
        }

        if (jumlahTarik > saldoAwal) {
            System.out.println("Saldo tidak mencukupi untuk tarik tunai.");
            return saldoAwal;
        }

        if (jumlahTarik > 5000000) {
            System.out.println("Jumlah tarik melebihi batas maksimum per transaksi.");
            return saldoAwal;
        }

        if (saldoAwal - jumlahTarik < 50000) {
            System.out.println("Saldo akhir tidak boleh kurang dari saldo minimum Rp50.000.");
            return saldoAwal;
        }

        return saldoAwal - jumlahTarik;
    }

    @Test
    void atm() {
        int saldoAwal = 100000;
        int jumlahTarik = 25000;
        int saldoAkhir = tarikTunai(saldoAwal, jumlahTarik);
        System.out.println("Saldo akhir setelah tarik tunai: " + saldoAkhir);
    }
}
