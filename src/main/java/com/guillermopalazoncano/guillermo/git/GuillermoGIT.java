package com.guillermopalazoncano.guillermo.git;

/**
 *
 * @author guillermopalazoncano
 */
public class GuillermoGIT {

    public static void main(String[] args) {
        /*
        Proyecto creado por Guillermo Palazón Cano para
        la tarea de Entornos de Desarrollo
        */
        int valor1 = 5;
        int valor2 = 3;
        System.out.println("El resultado de sumar "+valor1+" y "+valor2+" "
                + "es: "+suma(valor1, valor2));
        System.out.println("El resultado de restar "+valor1+" y "+valor2+" "
                + "es: "+resta(valor1, valor2));
        System.out.println("El resultado de multiplicar "+valor1+" y "+valor2+" "
                + "es: "+multiplica(valor1, valor2));
    }
    
    private static int suma (int num1, int num2){
        int resultado = num1+num2;
        return resultado;
    }
    
    private static int resta (int num1, int num2){
        int resultado = num1-num2;
        return resultado;
    }
    
    private static int multiplica (int num1, int num2){
        int resultado = num1*num2;
        return resultado;
    }
    
}
