import java.util.Scanner;
import onpackage.*;
public class TestVehicule {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la vitesse maximale qu'a cette Voiture ?");
        int vitesse_maximaleVoiture = scanner.nextInt();
        Vehicule vehiculeVoiture = new Voiture(0, vitesse_maximaleVoiture);

        System.out.println("demarre la Voiture (1/2) ?\n 1 pour oui ou 2 pour non");
        int repond =  scanner.nextInt();

        if (repond == 1){
            vehiculeVoiture.demarer();
            System.out.println();
            System.out.println("alumage du tableau de bord affiche:");
            System.out.println("vitesse maximale: "+ vehiculeVoiture.getVitesseMax()+" KM/H");
            System.out.println("vitesse initiale: "+ Voiture.getVitess()+" KM/H");

            System.out.println();
                System.out.println("passer à la vitesse suivante.");System.out.println("1/2");
                int reponse = scanner.nextInt();
                if (reponse == 1){
                    System.out.println("mettez vitesse");
                    int vitesse_augVoiture = scanner.nextInt();
                    
                    System.out.println();
                    System.out.println("vitesse en cours: "+ vitesse_augVoiture+ " KM/H");
                } 
                else {
                    System.out.println("passer la vitesse à OU arreter cette voiture. 1/2");
                    int choix = scanner.nextInt();

                    if (choix ==1){
                        int vitesse_actuelleVoiture = scanner.nextInt();
                        System.out.println("vitesse standard: "+ vitesse_actuelleVoiture+" KM/H");
                    } 
                    else {
                        vehiculeVoiture.arreter();
                        System.out.println("vitesse standard: "+ Voiture.getVitess());
                    }
                } 
                System.out.println();
                System.out.println("eteindre la voiture (1/2)");
                int arret = scanner.nextInt();

                if (arret == 1){
                    vehiculeVoiture.eteindre();
                } 
                else {
                System.out.println("brooooouuummm: La voiture continue de roulé.");
                }
        } 
        else {
        System.out.println("La voiture n'est pas demarer.");
        }


        System.out.println("Quelle est la vitesse maximale qu'a cette Moto ?");
        int vitesse_maximaleMoto = scanner.nextInt();
        Vehicule vehiculeMoto = new Moto(0, vitesse_maximaleMoto);

        System.out.println("demarrer la Moto (1/2) ?\n 1 pour oui ou 2 pour non");
        int repondmo =  scanner.nextInt();

        if (repondmo == 1){
            vehiculeMoto.demarer();
            System.out.println();
            System.out.println("alumage du tableau de bord affiche:");
            System.out.println("vitesse maximale: "+ vehiculeMoto.getVitesseMax()+" KM/H");
            System.out.println("vitesse initiale: "+ Moto.getVitess()+" KM/H");

            System.out.println();
                System.out.println("vitesse suivante.");System.out.println("1/2");
                int reponse = scanner.nextInt();
                if (reponse == 1){
                    System.out.println("mettez vitesse");
                    int vitesse_augMoto = scanner.nextInt();
                    
                    System.out.println();
                    System.out.println("vitesse en cours:"+ vitesse_augMoto+ " KM/H");
                } 
                else {
                    System.out.println("passer à la vitesse suivante OU arreter la. 1/2");
                    int choix = scanner.nextInt();

                    if (choix ==1){
                        int vitesse_actuelleMoto = scanner.nextInt();
                        System.out.println("vitesse encours: "+ vitesse_actuelleMoto+" KM/H");
                    } 
                    else {
                        vehiculeMoto.arreter();
                        System.out.println("vitesse standard: "+ Moto.getVitess());
                    }
                } 
                System.out.println();
                System.out.println("arreter de la moto (1/2)");
                int arret = scanner.nextInt();

                if (arret == 1){
                    vehiculeMoto.eteindre();
                } 
                else {
                System.out.println("vroooonnn :La moto continue de roulé.");
                }
        }
        else {
            System.out.println("La moto n'est pas demarer.");
            }


        System.out.println("Quelle est la vitesse maximale qu'a ce Velo ?");
        int vitesse_maximaleVelo = scanner.nextInt();
        Vehicule vehiculeVelo = new Velo(0, vitesse_maximaleVelo);

        System.out.println("demarre le velo (1/2) ?\n 1 pour oui ou 2 pour non");
        int repondvel =  scanner.nextInt();
        
        if (repondvel == 1){
            vehiculeVelo.demarer();
            System.out.println("vitesse maximale: "+ vehiculeVelo.getVitesseMax()+" KM/H");
            System.out.println("vitesse initiale: "+ Velo.getVitess()+" KM/H");

            System.out.println();
                System.out.println("passer vitesse.");System.out.println("1/2");
                int reponse = scanner.nextInt();
                if (reponse == 1){
                    System.out.println("entrer vitesse");
                    int vitesse_augMoto = scanner.nextInt();
                    
                    System.out.println();
                    System.out.println("vitesse actuel du velo: "+ vitesse_augMoto+ " KM/H");
                } 
                else {
                    System.out.println("passer à la vitesse superieure OU arreter le. 1/2");
                    int choix = scanner.nextInt();

                    if (choix ==1){
                        System.out.println("mettez vitesse: ");
                        int vitesse_actuelleMoto = scanner.nextInt();
                        System.out.println("vitesse en cours: "+ vitesse_actuelleMoto+" KM/H");
                    } 
                    else {
                        vehiculeVelo.arreter();
                        System.out.println("vitesse finale: "+ Moto.getVitess());
                    }
                } 
                System.out.println();
                System.out.println("arreter de le velo (1/2)");
                int arret = scanner.nextInt();

                if (arret == 1){
                    vehiculeVelo.arreter();
                } 
                else {
                System.out.println("le velo continue de roulé.");
                }
        }
        else {
            System.out.println("le velo n'est pas demarer.");
            }
    }
}