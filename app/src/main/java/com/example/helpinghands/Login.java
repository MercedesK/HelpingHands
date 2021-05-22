package com.example.helpinghands;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
public class Login {
}


    private Button lButton;
private android.widget.TextView ltextView;
    private android.widget.TextView ltextView2;
    private android.widget.TextView ltextView3;
    private android.widget.EditText editTextTextEmailAddress;
    private android.widget.EditText editTextTextPassword;


@Override
protected void onCreate(Bundle savedInstanceState) {
    Object savedInsanceState;
    super.onCreate(savedInsanceState);
    setContentView(R.layout.login_1); 

    lButton = (Button) findViewByID(R.id.lButton);
    ltextView = (android.widget.TextView) findViewByID(R.id.ltextView);
    ltextView2 = (android.widget.TextView) findViewByID(R.id.ltextView2);
    ltextView3 = (android.widget.TextView) findViewByID(R.id.ltextView3);
    editTextTextEmailAddress = (android.widget.EditText) findViewByID(R.id.editTextTextEmailAddress);
    editTextTextPassword = (android.widget.EditText) findViewByID(R.id.editTextTextPassword);
lButton.setText(R.string.button_name); }

    private Object findViewByID(int ltextView) {
    }
    private Object findViewByID(int ltextView2) {
    }
    private Object findViewByID(int ltextView3) {
    }







