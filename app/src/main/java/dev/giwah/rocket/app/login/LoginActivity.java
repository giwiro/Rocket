package dev.giwah.rocket.app.login;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import dev.giwah.rocket.R;

public class LoginActivity extends AppCompatActivity {

    TextView logoTxt;
    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.logoTxt = (TextView)findViewById(R.id.textView);
        font = Typeface.createFromAsset(getAssets(), "fonts/Vendetta.ttf");
        this.logoTxt.setTypeface(font);
    }

}
