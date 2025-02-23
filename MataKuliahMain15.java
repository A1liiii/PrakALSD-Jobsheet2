public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 mk1 = new MataKuliah15();
        mk1.tampilInformasi();
        
        MataKuliah15 mk2 = new MataKuliah15("SIB101", "Pemrograman Java", 3, 4);
        mk2.tampilInformasi();

        mk2.ubahSKS(4);
        
        mk2.tambahJam(2);

        mk2.kurangiJam(3);

        mk2.kurangiJam(10);
    }
}
