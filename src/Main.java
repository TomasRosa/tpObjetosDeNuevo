import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el ejercicio que desea ver. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1();
                break;
            }
            case 2:
            {
                ejercicio2();
                break;
            }
            case 3:
            {
                ejercicio3();
                break;
            }
            case 4:
            {
                ejercicio4();
                break;
            }
            case 5:
            {
                ejercico5();
                break;
            }
        }
    }
    public static void ejercicio1 ()
    {
        Scanner scan = new Scanner (System.in);

        System.out.println("Ingrese el ancho del rectangulo. ");
        double ancho = scan.nextDouble();

        System.out.println("Ingrese el alto del rectangulo .");
        double alto = scan.nextDouble();

        Rectangulo forma = new Rectangulo(ancho,alto);

        forma.setAlto(alto);
        forma.setAncho(ancho);

        System.out.println("Alto: " + forma.getAlto());
        System.out.println("Ancho " + forma.getAncho());

        double area = forma.area();
        double perimetro = forma.perimetro();

        System.out.println("Area " + area);
        System.out.println("Perimetro " + perimetro);

        System.out.println("Ingrese un nuevo alto.");
        alto = scan.nextDouble();
        forma.setAlto(alto);
        System.out.println("Ingrese un nuevo ancho. ");
        ancho = scan.nextDouble();
        forma.setAncho(ancho);

        System.out.println("Nuevo alto: " + forma.getAlto());
        System.out.println("Nuevo ancho: " + forma.getAncho());

        System.out.println("Nueva area y perimetro: ");
        area = forma.area();
        perimetro = forma.perimetro();

        System.out.println("Nueva area: " + area);
        System.out.println("Nuevo perimetro " + perimetro);
    }
    public static void ejercicio2()
    {
        Scanner scan = new Scanner(System.in);
        Empleado empleado1 = new Empleado();
        System.out.println("Ingrese el nombre del empleado. ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el apellido del empleado. ");
        String apellido = scan.nextLine();
        System.out.println("Ingrese el salario del empleado. ");
        double salario = scan.nextDouble();
        System.out.println("Ingrese el dni del empleado. ");
        int dni = scan.nextInt();

        empleado1.setDni(dni);
        empleado1.setApellido(apellido);
        empleado1.setNombre(nombre);
        empleado1.setSalario(salario);

        empleado1.mostrar();

        System.out.println("Cuanto desea aumentar el salario de el empleado? ");
        float porcentaje = scan.nextFloat();

        empleado1.aumentarSalarioPorcentaje(porcentaje);

        System.out.println("Su nuevo salario es de: " + empleado1.getSalario());

        double salarioAnual = empleado1.calcularSalarioAnual();
        System.out.println("Su nuevo salario anual con el aumento es de: ");
    }
    public static void ejercicio3 ()
    {
        ///Hola

        Scanner scan = new Scanner(System.in);
        Item venta = new Item();
        Item venta2 = new Item();

        System.out.println("Descricpion: ");
        String descripcion = scan.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = scan.nextInt();
        System.out.println("Precio unitario: ");
        int precioUnitario = scan.nextInt();

        venta.setCantidad(cantidad);
        venta.setDescripcion(descripcion);
        venta.setPrecioUnitario(precioUnitario);

        venta2.setCantidad(2);
        venta2.setDescripcion("Pan bimbo");
        venta2.setPrecioUnitario(50);

        venta.mostrar();
        venta2.mostrar();
    }
    public static void ejercicio4 ()
    {
        Scanner scan = new Scanner(System.in);
        Banco cuenta = new Banco();

        System.out.println("Ingrese el nombre del titular del banco.");
        String nombre = scan.nextLine();
        System.out.println("Ingrese cuanto dinero tiene en su cuenta.");
        double balance = scan.nextDouble();

        cuenta.setBalance(balance);
        cuenta.setNombre(nombre);

        cuenta.mostrar();

        System.out.println("Ingrese cuanto dinero desea depositar. ");
        double deposito = scan.nextDouble();

        double nuevoBalance = cuenta.credito(deposito);
        ///No necesito hacer el set xq en el metodo utilizo el this, lo cambio desde ahi.
        System.out.println("Su cuenta luego del deposito: ");
        cuenta.mostrar();

        System.out.println("Ingrese cuanto dinero desea sacar de su cuenta. ");
        double debito = scan.nextDouble();
        double auxi = cuenta.debito(debito);
        ///Necesito hacer el set xq en el metodo debito devuelvo una variable, no utilizo el this para modificar.
        cuenta.setBalance(auxi);
        System.out.println("Su cuenta luego del debito: ");
        cuenta.mostrar();

        System.out.println("Ingrese cuanto dinero desea sacar de su cuenta. ");
        debito = scan.nextDouble();
        auxi = cuenta.debito(debito);
        cuenta.setBalance(auxi);
        System.out.println("Su cuenta luego del debito: ");
        cuenta.mostrar();
    }
    public static void ejercico5()
    {
        Scanner scan = new Scanner(System.in);
        Hora horita = new Hora();
        int hora;
        int minuto;
        int segundo;

        do
        {
            System.out.println("Ingrese la hora. ");
            hora = scan.nextInt();
        }while(horita.validarHora(hora)==1);

        do
        {
            System.out.println("Ingrese los minutos. ");
            minuto = scan.nextInt();
        }while(horita.validarMinutoSegundo(minuto)==1);

        do
        {
            System.out.println("Ingrese los segundos. ");
            segundo = scan.nextInt();
        }while(horita.validarMinutoSegundo(segundo)==1);

        horita.setHora(hora);
        horita.setMinutos(minuto);
        horita.setSegundos(segundo);

        horita.mostrar();

        int retorno = horita.avanzarUnSegundo();
        System.out.print("Hora con el segundo avanzado: \n");
        horita.mostrar();

        int retorno2= horita.retrocederUnSegundo();
        System.out.println("Hora con el segundo retrocedido: \n");
        horita.mostrar();
        ///Hola
    }

}