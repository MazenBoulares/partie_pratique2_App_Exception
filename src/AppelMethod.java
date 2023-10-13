/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */


public class AppelMethod {

        public void method1() throws StackOverflowError{
        this.method2();
    }

    public void method2() throws StackOverflowError{
       this.method1();
    }

   public static void main(String[] args) {

            try {
                AppelMethod appel = new AppelMethod();
                appel.method1();
            }
            catch(StackOverflowError e){
                System.out.println("error catched, enough calls");

            }

}


}
