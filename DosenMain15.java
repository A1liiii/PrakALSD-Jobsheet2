public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 dosen1 = new Dosen15();
        dosen1.tampilInformasi();

        Dosen15 dosen2 = new Dosen15("D123", "Dr. Budi Santoso", true, 2015, "Data Science");
        dosen2.tampilInformasi();

        dosen1.setStatusAktif(true);

        dosen2.ubahKeahlian("Machine Learning");

        int tahunSekarang = 2025;
        System.out.println("Masa kerja " + dosen2.nama + " adalah " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun.");
    }
}
