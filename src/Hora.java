import com.sun.source.tree.ReturnTree;

public class Hora
{
    private int hora;
    private int minutos;
    private int segundos;

    public int getHora()
    {
        return hora;
    }

    public void setHora(int hora)
    {
        this.hora = hora;
    }

    public int getMinutos()
    {
        return minutos;
    }

    public void setMinutos(int minutos)
    {
        this.minutos = minutos;
    }

    public int getSegundos()
    {
        return segundos;
    }

    public void setSegundos(int segundos)
    {
        this.segundos = segundos;
    }
    public Hora ()
    {

    }
    public Hora (int hora,int minutos,int segundos)
    {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public void mostrar ()
    {
        System.out.printf("%02d:%02d:%02d \n", hora,minutos,segundos);
    }
    public int validarHora (int hora)
    {
        ///Le paso la hora por parametro debido a que primero debo validarla y luego colocarla en el objeto
        ///Si utilizo this estoy asumiendo que la hora ya esta en el objeto antes de validarla
        int flag = 0;
        if(hora > 23 || hora < 0)
        {
            flag = 1;
        }
        return flag;
    }
    public int validarMinutoSegundo (int minutoSegundo)
    {
        int flag = 0;
        if(minutoSegundo > 59 || minutoSegundo < 0)
        {
            flag = 1;
        }
        return flag;
    }
    public int avanzarUnSegundo ()
    {
        this.segundos++;

        if(this.segundos > 59)
        {
            this.segundos = 0;
            this.minutos++;
            if(this.minutos > 59)
            {
                this.hora++;
                this.minutos = 0;
                if(this.hora > 23)
                {
                    this.hora = 0;
                }
            }
        }
        return segundos;
    }
    public int retrocederUnSegundo ()
    {
        this.segundos--;
        if(this.segundos < 0)
        {
            this.segundos = 59;
            this.minutos--;
            if(this.minutos < 0)
            {
                this.hora--;
                this.minutos = 59;
                if(this.hora < 0)
                {
                    this.hora = 23;
                }
            }
        }
        return segundos;
    }
}
