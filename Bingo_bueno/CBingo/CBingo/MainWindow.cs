using System;
using Gtk;
using CBingo;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Panel panel = new Panel(vbox1);
        /*Bombo bombo = new Bombo();
        BJugar.Clicked += delegate
        {
            int numero = bombo.sacarbola();
        }*/

    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnBJugarClicked(object sender, EventArgs e)
    {
        Bombo bombo = new Bombo();
        int numero = bombo.sacarbola();
    }
}
