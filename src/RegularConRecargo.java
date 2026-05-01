public class RegularConRecargo extends EstudianteRegular{
    private double recargoPendiente;

    public RegularConRecargo(String codigo, String nombre, double promedio, double valorMatricula, int numeroMaterias, double recargoPendiente){
        super(codigo, nombre, promedio, valorMatricula, numeroMaterias);
        this.recargoPendiente=recargoPendiente;

    }

    public double getRecargoPendiente() {
        return recargoPendiente;
    }

    public void setRecargoPendiente(double recargoPendiente) {
        if(recargoPendiente<0){
            System.out.println("No se permite recargo negativo");
        }else{
            this.recargoPendiente=recargoPendiente;
        }
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal();
        pago -= getRecargoPendiente();

        if (pago < 0) pago = 0;

        return pago;
    }


}
