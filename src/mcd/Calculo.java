/*
 * Para hacer el ejercicio 3. modifique todo el codigo, de manera que todos los mensajes se evaluan en un mismo metodo
 * Mi metodo mensaje evalualos numeros introducidos y llama al metodo ObtenerMCD, y retorna un string.
 * 
 */
package mcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author damian
 */
public class Calculo {

    private int numero1;
    private int numero2;
    private String mensajeResultado = "";

    public Calculo() {
    }

    //setters
    public void setNumero1(int numero) {
        this.numero1 = numero;
    }

    public void setNumero2(int numero) {
        this.numero2 = numero;
    }

    //resultado del cálculo del MCD
    public String getMensajeResultado() {
        return mensajeResultado;
    }

    //getters
    //encapsulamos la modificación de las variables numero1 y numero2
    //para comprobar que los valores son correctos entre 
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    //método para calcular el MCD
    public int obtenerMCD(int num1, int num2) {
        int resto;
        int numDiv1 = num1;
        int numDiv2 = num2;

        if (num1 < 0 || num2 < 0) {
            return 0;
        }
        do {
            resto = numDiv1 % numDiv2;
            numDiv1 = numDiv2;
            if (resto != 0) {
                numDiv2 = resto;
            }
        } while (resto != 0);
        return numDiv2;
    }

    public int pedirDato() {
        int num=0;
        try {
            BufferedReader entradaTeclado = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("Introduzca el número : ");
            num = Integer.parseInt(entradaTeclado.readLine());
            return num;
        } catch (IOException e) {
            mensajeResultado = "Error al introducir datos";
        } catch (NumberFormatException e) {
            mensajeResultado = "Debe introducir un número válido";
        }finally{
           return num;
        }
    }
    

    public String mensaje(int num1, int num2) {
        try {
            if (num1 >= 0) {
                this.numero1 = num1;
            } else {
                mensajeResultado = "Error, Numero Negativo";
            }
            if (num2 >= 0) {
                this.numero2 = num2;
            } else {
                mensajeResultado = "Error, Numero Negativo";
            }
            Calculo calculo = new Calculo();
            calculo.setNumero1(numero1);
            calculo.setNumero2(numero2);
            if ((num1 >= 0)&&(num2 >= 0)){
                mensajeResultado = "MCD Realizado con exito";
            }
            System.out.println("El MCD de " + calculo.getNumero1() + " y "
                    + calculo.getNumero2() + " es: " + calculo.obtenerMCD(calculo.getNumero1(), calculo.getNumero2()));
            System.out.println("Resultado del cálculo: "
                    + calculo.getMensajeResultado());
            return mensajeResultado;
        } catch (NumberFormatException e) {
            mensajeResultado = "Debe introducir un número válido";
        } finally {
            return mensajeResultado;
        }

    }
}
