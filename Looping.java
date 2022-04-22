



public class Looping {

    
    public static void main(String[] args) {
       
        // For Loop
        for (int nomor = 1; nomor <= 5; nomor++ ){
      
          System.out.println("Pelajaran " + nomor ); 
        } 
         System.out.println("----------------------------------------");
        // While Loop
        
        int nomor = 1;
        
        while(nomor <= 5){
            System.out.println("Tugas " + nomor);
            
            nomor++;
        }
         System.out.println("----------------------------------------");
         // Do While Loop
         
         int angka = 1;
         
         do{
            System.out.println("Pertemuan " + angka);
            
            angka++;  
            
        }while(angka <= 15);
         
         
    }
    
}
