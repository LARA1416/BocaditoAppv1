package xyz.lacoffee.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Agregar animaciones
        Animation Animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation Animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView HolaTextView = findViewById(R.id.HolaTextView);
        TextView bienvenidoTextView = findViewById(R.id.bienvenidoTextView);
        ImageView logoImageView = findViewById(R.id.LogoImageView);

        HolaTextView.setAnimation(Animacion2);
        bienvenidoTextView.setAnimation(Animacion2);
        logoImageView.setAnimation(Animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}