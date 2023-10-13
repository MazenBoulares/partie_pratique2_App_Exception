/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author salma
 */
public class AddTable {
    public static void main(String[] args) {


        int[] array = new int[3];

        try {

            for (int i = 0; i < 4; ++i) {
                array[i] = i;

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exceptions dans l'array");
        } finally {

            try {
                System.out.println(array);
            } catch (Exception e) {

                System.out.println("passed");


            }

        }
    }
}


