public class Mahasiswa15pt2 {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;


    public Mahasiswa15pt2() {  
    }  

    // Konstruktor dengan parameter  
    public Mahasiswa15pt2(String nm, String nim, double ipk, String kls) {  
        this.nama = nm;  
        this.nim = nim;  
        this.ipk = ipk;  
        this.kelas = kls;  
    }

    public void tampilkanInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    public void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    public void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    public String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) return "Sangat Baik";
        else if (ipk >= 3.0) return "Baik";
        else if (ipk >= 2.5) return "Cukup";
        else return "Kurang";
    }
}
