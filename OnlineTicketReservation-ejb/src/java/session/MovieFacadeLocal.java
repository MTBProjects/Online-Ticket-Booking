/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Movie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PC
 */
@Local
public interface MovieFacadeLocal {

    void create(Movie movie);

    void edit(Movie movie);

    void remove(Movie movie);

    Movie find(Object id);

    List<Movie> findAll();

    List<Movie> findRange(int[] range);
    
    List<Movie> findListByName(String name);
    
    Movie findByName(String name);
    
    List<Movie> findByStatus(String status);
    
    public Movie findById(int id);

    int count();

    public List<Movie> findByKey(String string);
    
}
