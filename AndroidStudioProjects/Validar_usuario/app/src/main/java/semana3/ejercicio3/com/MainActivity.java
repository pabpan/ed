package semana3.ejercicio3.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_usuario);
        et2 = (EditText)findViewById(R.id.txt_contrasenya);
    }

    //MÉTODO PARA INICIAR SESIÓN

    public void Iniciar_sesion(View view){

        String usuario = et1.getText().toString();
        String contrasenya = et2.getText().toString();

        if (usuario.length() == 0){
            Toast.makeText(this, "Tienes que introducir un nombre", Toast.LENGTH_LONG).show();
        }
        if (contrasenya.length() == 0){
            Toast.makeText(this, "Tienes que introducir una Contraseña", Toast.LENGTH_LONG).show();
        }
        if (usuario.length() != 0 && contrasenya.length() != 0){
            Toast.makeText(this, "Comprobando datos", Toast.LENGTH_SHORT).show();
            Intent validar = new Intent(this, Sesion_iniciada.class);
            validar.putExtra("Usuario", et1.getText().toString());
            startActivity(validar);
        }
    }
}
