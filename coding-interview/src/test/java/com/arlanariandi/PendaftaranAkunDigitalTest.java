package com.arlanariandi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PendaftaranAkunDigitalTest {

    public String validasiPendaftaranAkunDigital(int umur, String ktp, String kewarganegaraan) {

        if (umur < 17) {
            return "Pendaftaran gagal: Umur harus minimal 17 tahun.";
        }

        if (!ktp.equalsIgnoreCase("Elektronik")) {
            return "Pendaftaran gagal: KTP harus elektronik.";
        }

        if (!kewarganegaraan.equalsIgnoreCase("Indonesia")) {
            return "Pendaftaran gagal: Warga negara harus Indonesia.";
        }

        return "Pendaftaran akun digital berhasil.";
    }


    @Test
    void testPendaftaranBerhasil() {
        String hasil = validasiPendaftaranAkunDigital(17, "Elektronik", "Indonesia");
        Assertions.assertEquals("Pendaftaran akun digital berhasil.", hasil);
    }

    @Test
    void testGagalKarenaUmurKurang() {
        String hasil = validasiPendaftaranAkunDigital(16, "Elektronik", "Indonesia");
        Assertions.assertEquals("Pendaftaran gagal: Umur harus minimal 17 tahun.", hasil);
    }

    @Test
    void testGagalKarenaBukanElektronik() {
        String hasil = validasiPendaftaranAkunDigital(17, "Non Elektornik", "Indonesia");
        Assertions.assertEquals("Pendaftaran gagal: KTP harus elektronik.", hasil);
    }

    @Test
    void testGagalKarenaBukanWNI() {
        String hasil = validasiPendaftaranAkunDigital(17, "Elektronik", "Jepang");
        Assertions.assertEquals("Pendaftaran gagal: Warga negara harus Indonesia.", hasil);
    }
}
