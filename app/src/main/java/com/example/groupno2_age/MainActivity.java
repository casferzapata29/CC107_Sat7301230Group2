package com.example.groupno2_age;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText efname, elname, eage;
    TextView teks1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);

        efname = (EditText) findViewById(R.id.editfirstname);
        elname = (EditText) findViewById(R.id.editlastname);
        eage = (EditText) findViewById(R.id.editage);
        teks1 = (TextView) findViewById(R.id.t1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numfname = efname.getText().toString();
                String numlname = elname.getText().toString();
                double numage = Double.parseDouble(eage.getText().toString());

                if (numage <= 17) {
                    teks1.setText(numfname + " " + numlname + "  Cannot Vote!!!");
                }
                if (numage >= 18) {
                    teks1.setText(numfname + " " + numlname + "  Can Vote!!!");
                }
            }
        });
    }
}