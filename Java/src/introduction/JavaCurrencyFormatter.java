/*
 * @auhtor: Alok Tibrewala
 */

package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();

	        // Write your code here.
	        
	        NumberFormat nf;
	        
	        nf = NumberFormat.getCurrencyInstance(Locale.US);
	        String us = nf.format(payment).toString();
	        System.out.println("US: " + us);
	        nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	        String india = nf.format(payment).toString();
	        System.out.println("India: " + india);
	        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        String china = nf.format(payment).toString();
	        System.out.println("China: " + china);
	        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        String france = nf.format(payment).toString();
	        System.out.println("France: " + france);
	    }
}
