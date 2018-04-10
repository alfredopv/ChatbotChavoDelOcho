package com.example.alfredo.chatbotexamen;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstruccionesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);

    }

    public void siguiente(View view){
        Intent intent = new Intent(InstruccionesActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
