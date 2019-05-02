
package guvi.player.set3;

import java.util.Scanner;

public class UpperToLowerAndConverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String res = "";
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            boolean bool = Character.isUpperCase(a);
            if(bool){
                res+=str.substring(i,i+1).toLowerCase();
            }
            else{
                res+=str.substring(i,i+1).toUpperCase();
            }
        }
        System.out.println(res);
    }
}
