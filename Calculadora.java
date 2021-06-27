import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //REQUEST BY CONSOLE FOR THE ANGLE
        Scanner entry = new Scanner(System.in);
        double AngleInDegrees;
        System.out.print("Indique el angulo: ");
        AngleInDegrees = entry.nextDouble();
        double result = 0;
        double AngleInRadians = Math.toRadians(AngleInDegrees);
        
        //CALCULATE THE SINUS
        result = Math.sin(AngleInRadians);
        System.out.println("El seno de " + AngleInDegrees + "° = " + result);

        //CALCULATE THE COSINE
        result = Math.cos(AngleInRadians);
        System.out.println("El coseno de " + AngleInDegrees + "° = " + result);

        //CALCULATE THE TANGENT
        result = Math.tan(AngleInRadians);
        System.out.println("La tangente de " + AngleInDegrees + "° = " + result);

        //CALCULATE THE ARCSIN
       result = Math.asin(AngleInRadians);
       System.out.println("El arcseno de " + AngleInDegrees + "° = " + result);

        //CALCULATE THE ARCCOS
       result = Math.acos(AngleInRadians);
       System.out.println("El arccoseno de " + AngleInDegrees + "° = " + result);

        //CALCULATE THE ARCTAN
        result = Math.atan(AngleInRadians);
        System.out.println("La arctangente de " + AngleInDegrees + "° = " + result);

        //CALCULATE THE SINH
        result = Math.sinh(AngleInRadians);
        System.out.println("El seno hiperbolico de " + AngleInDegrees + "° = " + result);

        //CALCULATE THE COSH
        result = Math.cosh(AngleInRadians);
        System.out.println("El coseno hiperbolico  de " + AngleInDegrees + "° = " + result);

        //CALCULATE THE TANH
        result = Math.tanh(AngleInRadians);
        System.out.println("La tangente hiperbolica de " + AngleInDegrees + "° = " + result);
    }
}
