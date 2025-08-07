
package tugas;

import java.util.Scanner;

public class testMethod {
    
  static void myMethod(int umur) {
  
  	System.out.println("Ur age are: " + umur);
    
    if (umur <= 18) {
    		System.out.println("nigga u are not old enough! get out from here");
    }
    else{
    System.out.println("Heyy whatsup manigga>_<");
    }
  }

  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
    
    System.out.print("please insert ur age bro: ");
    int umur = input.nextInt();
    myMethod(umur);
  }
}

