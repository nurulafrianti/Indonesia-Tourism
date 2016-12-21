package id.nurulafrianti.indonesiatourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        Button MainSumatra = (Button) findViewById(R.id.btn_Start1);
        MainSumatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent start = new Intent(Start.this, Sumatra.class);
                startActivity(start);
            }
        });

        Button MainJava = (Button) findViewById(R.id.btn_Start2);
        MainJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent start = new Intent(Start.this, Java.class);
                startActivity(start);
            }
        });

        Button MainKalimantan = (Button) findViewById(R.id.btn_Start3);
        MainKalimantan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent start = new Intent(Start.this, Kalimantan.class);
                startActivity(start);
            }
        });

        Button MainSulawesi = (Button) findViewById(R.id.btn_Start4);
        MainSulawesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent start = new Intent(Start.this, Sulawesi.class);
                startActivity(start);
            }
        });

        Button MainBali = (Button) findViewById(R.id.btn_Start5);
        MainBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent start = new Intent(Start.this, Bali.class);
                startActivity(start);
            }
        });

        Button MainNusaTenggara = (Button) findViewById(R.id.btn_Start6);
        MainNusaTenggara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent start = new Intent(Start.this, NusaTenggara.class);
                startActivity(start);
            }
        });

        Button MainMaluku = (Button) findViewById(R.id.btn_Start7);
        MainMaluku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent start = new Intent(Start.this, Maluku.class);
                startActivity(start);
            }
        });

        Button MainPapua = (Button) findViewById(R.id.btn_Start8);
        MainPapua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent start = new Intent(Start.this, Papua.class);
                startActivity(start);
            }
        });
    }
}
