import java.io.Serializable;

public class CompteBancaires implements Serializable{
    private int numeroCompte;
    private String titulaire;
    private double solde;

    public CompteBancaires(int compte, String titulaire, double solde){
        this.numeroCompte = compte;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public int getNumeroCompte(){
        return numeroCompte;
    }

    public String getTitulaire(){
        return titulaire;
    }

    public double getSolde(){
        return solde;
    }

    public void setNumeroCompte(int numero){
        this.numeroCompte = numero;
    }

    public void setTitulaire(String titulaire){
        this.titulaire = titulaire;
    }

    public void setSolde(double solde){
        this.solde = solde;
    }

    public void deposer(double montant){
        if (montant < 0){
            System.out.println(" le montant à deposer est inferieur à zero votre solde actuel est "+ this.solde+ " solde.");
        } else {
            this.solde = solde + montant;
        System.out.println(" Votre solde actuel est de "+ solde+ " dollards comme vous venez de deposer "+ montant+ " dollards");
        }
    }

    public void retirer(double montant){
        if (montant > solde){
            System.out.println("Retrait echouer");
            System.out.println(" le montant à retirer est superieur à  votre solde actuel qui est de  "
            + this.solde+ ". mettez un montant inferieur pour effectuer ce retrait");
        } else{
            this.solde =solde - montant;
            
        System.out.println(" Votre solde actuel est de "+ solde + " dollards comme vous venez de retirer "+ montant+ " dollards");
        }

    }


}

