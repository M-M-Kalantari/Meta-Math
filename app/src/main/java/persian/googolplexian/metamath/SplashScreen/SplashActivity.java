package persian.googolplexian.metamath.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, 3000);

    }
}