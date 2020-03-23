﻿using System;
using Gtk;
using CBingo;

public partial class MainWindow : Gtk.Window
{
    Bombo bombo = new Bombo();
    Panel panel;

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        panel = new Panel(vbox1);
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnBJugarClicked(object sender, EventArgs e)
    {
        int numero = bombo.sacarbola();
        panel.Marcar(numero);
    }

    protected void OnBresetClicked(object sender, EventArgs e)
    {

        panel = new Panel(vbox1);
    }

    protected void OnBSalirClicked(object sender, EventArgs e)
    {
        Application.Quit();
    }
}
