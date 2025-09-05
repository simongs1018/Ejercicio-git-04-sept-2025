//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int dado1=0, dado2=0, dado3=0;
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        for (int i = 0; i <= 21; i ++){
            dado1 = aleatorio.nextInt((6-1)+1)+1;
            res1+=dado1;

            dado2 = aleatorio.nextInt((6-1)+1)+1;
            res2+=dado2;

            dado3 = aleatorio.nextInt((6-1)+1)+1;
            res3+=dado3;
        }
        System.out.println("Suma total del dado 1: "+ res1);
        System.out.println("Suma total del dado 2: "+res2);
        System.out.println("Suma total del dado 3: "+ res3);

        int p1er=0 , s2do=0, t3er=0;
        if (res1 >= res2 && res1 >= res3){
            p1er = res1;
            if (res2 >= res3){
                s2do = res2;
                t3er = res3;
            }else{
                s2do = res3;
                t3er = res2;
            }

        }else if (res2 >= res1 && res2 >= res3){
            p1er = res2;
            if (res1 >= res3){
                s2do = res1;
                t3er = res3;
            }else{
                s2do = res3;
                t3er = res1;
            }

        }else if (res3 >= res1 && res3 >= res2){
            p1er = res3;
            if (res1 >= res2){
                s2do = res1;
                t3er = res2;
            }else{
                s2do = res2;
                t3er = res1;
            }

        }
        System.out.println("Primer puesto es "+p1er);
        System.out.println("Segundo puesto es "+s2do);
        System.out.println("Tercer puesto es "+t3er);
    }


}