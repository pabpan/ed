using System;
using Gtk;


public partial class MainWindow : Gtk.Window
{
    int contador = 0;
    Gdk.Color colorines = new Gdk.Color(135, 171, 171);

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

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {

        Application.Quit();
        a.RetVal = true;

    }

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

    protected void OnCceroClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "0");

    }

    protected void OnCigualClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "=");
    }

    protected void OnCmasClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "+");
    }

    protected void OnCunoClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "1");
    }

    protected void OnCdosClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "2");
    }

    protected void OnCtresClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "3");
    }

    protected void OnCmenosClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "-");
    }

    protected void OnCcuatroClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "4");
    }

    protected void OnCcincoClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "5");
    }

    protected void OnCseisClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "6");
    }

    protected void OnCmultiplicarClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "*");
    }

    protected void OnCsieteClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "7");
    }

    protected void OnCochoClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "8");
    }
    protected void OnCnueveClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "9");
    }
    protected void OnCdividirClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "/");
    }

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
    }

    protected void OnCsalirClicked(object sender, EventArgs e)
    {
        Application.Quit();
    }

    protected void OnStyleSet(object o, StyleSetArgs args)
    {
    }
}
