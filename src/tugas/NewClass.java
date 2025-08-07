
package tugas;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        String dumbbell;

    Scanner input = new Scanner(System.in);

    do{
    System.out.print("do u have a dumbbell? [yes/no]");
    dumbbell = input.next();

    if(dumbbell.equalsIgnoreCase("yes")){
        System.out.println("Nice");
    }else if(dumbbell.equalsIgnoreCase("no")){
        System.out.println("Go buy 1");
    }}while(dumbbell.equalsIgnoreCase("no"));
    }
}
