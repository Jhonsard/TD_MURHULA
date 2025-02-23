package onpackage;
public class Velo implements Vehicule{
    private static int vitess;
    private int vitessem;

    public Velo(int vitesse, int vitessem){
        this.vitessem = vitessem;
        vitess = vitesse;
    }

    public static int getVitess(){
        return vitess;
    }

    public  int getVitesseMax(){
        return vitessem;
    }

    public static void setVitesse(int vitesse){
        vitess = vitesse;
    }

    public void demarer(){
        System.out.println("un pied  sur la pédale poussée en avant: Le Velo demarre");
    }

    public void arreter(){
        System.out.println("frein à main: Le velo s'arrete");
    }

    public void eteindre(){
    }
    
}