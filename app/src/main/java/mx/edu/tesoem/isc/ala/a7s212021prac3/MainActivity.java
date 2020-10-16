package mx.edu.tesoem.isc.ala.a7s212021prac3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

        String[] strestados;
        List listEstado;
        ArrayAdapter<String> adaptador;

        Spinner spestados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spestados = findViewById(R.id.sp_estados_D);
        strestados = new String[{"CDMX","DURANGO","PUEBLA","EDO.MEX","CHIAPAS","GUERRERO","TAMAULIPAS","GUADALAJARA","MONTERREY"}
    }
}