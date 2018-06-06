package up.edu.br.jogodavelha;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    boolean jogador;
    int circulo;
    int x;
    int empate;
    TextView circle_wins;
    TextView draw;
    TextView x_wins;

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;


    public void validarJogada() {
        //Condições do Circulo
        if ((Integer) imageView.getTag() == R.drawable.circulo
                && (Integer) imageView2.getTag() == R.drawable.circulo
                && (Integer) imageView3.getTag() == R.drawable.circulo) {
            Toast.makeText(getApplicationContext(),
                    "Circulo Ganhou", Toast.LENGTH_LONG).show();
            circulo++;
            zerarJogo();
        }
        if ((Integer) imageView4.getTag() == R.drawable.circulo
                && (Integer) imageView5.getTag() == R.drawable.circulo
                && (Integer) imageView6.getTag() == R.drawable.circulo) {
            Toast.makeText(getApplicationContext(),
                    "Circulo Ganhou", Toast.LENGTH_LONG).show();
            circulo++;
            zerarJogo();
        }
        if ((Integer) imageView7.getTag() == R.drawable.circulo
                && (Integer) imageView8.getTag() == R.drawable.circulo
                && (Integer) imageView9.getTag() == R.drawable.circulo) {
            Toast.makeText(getApplicationContext(),
                    "Circulo Ganhou", Toast.LENGTH_LONG).show();
            circulo++;
            zerarJogo();
        }
        if ((Integer) imageView.getTag() == R.drawable.circulo
                && (Integer) imageView5.getTag() == R.drawable.circulo
                && (Integer) imageView9.getTag() == R.drawable.circulo) {
            Toast.makeText(getApplicationContext(),
                    "Circulo Ganhou", Toast.LENGTH_LONG).show();
            circulo++;
            zerarJogo();
        }
        if ((Integer) imageView3.getTag() == R.drawable.circulo
                && (Integer) imageView5.getTag() == R.drawable.circulo
                && (Integer) imageView7.getTag() == R.drawable.circulo) {
            Toast.makeText(getApplicationContext(),
                    "Circulo Ganhou", Toast.LENGTH_LONG).show();
            circulo++;
            zerarJogo();
        }
        if ((Integer) imageView.getTag() == R.drawable.circulo
                && (Integer) imageView4.getTag() == R.drawable.circulo
                && (Integer) imageView7.getTag() == R.drawable.circulo) {
            Toast.makeText(getApplicationContext(),
                    "Circulo Ganhou", Toast.LENGTH_LONG).show();
            circulo++;
            zerarJogo();
        }
        if ((Integer) imageView2.getTag() == R.drawable.circulo
                && (Integer) imageView5.getTag() == R.drawable.circulo
                && (Integer) imageView8.getTag() == R.drawable.circulo) {
            Toast.makeText(getApplicationContext(),
                    "Circulo Ganhou", Toast.LENGTH_LONG).show();
            circulo++;
            zerarJogo();
        }
        if ((Integer) imageView3.getTag() == R.drawable.circulo
                && (Integer) imageView6.getTag() == R.drawable.circulo
                && (Integer) imageView9.getTag() == R.drawable.circulo) {
            Toast.makeText(getApplicationContext(),
                    "Circulo Ganhou", Toast.LENGTH_LONG).show();
            circulo++;
            zerarJogo();
        }


        //Condições do X.
        if ((Integer) imageView.getTag() == R.drawable.x
                && (Integer) imageView2.getTag() == R.drawable.x
                && (Integer) imageView3.getTag() == R.drawable.x) {
            Toast.makeText(getApplicationContext(),
                    "X Ganhou", Toast.LENGTH_LONG).show();
            x++;
            zerarJogo();
        }
        if ((Integer) imageView4.getTag() == R.drawable.x
                && (Integer) imageView5.getTag() == R.drawable.x
                && (Integer) imageView6.getTag() == R.drawable.x) {
            Toast.makeText(getApplicationContext(),
                    "X Ganhou", Toast.LENGTH_LONG).show();
            x++;
            zerarJogo();
        }
        if ((Integer) imageView7.getTag() == R.drawable.x
                && (Integer) imageView8.getTag() == R.drawable.x
                && (Integer) imageView9.getTag() == R.drawable.x) {
            Toast.makeText(getApplicationContext(),
                    "X Ganhou", Toast.LENGTH_LONG).show();
            x++;
            zerarJogo();
        }
        if ((Integer) imageView.getTag() == R.drawable.x
                && (Integer) imageView5.getTag() == R.drawable.x
                && (Integer) imageView9.getTag() == R.drawable.x) {
            Toast.makeText(getApplicationContext(),
                    "X Ganhou", Toast.LENGTH_LONG).show();
            x++;
            zerarJogo();
        }
        if ((Integer) imageView3.getTag() == R.drawable.x
                && (Integer) imageView5.getTag() == R.drawable.x
                && (Integer) imageView7.getTag() == R.drawable.x) {
            Toast.makeText(getApplicationContext(),
                    "X Ganhou", Toast.LENGTH_LONG).show();
            x++;
            zerarJogo();
        }
        if ((Integer) imageView.getTag() == R.drawable.x
                && (Integer) imageView4.getTag() == R.drawable.x
                && (Integer) imageView7.getTag() == R.drawable.x) {
            Toast.makeText(getApplicationContext(),
                    "X Ganhou", Toast.LENGTH_LONG).show();
            x++;
            zerarJogo();
        }
        if ((Integer) imageView2.getTag() == R.drawable.x
                && (Integer) imageView5.getTag() == R.drawable.x
                && (Integer) imageView8.getTag() == R.drawable.x) {
            Toast.makeText(getApplicationContext(),
                    "X Ganhou", Toast.LENGTH_LONG).show();
            x++;
            zerarJogo();
        }
        if ((Integer) imageView3.getTag() == R.drawable.x
                && (Integer) imageView6.getTag() == R.drawable.x
                && (Integer) imageView9.getTag() == R.drawable.x) {
            Toast.makeText(getApplicationContext(),
                    "X Ganhou", Toast.LENGTH_LONG).show();
            x++;
            zerarJogo();
        }
        deuVelha();
    }

    public void deuVelha() {
        if ((Integer) imageView.getTag() != R.drawable.vazio
                && (Integer) imageView2.getTag() != R.drawable.vazio
                && (Integer) imageView3.getTag() != R.drawable.vazio
                && (Integer) imageView4.getTag() != R.drawable.vazio
                && (Integer) imageView5.getTag() != R.drawable.vazio
                && (Integer) imageView6.getTag() != R.drawable.vazio
                && (Integer) imageView7.getTag() != R.drawable.vazio
                && (Integer) imageView8.getTag() != R.drawable.vazio
                && (Integer) imageView9.getTag() != R.drawable.vazio) {
            Toast.makeText(getApplicationContext(),
                    "Deu Velha!", Toast.LENGTH_LONG).show();
            empate++;
            zerarJogo();
        }
    }

    public void zerarJogo() {
        imageView.setImageResource(R.drawable.vazio);
        imageView.setTag(R.drawable.vazio);
        imageView2.setImageResource(R.drawable.vazio);
        imageView2.setTag(R.drawable.vazio);
        imageView3.setImageResource(R.drawable.vazio);
        imageView3.setTag(R.drawable.vazio);
        imageView4.setImageResource(R.drawable.vazio);
        imageView4.setTag(R.drawable.vazio);
        imageView5.setImageResource(R.drawable.vazio);
        imageView5.setTag(R.drawable.vazio);
        imageView6.setImageResource(R.drawable.vazio);
        imageView6.setTag(R.drawable.vazio);
        imageView7.setImageResource(R.drawable.vazio);
        imageView7.setTag(R.drawable.vazio);
        imageView8.setImageResource(R.drawable.vazio);
        imageView8.setTag(R.drawable.vazio);
        imageView9.setImageResource(R.drawable.vazio);
        imageView9.setTag(R.drawable.vazio);

        draw.setText("Empates: " + empate);
        x_wins.setText("X: " + x);
        circle_wins.setText("Círculo: " + circulo);

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSair = (Button) findViewById(R.id.buttonSair);
        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        draw = (TextView) findViewById(R.id.draws);
        x_wins = (TextView) findViewById(R.id.x_wins);
        circle_wins = (TextView) findViewById(R.id.circle_wins);


        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView.getTag() != R.drawable.x) {
                        imageView.setImageResource(R.drawable.circulo);
                        imageView.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView.getTag() != R.drawable.circulo) {
                        imageView.setImageResource(R.drawable.x);
                        imageView.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();
            }
        });

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView2.getTag() != R.drawable.x) {
                        imageView2.setImageResource(R.drawable.circulo);
                        imageView2.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView2.getTag() != R.drawable.circulo) {
                        imageView2.setImageResource(R.drawable.x);
                        imageView2.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();
            }
        });

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView3.getTag() != R.drawable.x) {
                        imageView3.setImageResource(R.drawable.circulo);
                        imageView3.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView3.getTag() != R.drawable.circulo) {
                        imageView3.setImageResource(R.drawable.x);
                        imageView3.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();
            }
        });

        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView4.getTag() != R.drawable.x) {
                        imageView4.setImageResource(R.drawable.circulo);
                        imageView4.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView4.getTag() != R.drawable.circulo) {
                        imageView4.setImageResource(R.drawable.x);
                        imageView4.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();
            }
        });

        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView5.getTag() != R.drawable.x) {
                        imageView5.setImageResource(R.drawable.circulo);
                        imageView5.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView5.getTag() != R.drawable.circulo) {
                        imageView5.setImageResource(R.drawable.x);
                        imageView5.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();
            }
        });

        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView6.getTag() != R.drawable.x) {
                        imageView6.setImageResource(R.drawable.circulo);
                        imageView6.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView6.getTag() != R.drawable.circulo) {
                        imageView6.setImageResource(R.drawable.x);
                        imageView6.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();
            }
        });

        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView7.getTag() != R.drawable.x) {
                        imageView7.setImageResource(R.drawable.circulo);
                        imageView7.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView7.getTag() != R.drawable.circulo) {
                        imageView7.setImageResource(R.drawable.x);
                        imageView7.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();
            }
        });

        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView8.getTag() != R.drawable.x) {
                        imageView8.setImageResource(R.drawable.circulo);
                        imageView8.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView8.getTag() != R.drawable.circulo) {
                        imageView8.setImageResource(R.drawable.x);
                        imageView8.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();
            }
        });

        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    if ((Integer) imageView9.getTag() != R.drawable.x) {
                        imageView9.setImageResource(R.drawable.circulo);
                        imageView9.setTag(R.drawable.circulo);
                        jogador = false;
                    }
                } else {
                    if ((Integer) imageView9.getTag() != R.drawable.circulo) {
                        imageView9.setImageResource(R.drawable.x);
                        imageView9.setTag(R.drawable.x);
                        jogador = true;
                    }
                }
                validarJogada();

            }
        });
        zerarJogo();
    }
}