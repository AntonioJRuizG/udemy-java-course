public class Empleado extends Persona{
    private String departamento;

    public Empleado (String nombre, String edad, String departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles (){
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String Empleado (){
        return Persona();
    }
}
