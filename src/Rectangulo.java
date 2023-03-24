public class Rectangulo {
    private double ancho;
    private double alto;

    public double getAncho()
    {
        return ancho;
    }

    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }

    public double getAlto()
    {
        return alto;
    }

    public void setAlto(double alto)
    {
        this.alto = alto;
    }
    public Rectangulo (double ancho, double alto)
    {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double area ()
    {
        double area = this.ancho * this.alto;
        return area;
    }
    public double perimetro()
    {
        double perimetro = this.ancho * 2 + this.alto * 2;
        return perimetro;
    }
}
