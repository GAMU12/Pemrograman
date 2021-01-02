import java.util.Scanner;
class NamaBulan {
  public static void main(String[] args) {
    
   
        Scanner input = new Scanner(System.in);
        String[] bulan = {
                "Nomor tidak valid",
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
                "Nomor tidak valid"
        };

        // Input bulan
      
        int nomorBulan = input.nextInt();

        System.out.println(   bulan[nomorBulan] );

    
  }
}