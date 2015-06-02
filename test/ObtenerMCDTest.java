/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mcd.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bea
 */
public class ObtenerMCDTest {
    
    @Test
   public void  probarObtenerMCD (){
       Calculo ob = new Calculo();
       System.out.println("Verificar ObtenerMCD");
       assertEquals(ob.obtenerMCD(-3,-2), 0);
       assertTrue(ob.obtenerMCD(10, 5) == 5);
       assertTrue(ob.obtenerMCD(56,24) == 8);
   }
}
