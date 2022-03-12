/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Hopeacademy
 */
public class utilisateur {
    
    
    private int utilisateur_id ;
    private String nom ;
    private String prenom ;
   private String email ; 

    public utilisateur() {
    }

    public utilisateur(int utilisateur_id, String nom, String prenom, String email) {
        this.utilisateur_id = utilisateur_id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public utilisateur(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public int getUtilisateur_id() {
        return utilisateur_id;
    }

    public void setUtilisateur_id(int utilisateur_id) {
        this.utilisateur_id = utilisateur_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "utilisateur{" + "utilisateur_id=" + utilisateur_id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + '}';
    }
   
   
   
   
   
   
   
   
   
   
   
    
}
