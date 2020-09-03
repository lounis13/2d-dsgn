import java.util.Scanner;

public class Triangle extends Forme{
    /*hauteur*/
    double hauteur ;
    /*largeur*/
    double largeur ;

    /**
     *  constructeur vide
     */
    public Triangle(){}

    /**
     *      constructeur
     * @param positionX position x dans le dessin
     * @param positionY position y dans le dessin
     * @param largeur   la largeur
     * @param hauteur   la hauteur
     */
    public Triangle(int positionX, int positionY,double largeur, double hauteur)
    {
        this.positionX = positionX ;
        this.positionY = positionY ;
        this.hauteur   = hauteur   ;
        this.largeur   = largeur   ;
    }

    /***
     *      changé la hauteur et la largeur de traingle
     * @param hauteur hauteur de triangle
     * @param largeur   largeur de triangle
     */
    public void setHauteyrLargeur(double hauteur, double largeur)
    {
        this.hauteur = hauteur ;
        this.largeur = largeur ;
    }

    /*scanner*/
    private Scanner sc = new Scanner(System.in);

    /**
     *  saisir un triangle
     */
    void saisie() {
        System.out.print("-<CREATION DE TRIANGLE ---------------------\n");
        try {

            System.out.print("\t\t *PositionX : ");
            this.positionX = sc.nextInt();
            System.out.print("\t\t *PositionY : ");
            this.positionY = sc.nextInt();
            System.out.print("\t\t *Largeur   : ");
            this.largeur = sc.nextDouble();
            System.out.print("\t\t *Hauteur   : ");
            this.hauteur = sc.nextDouble();
        }catch (Exception e){
            System.out.println("Traingle (Erreur saise) fin prog!");
            System.exit(0);
        }
        System.out.print("-----------------------------CREATION SUCCES>\n");
    }

    /**
     *      modifie le triangle
     */
    void modifieForme() {
        try {
            System.out.println("  >> Donnez l'Hauteur de triangle :  ");
            this.hauteur = sc.nextDouble();
            System.out.println("  >> Donnez la largeur de triangle :  ");
            this.largeur = sc.nextDouble();
        }catch (Exception e){
            System.out.println("Traingle (Erreur saise) fin prog!");
            System.exit(0);
        }
    }

    /**
     * @return  la surface de triangle
     */
    double getSurface() {
        return this.hauteur*this.largeur / 2 ;
    }

    /**
     *      affichge les information de triangle
     */
    void affichage() {
        System.out.println( ">\t(TRIANGLE)\tPostion X : "+this.positionX
                          + "\t\tPosition Y : "+this.positionY
                          + "\t\tHauteur : "   +this.hauteur
                          + "\t\tLargeur : "   +this.largeur
        );
    }
}
