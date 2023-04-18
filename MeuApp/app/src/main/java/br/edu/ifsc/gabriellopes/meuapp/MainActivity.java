package br.edu.ifsc.gabriellopes.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button welcomeButton = findViewById(R.id.welcomeButton);
        welcomeButton.setOnClickListener(View -> { minhaAcao(); });

        Button welcomeButton2 = findViewById(R.id.welcomeButton2);
        welcomeButton2.setOnClickListener(View -> { segundaAcao(); });



    }
    void minhaAcao(){
        Toast.makeText(this,
                R.string.WelcomeToast,
                Toast.LENGTH_SHORT
        ).show();
    }
    void segundaAcao() {
        ImageView welcomeImageView = findViewById(R.id.welcomeImageView);
        welcomeImageView.setImageResource(R.drawable.arrasca);
    }

}