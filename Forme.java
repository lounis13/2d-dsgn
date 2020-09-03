abstract class Forme {

    /*position x*/
    public int positionX    ;
    /*position y*/
    public int positionY    ;

    /**
     *      changer le x
     * @param positionX
     */
    void   setPositionX(int positionX)
    {
        this.positionX = positionX;
    }

    /**
     *      charger Y
     * @param positionY
     */
    void   setPositionY(int positionY)
    {
        this.positionY = positionY ;
    }

    /**
     *      deplacement par rappoet a l'axe Y
     * @param dep   la valeur de deplacement
     */
    void   deplacementY(double dep)
    {
        this.positionY+=dep;
    }

    /**
     *      deplacement par rappoet a l'axe X
     * @param dep
     */
    void deplacementX(double dep)
    {
        this.positionX += dep;
    }


    // ********* METHODES ABSTRAITES ******* //

    /**
     *  saisir une fomre
     */
    abstract void   saisie();

    /**
     * modifie une forme
     */
    abstract void  modifieForme();

    /**
     *  caclculer une surface d'une forme
     * @return
     */
    abstract double getSurface();

    /**
     * afficher une fomrm
     */
    abstract void affichage ();


}
