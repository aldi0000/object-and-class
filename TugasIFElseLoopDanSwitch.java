
package tugas.pkgif.pkgelse.loop.dan.pkgswitch;


public class TugasIFElseLoopDanSwitch {

   
    public static void main(String[] args) {
        
       var nilai = 95;
       var absen_kehadiran = 80;
       
            if(nilai >= 75 && absen_kehadiran >= 65){
                System.out.println("Selamat Anda Lulus");
                   
            } else {
              System.out.println("Maaf Anda Belum Lulus");
            }  
            if(nilai >= 80 && absen_kehadiran >= 80){
                System.out.println("Grade A");
            } else if(nilai >= 70 && absen_kehadiran >= 80){
                System.out.println("Grade B");
            } else if(nilai >= 65 && absen_kehadiran >= 60){
                System.out.println("Grade C");
            } else if(nilai >= 50 && absen_kehadiran >= 50){
                System.out.println("Grade D");
            } else{
                System.out.println("Nyerah Aja");
                
            }
           
           var Grade = "A";
           System.out.println("----------------------------------------");
      switch(Grade){
          case "A":
            System.out.println("Congrats, Semoga Ilmunya Bermanfaat ");
            break; 
          case "B":
          case "C":
            System.out.println("Nilai Anda Sudah Cukup Baik, Tingkatkan Lagi Nilai Anda");
            break;
          case "D":
            System.out.println("Maaf, Usaha Anda Kurang, Harus Lebih Giat Lagi!");
            break;
          default:
            System.out.println("Maaf, Sepertinya Anda Salah Jurusan"); 
            
      }
            System.out.println("----------------------------------------");
      for (int nomor = 1; nomor <= 5; nomor++ ){
      
          System.out.println("Pelajaran " + nomor );
          
          
         
          
      }
    }
               
               
       
               
    
}
