
package guvi.player.set3;

import java.util.Scanner;

public class DifferByExactlyKCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        int n = scan.nextInt();
        int count = 0;
        for(int i=0;i<str1.length();i++){
            if(!str1.substring(i, i+1).equals(str2.substring(i, i+1))){
                    count++;
            }
        }
        System.out.println((count==n)?"yes":"no");
    }
}
