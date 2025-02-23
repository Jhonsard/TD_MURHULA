import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class StockageCompteBancaire{
    public static void main(String[] args){
        ObjectOutputStream fluxDecriture;
        ObjectInputStream fluxDeLecture;

        CompteBancaires compte1;
        CompteBancaires compte2;

        Scanner scanner;

        

        try {
            fluxDecriture = new ObjectOutputStream(new FileOutputStream(new File("Jhonsard.Docx")));
            scanner = new Scanner(System.in);

            System.out.println("entrer le numero du compte du premier client: ");
            int numero1 =scanner.nextInt();

            /*System.out.println("Son nom complet: ");
            String titulaire = scanner.nextLine();
            scanner.nextLine();*/

            System.out.println("L'argent dans son compte: ");
            double argent1 = scanner.nextDouble();
            
            compte1 = new CompteBancaires(numero1, "MURHULA MATABARO", argent1);

            System.out.println();
            System.out.println("entrer le numero du compte du deuxième client: ");
            int numero2 =scanner.nextInt();

            /*System.out.println("Son nom complet: ");
            String nom2 = scanner.nextLine();
            scanner.nextLine();*/
            System.out.println("L'argent dans son compte: ");
            double argent2 = scanner.nextDouble();

            compte2 = new CompteBancaires(numero2, "Furaha MASIKA", argent2);

            fluxDecriture.writeObject(compte1);
            fluxDecriture.writeObject(compte1);
            
            fluxDecriture.writeObject(compte2);
            fluxDecriture.writeObject(compte2);

            fluxDeLecture = new ObjectInputStream(new FileInputStream("Jhonsard.Docx"));

            System.out.println("comptes bancaire : ");
            System.out.println(compte1.getTitulaire());
            System.out.println("---------------------------------------------------------------------------------------------");
            ((CompteBancaires) fluxDeLecture.readObject()).retirer(1222);
            ((CompteBancaires) fluxDeLecture.readObject()).deposer(1222);
            System.out.println("=============================================================================================");
            System.out.println("comptes bancaire : ");
            System.out.println(compte1.getTitulaire());
            ((CompteBancaires) fluxDeLecture.readObject()).retirer(1222);
            ((CompteBancaires) fluxDeLecture.readObject()).deposer(1222000);
            System.out.println("---------------------------------------------------------------------------------------------");

        } catch (InputMismatchException e){
            System.out.println("InputMismatchException: "+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception: "+ e.getMessage());
            
        }
    }
}
