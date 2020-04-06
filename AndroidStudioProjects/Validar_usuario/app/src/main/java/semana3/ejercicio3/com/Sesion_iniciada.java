package semana3.ejercicio3.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Sesion_iniciada extends AppCompatActivity {

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_iniciada);

        tv2=(TextView)findViewById(R.id.txt_sesion_iniciada);
        String info = getIntent().getStringExtra("Usuario");
        tv2.setText("Usuario: " + info);
    }

    //MÉTODO CERRAR

    public void Cerrar (View view){
        Intent cerrar = new Intent (this, MainActivity.class);
        startActivity(cerrar);
        Toast.makeText(this, "Hasta la próxima", Toast.LENGTH_LONG).show();

    }
}
