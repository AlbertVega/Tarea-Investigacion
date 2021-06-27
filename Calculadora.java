import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        String TypeOfOperation;

        //REQUEST BY CONSOLE FOR THE ANGLE
        double AngleInDegrees;
        System.out.print("Indique el angulo: ");
        Scanner angle = new Scanner(System.in);
        AngleInDegrees = angle.nextDouble();

        // REQUEST BY CONSOLE THE TYPE OF OPERATION
        System.out.print("Indique el tipo de operación que desea ejecutar: ");
        Scanner Type = new Scanner(System.in);
        TypeOfOperation = Type.nextLine();

        //STORE THE RESULT
        double result = 0;

        //CONVERT THE ANGLE IN DEGREES TO RADIANS
        double AngleInRadians = Math.toRadians(AngleInDegrees);
        
        switch(TypeOfOperation) {
            //CALCULATE THE SINUS
            case "seno": 
                    result = Math.sin(AngleInRadians);
                    System.out.println("El seno de " + AngleInDegrees + "° = " + result);
                    break;

            //CALCULATE THE COSINE
            case "coseno":
                    result = Math.cos(AngleInRadians);
                    System.out.println("El coseno de " + AngleInDegrees + "° = " + result);
                    break;

            //CALCULATE THE TANGENT
            case "tangente":
                    result = Math.tan(AngleInRadians);
                    System.out.println("La tangente de " + AngleInDegrees + "° = " + result);
                    break;
        
            //CALCULATE THE ARCSIN
            case "arcoseno":
                    result = Math.asin(AngleInRadians);
                    System.out.println("El arcoseno de " + AngleInDegrees + "° = " + result);
                    break;

            //CALCULATE THE ARCCOS
            case "arcocoseno":
                    result = Math.acos(AngleInRadians);
                    System.out.println("El arcocoseno de " + AngleInDegrees + "° = " + result);
                    break;

            //CALCULATE THE ARCTAN
            case "arcotangente":
                    result = Math.atan(AngleInRadians);
                    System.out.println("La arcotangente de " + AngleInDegrees + "° = " + result);
                    break;

            //CALCULATE THE SINH
            case "seno hiperbolico":
                    result = Math.sinh(AngleInRadians);
                    System.out.println("El seno hiperbólico de " + AngleInDegrees + "° = " + result);
                    break;
            
            //CALCULATE THE COSH
            case "coseno hiperbolico":
                    result = Math.cosh(AngleInRadians);
                    System.out.println("El coseno hiperbólico  de " + AngleInDegrees + "° = " + result);
                    break;

            //CALCULATE THE TANH
            case "tangente hiperbolica":
                    result = Math.tanh(AngleInRadians);
                    System.out.println("La tangente hiperbólica de " + AngleInDegrees + "° = " + result);
                    break;
            default:
                System.out.println("Error, opciones disponibles:\n\t\t\t    seno\n\t\t\t    coseno\n\t\t\t    tangente\n\t\t\t    arcoseno\n\t\t\t    arcocoseno\n\t\t\t    arcotangente\n\t\t\t    seno hiperbolico\n\t\t\t    coseno hiperbolico\n\t\t\t    tagente hiperbolica\nAsegúrese de escribir bien las opciones y no escribir tíldes");
        }
    }
}
