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
        System.out.println("El seno de " + AngleInDegrees + "° = " + AngleInRadians);

        //CALCULATE THE COSINE
        result = Math.cos(AngleInRadians);
        System.out.println("El coseno de " + AngleInDegrees + "° = " + AngleInRadians);

        //CALCULATE THE TANGENT
        result = Math.tan(AngleInRadians);
        System.out.println("La tangente de " + AngleInDegrees + "° = " + AngleInRadians);
    }
}
