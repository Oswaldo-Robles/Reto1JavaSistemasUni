package appjavasesion2trabajo1;

import java.util.Scanner;

public class AppJavaSesion2Trabajo1 {

    public static void main(String[] args) {
        System.out.println(calculoFactorial(5));

    }

    public static double calculoFactorial(double n1) {

        double resultadoFactorial = 1;
        for (int i = 1; i <= n1; i++) {
            resultadoFactorial = i*resultadoFactorial;
        }

        return resultadoFactorial;

    }

}
