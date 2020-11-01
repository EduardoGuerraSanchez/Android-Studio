package com.example.corkylistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener corkyListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri url = Uri.parse("https://www.marca.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, url);
            startActivity(intent);
        }
    };

    private View.OnClickListener llamada = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri telefono = Uri.parse("622866680");
            Intent intent = new Intent(Intent.ACTION_DIAL,telefono);
            intent.setData(Uri.parse("tel: " + telefono));
            startActivity(intent);
        }
    };

    private View.OnClickListener main2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.corky);
        button.setOnClickListener(corkyListener);

        Button buttonCall = (Button) findViewById(R.id.llamar);
        buttonCall.setOnClickListener(llamada);

        Button button2 = (Button) findViewById((R.id.button2));
        button2.setOnClickListener(main2);

    }
}