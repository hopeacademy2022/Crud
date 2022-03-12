/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import entities.utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.MyDB;

/**
 *
 * @author Hopeacademy
 */
public class ServiceUtilisateur implements IServices<utilisateur> {
    
    Connection c ; 
    public ServiceUtilisateur ()
    {
        c = MyDB.getInstance().getConnection();
    }

    @Override
    public void ajouter(utilisateur u) {
        
        
        try {
            String req = "insert into utilisateur (nom , prenom ,email ) values "
                    +"('"+u.getNom()+"','"+u.getPrenom()+"','"+u.getEmail()+"' )" ;
            Statement s =  c.createStatement();
            s.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
              }

    @Override
    public void modifier(utilisateur u) {
        
        try {
            String req = "update utilisateur set nom = ? , prenom = ?  ,email =? where Utilisateur_Id = ? " ;
            PreparedStatement p = c.prepareStatement(req);
            p.setString(1, u.getNom());
            p.setString(2, u.getPrenom());
            p.setString(3,u.getEmail());
            p.setInt(4, u.getUtilisateur_id());
            p.executeUpdate();
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        


    }

    @Override
    public void supprimer(int Utilisateur_Id) {
        try {
            String req = "delete from utilisateur where Utilisateur_Id = ?" ;
            PreparedStatement p = c.prepareStatement(req);
            p.setInt(1, Utilisateur_Id);
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<utilisateur> afficher() {
            List <utilisateur> list = new ArrayList<>();
        try {
            
            String req ="select * from utilisateur " ;
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(req);
            while (r.next())
            {
                
                utilisateur u = new utilisateur ();
                u.setUtilisateur_id(r.getInt(1));
                u.setNom(r.getString("nom"));
                u.setPrenom(r.getString("prenom"));
                u.setEmail(r.getString("email"));
                
                
                list.add(u) ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
return list ; 


    }
    
}
