import java.util.*;
/**
 *  *************************************************************
 *  ****************** MAIN CLASS *******************************
 *  *************************************************************
 */
public class Dessin2D {

    /**
     *      Hacsh Map pour stocker les Forme avec leurs Cle
     *      j'ai utilisé une Hash pour recuperé les formes en temps
     *      constant
     */
    static HashMap<Integer,Forme> integerFormeHashMap = new HashMap<Integer, Forme>();

    /*array liste stock les ids pour la manipulation de plusieur forme */
    static ArrayList<Integer> listKey = new ArrayList<Integer>();
    /*la cle*/
    static  int key = 0 ;

    /*scanner*/
    static Scanner sc = new Scanner(System.in);

    /**
     *      pour afficher un menu
     */
    static  void afficheMenu()
    {
        System.out.println(" ______________________________");
        System.out.println(
                           "| 1.Cree un Cercle.            |" +
                         "\n| 2.Cree un Triangle.          |" +
                         "\n| 3.Cree un Rectangle.         |" +
                         "\n| 4.Deplacer  des Formes.      |" +
                         "\n| 5.Affichage des Formes       |" +
                         "\n| 6.Modifie   une Formes       |" +
                         "\n| 7.Quit                       |"
        );
        System.out.println("|______________________________|");
    }

    /**
     *      choisir une fonction
     * @param x
     */
    static void choisez(int x)
    {
        switch (x)
        {
            case 1 :/* cree un cercle */
            {
                Forme f = new Cercle();
                f.saisie();
                /*ajouter la forme dans la map*/
                integerFormeHashMap.put(key++,f);
                break;
            }
            case 2 : /* creee un triangle */
            {
                Forme f = new Triangle();
                f.saisie();
                integerFormeHashMap.put(key++,f);
                break;
            }
            case 3 : /* cree un rectangle*/
            {
                Forme f = new Rectangle();
                f.saisie();
                integerFormeHashMap.put(key++,f);
                break;
            }
            case 4 : /* deplacemment des formes */
            {
                try {
                    /*choix*/
                    choixForme();
                    System.out.println("\n * Combien des Formes Vaoulez vous Deplacez (entre 1 - "+(key)+") : ");
                    /*recuperer le nbr saisi par user*/
                    int nForme = sc.nextInt();
                    /*clear*/
                    listKey.clear();
                    /*sauter*/
                    System.out.println();
                    for (int i = 1 ; i <= nForme ; i++ )
                    {
                        System.out.print(" >> donnez La forme N° " + i + " (entre 0 - "+(key-1)+") : ");
                        int id = sc.nextInt();
                        if(id <0 || id >=key)
                        {
                            System.out.println("L'id ("+id+") n'exsite pas !");
                            i--;
                            continue;
                        }
                        listKey.add(id);
                    }
                    System.out.println("__________________________________________les Formes choisées _____________________________________________ ");
                    for (int i = 0 ; i < nForme ; i++)
                        integerFormeHashMap.get(listKey.get(i)).affichage();
                    System.out.println("___________________________________________________________________________________________________________");
                    
                    /* les valeures de deplacement */
                    System.out.println("\n  >> donnez deplacemment X :");
                    double nvX = sc.nextDouble();
                    System.out.println("  >> donnez deplacemment Y :");
                    double nvY = sc.nextDouble();

                    /* Modifie posX posY*/
                    for (int i = 0 ; i < nForme ; i++)
                    {
                        integerFormeHashMap.get(listKey.get(i)).deplacementX(nvX);
                        integerFormeHashMap.get(listKey.get(i)).deplacementY(nvY);
                    }
                    System.out.println("_____________________________________ Affcihage apres deplacement __________________________________________");
                    for (int i = 0 ; i < nForme ; i++)
                        integerFormeHashMap.get(listKey.get(i)).affichage();
                    listKey.clear();
                    System.out.println("____________________________________________________________________________________________________________");
                }catch (Exception e)
                {
                    integerFormeHashMap.clear();
                    System.out.println("Erreur saisie fin programme ! ");
                    System.exit(0);
                }
                break;
            }
            case 5 : /* afficher des fomes  */
            {
                try {
                    choixForme();
                    System.out.println("* Combien des Formes Vaoulez vous Affichez (entre 1 - "+(key)+") : ");
                    int nForme = sc.nextInt();
                    listKey.clear();
                    System.out.println();
                    for (int i = 1; i <= nForme; i++) {
                        System.out.print(" >> donnez La forme N° " + i + " (entre 0 - "+(key-1)+" ): ");
                        int id = sc.nextInt();
                        if(id <0 || id >=key)
                        {
                            System.out.println("L'id ("+id+") n'exsite pas !");
                            i--;
                            continue;
                        }
                        listKey.add(id);
                    }
                    System.out.println("__________________________________________les Formes choisées______________________________________________ ");
                    for (int i = 0; i < nForme; i++)
                        integerFormeHashMap.get(listKey.get(i)).affichage();
                    System.out.println("____________________________________________________________________________________________________________");
                }catch (Exception e)
                {
                    integerFormeHashMap.clear();
                    System.out.println("Erreur saisie fin programme ! ");
                    System.exit(0);
                }
                break;
            }
            case 6 : /* modifier une forme */
            {
                try {

                    choixForme();
                    System.out.println("\nDonnez la forme a Modifie (entre 0 - "+(key-1)+" )");
                    int id = sc.nextInt();
                    System.out.println("_________________________________________La Forme choisée ___________________________________________ ");
                        integerFormeHashMap.get(id).affichage();
                    System.out.println("________________________________________________________________________________________________________");
                    integerFormeHashMap.get(id).modifieForme();
                    System.out.println("____________________________________La Forme apres la modification _____________________________________ ");
                    integerFormeHashMap.get(id).affichage();
                    System.out.println("_________________________________________________________________________________________________________");

                }catch (Exception e)
                {
                    System.out.println("Erreur saisie ! fin prgrm ");
                    System.exit(0);
                }
                break;
            }
            /**/
            default :
            {
                if(x != 7)
                    System.out.println("Erreur (choix)!");
                /* clear */
                listKey.clear();
                integerFormeHashMap.clear();
                /* message fin de progrm */
                System.out.println("\t\t\t___ (: BYE BYE :)___");
                System.out.println();
                System.exit(0);
                break;
            }

        }
    }

    /**
     *  initiliser le dessin
     */
    static void etatFomesInit()
    {
        integerFormeHashMap.put(key++,new Cercle(10,100,10.0));
        integerFormeHashMap.put(key++,new Triangle(500,55,5,7));
        integerFormeHashMap.put(key++,new Rectangle(250,79,5,7));
    }

    /**
     *  afficher les formes
     */
    static void choixForme()
    {
        int saut = 0 ;
        System.out.println("<<<<<<<--------- Voici les Formes a Choisir --------->>>>>>>>\n");
        for (Map.Entry entry : integerFormeHashMap.entrySet())
        {
            Forme f = (Forme) entry.getValue();
            if(f instanceof Triangle)
                System.out.print(entry.getKey() + ". Triangle\t\t");
            if(f instanceof Cercle)
                System.out.print(entry.getKey() + ". Cercle\t\t");
            if(f instanceof Rectangle)
                System.out.print(entry.getKey() + ". Rectangle\t\t");

            ++saut;
            if(saut % 3 == 0 )
                System.out.println();

        }
        System.out.println("\n");

    }

    /**
     *  --------------- MAIN --------------------
     * @param args
     */
    public static void main(String[] args) {
        etatFomesInit();
        while (true)
        {
            afficheMenu();
            int x;
            try {
                System.out.println("CHOISEZ UNE FONCTION (de 1 - 7 ) : ");
                x = sc.nextInt();
                /* La fonction de manipulation */
                choisez(x);
            }catch (Exception e)
            {
                System.out.println("Erreur saisie ! fin progrm ");
                System.exit(0);
            }

            System.out.println("Appuyez Pour Continue ");
            sc.nextLine();
            sc.nextLine();
        }

    }
}
