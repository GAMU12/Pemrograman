import java.util.Scanner;
class MenghitungJumlahPerbaris {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int total;
        int baris = 5;
        int kolom = 5;
        int nilai [][] = new int [baris][kolom];
        input = new Scanner(System.in);
        baris = nilai.length;
        kolom = nilai[0].length;
        
        for(int b = 0; b<baris; b++) {
            for(int k = 0;k<kolom;k++){
              nilai [b][k] = input.nextInt();
        }
          
            
            
        }
      
         
         for (int b = 0; b < baris; b++) {
             total = 0;
             for(int k = 0; k<kolom; k++) {
                 total = total + nilai[b][k];
             }
             System.out.println( total);
         }
        
    }
    
}