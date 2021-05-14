package sg.edu.rp.c346.id20019634.l04democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbEnabled;
        Button btnCheck;
        TextView tvShow;

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = "";

                if (cbEnabled.isChecked()) {
                    output = "The discount is given.";
                } else {
                    output = "The discount not is given.";
                }

                tvShow.setText(output);

            }
        });

    }
}