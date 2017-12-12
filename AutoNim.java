public class AutoNim {

    public static void main(String[] args) {
        //NIM : Tahun Masuk + Kode Prodi + Nomor Urut Registrasi
        String ta = "2015";
        String kd_prodi = "153";
        String no_reg = "0001";
        String nim;

        nim = ta.substring(2, 4)+kd_prodi+no_reg;

        System.out.println("NIM : "+nim);
    }
}

// ANGKA PERTAMA MENUNJUKAN INDEX(2) >> 1
//ANGKA KEDUAMENUNJUKAN KARAKTER(4) >> 5