
package guvi.player.set3;

import java.util.Scanner;

public class StringIsNumericOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = "1234567890";
        String str = scan.next();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(number.contains(str.substring(i,i+1))){
                count++;
            }
        }
        if(count==str.length()){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
