package sg.edu.rp.c346.id22016635.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;

    ToggleButton tbtn;

    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editInput);
        tbtn = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.rdGroup);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale) {
                    tvDisplay.setText("He says " + stringResponse);
                }else if(checkedRadioId == R.id.radioButtonGenderFemale){
                    tvDisplay.setText("She says " + stringResponse);
                }
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tbtn.isChecked()){
                tvDisplay.setEnabled(true);
                etInput.setEnabled(true);
                }else{
                    tvDisplay.setEnabled(false);
                    etInput.setEnabled(false);
                }
            }
        });


    }
}