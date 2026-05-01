public abstract class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula){
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    public void mostrarDatos(){
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Valor matrícula: " + valorMatricula);
    }

    public abstract double calcularPagoFinal();

    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            System.out.println("Código inválido");
        } else {
            this.codigo = codigo;
        }
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre inválido");
        } else {
            this.nombre = nombre;
        }
    }

    public double getPromedio() { return promedio; }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido (0-10)");
        }
    }

    public double getValorMatricula() { return valorMatricula; }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula > 0) {
            this.valorMatricula = valorMatricula;
        } else {
            System.out.println("Valor matrícula inválido");
        }
    }
}
