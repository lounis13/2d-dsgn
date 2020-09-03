import java.util.Scanner;

public class Rectangle extends Forme{
    /*longueur*/
    public double longueur ;
    /*largeur*/
    public double largeur  ;

    /**
     *  constructeur vide
     */
    public Rectangle(){};
    /**
     *      constructeur
     * @param posX
     * @param posY
     * @param longueur
     * @param largeur
     */
    public Rectangle(int posX, int posY, double longueur, double largeur)
    {
        this.positionX = posX ;
        this.positionY = posY ;
        this.longueur  = longueur ;
        this.largeur   = largeur  ;
    }

    private Scanner sc = new Scanner(System.in);

    /**
     *  saisir un regtangle
     */
    void saisie() {

        System.out.print("-<CREATION DE RECTANGLE ---------------------\n");
        try {
        System.out.print("\t\t *PositionX : "); this.positionX = sc.nextInt();
        System.out.print("\t\t *PositionY : "); this.positionY = sc.nextInt();
        System.out.print("\t\t *Largeur   : "); this.largeur = sc.nextDouble();
        System.out.print("\t\t *Longueur  : "); this.longueur = sc.nextDouble();
        }catch (Exception e){
            System.err.println("Rectangle (Erreur saise) fin prog!");
            System.exit(0);
        }
        System.out.print("------------------------------CREATION SUCCES>\n");
    }

    /**
     *  modifie un rectangle
     */
    void modifieForme() {
        try {
            System.out.println("  >> Donnez la longueur de triangle :  ");
            this.longueur = sc.nextDouble();
            System.out.println("  >> Donnez la largeur de triangle :  ");
            this.largeur = sc.nextDouble();
        }catch (Exception e){
            System.err.println("Rectangle (Erreur saise) fin prog!");
            System.exit(0);
        }
    }


    /**
     *
     * @return  la surface de rectagle
     */
    double getSurface() {
        return this.largeur * this.longueur;
    }

    /**
     *  affichage
     */
    void affichage() {
        System.out.println( ">\t(RECTANGLE)\tPostion X : "+this.positionX
                          + "\t\tPosition Y : "+this.positionY
                          + "\t\tLongueur : "+this.longueur
                          + "\t\tLargeur  : "+this.largeur
        );
    }
}
