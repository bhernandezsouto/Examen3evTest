/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import mcd.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Bea
 */
@RunWith(Parameterized.class)
public class TestMensaje {

    private int input;
    private int input2;
    private String esperado;
    private Calculo cal;
    

    public TestMensaje (int input,int input2, String esperado) {
        this.input = input;
        this.input2 = input2;
        this.esperado = esperado;
    }

    @Before
    public void inicializar() {
        cal = new Calculo();
    }

    @Parameterized.Parameters
    public static Collection MCD() {
        return Arrays.asList(new Object[][]{
            {-3,-2,"Error, Numero Negativo"},
            {10,5,"MCD Realizado con exito"},
            {56,24,"MCD Realizado con exito"},
            {3,2,"MCD Realizado con exito"}
        });
    }

    @Test
    public void testeo() {
        System.out.println("Los Números parametrizados son: " + input + input2 + ". El valor esperado es :" + esperado);
        assertTrue(cal.mensaje(input, input2) == esperado);
    }

}