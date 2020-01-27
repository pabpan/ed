using System;
using Gtk;

namespace CTabla
{
    public class Panel
    {
        Random aleatorio = new Random();

        public Panel (VBox vBox)

        {
            Table table = new Table(3, 3, true);
            int index = 0;
            for (int row = 0; row < 3; row++)
                for (int col = 0; col < 3; col++)
                {
                    index++;
                    Button button = new Button();
                    table.Attach(button, (uint)col, (uint)col + 1, (uint)row, (uint)row + 1);
                    button.Label = ("Botón " + index.ToString());
                    button.Clicked += delegate {
                        button.ModifyBg(StateType.Normal, new Gdk.Color(100, 200, 250));
                    };
                }
            vBox.Add(table);
            table.ShowAll();
        }
    }
}