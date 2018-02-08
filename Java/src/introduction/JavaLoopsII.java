/*
 * @author: Alok Tibrewala
 */

package introduction;

import java.util.Scanner;

public class JavaLoopsII {

	static void results(int a, int b, int n){
        int answer = 0;
        int tempAnswer = 0;
        for(int i = 0; i<n;i++){
            tempAnswer = 0;
            for(int j = 0;j<=i;j++){ 
                tempAnswer = tempAnswer +(int)(Math.pow(2.0,j)*b);
            }
            tempAnswer+=a;
            System.out.print(tempAnswer + " ");
        }
        System.out.print("\n");
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            results(a, b, n);
        }
             in.close();
     }
       

}
