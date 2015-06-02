package mcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calcula maximo comun divisor recursivamente
 *
 */
public class MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int num1,num2;
        Calculo ob = new Calculo();
        num1=ob.pedirDato();
        num2=ob.pedirDato();
        System.out.println(ob.mensaje(num1,num2));
    }
}
