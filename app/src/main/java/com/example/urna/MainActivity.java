package com.example.urna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean clicou = false;
    String random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Um = findViewById(R.id.button);
        Button Dois = findViewById(R.id.button2);
        Button Tres = findViewById(R.id.button3);
        Button Quatro = findViewById(R.id.button4);
        Button Cinco = findViewById(R.id.button5);
        Button Seis = findViewById(R.id.button6);
        Button Sete = findViewById(R.id.button7);
        Button Oito = findViewById(R.id.button8);
        Button Nove = findViewById(R.id.button9);
        Button Zero = findViewById(R.id.button10);
        Button Branco = findViewById(R.id.btnBranco);
        Button Corrige = findViewById(R.id.btnCorrige);
        Button Confirma = findViewById(R.id.btnConfirmar);
        Button Candidatos = findViewById(R.id.btnCandidatos);

        final TextView Num1 = findViewById(R.id.txtNum1);
        final TextView Num2 = findViewById(R.id.txtNum2);
        final TextView Nome = findViewById(R.id.txtNome);
        final TextView vBranco = findViewById(R.id.txtBranco);
        final TextView partido = findViewById(R.id.txtPartido);
        final ImageView imagem = findViewById(R.id.imageView);
        final MediaPlayer grunt = MediaPlayer.create(this, R.raw.grunt);
        final MediaPlayer license = MediaPlayer.create(this, R.raw.license);
        final MediaPlayer jr = MediaPlayer.create(this, R.raw.jr);
        final MediaPlayer urso = MediaPlayer.create(this, R.raw.urso);

        Um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("1");
                }
                if (clicou) {
                    Num2.setText("1");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Dois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("2");
                }

                if (clicou) {
                    Num2.setText("2");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("3");
                }

                if (clicou) {
                    Num2.setText("3");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Quatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("4");
                }

                if (clicou) {
                    Num2.setText("4");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("5");
                }

                if (clicou) {
                    Num2.setText("5");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("6");
                }

                if (clicou) {
                    Num2.setText("6");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Sete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("7");
                }

                if (clicou) {
                    Num2.setText("7");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Oito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("8");
                }

                if (clicou) {
                    Num2.setText("8");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("9");
                }

                if (clicou) {
                    Num2.setText("9");
                } else {
                    random = "";
                }
                clicou = true;
            }
        });

        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicou) {
                    random = "";
                } else {
                    Num1.setText("0");
                }

                if (clicou) {
                    Num2.setText("0");
                } else {
                    random = "";
                }
                clicou = true;


            }
        });

        Branco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vBranco.setText("VOTO EM BRANCO");
            }
        });

        Corrige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num1.setText("");
                clicou = false;
                Num2.setText("");
            }
        });

        Confirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Num1.getText() == "0" && Num2.getText() == "1") {
                    Nome.setText("RUSBÉ");
                    imagem.setImageResource(R.drawable.rusbe);
                    partido.setText("Partido: MK - Moonwalk");
                    grunt.start();

                } else if (Num1.getText() == "9" && Num2.getText() == "2") {
                    Nome.setText("Carl Johnson");
                    imagem.setImageResource(R.drawable.carl);
                    partido.setText("Partido: GSF - Grove Street Families");
                    license.start();
                } else if (Num1.getText() == "2" && Num2.getText() == "4") {
                    Nome.setText("Pai de Família");
                    imagem.setImageResource(R.drawable.urso);
                    partido.setText("Partido: DLC - Delícia");
                    urso.start();
                } else if (Num1.getText() == "1" && Num2.getText() == "1") {
                    Nome.setText("JRGAMESX");
                    imagem.setImageResource(R.drawable.jr);
                    partido.setText("Partido: PB - Partido do Baleião");
                    jr.start();
                }
            }
        });

         Candidatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(MainActivity.this, activity2.class);

                startActivity(tela2);
            }
        });




    }
}