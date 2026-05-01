public abstract class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula){
        this.codigo=codigo;
        this.nombre=nombre;
        this.promedio=promedio;
        this.valorMatricula=valorMatricula;
    }


    public void mostrarDatos(){
        System.out.println("Código: "+codigo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Promedio: "+promedio);
        System.out.println("Valor de la matricula: "+valorMatricula);
    }

    public boolean validarPromedio(double promedio){
        return promedio >=0 && promedio<=10;
    }

    public abstract double calcularPagoFinal();

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        if(valorMatricula>0){
            System.out.println("El valor tiene que ser mayor a 0");
        }else{
            this.valorMatricula=valorMatricula;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre==null){
            System.out.println("El nombre no puede estar vacio");
        }else{
            this.nombre=nombre;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo==null){
            System.out.println("El código no puede estar vacio");
        }else{
            this.codigo=codigo;
        }
    }
}
