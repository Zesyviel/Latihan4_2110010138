
package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir z1 = new NilaiAkhir("Zet Erlangga Sukaria", "2110010138", 80, 80, 90);
        
        System.out.println("Nama Mahasiswa = " + z1.getNama());
        System.out.println("NPM Mahasiswa  = " + z1.getNpm());
        System.out.println("Nilai Akhir    = " + z1.hitungNilaiAkhir());
    }
}
