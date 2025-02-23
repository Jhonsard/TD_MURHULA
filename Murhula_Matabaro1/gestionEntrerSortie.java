import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class gestionEntrerSortie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nom du fichier que vous voulez editer: ");
        String nomFichier = scanner.nextLine();
        File fichier = new File(nomFichier);

        if (fichier.exists()){
            try {

                String[] fish = new String[10];

                FileOutputStream fluxDecriture = new FileOutputStream("Mon_fichier.txt");

                for (int i =0; i< 10;i++){
                    String texte1  = scanner.nextLine();
                    fluxDecriture.write(texte1.getBytes());

                    System.out.println(texte1);
                }

                
                byte[] buffer = new byte[10240];
                int n =0;
                
                FileInputStream fluxDeLecture = new FileInputStream("Mon_fichier.txt");

                while (((n=fluxDeLecture.read(buffer)) != -1)) {
                    String texte = new String(buffer,2,n);
                    fluxDecriture.close();
                    fluxDeLecture.close();
                }

            } catch (Exception e) {
                
            }
        } else {
            System.out.println("Le fichier n'existe pas, veuillez le creer et pour l'ouvrir et l'editer");
            }
        }
    }