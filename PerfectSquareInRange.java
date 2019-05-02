
package guvi.player.set3;

import java.util.Scanner;

public class PerfectSquareInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int count = 0;
        for(int i=l;i<=r;i++){
            int sqroot = (int)Math.sqrt(i);
            int sqre = sqroot * sqroot;
            if(i==sqre) count++;
            
        }
        System.out.println(count);
    }
}
