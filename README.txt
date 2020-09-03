
 ____________________________
|                            |
|   NOM      : BOULDJA       |    > Copilation javac *.java
|   Prenom   : Lounis        |    > Execution  java    Dessin2D
|   num Etud : 21920529      |               - ou -  
|   Goupe    : TD  03        |    > make compil 
|____________________________|    > make run                        

ps : c'est mieux d'executer dans un terminel plein ecran

>Les Class  :                                                               _______________________
                                                                             |                       |
                                     ________________________                | Claas Dessin2D <Main> |
                                    |                        |               |_______________________|
                                    | Class Forme <abstract> |         0...n | +static Methodes      |             | 
                                    |________________________|---------------| + Main                |
                                    | + positionX            |               |_______________________|
                                    | + positionY            |
                                    |------------------------|
                     <extends>      | + setPositionY()       |     <extends>
                 -----------------|>| + setPositionX()       |<|-------------------
                |                   | + deplacementX()       |                    |
                |                   | + deplacementY()       |                    |
                |                   | + saisie()             |                    |
                |                   | + modifieForme()       |                    |
                |                   | + getSurface()         |                    |
                |                   |________________________|                    |
                |                              /_\                                |
                |                               |                                 |
     ______________________           <extends> |                        ____________________
    |                       |                   |                       |                    |   
    | Class Rectangle       |                   |                       | Class Triangle     |
    |_______________________|          _________|________               |____________________|
    | + largeur             |         |                  |              | + largeur          |
    | + longueur            |         |  Claas Cercle    |              | + hauteur          |
    |_______________________|         |__________________|              |____________________|
                                      | + diametre       |
                                      |__________________|

                                                                            *****************
                                                                            * Bon Vacannces *
                                                                            *****************