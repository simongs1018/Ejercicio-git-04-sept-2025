import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main menus = new Main();
        menus.menu();

    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int ingreso, i = 0;
        do {
            System.out.println("¿Que quieres hacer?: \n" +
                    "#1 : Dos dados \n" +
                    "#2 : Tres dados \n" +
                    "#3 : IMC \n" +
                    "#4 : Salir");
            ingreso = entrada.nextInt();
            switch (ingreso) {
                case 1:
                    dados2();
                    break;
                case 2:
                    dados3();
                    break;
                case 3:
                    imc();
                    break;

            }
        } while (ingreso != 4);
    }

    public static void dados2() {
        Random aleatory = new Random();
        int dado01 = 0, dado02 = 0;
        int res01 = 0;
        int res02 = 0;
        for (int i = 0; i <= 21; i++) {
            dado01 = aleatory.nextInt((6 - 1) + 1) + 1;
            res01 += dado01;

            dado02 = aleatory.nextInt((6 - 1) + 1) + 1;
            res02 += dado02;

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
        int dado1 = 0, dado2 = 0, dado3 = 0;
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        for (int i = 0; i <= 21; i++) {
            dado1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            res1 += dado1;

            dado2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            res2 += dado2;

            dado3 = aleatorio.nextInt((6 - 1) + 1) + 1;
            res3 += dado3;
        }
        System.out.println("Suma total del dado 1: " + res1);
        System.out.println("Suma total del dado 2: " + res2);
        System.out.println("Suma total del dado 3: " + res3);

        int p1er = 0, s2do = 0, t3er = 0;
        if (res1 >= res2 && res1 >= res3) {
            p1er = res1;
            if (res2 >= res3) {
                s2do = res2;
                t3er = res3;
            } else {
                s2do = res3;
                t3er = res2;
            }

        } else if (res2 >= res1 && res2 >= res3) {
            p1er = res2;
            if (res1 >= res3) {
                s2do = res1;
                t3er = res3;
            } else {
                s2do = res3;
                t3er = res1;
            }

        } else if (res3 >= res1 && res3 >= res2) {
            p1er = res3;
            if (res1 >= res2) {
                s2do = res1;
                t3er = res2;
            } else {
                s2do = res2;
                t3er = res1;
            }

        }
        System.out.println("Primer puesto es " + p1er);
        System.out.println("Segundo puesto es " + s2do);
        System.out.println("Tercer puesto es " + t3er);

    }

    public static String imc() {
        Scanner teclas = new Scanner(System.in);
        double estatura, peso, imc;
        System.out.println("Vamos a calcular su indice de masa corporal \n" +
                "Ingrese su peso en kilogramos (kg)");
        peso = teclas.nextDouble();
        System.out.println("Ingrese su estatura en metros (m)");
        estatura = teclas.nextDouble();
        System.out.println("peso: " + peso + " estatura: " + estatura);
        imc = peso / (estatura * estatura);
        String imc01 = "";
        if (imc <= 18.5) {
            imc01 = "Bajo peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            imc01 = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            imc01 = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            imc01 = "Obesidad I";
        } else if (imc >= 35 && imc <= 39.9) {
            imc01 = "Obesidad II";
        } else if (imc >= 40 && imc <= 49.9) {
            imc01 = "Obesidad III";
        } else if (imc >= 50) {
            imc01 = "Obesidad IV";
        }

        return "Su indice de masa corporal es: " + imc + " y su estado fisico es: " + imc01;
    }
}