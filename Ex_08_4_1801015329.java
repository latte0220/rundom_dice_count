import java.util.Scanner;
import java.util.Random;

public class Ex_08_4_1801015329 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int [] eye = {0,0,0,0,0,0};
        
        System.out.print("サイコロを振る回数 > ");
        int max = scan.nextInt();
        
        int n = 0;
        for (int i=0; i<max; i++) {
            int dice = rand.nextInt(6);
           eye[dice] += 1;
        }
        
  for (int i = 0; i < 6; i++) {
      System.out.printf("%2d:", i + 1, eye[i]);
      for(int j = 0; j < eye[i]; j++)
          System.out.print('*');
      System.out.println();
 	   }
	}
}

