package de.hfu;
import java.util.Scanner;
/**
 * @author Ghufran
 * Zuerst ein text eingeben
 * Zweitens Scanner hinlegen
 * Drittens Text schrieben
 * gegebene Text wir groß geschreiben
 *
 */
public class App 
{
    public static void main( String[] args ){
    	System.out.println("Text eingeben: ");
    	 Scanner scan = new Scanner(System.in);
    	 String str = scan.nextLine();
         String result = str.toUpperCase();
         System.out.println("Original String  : " + str);
         System.out.println("Uppercase String : " + result);
     
    }
}
