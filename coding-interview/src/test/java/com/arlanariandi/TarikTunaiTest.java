package com.arlanariandi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TarikTunaiTest {

    public boolean tarikTunai(int saldoAwal, int jumlahTarik) {
        if (saldoAwal <= 0) {
            System.out.println("Saldo awal tidak valid. Saldo: " + saldoAwal);
            return false;
        }

        if (jumlahTarik <= 0) {
            System.out.println("Jumlah tarik tidak valid");
            return false;
        }

        if (jumlahTarik > saldoAwal) {
            System.out.println("Saldo tidak mencukupi untuk tarik tunai");
            return false;
        }

        if (jumlahTarik > 5000000) {
            System.out.println("Jumlah tarik melebihi batas maksimum per transaksi");
            return false;
        }

        if (saldoAwal - jumlahTarik < 50000) {
            System.out.println("Saldo akhir tidak boleh kurang dari saldo minimum Rp50.000");
            return false;
        }

        int salod = saldoAwal - jumlahTarik;
        System.out.println("Saldo: " + salod);
        return true;
    }

    @Test
    void testTarikTunaiBerhasil() {
        boolean atm = tarikTunai(100000, 50000);
        Assertions.assertTrue(atm);
    }

    @Test
    void testGagalKarenaSaldoNol() {
        boolean atm = tarikTunai(0, 50000);
        Assertions.assertFalse(atm);
    }

    @Test
    void testGagalKarenaJumlahTarikNol() {
        boolean atm = tarikTunai(100000, 0);
        Assertions.assertFalse(atm);
    }

    @Test
    void testGagalKarenaSaldoKurang() {
        boolean atm = tarikTunai(80000, 50000);
        Assertions.assertFalse(atm);
    }
}
