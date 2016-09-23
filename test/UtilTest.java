/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class UtilTest {
    @Test
    public void Util() {
      
EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        
    }
    
}
