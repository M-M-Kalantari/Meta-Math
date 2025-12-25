package persian.googolplexian.metamath.Menu.Language;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.Menu.ActivityInformation;
import persian.googolplexian.metamath.R;

public class ActivityLanguages extends AppCompatActivity {

    TextView TextView_ActivityLanguages;

    public static boolean Auto = true;
    public static String Language = "";
    // Auto - fa - en - de - fr - ar

    RelativeLayout RelativeLayout_Automatically;
    LinearLayout LinearLayout_Automatically;
    CheckBox CheckBox_Automatically;
    ImageView ImageView_Automatically;

    RelativeLayout RelativeLayout_Persian;
    LinearLayout LinearLayout_Persian;
    CheckBox CheckBox_Persian;
    ImageView ImageView_Persian;

    RelativeLayout RelativeLayout_English_US;
    LinearLayout LinearLayout_English_US;
    CheckBox CheckBox_English_US;
    ImageView ImageView_English_US;

    RelativeLayout RelativeLayout_English_UK;
    LinearLayout LinearLayout_English_UK;
    CheckBox CheckBox_English_UK;
    ImageView ImageView_English_UK;

    RelativeLayout RelativeLayout_German;
    LinearLayout LinearLayout_German;
    CheckBox CheckBox_German;
    ImageView ImageView_German;

    RelativeLayout RelativeLayout_French;
    LinearLayout LinearLayout_French;
    CheckBox CheckBox_French;
    ImageView ImageView_French;

    RelativeLayout RelativeLayout_Arabic;
    LinearLayout LinearLayout_Arabic;
    CheckBox CheckBox_Arabic;
    ImageView ImageView_Arabic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);

        InitViews();
        Load_Language();
        SwitchLanguage();
        BackKey();

    }

    private void InitViews() {

        TextView_ActivityLanguages = (TextView) findViewById(R.id.TextView_ActivityLanguages);

        RelativeLayout_Automatically = (RelativeLayout) findViewById(R.id.RelativeLayout_Automatically);
        LinearLayout_Automatically = (LinearLayout) findViewById(R.id.LinearLayout_Automatically);
        CheckBox_Automatically = (CheckBox) findViewById(R.id.CheckBox_Automatically);
        ImageView_Automatically = (ImageView) findViewById(R.id.ImageView_Automatically);

        RelativeLayout_Persian = (RelativeLayout) findViewById(R.id.RelativeLayout_Persian);
        LinearLayout_Persian = (LinearLayout) findViewById(R.id.LinearLayout_Persian);
        CheckBox_Persian = (CheckBox) findViewById(R.id.CheckBox_Persian);
        ImageView_Persian = (ImageView) findViewById(R.id.ImageView_Persian);

        RelativeLayout_English_US = (RelativeLayout) findViewById(R.id.RelativeLayout_English_US);
        LinearLayout_English_US = (LinearLayout) findViewById(R.id.LinearLayout_English_US);
        CheckBox_English_US = (CheckBox) findViewById(R.id.CheckBox_English_US);
        ImageView_English_US = (ImageView) findViewById(R.id.ImageView_English_US);

        RelativeLayout_English_UK = (RelativeLayout) findViewById(R.id.RelativeLayout_English_UK);
        LinearLayout_English_UK = (LinearLayout) findViewById(R.id.LinearLayout_English_UK);
        CheckBox_English_UK = (CheckBox) findViewById(R.id.CheckBox_English_UK);
        ImageView_English_UK = (ImageView) findViewById(R.id.ImageView_English_UK);

        RelativeLayout_German = (RelativeLayout) findViewById(R.id.RelativeLayout_German);
        LinearLayout_German = (LinearLayout) findViewById(R.id.LinearLayout_German);
        CheckBox_German = (CheckBox) findViewById(R.id.CheckBox_German);
        ImageView_German = (ImageView) findViewById(R.id.ImageView_German);

        RelativeLayout_French = (RelativeLayout) findViewById(R.id.RelativeLayout_French);
        LinearLayout_French = (LinearLayout) findViewById(R.id.LinearLayout_French);
        CheckBox_French = (CheckBox) findViewById(R.id.CheckBox_French);
        ImageView_French = (ImageView) findViewById(R.id.ImageView_French);

        RelativeLayout_Arabic = (RelativeLayout) findViewById(R.id.RelativeLayout_Arabic);
        LinearLayout_Arabic = (LinearLayout) findViewById(R.id.LinearLayout_Arabic);
        CheckBox_Arabic = (CheckBox) findViewById(R.id.CheckBox_Arabic);
        ImageView_Arabic = (ImageView) findViewById(R.id.ImageView_Arabic);
    }

    private void Load_Language() {

        TextView_ActivityLanguages.setText(Class_Language_Text.ActivityLanguages);

    }

    private void SwitchLanguage() {

        False_CheckBox();
        if (Auto) {
            CheckBox_Automatically.setChecked(true);
        } else {
            switch (Language) {
                case "fa":
                    CheckBox_Persian.setChecked(true);
                    break;

                case "en":
                    CheckBox_English_UK.setChecked(true);
                    break;

                case "de":
                    CheckBox_German.setChecked(true);
                    break;

                case "fr":
                    CheckBox_French.setChecked(true);
                    break;

                case "ar":
                    CheckBox_Arabic.setChecked(true);
                    break;
            }
        }

        RelativeLayout_Automatically.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                False_CheckBox();
                CheckBox_Automatically.setChecked(true);
                Auto = true;
                Save_Language();
            }
        });

        RelativeLayout_Persian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                False_CheckBox();
                CheckBox_Persian.setChecked(true);
                Auto = false;
                Language = "fa";
                Save_Language();
            }
        });

        RelativeLayout_English_US.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                False_CheckBox();
                CheckBox_English_US.setChecked(true);
                Auto = false;
                Language = "en";
                Save_Language();
            }
        });

        RelativeLayout_English_UK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                False_CheckBox();
                CheckBox_English_UK.setChecked(true);
                Auto = false;
                Language = "en";
                Save_Language();
            }
        });

        RelativeLayout_German.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                False_CheckBox();
                CheckBox_German.setChecked(true);
                Auto = false;
                Language = "de";
                Save_Language();
            }
        });

        RelativeLayout_French.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                False_CheckBox();
                CheckBox_French.setChecked(true);
                Auto = false;
                Language = "fr";
                Save_Language();
            }
        });

        RelativeLayout_Arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                False_CheckBox();
                CheckBox_Arabic.setChecked(true);
                Auto = false;
                Language = "ar";
                Save_Language();
            }
        });

    }

    public void False_CheckBox() {
        CheckBox_Automatically.setChecked(false);
        CheckBox_Persian.setChecked(false);
        CheckBox_English_US.setChecked(false);
        CheckBox_English_UK.setChecked(false);
        CheckBox_German.setChecked(false);
        CheckBox_French.setChecked(false);
        CheckBox_Arabic.setChecked(false);
    }

    private void Save_Language() {
        SharedPreferences.Editor editor = MainActivity.sharedPreferences.edit();
        editor.putString(MainActivity.KEY_Name, Language);
        editor.putBoolean(MainActivity.KEY_Auto, Auto);
        editor.apply();
    }

    private void BackKey() {
        ImageView ImageView_Back;
        ImageView_Back = (ImageView) findViewById(R.id.ImageView_Back);
        ImageView_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(ActivityLanguages.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent;
        intent = new Intent(ActivityLanguages.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}