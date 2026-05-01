public class BecadoExcelencia extends EstudianteBecado{
    private double bonoExcelencia;

    public BecadoExcelencia(String codigo, String nombre, double promedio, double valorMatricula, double bonoExcelencia, double porcentajeBeca){
        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        this.bonoExcelencia=bonoExcelencia;
    }

    public double getBonoExcelencia() {
        return bonoExcelencia;
    }

    public void setBonoExcelencia(double bonoExcelencia) {
        if (bonoExcelencia < 0) {
            System.out.println("El bono no puede ser negativo");
        } else {
            this.bonoExcelencia = bonoExcelencia;
        }
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal();
        pago -= getBonoExcelencia();

        if (pago < 0) pago = 0;

        return pago;
    }
}
