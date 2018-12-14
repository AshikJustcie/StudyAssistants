package com.ashik.justice.developer.studyassistants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
    }

    public void GoToSignUp(View view) {
        startActivity( new Intent( LoginActivity.this, SignUp1_Activity.class ) );
    }

    public void Login_Home(View view) {
        startActivity( new Intent( LoginActivity.this, MainActivity.class ) );
    }
}
