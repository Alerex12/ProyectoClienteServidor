  package com.mycompany.mavenproject4;

public class Mavenproject4 {

    public static void main(String[] args) {
        int resultadoSuma = sumar (89,76);
        System.out.println("Resultado de la suma:" +resultadoSuma);
        
        int resultadoResta = restar (102,47);
        System.out.println("Resultado de la resta:" + resultadoResta);
        
        double resultadoDivision = dividir (873 , 56);
        System.out.println("Resultado de la division:" + resultadoDivision);
        
        int resultadoMultiplicacion = multiplicar (98,23);
        System.out.println("Resultado de la multiplicacion:"+ resultadoMultiplicacion);
        
        
    }
    public static int sumar (int a, int b){
        return a + b ;
    }
    public static int restar (int a, int b){
        return a - b;
    }
    public static double dividir (double a, double b) {
        return a / b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
}
