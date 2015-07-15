package testapp.myapplication;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private EditText height =null;
    private EditText weight =null;
    private Button button = null;
    private TextView show =null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button=(Button)findViewById(R.id.BMIbutton);
        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        show=(TextView)findViewById(R.id.show);

        Button button1=(Button)findViewById(R.id.BMIbutton1);

        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                //跳转第二个界面
                Intent intent=new Intent(MainActivity.this,OthterActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new OnClickListener() {
            double bmi = 0;

            public void onClick(View v) {
                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                bmi = w / (h * h);

                double final_resault = exchangeResault(bmi);
                if (bmi < 18.5) {

                    show.setText("Your BMI is" + final_resault +"" + "Weight a little light, pay attention to increasing the diet, let yourself become a snack bar.\n");

                } else if (bmi >= 18.5 || bmi < 24) {

                    show.setText("Your BMI is" + final_resault + "" + "Normal weight, continue to maintain.\n");

                } else if (bmi >= 24 || bmi < 27) {

                    show.setText("Your BMI is" + final_resault + "" + "A slightly heavier weight, remember to exercise.\n");

                } else if (bmi >= 27 || bmi < 30) {

                    show.setText("Your BMI is" + final_resault + "" + "Mild obesity, pay attention to diet, a lot of exercise.\n");

                } else if (bmi >= 30 || bmi < 35) {

                    show.setText("Your BMI is" + final_resault + "" + "Moderate obesity, in order to have a good body, appropriate control, appropriate weight loss.\n");

                } else if (bmi >= 35) {

                    show.setText("Your BMI is" + final_resault + "" + "Severe obesity, in order to avoid a variety of obesity caused by the disease, you have to lose weight.\n");

                }
            }
        });
    }


    public double exchangeResault(double resault){
        double first=resault*100;
        double second=(int)first;
        double second_first=first-second;

        if (second_first>0.5){
            second++;
        }
        double jirguo=(double)second/100;
        return jirguo;
    }
}


