package kanishk.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MainActivity extends AppCompatActivity {

    String eval = "";
    TextView text;
    //All of the buttons
    Button clear;
    Button delete ;
    Button enter;

    Button zero ;
    Button paren;
    Button paren2 ;
    Button plus ;

    Button seven;
    Button eight;
    Button nine ;
    Button minus ;

    Button four ;
    Button five;
    Button six ;
    Button multiply ;

    Button one;
    Button two ;
    Button three;
    Button divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        //All of the buttons


         clear = findViewById(R.id.clear);
         delete = findViewById(R.id.delete);
         enter = findViewById(R.id.enter);

         zero = findViewById(R.id.zero);
         paren = findViewById(R.id.paren);
         paren2 = findViewById(R.id.paren2);
         plus = findViewById(R.id.plus);

         seven = findViewById(R.id.seven);
         eight = findViewById(R.id.eight);
         nine = findViewById(R.id.nine);
         minus = findViewById(R.id.minus);

         four = findViewById(R.id.four);
         five = findViewById(R.id.five);
         six = findViewById(R.id.six);
         multiply = findViewById(R.id.multiply);

         one = findViewById(R.id.one);
         two = findViewById(R.id.two);
         three = findViewById(R.id.three);
         divide = findViewById(R.id.divide);

        //all of ze buttons
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval = "";
                text.setText(eval);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eval.length()>0)
                    eval = eval.substring(0,eval.length()-1);
                text.setText(eval);
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eval.length() == 0)
                    return;
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                Object result = null;
                Integer in = null;
                String db = null;
                try {
                    result = engine.eval(eval);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
//                try {
//                    in = (Integer)result;
//                } catch (ClassCastException e) {
//                    db = (String)result;
//                }
//                if(in==null)
//                    text.setText(String.valueOf(db));
//                else
//                    text.setText(in);
                text.setText(result.toString());
                eval = "";
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "0";
                text.setText(eval);
            }
        });
        paren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "(";
                text.setText(eval);
            }
        });
        paren2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += ")";
                text.setText(eval);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "+";
                text.setText(eval);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "7";
                text.setText(eval);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "8";
                text.setText(eval);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "9";
                text.setText(eval);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "-";
                text.setText(eval);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "4";
                text.setText(eval);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "5";
                text.setText(eval);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "6";
                text.setText(eval);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "*";
                text.setText(eval);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "1";
                text.setText(eval);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "2";
                text.setText(eval);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "3";
                text.setText(eval);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval += "/";
                text.setText(eval);
            }
        });

    }
}