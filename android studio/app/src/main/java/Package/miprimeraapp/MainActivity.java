package Package.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*FUNCIÓN SUMA*/

    protected int suma(int suma){
        int num1=0;
        int num2=0;
        suma=num1+num2;
        return suma;


    }
}