package com.company;

public class Ejercicio {

    public void suma (){
        String cadena= "      11  22    33     (    4&4    5#5    66  p      J0o              ";
        String [] arregloCadena= new String[100];
        int [] arregloNumeros = new int[100];
        int numero;
        int suma=0;
        int i;
        int a=0;

        String s1 = cadena.trim();
        String[] token = s1.split("[\\s\\xA0]+");
        for(String s : token){
            arregloCadena[a] = s;
            try{
                numero=Integer.parseInt(arregloCadena[a]);
                arregloNumeros[a] = numero;
                suma=suma+numero;
            }catch(NumberFormatException ex){
                System.out.println(arregloCadena[a]+"  No es un número");
            }
            a++;
        }
        System.out.println("La suma de los números de la cadena es:  "+ suma);


    }
}
