package com.example.xochallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static boolean Xturn = true;
    TextView turn;
    static int[] Xarray = new int[9];
    static int[] Oarray = new int[9];
    static ArrayList<Button> buttons = new ArrayList<Button>();

    TextView winn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button zero = findViewById(R.id.button);
        final Button one = findViewById(R.id.button2);
        final Button two = findViewById(R.id.button3);
        final Button three = findViewById(R.id.button4);
        final Button four = findViewById(R.id.button5);
        final Button five = findViewById(R.id.button6);
        final Button six = findViewById(R.id.button7);
        final Button seven = findViewById(R.id.button8);
        final Button eight = findViewById(R.id.button9);
        winn = findViewById(R.id.textWin);
        Button reset = findViewById(R.id.reset);
        turn = findViewById(R.id.turnText);

        buttons.add(zero);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(seven);
        buttons.add(eight);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zero.setText("");
                zero.setBackgroundResource(R.drawable.button_background);
                one.setText("");
                one.setBackgroundResource(R.drawable.button_background);
                two.setText("");
                two.setBackgroundResource(R.drawable.button_background);
                three.setText("");
                three.setBackgroundResource(R.drawable.button_background);
                four.setText("");
                four.setBackgroundResource(R.drawable.button_background);
                five.setText("");
                five.setBackgroundResource(R.drawable.button_background);
                six.setText("");
                six.setBackgroundResource(R.drawable.button_background);
                seven.setText("");
                seven.setBackgroundResource(R.drawable.button_background);
                eight.setText("");
                eight.setBackgroundResource(R.drawable.button_background);
                winn.setText("");
                winn.setBackgroundColor(Color.parseColor("#a8e6cf"));


                for (int i = 0; i <= 8; i++) {
                    Xarray[i] = 0;
                    Oarray[i] = 0;
                }
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(Xturn);
                if (Xturn == true) {
                    Xarray[0] = 1;
                    zero.setText("X");
                    CheckIfXWon();


                } else {
                    Oarray[0] = 1;
                    zero.setText("O");
                    CheckIfOWon();


                }
                zero.setBackgroundResource(R.drawable.button_background2);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn == true) {
                    Xarray[1] = 1;
                    one.setText("X");
                    CheckIfXWon();

                } else {
                    Oarray[1] = 1;
                    one.setText("O");
                    CheckIfOWon();
                }
                one.setBackgroundResource(R.drawable.button_background2);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn == true) {
                    Xarray[2] = 1;
                    two.setText("X");
                    CheckIfXWon();


                } else {
                    Oarray[2] = 1;
                    two.setText("O");
                    CheckIfOWon();


                }
                two.setBackgroundResource(R.drawable.button_background2);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(Xturn);
                if (Xturn == true) {
                    Xarray[3] = 1;
                    System.out.println(Xarray[3]);
                    three.setText("X");
                    CheckIfXWon();

                } else {
                    Oarray[3] = 1;
                    three.setText("O");
                    CheckIfOWon();


                }
                three.setBackgroundResource(R.drawable.button_background2);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn == true) {
                    Xarray[4] = 1;
                    four.setText("X");
                    CheckIfXWon();

                } else {
                    Oarray[4] = 1;
                    four.setText("O");
                    CheckIfOWon();


                }
                four.setBackgroundResource(R.drawable.button_background2);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn == true) {
                    Xarray[5] = 1;
                    five.setText("X");
                    CheckIfXWon();
                    five.setBackgroundResource(R.drawable.button_background2);

                } else {
                    Oarray[5] = 1;
                    five.setText("O");
                    CheckIfOWon();
                    five.setBackgroundResource(R.drawable.button_background2);


                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn == true) {
                    Xarray[6] = 1;
                    six.setText("X");
                    System.out.println(Xarray[6]);
                    CheckIfXWon();
                    six.setBackgroundResource(R.drawable.button_background2);

                } else {
                    Oarray[6] = 1;
                    six.setText("O");
                    CheckIfOWon();
                    six.setBackgroundResource(R.drawable.button_background2);


                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn == true) {
                    Xarray[7] = 1;
                    seven.setText("X");
                    CheckIfXWon();
                    seven.setBackgroundResource(R.drawable.button_background2);

                } else {
                    Oarray[7] = 1;
                    seven.setText("O");
                    CheckIfOWon();
                    seven.setBackgroundResource(R.drawable.button_background2);


                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn == true) {
                    Xarray[8] = 1;
                    eight.setText("X");
                    CheckIfXWon();
                    eight.setBackgroundResource(R.drawable.button_background2);

                } else {
                    Oarray[8] = 1;
                    eight.setText("O");
                    CheckIfOWon();
                    eight.setBackgroundResource(R.drawable.button_background2);

                }
            }
        });

    }

    public void CheckIfXWon() {
        Xturn = false;
        turn.setText("It's O's turn now!");
        if (Xarray[0] == 1 && Xarray[1] == 1 && Xarray[2] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Xarray[3] == 1 && Xarray[4] == 1 && Xarray[5] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Xarray[6] == 1 && Xarray[7] == 1 && Xarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Xarray[0] == 1 && Xarray[3] == 1 && Xarray[6] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Xarray[1] == 1 && Xarray[4] == 1 && Xarray[7] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Xarray[2] == 1 && Xarray[5] == 1 && Xarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Xarray[0] == 1 && Xarray[4] == 1 && Xarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Xarray[2] == 1 && Xarray[4] == 1 && Xarray[6] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Xarray[0] != 0 && Xarray[3] != 0 && Xarray[6] != 0) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("X has won!");
            winn.setBackgroundResource(R.drawable.reset_button);

        }
    }

    public void CheckIfOWon() {
        Xturn = true;
        turn.setText("It's X's turn now!");
        if (Oarray[0] == 1 && Oarray[1] == 1 && Oarray[2] == 1) {
            Toast.makeText(MainActivity.this, "O has won!", Toast.LENGTH_LONG).show();
            winn.setText("O has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Oarray[3] == 1 && Oarray[4] == 1 && Oarray[5] == 1) {
            Toast.makeText(MainActivity.this, "O has won!", Toast.LENGTH_LONG).show();
            winn.setText("O has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Oarray[6] == 1 && Oarray[7] == 1 && Oarray[8] == 1) {
            Toast.makeText(MainActivity.this, "O has won!", Toast.LENGTH_LONG).show();
            winn.setText("O has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Oarray[0] == 1 && Oarray[3] == 1 && Oarray[6] == 1) {
            Toast.makeText(MainActivity.this, "X has won!", Toast.LENGTH_LONG).show();
            winn.setText("O has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Oarray[1] == 1 && Oarray[4] == 1 && Oarray[7] == 1) {
            Toast.makeText(MainActivity.this, "O has won!", Toast.LENGTH_LONG).show();
            winn.setText("O has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Oarray[2] == 1 && Oarray[5] == 1 && Oarray[8] == 1) {
            Toast.makeText(MainActivity.this, "O has won!", Toast.LENGTH_LONG).show();
            winn.setText("O has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Oarray[0] == 1 && Oarray[4] == 1 && Oarray[8] == 1) {
            Toast.makeText(MainActivity.this, "O has won!", Toast.LENGTH_LONG).show();
            winn.setText("O has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        } else if (Oarray[2] == 1 && Oarray[4] == 1 && Oarray[6] == 1) {
            Toast.makeText(MainActivity.this, "O has won!", Toast.LENGTH_LONG).show();
            winn.setText("O has won!");
            winn.setBackgroundResource(R.drawable.reset_button);
        }

    }


}
