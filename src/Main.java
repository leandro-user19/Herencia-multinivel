import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese código: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Ingrese valor de matrícula: ");
        double valorMatricula = sc.nextDouble();

        System.out.print("Ingrese porcentaje de beca: ");
        double porcentajeBeca = sc.nextDouble();

        System.out.print("Ingrese bono de excelencia: ");
        double bono = sc.nextDouble();

        BecadoExcelencia e2 = new BecadoExcelencia(codigo, nombre, promedio, valorMatricula, porcentajeBeca, bono);

        e2.mostrarDatos();
        System.out.println("Pago Final: " + e2.calcularPagoFinal());

    }
}
