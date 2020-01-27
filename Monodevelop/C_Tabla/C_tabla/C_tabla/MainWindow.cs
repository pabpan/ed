using System;
using CTabla;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    Random aleatorio = new Random();

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        //LLAMAMOS A LA FUNCIÓN PANEL QUE HEMOS CREADO
        Panel panel = new Panel(vBox);
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnbuttonsacarbolaClicked(object sender, EventArgs e)
    {

            int indexAleatorio = aleatorio.Next(1, 90);
            MessageDialog ms = new MessageDialog(null,DialogFlags.Modal,MessageType.Info, ButtonsType.Ok , "HOLA "+ indexAleatorio);
        ms.Run();
        ms.Destroy();

        for (int x = 0; x < 3; x++)
            for (int y = 0; y < 3; y++)
            {

            }
    }
}