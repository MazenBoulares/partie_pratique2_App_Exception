


public class TestFinally {


    public static void main(String[] args) {

        System.out.println("entrer votre code ");

        // traiter cette exception
        try {
            int x = System.in.read();

        } catch (Exception e) {
            System.out.println("Erreur");
        } finally {
            System.out.println("Merci de votre visite");
        }
        // afficher toujours le message "Merci de votre visite"

    }

}


