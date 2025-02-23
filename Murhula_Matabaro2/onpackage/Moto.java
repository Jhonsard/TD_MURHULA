package onpackage;
public class Moto implements Vehicule{
    private static int vitess;
    private int vitessem;

    public Moto(int vitesse, int vitessem){
        this.vitessem = vitessem;
        vitess = vitesse;
    }

    public static int getVitess(){
        return vitess;
    }

    public  int getVitesseMax(){
        return vitessem;
    }

    public void setVitesse(int vitesse){
        vitess = vitesse;
    }

    public void demarer(){
        System.out.println("alumage contaque plus quick ou boutton de demarage en serant l'ambrouillage");
        System.out.println("chuchuchuchuuu;vroooouum: La Moto vient de demarrer");
    }

    public void arreter(){
        System.out.println("frein à pieds ou frein à main: La Moto s'arreter");
    }

    public void eteindre(){
        System.out.println("contaque fermer apuie sur embrouillage: La Moto s'eteind");
    }


}