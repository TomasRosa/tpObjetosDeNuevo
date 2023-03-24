public class Item
{
    ///static comparte el valor del atributo los objetos de una clase
    private static int contadorIdentificador = 0;
    private int identificador;
    private String descripcion;
    private int cantidad;
    private int precioUnitario;

    public int getIdentificador()
    {
        return identificador;
    }

    public void setIdentificador(int identificador)
    {
        this.identificador = identificador;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario()
    {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario)
    {
        this.precioUnitario = precioUnitario;
    }
    public Item()
    {
        this.contadorIdentificador++;
        this.identificador = contadorIdentificador;
    }
    public Item (String descripcion, int cantidad, int precioUnitario)
    {
        this.contadorIdentificador++;
        this.identificador = contadorIdentificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int precioTotal ()
    {
        int precioTotal = this.precioUnitario * this.cantidad;
        return precioTotal;
    }
    public void mostrar ()
    {
        System.out.println("ItemVenta[ id= " + this.identificador + ", descripcion= " + this.descripcion + ", cantidad= " + this.cantidad + ", unitario= " + this.precioUnitario + ", total= " + precioTotal());
    }


}
