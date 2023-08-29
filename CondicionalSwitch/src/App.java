import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int valor_1, valor_2, resultado;
        double cociente = 0;
        System.out.println("----------MENU-----------");
        System.out.println("\t1) SUMAR");
        System.out.println("\t2) RESTAR");
        System.out.println("\t3) MULTIPLICAR");
        System.out.println("\t4) DIVIDIR");
        System.out.println("\t5) SALIR");
        System.out.println("----------MENU-----------");

        byte opcion = scanner.nextByte();

        switch (opcion) {
            case 1:
                System.out.println("----------SUMA-----------");
                System.out.println("Ingrese el primer valor: ");
                 valor_1 = scanner.nextInt();
                System.out.println("Ingrese el segundo valor: ");
                 valor_2 = scanner.nextInt();
                 resultado = valor_1 + valor_2;
                System.out.println("La suma de: " + valor_1 + " y " + valor_2 + " es: " + resultado);
                break;
            case 2:
                System.out.println("----------RESTA-----------");
                System.out.println("Ingrese el primer valor: ");
                 valor_1 = scanner.nextInt();
                System.out.println("Ingrese el segundo valor: ");
                 valor_2 = scanner.nextInt();
                 resultado = valor_1-valor_2;
                System.out.println("La resta de: " + valor_1 + " y " + valor_2 + " es: " + resultado);
                break;
            case 3:
                System.out.println("----------MULTIPLICACION-----------");
                System.out.println("Ingrese el primer valor: ");
                 valor_1 = scanner.nextInt();
                System.out.println("Ingrese el segundo valor: ");
                 valor_2 = scanner.nextInt();
                 resultado = valor_1*valor_2;
                System.out.println("La multiplicacion de: " + valor_1 + " y " + valor_2 + " es: " + resultado);
                break;
            case 4:
                System.out.println("----------DIVIDIR-----------");
                System.out.println("Ingrese el numerador valor: ");
                 double numerador = scanner.nextInt();
                System.out.println("Ingrese el denominador valor: ");
                 double denominador = scanner.nextInt();
                 if (denominador == 0) {
                    System.out.println("Usted no puede hacer semejante barbaridad");
                 } else {
                    cociente = numerador/denominador;
                    System.out.println("La division de: " + numerador + " y " + denominador + " es: " + cociente);
                 }
                
                break;
            case 5:
                System.out.println("Tenga buen dia");
                break;
        
            default:
            System.out.println("¡Oops, opcion incorrecta!");
                break;
        }

        System.out.println("Programa terminado");
        scanner.close();
    }
}
