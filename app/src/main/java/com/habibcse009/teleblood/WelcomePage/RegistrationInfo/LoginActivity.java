package com.habibcse009.teleblood.WelcomePage.RegistrationInfo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.habibcse009.teleblood.R;

public class LoginActivity extends AppCompatActivity {
    private TextView textViewlogin, subtitle_header,buttongotosignup;
    private Button buttonlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        buttongotosignup = findViewById(R.id.txtgotosignup);
        textViewlogin = findViewById(R.id.textView2login);
        buttonlogin = findViewById(R.id.btnlogin_button);

        Typeface tf = Typeface.createFromAsset(getAssets(), "Milkshake.ttf");
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "Quicksand-Regular.otf");

        //txtTitle.setTypeface(tf);
        textViewlogin.setTypeface(tf);
        buttonlogin.setTypeface(tf1);



        buttongotosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
