public class BecadoExcelencia extends EstudianteBecado {
    private double bonoExcelencia;

    public BecadoExcelencia(String codigo, String nombre, double promedio,
                            double valorMatricula, double porcentajeBeca, double bonoExcelencia) {
        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        setBonoExcelencia(bonoExcelencia);
    }

    public void setBonoExcelencia(double bonoExcelencia) {
        if (bonoExcelencia >= 0) {
            this.bonoExcelencia = bonoExcelencia;
        } else {
            System.out.println("Bono inválido");
        }
    }

    public double getBonoExcelencia() {
        return bonoExcelencia;
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal();
        pago -= bonoExcelencia;

        if (pago < 0) pago = 0;

        return pago;
    }
}