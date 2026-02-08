package com.arlanariandi;

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
    void bukaRekeningDigital() {
        int umur = 20;
        String ktp = "Elektronik";
        String kewarganegaraan = "Malaysia";

        String hasilPendaftaran = validasiPendaftaranAkunDigital(umur, ktp, kewarganegaraan);
        System.out.println(hasilPendaftaran);
    }
}
