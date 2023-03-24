    public class Banco
    {
        private int identificador;
        private static int contadorIdentificador = 0;
        private String nombre;
        private double balance;

        public int getIdentificador()
        {
            return identificador;
        }
        public void setIdentificador(int identificador)
        {
            this.identificador = identificador;
        }
        public String getNombre()
        {
            return nombre;
        }

        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }

        public double getBalance()
        {
            return balance;
        }

        public void setBalance(double balance)
        {
            this.balance = balance;
        }
        public Banco ()
        {
            this.contadorIdentificador++;
            this.identificador = contadorIdentificador;
        }
        public Banco (String nombre, double balance)
        {
            this.contadorIdentificador++;
            this.identificador = contadorIdentificador;
            this.nombre = nombre;
            this.balance = balance;
        }
        public double credito (double deposito)
        {
            this.balance = this.balance + deposito;
            return balance;
        }
        public double debito (double sustraccion)
        {
            double auxi = this.balance;
            ///El método débito que representa una sustracción de dinero de la cuenta.
            //Este método debe devolver el balance luego de la operación. Si el dinero en
            //la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
            //pantalla un aviso.
            if(sustraccion > this.balance)
            {
                System.out.println("No hay suficiente dinero en tu cuenta.");
            }
            else
            {
                auxi = this.balance - sustraccion;
            }
            return auxi;
            ///Como retorno auxi debo setear el valor del objeto luego de el metodo debito
        }
        public void mostrar ()
        {
            System.out.printf("Nombre: " + this.nombre + "\n");
            System.out.println("ID: " + this.identificador);
            System.out.printf("Balance: " + this.balance + "\n");

        }
    }
