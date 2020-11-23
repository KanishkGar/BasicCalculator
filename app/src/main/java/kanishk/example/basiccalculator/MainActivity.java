package kanishk.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String eval = "";
    TextView text = findViewById(R.id.text);
    //All of the buttons
    Button clear = findViewById(R.id.clear);
    Button delete = findViewById(R.id.delete);
    Button enter = findViewById(R.id.enter);

    Button zero = findViewById(R.id.clear);
    Button paren = findViewById(R.id.paren);
    Button paren2 = findViewById(R.id.paren2);
    Button plus = findViewById(R.id.plus);

    Button seven = findViewById(R.id.seven);
    Button eight = findViewById(R.id.eight);
    Button nine = findViewById(R.id.nine);
    Button minus = findViewById(R.id.minus);

    Button four = findViewById(R.id.four);
    Button five = findViewById(R.id.five);
    Button six = findViewById(R.id.six);
    Button multiply = findViewById(R.id.multiply);

    Button one = findViewById(R.id.one);
    Button two = findViewById(R.id.two);
    Button three = findViewById(R.id.three);
    Button divide = findViewById(R.id.divide);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                eval = eval.substring(eval.length()-2);
                text.setText(eval);
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //text.setText(eval);
            }
        });

    }
}