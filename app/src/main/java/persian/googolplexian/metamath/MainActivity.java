package persian.googolplexian.metamath;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryAdListener;
import com.adivery.sdk.AdiveryBannerAdView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import persian.googolplexian.metamath.BroadcastReceiver.Class_BroadcastReceiver;
import persian.googolplexian.metamath.MainFragments.Calculator.FragmentCalculator;
import persian.googolplexian.metamath.MainFragments.Calculator.History.Class_AdapterHistory;
import persian.googolplexian.metamath.MainFragments.Calculator.History.Class_History;
import persian.googolplexian.metamath.MainFragments.Calculator.Notepad.Class_AdapterNotepad;
import persian.googolplexian.metamath.MainFragments.Calculator.Notepad.Class_Notepad;
import persian.googolplexian.metamath.MainFragments.Class_ViewPagerAdapter;
import persian.googolplexian.metamath.MainFragments.Converter.FragmentConverter;
import persian.googolplexian.metamath.MainFragments.Currency.FragmentCurrency;
import persian.googolplexian.metamath.MainFragments.Health.FragmentHealth;
import persian.googolplexian.metamath.MainFragments.MathFormulas.FragmentMathFormulas;
import persian.googolplexian.metamath.MainFragments.NumericBase.FragmentNumericBase;
import persian.googolplexian.metamath.MainFragments.Shape.FragmentShape;
import persian.googolplexian.metamath.Menu.ActivityGuide;
import persian.googolplexian.metamath.Menu.ActivityInformation;
import persian.googolplexian.metamath.Menu.ActivityScientists;
import persian.googolplexian.metamath.Menu.ActivitySettings;
import persian.googolplexian.metamath.Menu.Language.ActivityLanguages;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;

public class MainActivity extends AppCompatActivity {

    public static DrawerLayout DrawerLayout_MainActivity;
    public static CoordinatorLayout CoordinatorLayout_MainActivity;
    public static NavigationView NavigationView_MainActivity;

    public static ImageView ImageView_Copy;
    public static ImageView ImageView_Clipboard;
    public static String ClipboardString;

    ///// Toolbar /////
    Toolbar Toolbar_Main;
    ImageView ImageView_Toolbar_Menu;
    ///////////////////

    ///// Tabs /////
    TabLayout TabLayout_Main;
    ViewPager ViewPager_Main;
    public static int TabsID = 0;
    ////////////////

    ///// Menu /////
    RelativeLayout RelativeLayout_Menu;
    ImageView ImageView_menu_Icon;
    LinearLayout LinearLayout_Menu_History, LinearLayout_Menu_Notepad, LinearLayout_Menu_Scientists, LinearLayout_Menu_Languages, LinearLayout_Menu_Settings, LinearLayout_Menu_Guide, LinearLayout_Menu_information;
    ImageView ImageView_Menu_History, ImageView_Menu_Notepad, ImageView_Menu_Scientists, ImageView_Menu_Languages, ImageView_Menu_Settings, ImageView_Menu_Guide, ImageView_Menu_information;
    TextView TextView_Menu_History, TextView_Menu_Notepad, TextView_Menu_Scientists, TextView_Menu_Languages, TextView_Menu_Settings, TextView_Menu_Guide, TextView_Menu_information;
    LinearLayout LinearLayout_Menu_Display;
    ImageView ImageView_Menu_Display;
    Switch Switch_Menu_Display;
    TextView TextView_Menu_Display;
    ////////////////

    ///// SharedPreferences /////
    public static SharedPreferences sharedPreferences;
    public static final String SPF_Name = "SharedPreferences_Language";
    public static final String KEY_Name = "Language";
    public static final String KEY_Auto = "Automatically";
    public static final String KEY_DisplayOn = "DisplayOn";
    /////////////////////////////

    ///// BottomSheet History /////
    public static BottomSheetBehavior BottomSheetBehavior_History;
    RelativeLayout RelativeLayout_BSH_History;
    LinearLayout LinearLayout_BSH_Keys;
    TextView TextView_BSH_History;
    ImageView ImageView_BSH_DeleteAll, ImageView_BSH_Close;
    public static RecyclerView RecyclerView_BSH_History;
    public static Class_AdapterHistory HistoryAdapter;
    public static ArrayList<Class_History> HistoryList = new ArrayList<>();
    ///////////////////////////////

    ///// BottomSheet NotePad /////
    public static BottomSheetBehavior BottomSheetBehavior_NotePad;
    RelativeLayout RelativeLayout_BSN_NotePad;
    LinearLayout LinearLayout_BSN_Keys;
    TextView TextView_BSN_NotePad;
    ImageView ImageView_BSN_DeleteAll, ImageView_BSN_Close;
    public static RecyclerView RecyclerView_BSN_NotePad;
    public static Class_AdapterNotepad NotepadAdapter;
    public static ArrayList<Class_Notepad> NotepadList = new ArrayList<>();
    ///////////////////////////////

    ///// BottomSheet NotePad Enter /////
    public static BottomSheetBehavior BottomSheetBehavior_NotePad_Enter;
    public static boolean NotePad_Update = false;
    RelativeLayout RelativeLayout_BSNE_NotePad_Enter;
    public static EditText EditText_BSNE_EnterTitle, EditText_BSNE_EnterNumber;
    ImageView ImageView_BSNE_Plus, ImageView_BSNE_Minus, ImageView_BSNE_Times, ImageView_BSNE_Division, ImageView_BSNE_OK, ImageView_BSNE_Cancel;
    double FirstNumber = 0;
    double SecondNumber = 0;
    String ResultNumber = "";
    String FinalNumber = "";
    String FinalTitle = "";
    public static int id = 0;
    /////////////////////////////////////

    public static boolean Snackbar_TypeNumber_1 = false;
    public static boolean Snackbar_TypeNumber_5 = false;

    ClipboardManager clipboardManager;

    public static boolean Fragment_BackPressed = false;
    boolean BackPressed_DoubleClick = false;

    public static int MainAds_Index = 0;
    Handler MainAds_Handler = new Handler();
    Class_BroadcastReceiver broadcastReceiver;
    public static boolean RunningActivity = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Build_Toolbar();
        Build_Tabs();
        Find_Views();
        Configure_Language();
        Load_Language();
        Display_Settings();
        Build_Events();
        ClipboardManager();
        try {
            InApp_ads();
        }catch (Exception e){}

    }

    private void Build_Toolbar() {
        Toolbar_Main = (Toolbar) findViewById(R.id.Toolbar_Main);
        setSupportActionBar(Toolbar_Main);
        ImageView_Toolbar_Menu = (ImageView) findViewById(R.id.ImageView_Toolbar_Menu);

    }

    private void Build_Tabs() {
        TabLayout_Main = (TabLayout) findViewById(R.id.TabLayout_Main);
        ViewPager_Main = (ViewPager) findViewById(R.id.ViewPager_Main);

        Class_ViewPagerAdapter adapter = new Class_ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FragmentCalculator(), "");
        adapter.addFragment(new FragmentMathFormulas(), "");
        adapter.addFragment(new FragmentShape(), "");
        adapter.addFragment(new FragmentConverter(), "");
        adapter.addFragment(new FragmentCurrency(), "");
        adapter.addFragment(new FragmentHealth(), "");
        adapter.addFragment(new FragmentNumericBase(), "");


        ViewPager_Main.setAdapter(adapter);

        TabLayout_Main.setupWithViewPager(ViewPager_Main);

        TabLayout_Main.getTabAt(0).setIcon(R.drawable.ic_001_calculator);
        TabLayout_Main.getTabAt(1).setIcon(R.drawable.ic_001_mathformulas);
        TabLayout_Main.getTabAt(2).setIcon(R.drawable.ic_001_shape);
        TabLayout_Main.getTabAt(3).setIcon(R.drawable.ic_001_converter);
        TabLayout_Main.getTabAt(4).setIcon(R.drawable.ic_001_currency);
        TabLayout_Main.getTabAt(5).setIcon(R.drawable.ic_001_health);
        TabLayout_Main.getTabAt(6).setIcon(R.drawable.ic_001_numericbase);
    }

    private void Find_Views() {
        DrawerLayout_MainActivity = (DrawerLayout) findViewById(R.id.DrawerLayout_MainActivity);
        CoordinatorLayout_MainActivity = (CoordinatorLayout) findViewById(R.id.CoordinatorLayout_MainActivity);
        NavigationView_MainActivity = (NavigationView) findViewById(R.id.NavigationView_MainActivity);

        ImageView_Copy = (ImageView) findViewById(R.id.ImageView_Copy);
        ImageView_Clipboard = (ImageView) findViewById(R.id.ImageView_Clipboard);

        /*/*/ ///// Menu /////
        RelativeLayout_Menu = (RelativeLayout) findViewById(R.id.RelativeLayout_Menu);

        ImageView_menu_Icon = (ImageView) findViewById(R.id.ImageView_menu_Icon);

        LinearLayout_Menu_History = (LinearLayout) findViewById(R.id.LinearLayout_Menu_History);
        LinearLayout_Menu_Notepad = (LinearLayout) findViewById(R.id.LinearLayout_Menu_Notepad);
        LinearLayout_Menu_Scientists = (LinearLayout) findViewById(R.id.LinearLayout_Menu_Scientists);
        LinearLayout_Menu_Languages = (LinearLayout) findViewById(R.id.LinearLayout_Menu_Languages);
        LinearLayout_Menu_Settings = (LinearLayout) findViewById(R.id.LinearLayout_Menu_Settings);
        LinearLayout_Menu_Guide = (LinearLayout) findViewById(R.id.LinearLayout_Menu_Guide);
        LinearLayout_Menu_information = (LinearLayout) findViewById(R.id.LinearLayout_Menu_information);

        ImageView_Menu_History = (ImageView) findViewById(R.id.ImageView_Menu_History);
        ImageView_Menu_Notepad = (ImageView) findViewById(R.id.ImageView_Menu_Notepad);
        ImageView_Menu_Scientists = (ImageView) findViewById(R.id.ImageView_Menu_Scientists);
        ImageView_Menu_Languages = (ImageView) findViewById(R.id.ImageView_Menu_Languages);
        ImageView_Menu_Settings = (ImageView) findViewById(R.id.ImageView_Menu_Settings);
        ImageView_Menu_Guide = (ImageView) findViewById(R.id.ImageView_Menu_Guide);
        ImageView_Menu_information = (ImageView) findViewById(R.id.ImageView_Menu_information);

        TextView_Menu_History = (TextView) findViewById(R.id.TextView_Menu_History);
        TextView_Menu_History.setSelected(true);
        TextView_Menu_Notepad = (TextView) findViewById(R.id.TextView_Menu_Notepad);
        TextView_Menu_Notepad.setSelected(true);
        TextView_Menu_Scientists = (TextView) findViewById(R.id.TextView_Menu_Scientists);
        TextView_Menu_Scientists.setSelected(true);
        TextView_Menu_Languages = (TextView) findViewById(R.id.TextView_Menu_Languages);
        TextView_Menu_Languages.setSelected(true);
        TextView_Menu_Settings = (TextView) findViewById(R.id.TextView_Menu_Settings);
        TextView_Menu_Settings.setSelected(true);
        TextView_Menu_Guide = (TextView) findViewById(R.id.TextView_Menu_Guide);
        TextView_Menu_Guide.setSelected(true);
        TextView_Menu_information = (TextView) findViewById(R.id.TextView_Menu_information);
        TextView_Menu_information.setSelected(true);

        LinearLayout_Menu_Display = (LinearLayout) findViewById(R.id.LinearLayout_Menu_Display);
        ImageView_Menu_Display = (ImageView) findViewById(R.id.ImageView_Menu_Display);
        Switch_Menu_Display = (Switch) findViewById(R.id.Switch_Menu_Display);
        TextView_Menu_Display = (TextView) findViewById(R.id.TextView_Menu_Display);
        TextView_Menu_Display.setSelected(true);
        ////////////////

        /*/*/ ///// BottomSheet History /////
        RelativeLayout_BSH_History = (RelativeLayout) findViewById(R.id.RelativeLayout_BSH_History);
        BottomSheetBehavior_History = BottomSheetBehavior.from(RelativeLayout_BSH_History);
        LinearLayout_BSH_Keys = (LinearLayout) findViewById(R.id.LinearLayout_BSH_Keys);
        TextView_BSH_History = (TextView) findViewById(R.id.TextView_BSH_History);
        ImageView_BSH_DeleteAll = (ImageView) findViewById(R.id.ImageView_BSH_DeleteAll);
        ImageView_BSH_Close = (ImageView) findViewById(R.id.ImageView_BSH_Close);
        RecyclerView_BSH_History = (RecyclerView) findViewById(R.id.RecyclerView_BSH_History);
        ///////////////////////////////

        /*/*/ ///// BottomSheet NotePad /////
        RelativeLayout_BSN_NotePad = (RelativeLayout) findViewById(R.id.RelativeLayout_BSN_NotePad);
        BottomSheetBehavior_NotePad = BottomSheetBehavior.from(RelativeLayout_BSN_NotePad);
        LinearLayout_BSN_Keys = (LinearLayout) findViewById(R.id.LinearLayout_BSN_Keys);
        TextView_BSN_NotePad = (TextView) findViewById(R.id.TextView_BSN_NotePad);
        ImageView_BSN_DeleteAll = (ImageView) findViewById(R.id.ImageView_BSN_DeleteAll);
        ImageView_BSN_Close = (ImageView) findViewById(R.id.ImageView_BSN_Close);
        RecyclerView_BSN_NotePad = (RecyclerView) findViewById(R.id.RecyclerView_BSN_NotePad);
        ///////////////////////////////

        /*/*/ ///// BottomSheet NotePad Enter /////
        RelativeLayout_BSNE_NotePad_Enter = (RelativeLayout) findViewById(R.id.RelativeLayout_BSNE_NotePad_Enter);
        BottomSheetBehavior_NotePad_Enter = BottomSheetBehavior.from(RelativeLayout_BSNE_NotePad_Enter);
        EditText_BSNE_EnterTitle = (EditText) findViewById(R.id.EditText_BSNE_EnterTitle);
        EditText_BSNE_EnterNumber = (EditText) findViewById(R.id.EditText_BSNE_EnterNumber);
        ImageView_BSNE_Plus = (ImageView) findViewById(R.id.ImageView_BSNE_Plus);
        ImageView_BSNE_Minus = (ImageView) findViewById(R.id.ImageView_BSNE_Minus);
        ImageView_BSNE_Times = (ImageView) findViewById(R.id.ImageView_BSNE_Times);
        ImageView_BSNE_Division = (ImageView) findViewById(R.id.ImageView_BSNE_Division);
        ImageView_BSNE_OK = (ImageView) findViewById(R.id.ImageView_BSNE_OK);
        ImageView_BSNE_Cancel = (ImageView) findViewById(R.id.ImageView_BSNE_Cancel);
        /////////////////////////////////////

    }

    private void Configure_Language() {
        sharedPreferences = getSharedPreferences(SPF_Name, Context.MODE_PRIVATE);
        ActivityLanguages.Language = sharedPreferences.getString(KEY_Name, null);
        ActivityLanguages.Auto = sharedPreferences.getBoolean(KEY_Auto, true);
        if (ActivityLanguages.Auto) {
            String L = Locale.getDefault().getLanguage();
            if (L.equals("fa") || L.equals("en") || L.equals("de") || L.equals("fr") || L.equals("ar")) {
                ActivityLanguages.Language = L;
            } else {
                ActivityLanguages.Language = "en";
            }
        }
        Class_Language_Text.Set_Text_Language();
    }

    private void Load_Language() {

        TextView_BSH_History.setText(Class_Language_Text.MainActivity_History);
        TextView_BSN_NotePad.setText(Class_Language_Text.MainActivity_Notepad);
        TextView_Menu_History.setText(Class_Language_Text.MainActivity_History);
        TextView_Menu_Notepad.setText(Class_Language_Text.MainActivity_Notepad);
        TextView_Menu_Scientists.setText(Class_Language_Text.ActivityScientists);
        TextView_Menu_Languages.setText(Class_Language_Text.ActivityLanguages);
        TextView_Menu_Settings.setText(Class_Language_Text.ActivitySettings);
        TextView_Menu_Guide.setText(Class_Language_Text.ActivityGuide);
        TextView_Menu_information.setText(Class_Language_Text.ActivityInformation);
        TextView_Menu_Display.setText(Class_Language_Text.MainActivity_DisplayAlwaysON);

    }

    private void Display_Settings() {
        sharedPreferences = getSharedPreferences(SPF_Name, Context.MODE_PRIVATE);
        boolean DisplayOn = sharedPreferences.getBoolean(KEY_DisplayOn, true);

        Switch_Menu_Display.setChecked(DisplayOn);

        if (DisplayOn) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
    }

    private void Build_Events() {
        /*/*/ ///// BottomSheet History /////
        ImageView_BSH_DeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.MainActivity_Snackbars_1, Snackbar.LENGTH_SHORT);
                snackbar.setDuration(5000);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int Res = Class_History.HistoryDataBaseDeleteAll(MainActivity.this);
                        HistoryList.clear();
                        HistoryAdapter.notifyDataSetChanged();
                        snackbar.dismiss();
                    }
                });
                snackbar.show();
            }
        });

        ImageView_BSH_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetBehavior_History.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });
        ///////////////////////////////

        /*/*/ ///// BottomSheet NotePad /////
        ImageView_BSN_DeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.MainActivity_Snackbars_1, Snackbar.LENGTH_SHORT);
                snackbar.setDuration(5000);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int Res = Class_Notepad.NotepadDataBaseDeleteAll(MainActivity.this);
                        NotepadList.clear();
                        NotepadAdapter.notifyDataSetChanged();
                        snackbar.dismiss();
                    }
                });
                snackbar.show();
            }
        });

        ImageView_BSN_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetBehavior_NotePad.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });
        ///////////////////////////////

        /*/*/ ///// BottomSheet NotePad Enter /////
        ImageView_BSNE_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BottomSheetBehavior_NotePad_Enter.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    FirstNumber = Double.parseDouble(String.valueOf(EditText_BSNE_EnterNumber.getText()));
                    SecondNumber = Double.parseDouble(String.valueOf(FragmentCalculator.TextView_EnterResult.getText()));
                    ResultNumber = FirstNumber + SecondNumber + "";
                    EditText_BSNE_EnterNumber.setText(ResultNumber);
                }
            }
        });

        ImageView_BSNE_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BottomSheetBehavior_NotePad_Enter.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    FirstNumber = Double.parseDouble(String.valueOf(EditText_BSNE_EnterNumber.getText()));
                    SecondNumber = Double.parseDouble(String.valueOf(FragmentCalculator.TextView_EnterResult.getText()));
                    ResultNumber = FirstNumber - SecondNumber + "";
                    EditText_BSNE_EnterNumber.setText(ResultNumber);
                }
            }
        });

        ImageView_BSNE_Times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BottomSheetBehavior_NotePad_Enter.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    FirstNumber = Double.parseDouble(String.valueOf(EditText_BSNE_EnterNumber.getText()));
                    SecondNumber = Double.parseDouble(String.valueOf(FragmentCalculator.TextView_EnterResult.getText()));
                    ResultNumber = FirstNumber * SecondNumber + "";
                    EditText_BSNE_EnterNumber.setText(ResultNumber);
                }
            }
        });

        ImageView_BSNE_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BottomSheetBehavior_NotePad_Enter.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    FirstNumber = Double.parseDouble(String.valueOf(EditText_BSNE_EnterNumber.getText()));
                    SecondNumber = Double.parseDouble(String.valueOf(FragmentCalculator.TextView_EnterResult.getText()));
                    ResultNumber = FirstNumber / SecondNumber + "";
                    EditText_BSNE_EnterNumber.setText(ResultNumber);
                }
            }
        });

        ImageView_BSNE_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (NotePad_Update == false) {
                    FinalNumber = EditText_BSNE_EnterNumber.getText().toString();
                    FinalTitle = EditText_BSNE_EnterTitle.getText().toString();
                    if (FinalNumber.isEmpty() || FinalTitle.isEmpty()) {
                        Snackbar snackbar = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.MainActivity_Snackbars_2, Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    } else {
                        NotePadInsert(FinalTitle + "", FinalNumber + "");

                        EditText_BSNE_EnterNumber.setText("");
                        EditText_BSNE_EnterTitle.setText("");
                        MainActivity.BottomSheetBehavior_NotePad_Enter.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    }
                } else {
                    FinalNumber = EditText_BSNE_EnterNumber.getText().toString();
                    FinalTitle = EditText_BSNE_EnterTitle.getText().toString();
                    if (FinalNumber.isEmpty() || FinalTitle.isEmpty()) {
                        Snackbar snackbar = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.MainActivity_Snackbars_2, Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    } else {
                        NotePadUpdate(FinalTitle + "", FinalNumber + "");

                        EditText_BSNE_EnterNumber.setText("");
                        EditText_BSNE_EnterTitle.setText("");
                        MainActivity.BottomSheetBehavior_NotePad_Enter.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    }
                }
            }
        });

        ImageView_BSNE_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_BSNE_EnterNumber.setText("");
                EditText_BSNE_EnterTitle.setText("");
                MainActivity.BottomSheetBehavior_NotePad_Enter.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });
        /////////////////////////////////////

        /*/*/ ///// Menu /////
        ImageView_Toolbar_Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawerLayout_MainActivity.openDrawer(Gravity.LEFT);
            }
        });

        LinearLayout_Menu_History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentCalculator.ImageView_Spe_History.callOnClick();
                DrawerLayout_MainActivity.closeDrawer(Gravity.LEFT);
            }
        });

        LinearLayout_Menu_Notepad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentCalculator.ImageView_Spe_Notepad.callOnClick();
                DrawerLayout_MainActivity.closeDrawer(Gravity.LEFT);
            }
        });

        LinearLayout_Menu_Scientists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, ActivityScientists.class);
                startActivity(intent);
            }
        });

        LinearLayout_Menu_Languages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, ActivityLanguages.class);
                startActivity(intent);
                finish();
            }
        });

        LinearLayout_Menu_Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, ActivitySettings.class);
                startActivity(intent);
                finish();
            }
        });

        LinearLayout_Menu_Guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, ActivityGuide.class);
                startActivity(intent);
            }
        });

        LinearLayout_Menu_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, ActivityInformation.class);
                startActivity(intent);
            }
        });

        Switch_Menu_Display.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                } else {
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                }

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean(KEY_DisplayOn, isChecked);
                editor.apply();
            }
        });
        ////////////////
    }


    private void NotePadInsert(String Title, String Number) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
        String currentDateandTime = sdf.format(new Date());

        long DataBaseResult;
        Class_Notepad temp = new Class_Notepad();
        temp.setTitle(Title + "");
        temp.setNumber(Number + "");
        temp.setDateTime(currentDateandTime + "");
        DataBaseResult = Class_Notepad.NotepadDataBaseInsert(MainActivity.this, temp);
    }

    private void NotePadUpdate(String Title, String Number) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
        String currentDateandTime = sdf.format(new Date());

        Class_Notepad temp = new Class_Notepad();
        temp.setTitle(Title + "");
        temp.setNumber(Number + "");
        temp.setDateTime(currentDateandTime + "");

        String WC = Class_Notepad.COL_N_ID + "=?";
        String[] args = {id + ""};

        int Result = Class_Notepad.NotepadDataBaseUpdate(MainActivity.this, WC, args, temp);
    }

    public static void DeleteNotePadItem(Class_Notepad item, final int ID, int pos) {
        Snackbar snackbar = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.MainActivity_Snackbars_3, Snackbar.LENGTH_SHORT);
        snackbar.setDuration(5000);
        snackbar.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String whereclause = Class_Notepad.COL_N_ID + "=?";
                String[] args = {ID + ""};
                int Res = Class_Notepad.NotepadDataBaseDelete(snackbar.getContext(), whereclause, args);
                MainActivity.NotepadList.remove(pos);
                MainActivity.NotepadAdapter.notifyDataSetChanged();

                snackbar.dismiss();
            }
        });
        snackbar.show();
    }

    public static void DeleteHistoryItem(Class_History item, final int ID, int pos) {
        Snackbar snackbar = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.MainActivity_Snackbars_3, Snackbar.LENGTH_SHORT);
        snackbar.setDuration(5000);
        snackbar.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String whereclause = Class_History.COL_H_ID + "=?";
                String[] args = {ID + ""};
                int Res = Class_History.HistoryDataBaseDelete(snackbar.getContext(), whereclause, args);
                MainActivity.HistoryList.remove(pos);
                MainActivity.HistoryAdapter.notifyDataSetChanged();

                snackbar.dismiss();
            }
        });
        snackbar.show();
    }


    public static void External_Snackbars(int TypeNumber) {
        switch (TypeNumber) {
            case 1:
                if (!Snackbar_TypeNumber_1) {
                    Snackbar snackbar_1 = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.External_Snackbars_1, Snackbar.LENGTH_SHORT);
                    snackbar_1.setDuration(15000);
                    snackbar_1.setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            snackbar_1.dismiss();
                            Snackbar_TypeNumber_1 = true;
                        }
                    });
                    snackbar_1.show();
                }
                break;

            case 2:
                Snackbar snackbar_2 = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.External_Snackbars_2, Snackbar.LENGTH_SHORT);
                snackbar_2.show();
                break;

            case 3:
                Snackbar snackbar_3 = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.External_Snackbars_3, Snackbar.LENGTH_SHORT);
                snackbar_3.show();
                break;

            case 4:
                Snackbar snackbar_4 = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.External_Snackbars_4, Snackbar.LENGTH_SHORT);
                snackbar_4.show();

            case 5:
                if (!Snackbar_TypeNumber_5) {
                    Snackbar snackbar_5 = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.External_Snackbars_5, Snackbar.LENGTH_SHORT);
                    snackbar_5.setDuration(15000);
                    snackbar_5.setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            snackbar_5.dismiss();
                            Snackbar_TypeNumber_5 = true;
                        }
                    });
                    snackbar_5.show();
                }
                break;
        }
    }

    private void ClipboardManager() {
        ImageView_Copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData myClip;
                myClip = ClipData.newPlainText("text", ClipboardString);
                clipboardManager.setPrimaryClip(myClip);
            }
        });

        ImageView_Clipboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ClipData abc = clipboardManager.getPrimaryClip();
                    ClipData.Item item = abc.getItemAt(0);
                    ClipboardString = item.getText().toString();
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, Class_Language_Text.Error_3, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void InApp_ads() {
        Adivery.configure(getApplication(), "89b4c01a-d9fb-4aa0-ad89-739b526fe037");

        Adivery.setLoggingEnabled(true);

        AdiveryBannerAdView bannerAd_History = findViewById(R.id.banner_ad_History);
        bannerAd_History.setBannerAdListener(new AdiveryAdListener() {
            @Override
            public void onAdLoaded() {
                // تبلیغ به‌طور خودکار نمایش داده می‌شود، هر کار دیگری لازم است اینجا انجام دهید.
            }

            @Override
            public void onError(String reason) {
                // خطا را چاپ کنید تا از دلیل آن مطلع شوید
            }

            @Override
            public void onAdClicked() {
                // کاربر روی بنر کلیک کرده
            }
        });
        bannerAd_History.loadAd();

        AdiveryBannerAdView bannerAd_NotePad = findViewById(R.id.banner_ad_NotePad);
        bannerAd_NotePad.setBannerAdListener(new AdiveryAdListener() {
            @Override
            public void onAdLoaded() {
                // تبلیغ به‌طور خودکار نمایش داده می‌شود، هر کار دیگری لازم است اینجا انجام دهید.
            }

            @Override
            public void onError(String reason) {
                // خطا را چاپ کنید تا از دلیل آن مطلع شوید
            }

            @Override
            public void onAdClicked() {
                // کاربر روی بنر کلیک کرده
            }
        });
        bannerAd_NotePad.loadAd();

        Adivery.prepareInterstitialAd(MainActivity.this, "944aae64-d182-4dd4-b87a-569a4d1e0ace");

        MainAds_Handler.postDelayed(MainAds_Runnable, 60000);
    }

    Runnable MainAds_Runnable = new Runnable() {
        @Override
        public void run() {
            MainAds_Index++;
            MainAds();
            MainAds_Handler.postDelayed(this, 60000);
        }
    };

    public static void MainAds() {
        if (RunningActivity) {
            if (MainAds_Index >= 5) {
                if (Adivery.isLoaded("944aae64-d182-4dd4-b87a-569a4d1e0ace")) {
                    MainAds_Index = 0;
                    Adivery.showAd("944aae64-d182-4dd4-b87a-569a4d1e0ace");
                }
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        broadcastReceiver = new Class_BroadcastReceiver();
        registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        RunningActivity = true;

    }

    @Override
    protected void onPause() {
        super.onPause();
        RunningActivity = false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(broadcastReceiver);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();

        if (DrawerLayout_MainActivity.isDrawerOpen(Gravity.LEFT)) {
            DrawerLayout_MainActivity.closeDrawer(Gravity.LEFT);
        } else {
            if (BottomSheetBehavior_History.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                BottomSheetBehavior_History.setState(BottomSheetBehavior.STATE_COLLAPSED);
            } else {
                if (BottomSheetBehavior_NotePad.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    BottomSheetBehavior_NotePad.setState(BottomSheetBehavior.STATE_COLLAPSED);
                } else {
                    if (BottomSheetBehavior_NotePad_Enter.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                        BottomSheetBehavior_NotePad_Enter.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    } else {
                        if (Fragment_BackPressed) {
                            TabsID = TabLayout_Main.getSelectedTabPosition();
                            switch (TabsID) {
                                case 0: /*calculator*/
                                    FragmentCalculator.ImageView_Opr_OtherOperations.callOnClick();
                                    break;
                                case 1: /*math formulas*/
                                    FragmentMathFormulas.ListView_MathFormulasItems.setVisibility(View.VISIBLE);
                                    FragmentMathFormulas.RelativeLayout_MathFormulasFields.setVisibility(View.GONE);
                                    FragmentMathFormulas.ImageView_Add.setVisibility(View.GONE);
                                    break;
                                case 2: /*shape*/
                                    FragmentShape.ListView_ShapeItems.setVisibility(View.VISIBLE);
                                    FragmentShape.RelativeLayout_ShapeFields.setVisibility(View.GONE);
                                    break;
                                case 3: /*converter*/
                                    FragmentConverter.ListView_ConverterItems.setVisibility(View.VISIBLE);
                                    FragmentConverter.RelativeLayout_ConverterFields.setVisibility(View.GONE);
                                    break;
                                case 4: /*currency*/
                                    FragmentCurrency.ListView_CurrencyItems.setVisibility(View.VISIBLE);
                                    FragmentCurrency.RelativeLayout_CurrencyFields.setVisibility(View.GONE);
                                    break;
                                case 5: /*health*/
                                    FragmentHealth.LinearLayout_Health_BMI_Item.setVisibility(View.VISIBLE);
                                    FragmentHealth.RelativeLayout_Health_BMI_Field.setVisibility(View.GONE);
                                    break;
                                case 6: /*numeric base*/
                                    break;
                            }
                            Fragment_BackPressed = false;
                        } else {
                            if (BackPressed_DoubleClick == false) {
                                BackPressed_DoubleClick = true;
                                Snackbar snackbar = Snackbar.make(CoordinatorLayout_MainActivity, Class_Language_Text.MainActivity_Snackbars_4, Snackbar.LENGTH_SHORT);
                                snackbar.show();

                                Vibrator mVibrator;
                                mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                mVibrator.vibrate(100);

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        BackPressed_DoubleClick = false;
                                    }
                                }, 3000);
                            } else if (BackPressed_DoubleClick == true) {
                                finish();
                            }
                        }
                    }
                }
            }
        }
    }

}