using System;
using Gtk;

namespace CBingo
{
    public class Panel
    {
        Random aleatorio = new Random();

        public Panel (VBox vBox)

        {
            Table table = new Table(9, 10, true);
            int index = 0;
            for (int row = 0; row < 9; row++)
                for (int col = 0; col < 10; col++)
                {
                    index++;
                    Button button = new Button();
                    table.Attach(button, (uint)col, (uint)col + 1, (uint)row, (uint)row + 1);
                    //button.Label = ("Botón " + index.ToString());
                    button.Label = index.ToString();//insertar número en los botones
                    //button.Clicked += delegate {
                    //button.ModifyBg(StateType.Normal, new Gdk.Color(100, 200, 250));
                    //};
                }
            vBox.Add(table);
            table.ShowAll();
        }
    }
}