import java.util.*;

class ArrayTerbalik2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jumlah = input.nextInt();
    int[] nilai = new int[jumlah];
    for (int i = 0; i < jumlah; i++) {
         nilai[i] = input.nextInt();
    }
    
    for(int i=0; i < nilai.length/2; i++){
        int temp = nilai[i];
        nilai[i] = nilai[(nilai.length-1) -i];
        nilai[(nilai.length-1) -i] = temp;
      
    }
    System.out.println(Arrays.toString(nilai) );
    
  }
}