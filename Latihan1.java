
package latihan.pkg1;
class Merek {

    String nama_mobil;
    String warna;
    Integer tahun_keluaran;       
}

public class Latihan1 {
    public static void main(String[] args) {
        Merek toyota = new Merek();
        toyota.nama_mobil = "Pajero  Sport";
        toyota.warna = "Putih";
        toyota.tahun_keluaran = 2020;
        
        System.out.println("Nama Mobil :"  + toyota.nama_mobil);
        System.out.println("Warna Mobil :" + toyota.warna);
        System.out.println("Tahun Keluaran" + toyota.tahun_keluaran);  
    }
    
}
