package org.example;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String opcionPc;
        int cantidadPartidasJugador;

        int puntosJugador = 0;
        int puntosPc = 0;

        // 1. Recibir datos del usuario

        Scanner input = new Scanner(System.in);

        String nombreUsuario;
        String opcionJugador;

        final String nombreComputador = "stockfish";

        boolean bandera = false;

        // Interfaz de bienvenida

        System.out.println("****************** StockFish ******************");
        System.out.print("Digita el nombre de usuario: ");
        nombreUsuario = input.nextLine();

        System.out.print(nombreUsuario+ ", digite la cantidad de partidas que quiere jugar: ");
        cantidadPartidasJugador = input.nextInt();

        //4. Implementar ciclo

        int counter = 0;

        while(counter < cantidadPartidasJugador){
            counter++;

            //5. Generando la opción del computador

            Random randomChoice = new Random();
            int numeroAleatorio = randomChoice.nextInt(3);

            if (numeroAleatorio == 0){
                opcionPc = "piedra";
            }
            else if (numeroAleatorio == 1) {
                opcionPc = "papel";

            }
            else {
                opcionPc = "tijera";
            }

            System.out.println("Escribe tu opción de juego: \n 1. Piedra \n 2. Papel \n 3. Tijera \n");
            opcionJugador = input.next().toLowerCase();

            if (opcionJugador.equals("papel") || opcionJugador.equals("tijera") || opcionJugador.equals("piedra")){

                System.out.println("El usuario elige: " + opcionJugador);
                System.out.println("El computador elige: " + opcionPc);

                if (opcionJugador.equals(opcionPc)){
                    System.out.println("Empate");
                    System.out.println("puntos pc: " + puntosPc + "\npuntos jugador: " + puntosJugador);
                }
                else if (opcionJugador.equals("piedra") && opcionPc.equals("tijera")){
                    System.out.println("Ganó el jugador");
                    puntosJugador++;
                    System.out.println("puntos pc: " + puntosPc + "\npuntos jugador: " + puntosJugador);

                }
                else if (opcionJugador.equals("tijera") && opcionPc.equals("papel")) {
                    System.out.println("Ganó el jugador");
                    puntosJugador++;
                    System.out.println("puntos pc: " + puntosPc + "\npuntos jugador: " + puntosJugador);

                }
                else if (opcionJugador.equals("papel") && opcionPc.equals("piedra")) {
                    System.out.println("Ganó el jugador");
                    puntosJugador++;
                    System.out.println("puntos pc: " + puntosPc + "\npuntos jugador: " + puntosJugador);

                }
                else{
                    puntosPc++;
                    System.out.println("puntos pc: " + puntosPc + "\npuntos jugador: " + puntosJugador);

                }

            }
            else {
                System.out.println("Escribe una opción valida (Piedra, Papel o Tijera)");
            }






            // 6. Elegir el ganador



            System.out.println("\n-------------------------------------");

        }
        if (puntosPc == puntosJugador){
            System.out.println("Empate");
        }
        else if (puntosPc > puntosJugador) {
            System.out.println("Ganó: " + nombreComputador);
        }
        else {
            System.out.println("Ganó: " + nombreUsuario);
        }

        /*TAREA:
        * 1: Implementar que el jugador juege tres veces
        * 2: Implementar cuantas ganó el humano o la maquina
        * 3: Implementar cuantas partidas quiere jugar el humano*/
    }


}