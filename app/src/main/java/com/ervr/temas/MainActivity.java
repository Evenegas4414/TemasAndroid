package com.ervr.temas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private int temaActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(temaActual);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        temaActual = R.style.Tema1;

        Button botonTema = findViewById(R.id.boton_tema);
        botonTema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temaActual == R.style.Tema1) {
                    temaActual = R.style.Tema2;

                } else {
                    temaActual = R.style.Tema1;
                }
                recreate();
            }
        });

        Snackbar.make(findViewById(android.R.id.content), "¡Bienvenido/a!", Snackbar.LENGTH_LONG).show();
    }
}
