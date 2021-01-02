import java.util.Scanner;
class MatriksAngka {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int u = input.nextInt();
    
   for (int i = 0; i < u; i++) {
            for (int j = 0; j < u; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    
  }
}