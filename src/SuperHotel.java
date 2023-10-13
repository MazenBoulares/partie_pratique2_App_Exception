/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class SuperHotel {
    static int x[];


    public void reserver(){

              x[0] = 1;
    }

    public static void main(String args[]) {

        SuperHotel s = new SuperHotel();
        try {
            s.reserver();
        }
        catch(NullPointerException e){
            System.out.println("pas d'espace alloué pour l'array");
        }
    }
}

