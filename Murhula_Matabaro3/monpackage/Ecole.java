package monpackage;
import java.util.Scanner;

public class Ecole extends Institution {
    
    private String type;
    private int classNomb;
    private String nomPromot;

    public Ecole(){

    }

    public String geTtype(){
        return type;
    }

    public int getclassNomb(){
        return classNomb;
    }

    public String getnomPromot(){
        return nomPromot;
    }

    public void seTtype(String type){
        this.type = type;
    }
    public void setclassNomb(int nombre){
        this.classNomb = nombre;
    }

    public void setnomPromot(String nom){
        this.nomPromot = nom;
    }

    public void InstDecri(){
        setclassNomb(26);
        seTtype("Secondaire");
        setnomPromot("MPAKULA OMBE MANZAMBI");

        System.out.println();
        System.out.println
        (
        getInstNom()+" a une ecole "+geTtype()+
        " Elle a "+ getclassNomb()+
        " Classes \net Elle est sous la direction du promoteur "+ getnomPromot()
        );
        System.out.println();
    }

    public void LastsPromot(String nomPromoteur1, String nomPromoteur2, String nomPromoteur3){
        System.out.println();
        System.out.println
        (
            nomPromoteur1 +", "+ nomPromoteur2 +" et "+nomPromoteur3+
            " \nsont les trois promoteurs qui ont precedé "+ getnomPromot());
    }

    Scanner sc = new Scanner(System.in);

    public String newEcole(){
        String NomUn;
        System.out.println("nom de l'Ecole de l'institution "+ getInstNom());
        return NomUn = sc.nextLine();
    }

    public String newPromot(){
        String NomPromo;
        System.out.println("et le nom de son Promoteur");
        return NomPromo  = sc.nextLine();
    }

}
