package sg.edu.rp.c346.id22011199.week04ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvName;
    EditText etName;
    TextView tvTele;
    EditText etTele;
    TextView tvSize;
    EditText etSize;
    CheckBox cbSmoke;
    DatePicker dp;
    TimePicker tp;
    Button buttonReserve;
    Button buttonReset;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.textViewName);
        etName = findViewById(R.id.editTextName);
        tvTele = findViewById(R.id.textViewTelephone);
        etTele = findViewById(R.id.editTextTelephone);
        tvSize = findViewById(R.id.textViewSize);
        etSize = findViewById(R.id.editTextSize);
        cbSmoke = findViewById(R.id.checkBoxSmoke);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        buttonReset = findViewById(R.id.buttonReset);
        buttonReserve = findViewById(R.id.buttonReserve);


        buttonReserve.setOnClickListener(new View.OnClickListener() {

            String Name = String.valueOf(etName.getText());
            String number = String.valueOf(etTele.getText());
            String size = String.valueOf(etSize.getText());
            String time = String.valueOf(tp.getCurrentHour() + tp.getCurrentMinute());
            String date = String.valueOf(dp.getMonth() + dp.getDayOfMonth() + dp.getYear());

            if( cbSmoke.isChecked()){
                String smokeArea = "Smoking Area";
            }
            else{
                String smokeArea= "Non-smoking area";
            }


            String output = "Name : " + Name + ", Telephone: " + number + ", Size: " + size + smokeArea + ", Date: "+ date + ",Time: " + time;
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,output, Toast.LENGTH_SHORT).show();



            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvName.setText("");
                tvTele.setText(0);
                tvSize.setText(0);
                cbSmoke.setChecked(false);
                dp.updateDate(2023, 6,1);
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);




            }
        });




    }
}