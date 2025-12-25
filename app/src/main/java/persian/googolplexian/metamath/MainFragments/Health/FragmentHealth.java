package persian.googolplexian.metamath.MainFragments.Health;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryAdListener;
import com.adivery.sdk.AdiveryBannerAdView;
import com.google.android.material.textfield.TextInputLayout;

import androidx.fragment.app.Fragment;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;
import persian.googolplexian.metamath.R;


public class FragmentHealth extends Fragment {

    public static LinearLayout LinearLayout_Health_BMI_Item;
    ImageView ImageView_Health_BMI;
    TextView TextView_Health_BMI;

    public static RelativeLayout RelativeLayout_Health_BMI_Field;
    TextInputLayout TextInputLayout_Field_Weight, TextInputLayout_Field_Height;
    EditText EditText_Field_Weight, EditText_Field_Height;
    LinearLayout LinearLayout_BMI_Result;
    TextView TextView_BMI_Number;
    LinearLayout LinearLayout_Grade_1, LinearLayout_Grade_2, LinearLayout_Grade_3, LinearLayout_Grade_4, LinearLayout_Grade_5;
    Button Button_Grade_1, Button_Grade_2, Button_Grade_3, Button_Grade_4, Button_Grade_5;
    ImageView ImageView_Grade_1, ImageView_Grade_2, ImageView_Grade_3, ImageView_Grade_4, ImageView_Grade_5;

    LinearLayout LinearLayout_Selected_BMI;
    ImageView ImageView_Selected_BMI, ImageView_Clean_BMI, ImageView_Back_BMI;
    TextView TextView_Selected_BMI;

    double Weight = 0;
    double Height = 0;
    double Result = 0;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public FragmentHealth() {
        // Required empty public constructor
    }

    public static FragmentHealth newInstance(String param1, String param2) {
        FragmentHealth fragment = new FragmentHealth();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_health, container, false);

        Find_Views(view);
        Load_Language();
        InApp_ads(view);
        Build_Events();

        return view;
    }

    private void Find_Views(View view) {

        LinearLayout_Health_BMI_Item = (LinearLayout) view.findViewById(R.id.LinearLayout_Health_BMI_Item);
        ImageView_Health_BMI = (ImageView) view.findViewById(R.id.ImageView_Health_BMI);
        TextView_Health_BMI = (TextView) view.findViewById(R.id.TextView_Health_BMI);

        RelativeLayout_Health_BMI_Field = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Health_BMI_Field);
        TextInputLayout_Field_Weight = (TextInputLayout) view.findViewById(R.id.TextInputLayout_Field_Weight);
        TextInputLayout_Field_Height = (TextInputLayout) view.findViewById(R.id.TextInputLayout_Field_Height);
        EditText_Field_Weight = (EditText) view.findViewById(R.id.EditText_Field_Weight);
        EditText_Field_Height = (EditText) view.findViewById(R.id.EditText_Field_Height);
        LinearLayout_BMI_Result = (LinearLayout) view.findViewById(R.id.LinearLayout_BMI_Result);
        TextView_BMI_Number = (TextView) view.findViewById(R.id.TextView_BMI_Number);
        LinearLayout_Grade_1 = (LinearLayout) view.findViewById(R.id.LinearLayout_Grade_1);
        LinearLayout_Grade_2 = (LinearLayout) view.findViewById(R.id.LinearLayout_Grade_2);
        LinearLayout_Grade_3 = (LinearLayout) view.findViewById(R.id.LinearLayout_Grade_3);
        LinearLayout_Grade_4 = (LinearLayout) view.findViewById(R.id.LinearLayout_Grade_4);
        LinearLayout_Grade_5 = (LinearLayout) view.findViewById(R.id.LinearLayout_Grade_5);
        Button_Grade_1 = (Button) view.findViewById(R.id.Button_Grade_1);
        Button_Grade_2 = (Button) view.findViewById(R.id.Button_Grade_2);
        Button_Grade_3 = (Button) view.findViewById(R.id.Button_Grade_3);
        Button_Grade_4 = (Button) view.findViewById(R.id.Button_Grade_4);
        Button_Grade_5 = (Button) view.findViewById(R.id.Button_Grade_5);
        ImageView_Grade_1 = (ImageView) view.findViewById(R.id.ImageView_Grade_1);
        ImageView_Grade_2 = (ImageView) view.findViewById(R.id.ImageView_Grade_2);
        ImageView_Grade_3 = (ImageView) view.findViewById(R.id.ImageView_Grade_3);
        ImageView_Grade_4 = (ImageView) view.findViewById(R.id.ImageView_Grade_4);
        ImageView_Grade_5 = (ImageView) view.findViewById(R.id.ImageView_Grade_5);

        LinearLayout_Selected_BMI = (LinearLayout) view.findViewById(R.id.LinearLayout_Selected_BMI);
        ImageView_Selected_BMI = (ImageView) view.findViewById(R.id.ImageView_Selected_BMI);
        ImageView_Clean_BMI = (ImageView) view.findViewById(R.id.ImageView_Clean_BMI);
        ImageView_Back_BMI = (ImageView) view.findViewById(R.id.ImageView_Back_BMI);
        TextView_Selected_BMI = (TextView) view.findViewById(R.id.TextView_Selected_BMI);

    }

    private void Load_Language() {

        TextView_Health_BMI.setText(Class_Language_Text.FragmentHealth_BMI);
        TextView_Selected_BMI.setText(Class_Language_Text.FragmentHealth_BMI);

        TextInputLayout_Field_Weight.setHint(Class_Language_Text.FragmentHealth_Weight);
        TextInputLayout_Field_Height.setHint(Class_Language_Text.FragmentHealth_Height);

        Button_Grade_1.setText(Class_Language_Text.FragmentHealth_Grade_1);
        Button_Grade_2.setText(Class_Language_Text.FragmentHealth_Grade_2);
        Button_Grade_3.setText(Class_Language_Text.FragmentHealth_Grade_3);
        Button_Grade_4.setText(Class_Language_Text.FragmentHealth_Grade_4);
        Button_Grade_5.setText(Class_Language_Text.FragmentHealth_Grade_5);

    }

    private void InApp_ads(View view) {

        Adivery.configure(getActivity().getApplication(), "89b4c01a-d9fb-4aa0-ad89-739b526fe037");

        AdiveryBannerAdView bannerAd = view.findViewById(R.id.banner_ad);

        bannerAd.setBannerAdListener(new AdiveryAdListener() {
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

        bannerAd.loadAd();

    }

    private void Build_Events() {

        LinearLayout_Health_BMI_Item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.MainAds_Index++;
                MainActivity.MainAds();

                LinearLayout_Health_BMI_Item.setVisibility(View.GONE);
                RelativeLayout_Health_BMI_Field.setVisibility(View.VISIBLE);
            }
        });

        EditText_Field_Weight.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!EditText_Field_Weight.getText().toString().isEmpty() && !EditText_Field_Height.getText().toString().isEmpty()) {
                    CalculateBMI();
                }
                return false;
            }
        });

        EditText_Field_Height.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!EditText_Field_Weight.getText().toString().isEmpty() && !EditText_Field_Height.getText().toString().isEmpty()) {
                    CalculateBMI();
                }
                return false;
            }
        });

        ImageView_Back_BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout_Health_BMI_Item.setVisibility(View.VISIBLE);
                RelativeLayout_Health_BMI_Field.setVisibility(View.GONE);
            }
        });

        ImageView_Clean_BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText_Field_Height.setText("");
                EditText_Field_Weight.setText("");
                TextView_BMI_Number.setText("");

                ImageView_Grade_1.setVisibility(View.GONE);
                ImageView_Grade_2.setVisibility(View.GONE);
                ImageView_Grade_3.setVisibility(View.GONE);
                ImageView_Grade_4.setVisibility(View.GONE);
                ImageView_Grade_5.setVisibility(View.GONE);

                LinearLayout_BMI_Result.setVisibility(View.GONE);
            }
        });

    }

    private void CalculateBMI() {

        Weight = Double.parseDouble(EditText_Field_Weight.getText().toString());
        Height = Double.parseDouble(EditText_Field_Height.getText().toString()) / 100;

        Result = Math.round((Weight / Math.pow(Height, 2)) * 1000);
        Result /= 1000;

        TextView_BMI_Number.setText(Result + "");

        LinearLayout_BMI_Result.setVisibility(View.VISIBLE);

        ImageView_Grade_1.setVisibility(View.GONE);
        ImageView_Grade_2.setVisibility(View.GONE);
        ImageView_Grade_3.setVisibility(View.GONE);
        ImageView_Grade_4.setVisibility(View.GONE);
        ImageView_Grade_5.setVisibility(View.GONE);

        if (Result < 18.5){
            ImageView_Grade_1.setVisibility(View.VISIBLE);
        }

        if (Result > 18.5 && Result < 24.9){
            ImageView_Grade_2.setVisibility(View.VISIBLE);
        }

        if (Result > 25 && Result < 29.9){
            ImageView_Grade_3.setVisibility(View.VISIBLE);
        }

        if (Result > 30 && Result < 34.9){
            ImageView_Grade_4.setVisibility(View.VISIBLE);
        }

        if (Result > 35){
            ImageView_Grade_5.setVisibility(View.VISIBLE);
        }

    }

}