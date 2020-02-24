using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    int contador = 0, opcion, contador_igual;
    float num1, num2, resultado;
    Gdk.Color colorines = new Gdk.Color(135, 171, 171);

    Operaciones resultados = new Operaciones();

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();

        ModifyBg(StateType.Normal, colorines);
        Ccancelar.ModifyBg(StateType.Normal, new Gdk.Color(222, 78, 48));
        Cmas.ModifyBg(StateType.Normal, new Gdk.Color(13, 164, 18));
        Cmenos.ModifyBg(StateType.Normal, new Gdk.Color(204, 208, 206));
        Cdividir.ModifyBg(StateType.Normal, new Gdk.Color(204, 208, 206));
        Cigual.ModifyBg(StateType.Normal, new Gdk.Color(204, 208, 206));
        Cmultiplicar.ModifyBg(StateType.Normal, new Gdk.Color(204, 208, 206));
        Ccoma.ModifyBg(StateType.Normal, new Gdk.Color(204, 208, 206));
        Cvaciar.ModifyBg(StateType.Normal, new Gdk.Color(204, 208, 206));
        Ctitulo.ModifyFont(Pango.FontDescription.FromString("Purisa Bold 18"));

    }
    //SUMA
    protected void OnCmasClicked(object sender, EventArgs e)
    {
        opcion = 1;
        num1 = Convert.ToSingle(Pantalla.Text);
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }
    //RESTA
    protected void OnCmenosClicked(object sender, EventArgs e)
    {
        opcion = 2;
        num1 = Convert.ToSingle(Pantalla.Text);
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }
    //MULTIPLICACIÓN
    protected void OnCmultiplicarClicked(object sender, EventArgs e)
    {
        opcion = 3;
        num1 = Convert.ToSingle(Pantalla.Text);
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }
    //DIVISIÓN
    protected void OnCdividirClicked(object sender, EventArgs e)
    {
        opcion = 4;
        num1 = Convert.ToSingle(Pantalla.Text);
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }
    //RESULTADO
    protected void OnCigualClicked(object sender, EventArgs e)
    {
        num2 = Convert.ToSingle(Pantalla.Text);
        Pantalla.DeleteText(0, Pantalla.Text.Length);

        if (contador_igual == 0)

        {
            switch (opcion)
            {
                case 1:

                    resultado = resultados.suma(num1, num2);
                    Pantalla.InsertText(Convert.ToString(resultado));
                    contador_igual++;
                    break;
                case 2:
                    resultado = resultados.resta(num1, num2);
                    Pantalla.InsertText(Convert.ToString(resultado));
                    contador_igual++;
                    break;
                case 3:
                    resultado = resultados.multiplicacion(num1, num2);
                    Pantalla.InsertText(Convert.ToString(resultado));
                    contador_igual++;
                    break;
                case 4:
                    resultado = resultados.division(num1, num2);
                    Pantalla.InsertText(Convert.ToString(resultado));
                    contador_igual++;
                    break;
            }
        }
        else
        {
            Pantalla.InsertText("Vacía para continuar");
            contador_igual++;
        }
    }
    //SALIR
    protected void OnCsalirClicked(object sender, EventArgs e)
    {
        Application.Quit();
    }
    //DECIMAL
    protected void OnCcomaClicked(object sender, EventArgs e)
    {

        if (contador == 0)
        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + ",");
            contador++;
        }
    }

    //LISTADO DE NÚMEROS:

    //CERO ====================================================//
    protected void OnCceroClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "0");
        }
    }
    //UNO ====================================================//
    protected void OnCunoClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "1");
        }
    }
    //DOS ====================================================//
    protected void OnCdosClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "2");
        }
    }
    //TRES ====================================================//
    protected void OnCtresClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "3");
        }
    }
    //CUATRO ====================================================//
    protected void OnCcuatroClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "4");
        }
    }
    //CINCO ====================================================//
    protected void OnCcincoClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "5");
        }
    }
    //SEIS ====================================================//
    protected void OnCseisClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "6");
        }
    }
    //SIETE ====================================================//
    protected void OnCsieteClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "7");
        }
    }
    //OCHO ====================================================//
    protected void OnCochoClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "8");
        }
    }
    //NUEVE ====================================================//
    protected void OnCnueveClicked(object sender, EventArgs e)
    {
        if (contador_igual == 0)

        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + "9");
        }
    }

    //VACIAR, CANCELAR

    protected void OnCcancelarClicked(object sender, EventArgs e)
    {
        Pantalla.DeleteText((Pantalla.Text.Length - 1), Pantalla.Text.Length);
        String display = Pantalla.Text.ToString();
        if (!display.Contains(","))
        {
            contador=0;
        }

    }
    protected void OnCvaciarClicked(object sender, EventArgs e)
    {
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        contador=0;
        contador_igual = 0;
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

}
