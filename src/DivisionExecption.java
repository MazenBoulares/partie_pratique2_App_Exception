
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author USER
 */


public class DivisionExecption {


    static int x = 20;
    static int y;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter un entier");
        y = scanner.nextInt();
        if (y == 0) {
            throw new StackOverflowError("cant divide by 0");

        } else {


            System.out.println(x / y);
        }


    }


}
