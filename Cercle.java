import java.util.Scanner;

public class Cercle extends Forme {
    /*diametre de cercle*/
    double diametre ;

    /**
     *      constructeur pour cree un objet Cercle
     * @param posX      position x
     * @param posY      position h
     * @param diametre  diametre
     */
    public  Cercle (int posX,int posY, double diametre)
    {
        this.positionX = posX ;
        this.positionY = posY ;
        this.diametre  = diametre ;
    }

    /**
     * codtructeru vide
     */
    public Cercle() {}

    /*un scanner */
    private Scanner sc = new Scanner(System.in);

    /**
     *  saisir un cercle
     */
    void saisie() {

        try {
            System.out.print("-<CREATION DE CERCLE ---------------------\n");
        System.out.print("\t\t\t*PositionX : "); this.positionX = sc.nextInt();
        System.out.print("\t\t\t*PositionY : "); this.positionY = sc.nextInt();
        System.out.print("\t\t\t*Diametre  : "); this.diametre = sc.nextInt();
    }catch (Exception e){
        System.out.println("Cercle (Erreur saise) fin prog!");
        System.exit(0);
    }
        System.out.print("--------------------------CREATION SUCCES>\n");
    }

    /**
     *      Modifier un cercle
     */
    void modifieForme() {
        try {
            System.out.println("  >> Donnez Le nouveau Diametre : ");
            this.diametre = sc.nextDouble();
        }catch (Exception e)
        {
            System.out.println("Cercle (Erreur saise) fin prog!");
            System.exit(0);
        }
    }

    /**
     * @return fouble la surface d'un cercle
     */
    double getSurface() {
        return this.diametre * this.diametre * 3.14 ;
    }

    /**
     *      affichage les information d'un cercle
     */
    void affichage() {
        System.out.println(  ">\t(CERLE) \tPostion X : "+this.positionX
                           + "\t\tPosition Y : "+this.positionY
                           + "\t\tDiametre de cercle : "+this.diametre
                          );
    }


}
