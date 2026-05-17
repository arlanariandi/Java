package com.arlanariandi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PendaftaranAkunDigitalTest {

    public boolean validasiPendaftaranAkunDigital(int umur, String ktp, String kewarganegaraan) {

        if (umur < 17) {
            System.out.println("Pendaftaran gagal: Umur harus minimal 17 tahun");
            return false;
        }

        if (!ktp.equalsIgnoreCase("Elektronik")) {
            System.out.println("Pendaftaran gagal: KTP harus elektronik");
            return false;
        }

        if (!kewarganegaraan.equalsIgnoreCase("Indonesia")) {
            System.out.println("Pendaftaran gagal: Warga negara harus Indonesia");
            return false;
        }

        System.out.println("Pendaftaran akun digital berhasil");
        return true;
    }


    @Test
    void testPendaftaranBerhasil() {
        boolean hasil = validasiPendaftaranAkunDigital(17, "Elektronik", "Indonesia");
        Assertions.assertTrue(hasil);
    }

    @Test
    void testGagalKarenaUmurKurang() {
        boolean hasil = validasiPendaftaranAkunDigital(16, "Elektronik", "Indonesia");
        Assertions.assertFalse(hasil);
    }

    @Test
    void testGagalKarenaBukanElektronik() {
        boolean hasil = validasiPendaftaranAkunDigital(17, "Non Elektornik", "Indonesia");
        Assertions.assertFalse(hasil);
    }

    @Test
    void testGagalKarenaBukanWNI() {
        boolean hasil = validasiPendaftaranAkunDigital(17, "Elektronik", "Jepang");
        Assertions.assertFalse(hasil);
    }
}
