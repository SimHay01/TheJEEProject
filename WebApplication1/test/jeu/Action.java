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
public class Action {
    private int joueur;
    private int action;
    private boolean result;
    
    
    public Action( int joueur, int action, boolean result){
        this.joueur = joueur;
        this.action = action;
        this.result = result;
    }

    public int getJoueur() {
        return joueur;
    }

    public int getAction() {
        return action;
    }

    public boolean isResult() {
        return result;
    }
    
}
