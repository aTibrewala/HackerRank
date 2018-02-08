/*
 * @author: Alok Tibrewala
 */

package introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            
            int stringLength = s1.length();
            if(stringLength < 16){
                for(int j = 0; j < (15 - stringLength); j++){
                    s1 = s1 + " ";
                }
            }
            
            String xString = String.valueOf(x);
            if(xString.length() != 3){
                for(int k = 0; k <(4-xString.length()); k++){
                    xString = "0"+xString;
                }
            }

            System.out.println(s1+xString);
        }
        System.out.println("================================");

}
}
