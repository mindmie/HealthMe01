package com.example.mindmie.healthme01.seniorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //variable
    private Button btnSignin;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        bindview();


    }

    private void initView() {

        findViewById(R.id.btn_sign_in).setOnClickListener(this);
        findViewById(R.id.btn_sign_up).setOnClickListener(this);
    }

    private void bindview() {
        //mapping variable and layout
        btnSignin = (Button) findViewById(R.id.btn_sign_in);
        btnSignup = (Button) findViewById(R.id.btn_sign_up);
    }


    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.btn_sign_in) {
            Toast.makeText(this, "go to sign-in Activity", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, SignInActivity.class);
            startActivity(i);

        } else if (viewId == R.id.btn_sign_up) {
            Toast.makeText(this, "go to sign-up Activity", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, SignUpActivity.class);
            startActivity(i);
        }

    }
}
