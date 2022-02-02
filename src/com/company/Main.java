package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hola!");

        int edad = 25;

        if (edad == 18) {

            System.out.println("Tienes 18 años");

        } else if (edad == 19) {

            System.out.println("Tienes 19 años");

        } else if (edad == 20) {

            System.out.println("Tienes 20 años");

        } else {

            System.out.println("No tienes 18 ni 19 ni 20 años");

        }


            //4 ladrillos básicos:

            //1 - variables

            //1.1 para almacenar números

            // CREAR una variable:

            int edad;// form alenta
            edad =18;

            int edad2 = 18; // forma rapida


            //1.2 para almacenar textos

            String nombre = "Alberto";

            //1.3 para almacenar verdadero o falso

            boolean esmujer = true;

            //1.4 para almacenar LISTAS de números o de strings -arrays-

            //2 - condiciones

            //2.1 if

            int edad = 12;

            if(edad == 18)
            {

                System.out.println("Tienes 18 años");

            } else
            {
                System.out.println("No Tienes 18 años");
            }


            //2.2 if else if


            if(edad == 18)
            {

                System.out.println("Tienes 18 años");

            } else if(edad == 19)
            {

                System.out.println("Tienes 19 años");

            } else if(edad == 20)
            {

                System.out.println("Tienes 20 años");

            } else
            {

                System.out.println("No tienes 18 ni 19 ni 20 años");

            }

            //2.3 switch

            // ahora lo vamos a escribir MÄS BREVE con un switch:

            switch(edad)
            {
                case 18:
                    System.out.println("Tienes 18 años");
                    break;

                case 19:
                    System.out.println("Tienes 19 años");
                    break;

                case 20:
                    System.out.println("Tienes 20 años");
                    break;

                default:
                    System.out.println("No tienes 18 ni 19 ni 20 años");
                    break;

            }


            //2.4 try catch

            //3 - bucles

            //3.1 for

            System.out.println("Hola 1");
            System.out.println("Hola 2");

            // traza
            for (int i = 0; i < 4; i = i + 1) {

                System.out.println(i);

            }

            // hazme un for que me imprima los números pares, desde el 0 hasta el 8

            for (int i = 0; i < 9; i = i + 2) {

                System.out.println(i);

            }

            // hazame un for que me imprima los números del 10 al 1

            for (int i = 10; i > 0; i = i - 1) {

                System.out.println(i);

            }



            /*
            0
            1
            2
            3




             */



            //3.2 while

            //3.3 do while

            //3.4 for each

        //4 - funciones

            //4.1 - NO RETORNAN, NO RECIBEN

            //4.2 - NO RETORNAN, SÍ RECIBEN

            //4.3 - SÍ RETORNAN, SÍ RECIBEN

            //4.4 - SÍ RETORNAN, SÍ RECIBEN


    }
}
