
package guvi.player.set3;

import java.util.Scanner;

public class GreatestNumberDivideTheBothNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int maxi = 0;
        int max = Math.max(a, b);
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0){
                if(i>maxi){
                    maxi = i;
                }
            }
        }
        System.out.println(maxi);
    }
}
