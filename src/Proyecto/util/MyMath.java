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
    
    public String explicacionResultadoFactorial(double n1){
        String interacion="\n Explicacion del factorial de: "+(int) n1+
                "\n Debemos de multiplicar todos los números desde el 1 hasta el "+(int) n1+
                "\n";
        for(int i=1; i<= n1 ; i++){
            if(i==n1){
                interacion+=i;
            }else{
                interacion +=i+"*";
            }
        }
        interacion = interacion + " = "+calculoFactorial(n1);
        return interacion;
    }

}
