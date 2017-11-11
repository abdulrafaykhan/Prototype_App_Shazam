package com.example.abdulrafaykhan.prototype_app;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         /* create a full screen window */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fullscreen);

        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        tv1 = findViewById(R.id.text3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()) {
                    Toast.makeText(FullscreenActivity.this, "Please enter the correct initials", Toast.LENGTH_SHORT).show();
                } else if (!et1.getText().toString().contains("adsync")) {
                    Toast.makeText(FullscreenActivity.this, "Wrong Email/Username", Toast.LENGTH_SHORT).show();
                } else if (!et2.getText().toString().contains("hello5")) {
                    Toast.makeText(FullscreenActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(FullscreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FullscreenActivity.this, "Facebook Login isn't available at the moment", Toast.LENGTH_SHORT).show();
            }
        });




    }

    public void reg_activity(View view)
    {
        Toast.makeText(this, "Taking you to registration now...", Toast.LENGTH_SHORT).show();
    }
}


