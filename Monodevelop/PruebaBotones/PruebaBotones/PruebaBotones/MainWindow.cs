using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    private Random aleatorio = new Random();

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnBSaludarClicked(object sender, EventArgs e)
    {
        MessageDialog md = new MessageDialog(null, DialogFlags.Modal, MessageType.Info, ButtonsType.Ok, "HOLA");
        md.Run();
        md.Destroy();
    }
    //PARA CREAR EL CO
    protected void OnSalirClicked(object sender, EventArgs e)
    {
        this.Destroy();
    }

    protected void OnAleatorioClicked(object sender, EventArgs e)
    {
        int indexAleatorio = aleatorio.Next(1, 10);
        MessageDialog a = new MessageDialog(null, DialogFlags.Modal,
        MessageType.Question, ButtonsType.Close, "Número aleatorio" + indexAleatorio);
        a.Run();
        a.Destroy();
    }
}
