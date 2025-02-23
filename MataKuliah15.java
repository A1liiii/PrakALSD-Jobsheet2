public class MataKuliah15 {
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;

    public MataKuliah15() {
        this.kodeMK = "XXX";
        this.nama = "Mata Kuliah Default";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah15(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("\n===== INFORMASI MATA KULIAH =====");
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS mata kuliah telah diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam bertambah menjadi: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak bisa dilakukan! Jumlah jam tidak mencukupi.");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        }
    }
}
