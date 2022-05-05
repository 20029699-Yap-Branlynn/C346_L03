package sg.edu.rp.c346.id20029699.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnClickMe;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup radioGrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bridge
        btnClickMe = findViewById(R.id.buttonDisplay);
        tvDisplay = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        radioGrp = findViewById(R.id.radioGroupGender);

        //set event
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code for action
                if (tbtn.isChecked() == true){
                    String stringResponse = etInput.getText().toString();
                    tvDisplay.setText(stringResponse);

                    int gender = radioGrp.getCheckedRadioButtonId();
                    if (gender == R.id.radioButtonMale){
                        tvDisplay.setText("He says " + stringResponse);
                    }else{
                        tvDisplay.setText("She says " + stringResponse);
                    }
                }
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbtn.isChecked() == true){
                    tvDisplay.setText("Enabled");
                }
                else {
                    tvDisplay.setText("Disabled");
                }
            }
        });
    }
}