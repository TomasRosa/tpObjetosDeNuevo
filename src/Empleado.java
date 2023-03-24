public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public int getDni()
    {
        return dni;
    }

    public void setDni(int dni)
    {
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    public Empleado ()
    {

    }
    public Empleado(String nombre, String apellido,int dni, double salario)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }
    public double calcularSalarioAnual()
    {
        double salarioAnual = this.salario * 12;
        return salarioAnual;
    }
    public void aumentarSalarioPorcentaje (float porcentaje)
    {
        double aumento = this.salario*(porcentaje/100);
        this.salario = this.salario + aumento;
    }
    public void mostrar ()
    {
        System.out.println("Empleado[dni= " + this.dni + " nombre= " + this.nombre + " apellido= " + this.apellido + " salario= " + this.salario);
    }
}
