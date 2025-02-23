package monpackage;
import java.util.Scanner;;

public class Institution {
    protected String InstNom;
    protected String InstPays;
    protected String InstType;
    protected int InstAnCreat;

    public Institution(){
        InstNom = "ULPGL";
        
    }

    public String getInstNom(){
        return InstNom;
    }

    public String getInstPays(){
        return InstPays;
    }

    public String getInstType(){
        return InstType;
    }

    public int getInstAnCreat(){
        return InstAnCreat;
    }

    public void setInstNom(String nom){
        this.InstNom = nom;
    }

    public void setInstPays(String pays){
        this.InstPays = pays;
    }

    public void setInstType(String type){
        this.InstType = type;
    }

    public void setInstAnCreat(int annee){
        this.InstAnCreat = annee;
    }

    public int EtablisAge(){
        setInstAnCreat(1833);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'année en cours?");
        int anIn = sc.nextInt();
    if (anIn<InstAnCreat) {
        do {
            System.out.println(
            "veuillez bien verifier que la date de création : " + getInstAnCreat()+
            " soit inferieure à celle en cours."
            );
            System.out.println("Quel est l'année en cours?");
            anIn = sc.nextInt();}
        while(anIn<InstAnCreat);
        }
        return anIn-InstAnCreat;
    }

    public void InstDecri(){
        setInstNom("CBCA-ULPGL");
        setInstAnCreat(1833);
        setInstPays("RDC/GOMA/Keshero");
        setInstType("Privé");
        System.out.println("L'institution "+getInstNom()+" a été creer en "+ getInstAnCreat()+
        ", donc elle a actuelement "+ EtablisAge() +
        " ans.\nElle se retrouve précisement en "+getInstPays()+".\nElle est du type "+getInstType());
        System.out.println();
    }
}
