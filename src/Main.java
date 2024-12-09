// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

/*
Enunciado:  Tomando como base la Actividad #3, elaborar una aplicación
 de consola que permita almacenar información sobre un visitante a un
 edificio de departamentos utilizando todos los tipos de datos primitivos
 en Java. Diseña un programa que lea por teclado todas las visitas que
 realice dicha persona durante una semana y que al final calcule la cantidad
 total de visitas, el tiempo promedio de estadía de todas las visitas,
 y si la persona es mayor o menor de edad. Ya no se admiten valores constantes.
*/

// importamos la clase Scanner del paquete java.util
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer la información del visitante
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar y leer la edad
        System.out.print("Ingrese la edad: ");
        byte edad = scanner.nextByte();

        // Solicitar y leer el número de departamento
        System.out.print("Ingrese el número de departamento: ");
        short numeroDepartamento = scanner.nextShort();

        // Solicitar y leer el teléfono
        System.out.print("Ingrese el teléfono: ");
        long telefono = scanner.nextLong();

        // Solicitar y leer la altura
        System.out.print("Ingrese la altura (en metros): ");
        float altura = scanner.nextFloat();

        // Solicitar y leer el peso
        System.out.print("Ingrese el peso (en kg): ");
        double peso = scanner.nextDouble();

        // Solicitar y leer el género
        System.out.print("Ingrese el género (M/F): ");
        char genero = scanner.next().charAt(0);

        // Solicitar y leer si es residente
        System.out.print("¿Es residente? (true/false): ");
        boolean esResidente = scanner.nextBoolean();

        // Inicializar variables para contar las visitas y el tiempo total de estadía
        int totalVisitas = 0;
        int totalTiempoEstadia = 0;

        // Solicitar y leer las visitas durante una semana
        for (int i = 1; i <= 7; i++) {
            // Solicitar y leer el número de visitas del día
            System.out.print("Ingrese el número de visitas del día " + i + ": ");
            int visitasDia = scanner.nextInt();
            totalVisitas += visitasDia;

            // Solicitar y leer el tiempo de estadía del día
            System.out.print("Ingrese el tiempo de estadía (en minutos) del día " + i + ": ");
            int tiempoEstadiaDia = scanner.nextInt();
            totalTiempoEstadia += tiempoEstadiaDia;
        }

        // Calcular el tiempo promedio de estadía
        double tiempoPromedioEstadia;
        if (totalVisitas > 0) {
            tiempoPromedioEstadia = (double) totalTiempoEstadia / totalVisitas;
        } else {
            tiempoPromedioEstadia = 0;
        }

        // Determinar si la persona es mayor o menor de edad
        String mayorOMenor;
        if (edad >= 18) {
            mayorOMenor = "mayor de edad";
        } else {
            mayorOMenor = "menor de edad";
        }

        // Imprimir la información del visitante y los cálculos
        System.out.println("\nInformación del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de departamento: " + numeroDepartamento);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Género: " + genero);
        System.out.println("Es residente: " + esResidente);
        System.out.println("Total de visitas en la semana: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedioEstadia + " minutos");
        System.out.println("La persona es " + mayorOMenor);
    }
}