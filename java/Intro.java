package id.nurulafrianti.indonesiatourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button MainIntro = (Button) findViewById(R.id.btn_Intro);
        MainIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intro = new Intent(Intro.this, Start.class);
                startActivity(intro);
            }
        });
    }
}
