package Proyecto.util;

/**
 * @author Oswaldo Robles
 */
public class MyMath {

    public double calculoFactorial(double n1) {
        double acumulador = 1;

        for (int i = 1; i <= n1; i++) {
            acumulador = i * acumulador;
        }
        return acumulador;
    }

    public String explicacionResultadoFactorial(double n1) {
        String interacion = "\n Explicacion del factorial de: " + (int) n1
                + "\n Debemos de multiplicar todos los números desde el 1 hasta el " + (int) n1
                + "\n";
        for (int i = 1; i <= n1; i++) {
            if (i == n1) {
                interacion += i;
            } else {
                interacion += i + "*";
            }
        }
        interacion = interacion + " = " + calculoFactorial(n1);
        return interacion;
    }

    public int mcd(double n1, double n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        while (n2 != 0) {
            double temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return (int) n1;
    }

    public int mcm(double n1, double n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        return (int) ((n1 * n2) / mcd(n1, n2));
    }

    public String McdyMcm(double n1, double n2) {

        int n1_int = (int) n1;
        int n2_int = (int) n2;

        double resultMcd = mcd(n1_int, n2_int);
        double resultMcm = mcm(n1_int, n2_int);

        return "El MCD (Maximo Común divisor de " + n1_int + " y " + n2_int + " es: " + resultMcd
                + "\nEl MCM (Minimo Común múltiplo de " + n1_int + " y " + n2_int + " es: " + resultMcm;

    }

    public String explicacionResultadoMcdMcm(double n1, double n2) {
        int n1_int = (int) n1;
        int n2_int = (int) n2;

        String explicacion = "\nExplicación del MCD y MCM de " + n1_int + " y " + n2_int + ":\n";

        explicacion += "\n Cálculo del MCD usando el Algoritmo de Euclides:\n";
        int a = Math.abs(n1_int);
        int b = Math.abs(n2_int);
        while (b != 0) {
            explicacion += "MCD(" + a + ", " + b + ") -> " + a + " % " + b + " = " + (a % b) + "\n";
            int temp = b;
            b = a % b;
            a = temp;
        }
        int resultMcd = a;
        explicacion += "El MCD es: " + resultMcd + "\n";

        // Explicación del MCM
        explicacion += "\n🔹 Cálculo del MCM usando la fórmula:\n";
        int resultMcm = (n1_int * n2_int) / resultMcd;
        explicacion += "MCM = (" + n1_int + " × " + n2_int + ") / MCD(" + n1_int + ", " + n2_int + ") = "
                + "(" + n1_int * n2_int + ") / " + resultMcd + " = " + resultMcm + "\n";

        return explicacion;
    }

    public double calculoFibonacci(double n1) {
        if (n1 < 0) {
            throw new IllegalArgumentException("La posicion debe ser un numero no negativo");
        }

        if (n1 == 0) {
            return 0;
        }

        if (n1 == 1 || n1 == 2) {
            return 1;
        }

        long fibAnterior = 1;
        long fibActual = 1;
        long resultado = 0;

        for (int i = 3; i <= n1; i++) {
            resultado = fibAnterior + fibActual;
            fibAnterior = fibActual;
            fibActual = resultado;
        }
        return fibActual;
    }

    public String explicacionResultadoFibonacci(double n1) {

        String explicacion = "\nExplicación del Fibonacci en la posición " + (int) n1 + ":\n";

        if (n1 == 0) {
            return explicacion + "F(0) = 0";
        }

        if (n1 == 1 || n1 == 2) {
            return explicacion + "F(1) = 1\nF(2) = 1";
        }

        long fibAnterior = 1;
        long fibActual = 1;
        long resultado = 0;

        explicacion += "F(1) = 1\nF(2) = 1\n";

        for (int i = 3; i <= n1; i++) {
            resultado = fibAnterior + fibActual;
            explicacion += "F(" + i + ") = F(" + (i - 2) + ") + F(" + (i - 1) + ") = "
                    + fibAnterior + " + " + fibActual + " = " + resultado + "\n";
            fibAnterior = fibActual;
            fibActual = resultado;
        }

        explicacion += "El resultado es: " + fibActual;
        return explicacion;
    }

    public String primo(double n1) {
        if (n1 < 2) {
            return "No es primo";
        }

        for (int i = 2; i <= Math.sqrt(n1); i++) {
            if (n1 % i == 0) {
                return "No es primo";
            }
        }

        return "Es primo";
    }

    public String explicacionResultadoPrimo(double n1) {
        if (n1 < 2) {
            return "El número " + n1 + " no es primo porque los primos empiezan desde 2.";
        }

        String explicacion = "Verificando si " + n1 + " es primo:\n";
        boolean esPrimo = true;

        for (int i = 2; i <= Math.sqrt(n1); i++) {
            explicacion += "Probamos con " + i + ": " + n1 + " % " + i + " = " + (n1 % i) + "\n";
            if (n1 % i == 0) {
                explicacion += "El número " + n1 + " es divisible por " + i + ", por lo que No es primo.\n";
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            explicacion += "El número " + n1 + " Es primo porque no tiene divisores distintos de 1 y " + n1 + ".";
        }

        return explicacion;
    }

}
