package com.example.reg_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view)
    {
        EditText edtxt1 = findViewById(R.id.editTextText);
        EditText edtxt2 = findViewById(R.id.editTextText2);
        EditText edtxt3 = findViewById(R.id.editTextText3);
        TextView txtv1 = findViewById(R.id.textView3);
        TextView txtv2 = findViewById(R.id.textView2);
        TextView txtv3 = findViewById(R.id.textView);
        txtv1.setText(edtxt1.getText().toString());
        txtv2.setText(edtxt2.getText().toString());
        txtv3.setText(edtxt3.getText().toString());

    }
}