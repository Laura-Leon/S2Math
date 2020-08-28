package com.example.s2math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView muestra;
    private EditText editar;
    private TextView tiempo;
    //con este resonde la pregunta
    private Button buttonResponder;

    private TextView TextPuntaje;

    private ArrayList<Pregunta> preguntas;

    private Button intentarDeNuevo;


    private int punticos = 0;
    private int contador = 30;



//para recordar. onCreate es como el setup donde la magia ocurre

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referenciar
        muestra = findViewById(R.id.muestra);
        editar = findViewById(R.id.editar);
        tiempo = findViewById(R.id.tiempo);
        buttonResponder = findViewById(R.id.buttonResponder);
        TextPuntaje = findViewById(R.id.TextPuntaje);
        intentarDeNuevo = findViewById(R.id.intentarDeNuevo);



        // -- //
        preguntas = new ArrayList<Pregunta>();
        for (int i =0; i < 1; i ++) {
            preguntas.add (new Pregunta ());
            preguntas.get(i).ejercicio();
            muestra.setText(""+preguntas.get(i).getDuda());
        }



        buttonResponder.setOnClickListener(
                (View) -> {
                    String responder = editar.getText().toString();
                    for (int i = 0; i < preguntas.size(); i++) {
                        if (preguntas.get(i).getRespuesta().equals(responder)) {
                            preguntas.get(i).ejercicio();
                            muestra.setText("" + preguntas.get(i).getDuda());

                            //aqui se aumenta el puntaje cuando es correcto
                            punticos += 10;
                            TextPuntaje.setText("" + punticos);

                        } else {

                        }

                    }
                }
        );

        intentarDeNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < preguntas.size(); i++) {

                        preguntas.get(i).ejercicio();
                        muestra.setText("" + preguntas.get(i).getDuda());
                    }

                punticos = 0;
                contador = 30;
                TextPuntaje.setText("" + punticos);


                new Thread(

                        () -> {
                            while (contador > 0) {
                                contador--;
                                runOnUiThread(() -> {
                                    tiempo.setText("" + contador);
                                    if (contador > 0) {
                                        intentarDeNuevo.setVisibility(View.GONE);
                                    } else {
                                        intentarDeNuevo.setVisibility(View.VISIBLE);
                                    }

                                });
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                ).start();
            }
        });



        new Thread(

                () -> {
                    while (contador > 0) {
                        contador--;
                        runOnUiThread(() -> {
                            tiempo.setText("" + contador);
                            if (contador > 0) {
                                intentarDeNuevo.setVisibility(View.GONE);
                            } else {
                                intentarDeNuevo.setVisibility(View.VISIBLE);
                            }

                        });
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        ).start();

    }
}