import java.util.*;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int ingreso;
        do {
            System.out.println("¿Qué quieres hacer?: \n" +
                    "#1 : Dos dados \n" +
                    "#2 : Tres dados \n" +
                    "#3 : IMC \n" +
                    "#4 : Adivinar número \n" +
                    "#5 : Salir");
            ingreso = entrada.nextInt();
            switch (ingreso) {
                case 1:
                    dados2();
                    break;
                case 2:
                    dados3();
                    break;
                case 3:
                    System.out.println(imc());
                    break;
                case 4:
                    adivinarNumero();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (ingreso != 5);
        entrada.close();
    }

    public static void dados2() {
        Random aleatory = new Random();
        int res01 = 0, res02 = 0;
        for (int i = 0; i < 21; i++) {
            res01 += aleatory.nextInt(6) + 1;
            res02 += aleatory.nextInt(6) + 1;
        }
        System.out.println("Suma total del dado 1: " + res01);
        System.out.println("Suma total del dado 2: " + res02);

        if (res01 >= res02) {
            System.out.println("Gana el dado 1");
        } else {
            System.out.println("Gana el dado 2");
        }
    }

    public static void dados3() {
        Random aleatorio = new Random();
        int res1 = 0, res2 = 0, res3 = 0;
        for (int i = 0; i < 21; i++) {
            res1 += aleatorio.nextInt(6) + 1;
            res2 += aleatorio.nextInt(6) + 1;
            res3 += aleatorio.nextInt(6) + 1;
        }
        System.out.println("Suma total del dado 1: " + res1);
        System.out.println("Suma total del dado 2: " + res2);
        System.out.println("Suma total del dado 3: " + res3);

        int[] resultados = {res1, res2, res3};
        Arrays.sort(resultados);

        System.out.println("Primer puesto: " + resultados[2]);
        System.out.println("Segundo puesto: " + resultados[1]);
        System.out.println("Tercer puesto: " + resultados[0]);
    }

    public static String imc() {
        Scanner teclas = new Scanner(System.in);
        System.out.println("Vamos a calcular su índice de masa corporal");
        System.out.print("Ingrese su peso en kilogramos (kg): ");
        double peso = teclas.nextDouble();
        System.out.print("Ingrese su estatura en metros (m): ");
        double estatura = teclas.nextDouble();

        double imc = peso / (estatura * estatura);
        String imc01;

        if (imc <= 18.5) {
            imc01 = "Bajo peso";
        } else if (imc <= 24.9) {
            imc01 = "Peso normal";
        } else if (imc <= 29.9) {
            imc01 = "Sobrepeso";
        } else if (imc <= 34.9) {
            imc01 = "Obesidad I";
        } else if (imc <= 39.9) {
            imc01 = "Obesidad II";
        } else if (imc <= 49.9) {
            imc01 = "Obesidad III";
        } else {
            imc01 = "Obesidad IV";
        }

        return "Su índice de masa corporal es: " + String.format("%.2f", imc) +
                " y su estado físico es: " + imc01;
    }

    // 🔹 NUEVO EJERCICIO
    public static void adivinarNumero() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(10) + 1; // número aleatorio entre 1 y 10
        int intento;
        System.out.println("He pensado un número del 1 al 10. ¡Adivínalo!");
        do {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();
            if (intento < numero) {
                System.out.println("El número es mayor.");
            } else if (intento > numero) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! El número era " + numero);
            }
        } while (intento != numero);
    }
}