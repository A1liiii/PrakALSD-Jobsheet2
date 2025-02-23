public class Dosen15 {
    String idDosen;
    public String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen15() {
        this.idDosen = "D000";
        this.nama = "Nama Default";
        this.statusAktif = false;
        this.tahunBergabung = 2020;
        this.bidangKeahlian = "Umum";
    }

    public Dosen15(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("----------------------------------------");
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status dosen " + nama + " diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen " + nama + " diubah menjadi: " + bidang);
    }
}
