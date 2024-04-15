package com.example.presentacionprueba;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txt_nombre,txt_codigo;
    TextView etiNombre,etiCodigo,etibienvenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_nombre=findViewById(R.id.txt_nombre);
        txt_codigo=findViewById(R.id.txt_codigo);
        etiNombre=findViewById(R.id.etiNombre);
        etiCodigo=findViewById(R.id.etiCodigo);
       etibienvenido=findViewById(R.id.etibienvenido);
    }

    public void evento(View view) {
    if(view.getId()==R.id.btn_ingresar){
    String nombre=txt_nombre.getText().toString();
    int codigo=Integer.parseInt(txt_codigo.getText().toString());
    String bienvenido="* Bienvenido *";
    etibienvenido.setText(bienvenido);
    etiNombre.setText(nombre);
    etiCodigo.setText(String.valueOf(codigo));
    }
    }
}