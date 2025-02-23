package onpackage;
public class Voiture implements Vehicule {
    private static int vitess;
        private int vitessem;
        public Voiture (int vitesse, int vitessem){
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
        System.out.println("alumage contaque et appuie sur ambrouillage.");
        System.out.println("chuchuchuchuuu;brooouuum: La voiture vient de demarrer");
    }

    public void arreter(){
        System.out.println("appuie sur frein à pied: la voiture s'arrete");
    }
    
    public void eteindre(){
        System.out.println("fermeture contaque levier de vitesse dans neutre : la voiture s'eteind");
    }
}