/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import entities.utilisateur;
import services.ServiceUtilisateur;

/**
 *
 * @author Hopeacademy
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceUtilisateur su = new ServiceUtilisateur ();
        //su.ajouter(new utilisateur ("hope","academy","hopeacademy@gmail.com"));
        
        //su.modifier(new utilisateur (2,"hope2022","academy","hopeacademy@gmail.com"));
        
    // System.out.println(su.afficher());
   su.supprimer(2);
        
    }
    
}
