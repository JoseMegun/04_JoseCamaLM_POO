/*Estudiante: José Megun Cama La Madrid*/
package S05_04JoseCama;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main_S05_04JoseCama {

       public static void main(String[] args) {
      
      // Uso de la clase Estudiante
        String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edadEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));

        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante);
        JOptionPane.showMessageDialog(null, "Información del estudiante:\nNombre: " + estudiante.getNombre() + "\nEdad: " + estudiante.getEdad());

        // Uso de la clase Libro
        String tituloLibro = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autorLibro = JOptionPane.showInputDialog("Ingrese el autor del libro:");

        Libro libro = new Libro(tituloLibro, autorLibro);
        JOptionPane.showMessageDialog(null, "Información del libro:\nTítulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor());
    }
}     
           
           
           
           
           
           
           
           
        Scanner scanner = new Scanner(System.in);

        // Crear una cuenta bancaria
        System.out.print("Ingrese el nombre del titular de la cuenta bancaria: ");
        String titularCuenta = scanner.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(titularCuenta);

        // Interactuar con la cuenta bancaria
        System.out.println("Acciones disponibles para la cuenta bancaria:");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.print("Seleccione una acción (1/2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad a depositar: ");
            double cantidad = scanner.nextDouble();
            cuenta.depositar(cantidad);
        } else if (opcion == 2) {
            System.out.print("Ingrese la cantidad a retirar: ");
            double cantidad = scanner.nextDouble();
            cuenta.retirar(cantidad);
        } else {
            System.out.println("Opción no válida.");
        }

        
        
        
        // Crear un auto
        System.out.print("Ingrese la marca del auto: ");
        scanner.nextLine(); // Limpiar el buffer de entrada
        String marcaAuto = scanner.nextLine();
        System.out.print("Ingrese el modelo del auto: ");
        String modeloAuto = scanner.nextLine();
        System.out.print("Ingrese el año del auto: ");
        int añoAuto = scanner.nextInt();

        Auto auto = new Auto(marcaAuto, modeloAuto, añoAuto);

        // Mostrar información del auto
        System.out.println("\nInformación del auto:");
        auto.mostrarInformacion();

        scanner.close();
    }
}
