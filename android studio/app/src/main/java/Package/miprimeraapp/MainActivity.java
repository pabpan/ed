package Package.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*DECLARAMOS COMPONENTES DE TIPO PRIVADO*/

    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*INICIALIZAMOS LOS COMPONENTES*/

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
    }

    /*MÉTODO SUMA*/

    public void sumar(View View){

        /*Definimos las variables*/
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        /*Realizamos la operación*/
        int suma = num1 + num2;

        /*Mostrar el resultado y convertir a String de nuevo*/
        tv1.setText(String.valueOf(suma));
    }

    /*MÉTODO RESTA*/

    public void restar(View View){

        /*Definimos las variables*/
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        /*Realizamos la operación*/
        int resta = num1 - num2;

        /*Mostrar el resultado y convertir a String de nuevo*/
        tv1.setText(String.valueOf(resta));
    }

    /*MÉTODO MULTIPLICAR*/

    public void multiplicar(View View){

        /*Definimos las variables*/
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        /*Realizamos la operación*/
        int multiplicacion = num1 * num2;

        /*Mostrar el resultado y convertir a String de nuevo*/
        tv1.setText(String.valueOf(multiplicacion));
    }

    /*MÉTODO DIVIDIR*/

    public void dividir(View View){

        /*Definimos las variables*/
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        /*Realizamos la operación*/
        int division = num1 / num2;

        /*Mostrar el resultado y convertir a String de nuevo*/
        tv1.setText(String.valueOf(division));
    }
}
