package sg.edu.rp.c346.id22011199.week04ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

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

    }
}