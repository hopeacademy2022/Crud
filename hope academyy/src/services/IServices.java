/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;

/**
 *
 * @author Hopeacademy
 */
public interface IServices <U> {
    public void ajouter (U u) ; 
    public void modifier (U u);
    public void supprimer (int id);
    public List <U> afficher();
    
}
