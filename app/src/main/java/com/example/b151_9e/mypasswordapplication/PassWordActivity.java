package com.example.b151_9e.mypasswordapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class PassWordActivity extends AppCompatActivity implements OnClickListener {

    private EditText password1ID;
    private EditText passwordID;
    private TextView messageID;
    private Button LoginButtonID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_word);

        password1ID = (EditText) findViewById(R.id.passWord1ID);
        passwordID = (EditText) findViewById(R.id.passwordID);
        //PasswordtextViewID = (TextView) findViewById(R.id.PasswordtextViewID);
        messageID = (TextView) findViewById(R.id.messageID);
        LoginButtonID = (Button) findViewById(R.id.LoginButtonID);
        LoginButtonID.setOnClickListener(this);

    }

    public void onClick(View v) {

        if (v.getId() == R.id.LoginButtonID){
            if (password1ID.getText().toString().equals(passwordID.getText().toString()))
            {
                messageID.setText("Success!!!");
            }     //.setText(passwordId.getText());
            else
            {
                messageID.setText("Password Not Match!!!");
            }
        }

    }
}