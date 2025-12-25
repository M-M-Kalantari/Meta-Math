package persian.googolplexian.metamath.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.Menu.Language.ActivityLanguages;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;
import persian.googolplexian.metamath.R;

public class ActivityInformation extends AppCompatActivity {

    TextView TextView_ActivityInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Find_Views();
        Load_Language();
        BackKey();

    }

    private void Find_Views() {
        TextView_ActivityInformation = (TextView) findViewById(R.id.TextView_ActivityInformation);
    }

    private void Load_Language() {

        TextView_ActivityInformation.setText(Class_Language_Text.ActivityInformation);

    }

    private void BackKey() {
        ImageView ImageView_Back;
        ImageView_Back = (ImageView) findViewById(R.id.ImageView_Back);
        ImageView_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(ActivityInformation.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}