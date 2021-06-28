import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //REQUEST BY CONSOLE FOR THE ANGLE
        
        
        String TypeOfOperation;
        double AngleInDegrees;
        System.out.println("Indique el angulo: ");
        Scanner angle = new Scanner(System.in);
        AngleInDegrees = angle.nextDouble();
        System.out.println("Indique el tipo de operación que desea ejecutar: ");
        Scanner Type = new Scanner(System.in);
        TypeOfOperation = Type.nextLine();
        double result = 0;
        double AngleInRadians = Math.toRadians(AngleInDegrees);
        
        //CALCULATE THE SINUS
        if(TypeOfOperation == "seno"){
            result = Math.sin(AngleInRadians);
            System.out.println("El seno de " + AngleInDegrees + "° = " + result);
        }
        
        //CALCULATE THE COSINE
        if(TypeOfOperation == "coseno"){
            result = Math.cos(AngleInRadians);
            System.out.println("El coseno de " + AngleInDegrees + "° = " + result);
        }
        
        //CALCULATE THE TANGENT
        if(TypeOfOperation == "tangente"){
            result = Math.tan(AngleInRadians);
            System.out.println("La tangente de " + AngleInDegrees + "° = " + result);
        }
        
        //CALCULATE THE ARCSIN
        if(TypeOfOperation == "arcoseno"){
            result = Math.asin(AngleInRadians);
            System.out.println("El arcoseno de " + AngleInDegrees + "° = " + result);
        }
        
        //CALCULATE THE ARCCOS
        if(TypeOfOperation == "arcocoseno"){
            result = Math.acos(AngleInRadians);
            System.out.println("El arcocoseno de " + AngleInDegrees + "° = " + result);
        }

        //CALCULATE THE ARCTAN
        if(TypeOfOperation == "arcotangente"){
            result = Math.atan(AngleInRadians);
            System.out.println("La arcotangente de " + AngleInDegrees + "° = " + result);
        }

        //CALCULATE THE SINH
        if(TypeOfOperation == "seno hiperbólico"){
            result = Math.sinh(AngleInRadians);
            System.out.println("El seno hiperbólico de " + AngleInDegrees + "° = " + result);
        }
        
        //CALCULATE THE COSH
        if(TypeOfOperation == "coseno hiperbólico"){
            result = Math.cosh(AngleInRadians);
            System.out.println("El coseno hiperbólico  de " + AngleInDegrees + "° = " + result);
        }

        //CALCULATE THE TANH
        if(TypeOfOperation == "tangente hiperbólica"){
            result = Math.tanh(AngleInRadians);
            System.out.println("La tangente hiperbólica de " + AngleInDegrees + "° = " + result);
        }
        else {
            System.out.println("error, digite una operación válida");
        } 
    }
}
