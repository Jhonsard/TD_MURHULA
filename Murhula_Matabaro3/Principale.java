import monpackage.*;

public class Principale {
    public static void main(String[] args) {

        String[][] unTab = new String[2][2];
        String[][] unTabl = new String[3][2];
        
        Institution[] ins = new Institution[5][4];
        Universite un = new Universite();
        Ecole ec = new Ecole();
        ins.InstDecri();
        un.InstDecri();
        un.LastsRect("Mumbere Kasongo","Murhula Matabaro");
        ec.InstDecri();
        ec.LastsPromot("MWENDAKULALA BLAISE","KAGARABI GENTIL", "ACHUNGE J.P");
        
        unTab[0][0]= un.newUniv();
        unTab[0][1]= un.newRect();
        unTab[1][0]= un.newUniv();
        unTab[1][1]= un.newRect();

        unTabl[0][0]= ec.newEcole();
        unTabl[0][1]= ec.newPromot();
        unTabl[1][0]= ec.newEcole();
        unTabl[1][1]= ec.newPromot();
        unTabl[2][0]= ec.newEcole();
        unTabl[2][1]= ec.newPromot();



        for (int i=0; i<2; i++){
            System.out.println("L'Université numero "+(i+1) +" et son Recteur en bas");
            for (int j=0; j< 2; j++){
                System.out.println(unTab[i][j]);
            }
        }

        for (int i=0; i<unTabl.length; i++){
            System.out.println("L'Ecole numero "+(i+1) +" et son Promoteur en bas");
            for (int j=0; j< 2; j++){
                System.out.println(unTabl[i][j]);
            }
        }
    }
}