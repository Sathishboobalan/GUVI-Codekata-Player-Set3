
package guvi.player.set3;

import java.util.Scanner;
public class TakeOutExtraSpaces {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String str1 = scan.next();
         String str2 = scan.next();
         str1 = str1.replace("\\s", "");
         str2 = str2.replace("\\s", "");
         System.out.println(str1+str2);
     }
    
}
