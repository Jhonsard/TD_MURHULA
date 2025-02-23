package monpackage;
import java.util.Scanner;

public class Universite extends Institution {
    private int facuNomb;
    private String systEnsegn;
    private String nomRect;


    public int getfacuNomb(){
        return facuNomb;
    }

    public String getsystEnsegn(){
        return systEnsegn;
    }

    public String getnomRect(){
        return nomRect;
    }

    public void setfacuNomb(int nombre){
        this.facuNomb = nombre;
    }

    public void setsystEnsegn(String systeme){
        this.systEnsegn = systeme;
    }

    public void setnomRect(String nom){
        this.nomRect = nom;
    }
    
    public Universite(){
        
    }

    public void InstDecri(){
        setfacuNomb(12);
        setnomRect("MASUMBUKO MUGANZA");
        setsystEnsegn("LMD");
        setInstNom("CBCA-ULPGL");
        System.out.println
        (
        getInstNom()+ "à une Université du \nfonctionnant dans le system "+getsystEnsegn()+
        " Elle a "+ getfacuNomb()+
        " Facultés \net Elle est sous la direction du recteur "+ getnomRect()
        );
    }

    public void LastsRect(String nomRecteur1, String nomRecteur2){
        System.out.println();
        System.out.println
        (
            nomRecteur1 +" et "+ nomRecteur2 + 
            " \nsont les deux recteurs qui ont precedé "+ getnomRect());
    }

    Scanner sc = new Scanner(System.in);

    public String newUniv(){
        String NomUn;
        System.out.println("nom de l'univ de l'institution "+ getInstNom());
        return NomUn = sc.nextLine();
    }

    public String newRect(){
        String NomRec;
        System.out.println("et le nom de son recteur");
        return NomRec  = sc.nextLine();
    }
    
}
