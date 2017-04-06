/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

/**
 *
 * @author Simon Hay
 */
 
public class Jeu implements API{
  int[][] grille; // Définition de la grille
  private int vainqueur = 0;
  private String statut;
  private int joueur;
  private int derniereAction = 0;

    /**
     * Permet de mettre des 0 dans toutes les cases de la grille
     */
    @Override
    public void initialisation() {       
         
        statut = "Joueur 1";
        joueur = 1;
        
        //grille = new int[5][]; // Grille avec 6 lignes
        //for (int i = 0; i <= 6; i++){ // Ajout de 7 zéros dans chacune des lignes
        //   grille[i] = new int[5];          
        //}
        
        int colonnes = 7;
        int lignes = 6;
        
        int[][] grille = new int[lignes][colonnes];
        
        for(int i = 0; i<lignes; i++){            
            for(int j = 0; j<colonnes; j++){
                grille[i][j] = 0;
            }
        }
        
//        for(int i = 0; i<lignes; i++){            
//            for(int j = 0; j<colonnes; j++){
//                System.out.print(grille[i][j]);
//            }            
//            System.out.println();
//        }
    }


    /**
     * Permet de gérer les actions du joueur
     * @param joueur Le joueur
     * @param colonne La position en abscisse où le joueur a mis son pion
     * @return L'état de validation de l'action
     */
    @Override
    public boolean action(int joueur, int colonne) {
        
        int cpt = 0; // Nombre de coups joués  
        boolean isValide = false; // Validité de l'action
        
        if (colonne < 0 && colonne > 6){
            isValide = false;
        } else {
            isValide = true;
            for (int j=5; j>=0; j--){
                if (grille[colonne][j] == 0) {
                    grille[colonne][j] = joueur;
                    derniereAction = colonne;
                    if (gagne(colonne, j, grille, joueur)){
                        vainqueur = joueur;
                        vainqueur();
                        statut = "fini";
                    } else if (cpt == 42) {
                        vainqueur = 0;
                        vainqueur(); 
                        statut = "fini";
                    } else {
                       cpt++; 
                    }                                
                }
                break;
            }
        }

        return isValide;
        
    }

    @Override
    public String affichage() {
        return ("Joueur " + statut() + " : Colonne " + derniereAction());
    }

    /**
     * Retourne le statut du jeu : joueur 1, joueur 2 ou partie finie.
     * @return Le statut du jeu
     */
    @Override
    public String statut() {
        return this.statut;
    }

    @Override
    public int derniereAction() {
        return this.derniereAction;
    }

    /**
     * Vainqueur du jeu : 1 pour J1, 2 pour J2, 0 pour match nul
     * @return Le vainqueur
     */
    @Override
    public int vainqueur() {
        return this.vainqueur;
    }
    
        public boolean parcours (int x, int y){
        boolean dansTableau = false;
        if (x >=1 && x<=7 && y>=1 && y<=6){
            dansTableau=true;
        }
        return(dansTableau);
    }
    
    public boolean gagne(int x, int y, int table[][], int joueur){
        boolean gagne=false;
        int cptH=0;
        int cptV=0;
        int cptDD=0; // droite quand on monte
        int cptDG=0; /// gauche quand on monte
        
        for (int i=1; i<=3; i++){
            if (parcours(x,y-i)){
                cptV+=1;
            }
            if (parcours(x,y+i)){
                cptV+=1;
            }
            if (parcours(x-i,y)){
                cptH+=1;
            }
            if (parcours(x+i,y)){
                cptH+=1;
            }
            if (parcours(x-i,y-i)){
                cptDD+=1;
            }
            if (parcours(x+i,y+i)){
                cptDD+=1;
            }
            if (parcours(x+i,y-i)){
                cptDG+=1;
            }
            if (parcours(x-i,y+i)){
                cptDG+=1;
            }
        }
        if (cptDG>=3 || cptDD>=3 || cptH>=3 || cptV>=3){
            gagne=true;
         }
        return(gagne);
    }
    
    public void changerJoueur(int joueur){
        if (joueur == 1) {
            joueur = 2;
        } else {
            joueur = 1;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.initialisation();
    }
 }
   
