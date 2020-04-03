package Package.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*DECLARAMOS COMPONENTES DE TIPO PRIVADO*/

    private EditText et1, et2;
    private TextView tv1, tv2;
    private RadioButton rb1, rb2, rb3, rb4;
    private CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PONER ICONO EN EL ACTION BAR

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        /*INICIALIZAMOS LOS COMPONENTES*/

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
        tv2 = (TextView) findViewById(R.id.txt_resultado_cb);
        rb1 = (RadioButton) findViewById(R.id.RB_SUMA);
        rb2 = (RadioButton) findViewById(R.id.RB_RESTA);
        rb3 = (RadioButton) findViewById(R.id.RB_MULTIPLICAR);
        rb4 = (RadioButton) findViewById(R.id.RB_DIVIDIR);
        cb1 = (CheckBox) findViewById(R.id.CB_SUMA);
        cb2 = (CheckBox) findViewById(R.id.CB_RESTA);
        cb3 = (CheckBox) findViewById(R.id.CB_MULTIPLICAR);
        cb4 = (CheckBox) findViewById(R.id.CB_DIVIDIR);
    }

    /*MÉTODO CERRAR TECLADO*/

    public void cerrar_teclado() {
        View v = this.getCurrentFocus();
        if (v != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }

    /*MÉTODO CALCULAR*/

    public void Calcular(View View) {

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        /*CONDICIONES PARA RADIOBUTTONS*/

        if (rb1.isChecked() == true) {
            int suma = num1 + num2;
            tv1.setText(String.valueOf(suma));
            rb1.setChecked(false);
            cerrar_teclado();
        } else if (rb2.isChecked() == true) {
            int resta = num1 - num2;
            tv1.setText(String.valueOf(resta));
            rb2.setChecked(false);
            cerrar_teclado();
        } else if (rb3.isChecked() == true) {
            int multiplicar = num1 * num2;
            tv1.setText(String.valueOf(multiplicar));
            rb3.setChecked(false);
            cerrar_teclado();
        } else if (rb4.isChecked() == true) {
            if (num2 != 0) {
                int dividir = num1 / num2;
                tv1.setText(String.valueOf(dividir));
            } else {
                Toast.makeText(this, "No se puede hacer la operación", Toast.LENGTH_LONG).show();
            }
            rb4.setChecked(false);
            cerrar_teclado();
        }


        /*CONDICIONES PARA CHECKBOX*/

        int suma_cb = num1 + num2;
        int resta_cb = num1 - num2;
        int multiplicacion_cb = num1 * num2;
        int division_cb = 0;
        String resultado = "";

        if (cb1.isChecked() == true) {
            if (cb2.isChecked() != true) {
                if (cb3.isChecked() != true) {
                    if (cb4.isChecked() != true) {
                        resultado = "La Suma es: " + suma_cb + "\n";
                    } else if (cb4.isChecked() == true) {
                        if (num2 != 0) {
                            division_cb = num1 / num2;
                        } else {
                            Toast.makeText(this, "No se puede hacer la operación", Toast.LENGTH_SHORT).show();
                        }
                        resultado = "La Suma es: " + suma_cb + "\n" + "La División es: " + division_cb + "\n";
                    }
                } else if (cb3.isChecked() == true) {
                    resultado = "La Suma es: " + suma_cb + "\n" + "La Multiplicación es: " + multiplicacion_cb + "\n";
                    if (cb4.isChecked() == true) {
                        if (num2 != 0) {
                            division_cb = num1 / num2;
                        } else {
                            Toast.makeText(this, "No se puede hacer la operación", Toast.LENGTH_SHORT).show();
                        }
                        resultado = "La Suma es: " + suma_cb + "\n" + "La Multiplicación es: " + multiplicacion_cb + "\n" + "La División es: " + division_cb + "\n";
                    }
                }
            } else if (cb2.isChecked() == true) {
                resultado = "La Suma es: " + suma_cb + "\n" + "La Resta es: " + resta_cb + "\n";
                if (cb3.isChecked() == true) {
                    resultado = "La Suma es: " + suma_cb + "\n" + "La Resta es: " + resta_cb + "\n" + "La Multiplicación es: " + multiplicacion_cb + "\n";
                }
                if (cb4.isChecked() == true) {
                    if (num2 != 0) {
                        division_cb = num1 / num2;
                    } else {
                        Toast.makeText(this, "No se puede hacer la operación", Toast.LENGTH_SHORT).show();
                    }
                    resultado = "La Suma es: " + suma_cb + "\n" + "La Resta es: " + resta_cb + "\n" + "La Multiplicación es: " + multiplicacion_cb + "\n" + "La División es: " + division_cb + "\n";
                }
            }
        } else if (cb2.isChecked() != true && cb3.isChecked() != true && cb4.isChecked() == true) {
            if (num2 != 0) {
                division_cb = num1 / num2;
            } else {
                Toast.makeText(this, "No se puede hacer la operación", Toast.LENGTH_SHORT).show();
            }
            resultado = "La División es: " + division_cb + "\n";
        } else if (cb2.isChecked() != true && cb3.isChecked() == true && cb4.isChecked() != true) {
            resultado = "La Multiplicación es: " + multiplicacion_cb + "\n";
        } else if (cb2.isChecked() == true && cb3.isChecked() != true && cb4.isChecked() != true) {
            resultado = "La Resta es: " + resta_cb + "\n";
        } else if (cb2.isChecked() == true && cb3.isChecked() == true && cb4.isChecked() != true) {
            resultado = "La Resta es: " + resta_cb + "\n" + "La Multiplicación es: " + multiplicacion_cb + "\n";
            ;
        } else if (cb2.isChecked() == true && cb3.isChecked() != true && cb4.isChecked() == true) {
            if (num2 != 0) {
                division_cb = num1 / num2;
            } else {
                Toast.makeText(this, "No se puede hacer la operación", Toast.LENGTH_SHORT).show();
            }
            resultado = "La Resta es: " + resta_cb + "\n" + "La División es: " + division_cb + "\n";

        } else if (cb2.isChecked() == true && cb3.isChecked() == true && cb4.isChecked() == true) {
            if (num2 != 0) {
                division_cb = num1 / num2;
            } else {
                Toast.makeText(this, "No se puede hacer la operación", Toast.LENGTH_SHORT).show();
            }
            resultado = "La Resta es: " + resta_cb + "\n" + "La Multiplicación es: " + multiplicacion_cb + "\n" + "La División es: " + division_cb + "\n";
        } else if (cb2.isChecked() != true && cb3.isChecked() == true && cb4.isChecked() == true) {
            if (num2 != 0) {
                division_cb = num1 / num2;
            } else {
                Toast.makeText(this, "No se puede hacer la operación", Toast.LENGTH_SHORT).show();
            }
            resultado = "La Multiplicación es: " + multiplicacion_cb + "\n" + "La División es: " + division_cb + "\n";
        }
        tv2.setText(resultado);
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        cerrar_teclado();
    }
}

/*SEMANA 1 - CÓDIGO COMENTADO*/

/*MÉTODO SUMA*//*


    public void sumar(View View){

        */
/*Definimos las variables*//*

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        */
/*Realizamos la operación*//*

        int suma = num1 + num2;

        */
/*Mostrar el resultado y convertir a String de nuevo*//*

        tv1.setText(String.valueOf(suma));
    }

    */
/*MÉTODO RESTA*//*


    public void restar(View View){

        */
/*Definimos las variables*//*

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        */
/*Realizamos la operación*//*

        int resta = num1 - num2;

        */
/*Mostrar el resultado y convertir a String de nuevo*//*

        tv1.setText(String.valueOf(resta));
    }

    */
/*MÉTODO MULTIPLICAR*//*


    public void multiplicar(View View){

        */
/*Definimos las variables*//*

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        */
/*Realizamos la operación*//*

        int multiplicacion = num1 * num2;

        */
/*Mostrar el resultado y convertir a String de nuevo*//*

        tv1.setText(String.valueOf(multiplicacion));
    }

    */
/*MÉTODO DIVIDIR*//*


    public void dividir(View View){

        */
/*Definimos las variables*//*

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        */
/*Realizamos la operación*//*

        int division = num1 / num2;

        */
/*Mostrar el resultado y convertir a String de nuevo*//*

        tv1.setText(String.valueOf(division));
    }
}
*/
