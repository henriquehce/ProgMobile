package br.univali.aplicativo.cipriani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView resultado;
    private EditText nota1;
    private EditText nota2;
    private Button Calculo;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        nota1 = findViewById(R.id.Nota1);
        nota2 = findViewById(R.id.nota2);
        Calculo = findViewById(R.id.somar);

        Calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(String.valueOf(nota1.getText()));
                int n2 = Integer.parseInt((String.valueOf(nota2.getText())));
                int res2 = n1+n2;
                resultado.setText("Resultado: " + res2);

            }
        });



    }
}