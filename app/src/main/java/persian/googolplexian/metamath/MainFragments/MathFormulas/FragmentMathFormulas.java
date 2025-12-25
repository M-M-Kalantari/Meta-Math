package persian.googolplexian.metamath.MainFragments.MathFormulas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryAdListener;
import com.adivery.sdk.AdiveryBannerAdView;

import net.yslibrary.android.keyboardvisibilityevent.util.UIUtil;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import persian.googolplexian.metamath.BroadcastReceiver.Class_BroadcastReceiver;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.MainFragments.MathFormulas.AverageList.Class_Maf_Average;
import persian.googolplexian.metamath.MainFragments.MathFormulas.AverageList.Class_Maf_AverageAdapter;
import persian.googolplexian.metamath.MainFragments.MathFormulas.AverageList.Class_Maf_AverageData;
import persian.googolplexian.metamath.MainFragments.MathFormulas.ItemsList.Class_Maf_Item;
import persian.googolplexian.metamath.MainFragments.MathFormulas.ItemsList.Class_Maf_ItemsAdapter;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;
import persian.googolplexian.metamath.R;

import static persian.googolplexian.metamath.MainActivity.Fragment_BackPressed;

public class FragmentMathFormulas extends Fragment {

    RelativeLayout RelativeLayout_MathFormulas;

    ///// Lock /////
    public static RelativeLayout RelativeLayout_Lock_FragmentMathFormulas;
    ImageView ImageView_Lock;
    TextView TextView_Lock;
    ////////////////

    public static ListView ListView_MathFormulasItems;
    ArrayList<Class_Maf_Item> arrayListItems;
    Class_Maf_ItemsAdapter itemsAdapter;

    public static ImageView ImageView_Add;

    ///// Selected Field /////
    public static RelativeLayout RelativeLayout_MathFormulasFields;
    LinearLayout LinearLayout_SelectedField;
    ImageView ImageView_SelectedField, ImageView_Share, ImageView_Clean, ImageView_Back;
    TextView TextView_SelectedField;
    /////////////////////////

    ///// Equations /////
    ScrollView ScrollView_Equations;
    RelativeLayout RelativeLayout_Equations;
    Spinner Spinner_Equations;
    LinearLayout LinearLayout_Equations_1;
    EditText EditText_Equations_1_m, EditText_Equations_1_h;
    LinearLayout LinearLayout_Equations_2;
    EditText EditText_Equations_2_c, EditText_Equations_2_b, EditText_Equations_2_a;
    LinearLayout LinearLayout_Equations_x1, LinearLayout_Equations_x2;
    TextView TextView_Equations_Result, TextView_Equations_x1, TextView_Equations_x2;
    boolean Negative_Equations_m = false;
    boolean Negative_Equations_h = false;
    boolean Negative_Equations_a = false;
    boolean Negative_Equations_b = false;
    boolean Negative_Equations_c = false;
    int Equations = 0;
    /////////////////////

    ///// Average /////
    RelativeLayout RelativeLayout_Average;
    TextView TextView_Average;
    RecyclerView RecyclerView_Average;
    Class_Maf_AverageAdapter averageAdapter;
    ///////////////////

    ///// Percentage /////
    ScrollView ScrollView_Percentage;
    RelativeLayout RelativeLayout_Percentage;
    Spinner Spinner_Percentage;
    TextView TextView_Percentage;
    EditText EditText_Percentage_a, EditText_Percentage_b;
    boolean Negative_Percentage_a = false;
    boolean Negative_Percentage_b = false;
    int Percentage = 0;
    //////////////////////

    ///// Proportion /////
    ScrollView ScrollView_Proportion;
    RelativeLayout RelativeLayout_Proportion;
    Spinner Spinner_Proportion;
    LinearLayout LinearLayout_Proportion_1;
    EditText EditText_Proportion_1_a, EditText_Proportion_1_b, EditText_Proportion_1_x, EditText_Proportion_1_y;
    LinearLayout LinearLayout_Proportion_2;
    EditText EditText_Proportion_2_a, EditText_Proportion_2_b, EditText_Proportion_2_x, EditText_Proportion_2_y;
    boolean Negative_Proportion_1_a = false;
    boolean Negative_Proportion_1_b = false;
    boolean Negative_Proportion_1_x = false;
    boolean Negative_Proportion_1_y = false;
    boolean Negative_Proportion_2_a = false;
    boolean Negative_Proportion_2_b = false;
    boolean Negative_Proportion_2_x = false;
    boolean Negative_Proportion_2_y = false;
    int Proportion = 0;
    //////////////////////

    ///// Combinations Permutation /////
    ScrollView ScrollView_CombinationsPermutation;
    RelativeLayout RelativeLayout_CombinationsPermutation;
    EditText EditText_CombinationsPermutation_n, EditText_CombinationsPermutation_r;
    TextView TextView_CombinationsPermutation_Repeatable;
    RadioGroup RadioGroup_CombinationsPermutation_Repeatable;
    RadioButton RadioButton_CombinationsPermutation_Repeatable_Yes, RadioButton_CombinationsPermutation_Repeatable_No;
    TextView TextView_CombinationsPermutation_Regular;
    RadioGroup RadioGroup_CombinationsPermutation_Regular;
    RadioButton RadioButton_CombinationsPermutation_Regular_Yes, RadioButton_CombinationsPermutation_Regular_No;
    TextView TextView_CombinationsPermutation;
    boolean Repeatable = false;
    boolean Regular = false;
    boolean Negative_CombinationsPermutation_n = false;
    boolean Negative_CombinationsPermutation_r = false;
    ////////////////////////////////////

    ///// Fraction Decimal /////
    ScrollView ScrollView_FractionDecimal;
    RelativeLayout RelativeLayout_FractionDecimal;
    EditText EditText_FractionDecimal_a, EditText_FractionDecimal_b, EditText_FractionDecimal_x;
    boolean Negative_FractionDecimal_a = false;
    boolean Negative_FractionDecimal_b = false;
    boolean Negative_FractionDecimal_x = false;
    ////////////////////////////

    ///// Efficiency /////
    ScrollView ScrollView_Efficiency;
    RelativeLayout RelativeLayout_Efficiency;
    EditText EditText_Efficiency_Output, EditText_Efficiency_Input, EditText_Efficiency;
    boolean Negative_Efficiency_Output = false;
    boolean Negative_Efficiency_Input = false;
    //////////////////////

    public static int MAF_SelectedItemID = 0;
    public static int MAF_SelectedFieldID = 0;
    public static String MAF_InputText = "";
    public static double MAF_InputNumber = 0;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public FragmentMathFormulas() {
        // Required empty public constructor
    }

    public static FragmentMathFormulas newInstance(String param1, String param2) {
        FragmentMathFormulas fragment = new FragmentMathFormulas();
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
        View view = inflater.inflate(R.layout.fragment_math_formulas, container, false);

        Find_Views(view);
        Load_Language();
        Lock_FragmentMathFormulas();
        InApp_ads(view);
        Build_Events();
        Build_ItemList();

        return view;
    }

    private void Find_Views(View view) {
        RelativeLayout_MathFormulas = (RelativeLayout) view.findViewById(R.id.RelativeLayout_MathFormulas);

        /*/*/ ///// Lock /////
        RelativeLayout_Lock_FragmentMathFormulas = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Lock_FragmentMathFormulas);
        ImageView_Lock = (ImageView) view.findViewById(R.id.ImageView_Lock);
        TextView_Lock = (TextView) view.findViewById(R.id.TextView_Lock);
        ////////////////

        ListView_MathFormulasItems = (ListView) view.findViewById(R.id.ListView_MathFormulasItems);

        RelativeLayout_MathFormulasFields = (RelativeLayout) view.findViewById(R.id.RelativeLayout_MathFormulasFields);

        ImageView_Add = (ImageView) view.findViewById(R.id.ImageView_Add);

        /*/*/ ///// Selected Field /////
        RelativeLayout_MathFormulasFields = (RelativeLayout) view.findViewById(R.id.RelativeLayout_MathFormulasFields);
        LinearLayout_SelectedField = (LinearLayout) view.findViewById(R.id.LinearLayout_SelectedField);
        ImageView_SelectedField = (ImageView) view.findViewById(R.id.ImageView_SelectedField);
        ImageView_Share = (ImageView) view.findViewById(R.id.ImageView_Share);
        ImageView_Clean = (ImageView) view.findViewById(R.id.ImageView_Clean);
        ImageView_Back = (ImageView) view.findViewById(R.id.ImageView_Back);
        TextView_SelectedField = (TextView) view.findViewById(R.id.TextView_SelectedField);
        TextView_SelectedField.setSelected(true);
        /////////////////////////

        /*/*/ ///// Equations /////
        ScrollView_Equations = (ScrollView) view.findViewById(R.id.ScrollView_Equations);
        RelativeLayout_Equations = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Equations);
        Spinner_Equations = (Spinner) view.findViewById(R.id.Spinner_Equations);
        LinearLayout_Equations_1 = (LinearLayout) view.findViewById(R.id.LinearLayout_Equations_1);
        EditText_Equations_1_m = (EditText) view.findViewById(R.id.EditText_Equations_1_m);
        EditText_Equations_1_h = (EditText) view.findViewById(R.id.EditText_Equations_1_h);
        LinearLayout_Equations_2 = (LinearLayout) view.findViewById(R.id.LinearLayout_Equations_2);
        EditText_Equations_2_c = (EditText) view.findViewById(R.id.EditText_Equations_2_c);
        EditText_Equations_2_b = (EditText) view.findViewById(R.id.EditText_Equations_2_b);
        EditText_Equations_2_a = (EditText) view.findViewById(R.id.EditText_Equations_2_a);
        TextView_Equations_Result = (TextView) view.findViewById(R.id.TextView_Equations_Result);
        LinearLayout_Equations_x1 = (LinearLayout) view.findViewById(R.id.LinearLayout_Equations_x1);
        LinearLayout_Equations_x2 = (LinearLayout) view.findViewById(R.id.LinearLayout_Equations_x2);
        TextView_Equations_x1 = (TextView) view.findViewById(R.id.TextView_Equations_x1);
        TextView_Equations_x2 = (TextView) view.findViewById(R.id.TextView_Equations_x2);
        /////////////////////

        /*/*/ ///// Average /////
        RelativeLayout_Average = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Average);
        TextView_Average = (TextView) view.findViewById(R.id.TextView_Average);
        RecyclerView_Average = (RecyclerView) view.findViewById(R.id.RecyclerView_Average);
        ///////////////////

        /*/*/ ///// Percentage /////
        ScrollView_Percentage = (ScrollView) view.findViewById(R.id.ScrollView_Percentage);
        RelativeLayout_Percentage = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Percentage);
        Spinner_Percentage = (Spinner) view.findViewById(R.id.Spinner_Percentage);
        TextView_Percentage = (TextView) view.findViewById(R.id.TextView_Percentage);
        EditText_Percentage_a = (EditText) view.findViewById(R.id.EditText_Percentage_a);
        EditText_Percentage_b = (EditText) view.findViewById(R.id.EditText_Percentage_b);
        //////////////////////

        /*/*/ ///// Proportion /////
        ScrollView_Proportion = (ScrollView) view.findViewById(R.id.ScrollView_Proportion);
        RelativeLayout_Proportion = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Proportion);
        Spinner_Proportion = (Spinner) view.findViewById(R.id.Spinner_Proportion);
        LinearLayout_Proportion_1 = (LinearLayout) view.findViewById(R.id.LinearLayout_Proportion_1);
        EditText_Proportion_1_a = (EditText) view.findViewById(R.id.EditText_Proportion_1_a);
        EditText_Proportion_1_b = (EditText) view.findViewById(R.id.EditText_Proportion_1_b);
        EditText_Proportion_1_x = (EditText) view.findViewById(R.id.EditText_Proportion_1_x);
        EditText_Proportion_1_y = (EditText) view.findViewById(R.id.EditText_Proportion_1_y);
        LinearLayout_Proportion_2 = (LinearLayout) view.findViewById(R.id.LinearLayout_Proportion_2);
        EditText_Proportion_2_a = (EditText) view.findViewById(R.id.EditText_Proportion_2_a);
        EditText_Proportion_2_b = (EditText) view.findViewById(R.id.EditText_Proportion_2_b);
        EditText_Proportion_2_x = (EditText) view.findViewById(R.id.EditText_Proportion_2_x);
        EditText_Proportion_2_y = (EditText) view.findViewById(R.id.EditText_Proportion_2_y);
        //////////////////////

        /*/*/ ///// Combinations Permutation /////
        ScrollView_CombinationsPermutation = (ScrollView) view.findViewById(R.id.ScrollView_CombinationsPermutation);
        RelativeLayout_CombinationsPermutation = (RelativeLayout) view.findViewById(R.id.RelativeLayout_CombinationsPermutation);
        EditText_CombinationsPermutation_n = (EditText) view.findViewById(R.id.EditText_CombinationsPermutation_n);
        EditText_CombinationsPermutation_r = (EditText) view.findViewById(R.id.EditText_CombinationsPermutation_r);
        TextView_CombinationsPermutation_Repeatable = (TextView) view.findViewById(R.id.TextView_CombinationsPermutation_Repeatable);
        TextView_CombinationsPermutation_Repeatable.setSelected(true);
        RadioGroup_CombinationsPermutation_Repeatable = (RadioGroup) view.findViewById(R.id.RadioGroup_CombinationsPermutation_Repeatable);
        RadioButton_CombinationsPermutation_Repeatable_Yes = (RadioButton) view.findViewById(R.id.RadioButton_CombinationsPermutation_Repeatable_Yes);
        RadioButton_CombinationsPermutation_Repeatable_No = (RadioButton) view.findViewById(R.id.RadioButton_CombinationsPermutation_Repeatable_No);
        TextView_CombinationsPermutation_Regular = (TextView) view.findViewById(R.id.TextView_CombinationsPermutation_Regular);
        TextView_CombinationsPermutation_Regular.setSelected(true);
        RadioGroup_CombinationsPermutation_Regular = (RadioGroup) view.findViewById(R.id.RadioGroup_CombinationsPermutation_Regular);
        RadioButton_CombinationsPermutation_Regular_Yes = (RadioButton) view.findViewById(R.id.RadioButton_CombinationsPermutation_Regular_Yes);
        RadioButton_CombinationsPermutation_Regular_No = (RadioButton) view.findViewById(R.id.RadioButton_CombinationsPermutation_Regular_No);
        TextView_CombinationsPermutation = (TextView) view.findViewById(R.id.TextView_CombinationsPermutation);
        ////////////////////////////////////

        /*/*/ ///// Fraction Decimal /////
        ScrollView_FractionDecimal = (ScrollView) view.findViewById(R.id.ScrollView_FractionDecimal);
        RelativeLayout_FractionDecimal = (RelativeLayout) view.findViewById(R.id.RelativeLayout_FractionDecimal);
        EditText_FractionDecimal_a = (EditText) view.findViewById(R.id.EditText_FractionDecimal_a);
        EditText_FractionDecimal_b = (EditText) view.findViewById(R.id.EditText_FractionDecimal_b);
        EditText_FractionDecimal_x = (EditText) view.findViewById(R.id.EditText_FractionDecimal_x);
        ////////////////////////////

        /*/*/ ///// Efficiency /////
        ScrollView_Efficiency = (ScrollView) view.findViewById(R.id.ScrollView_Efficiency);
        RelativeLayout_Efficiency = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Efficiency);
        EditText_Efficiency_Output = (EditText) view.findViewById(R.id.EditText_Efficiency_Output);
        EditText_Efficiency_Input = (EditText) view.findViewById(R.id.EditText_Efficiency_Input);
        EditText_Efficiency = (EditText) view.findViewById(R.id.EditText_Efficiency);
        //////////////////////

    }

    private void Load_Language() {

        TextView_Equations_Result.setText(Class_Language_Text.FragmentMathFormulas_Result);
        TextView_Lock.setText(Class_Language_Text.Error_0);

    }

    public static void Lock_FragmentMathFormulas() {
        try {
            if (Class_BroadcastReceiver.Lock_App){
                RelativeLayout_Lock_FragmentMathFormulas.setVisibility(View.VISIBLE);
            }else {
                RelativeLayout_Lock_FragmentMathFormulas.setVisibility(View.GONE);
            }
        }catch (Exception e){

        }
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

        ImageView_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListView_MathFormulasItems.setVisibility(View.VISIBLE);
                RelativeLayout_MathFormulasFields.setVisibility(View.GONE);
                ImageView_Add.setVisibility(View.GONE);

                ScrollView_Equations.setVisibility(View.GONE);
                RelativeLayout_Equations.setVisibility(View.GONE);

                RelativeLayout_Average.setVisibility(View.GONE);

                ScrollView_Percentage.setVisibility(View.GONE);
                RelativeLayout_Percentage.setVisibility(View.GONE);

                ScrollView_Proportion.setVisibility(View.GONE);
                RelativeLayout_Proportion.setVisibility(View.GONE);

                ScrollView_CombinationsPermutation.setVisibility(View.GONE);
                RelativeLayout_CombinationsPermutation.setVisibility(View.GONE);

                ScrollView_FractionDecimal.setVisibility(View.GONE);
                RelativeLayout_FractionDecimal.setVisibility(View.GONE);

                ScrollView_Efficiency.setVisibility(View.GONE);
                RelativeLayout_Efficiency.setVisibility(View.GONE);

            }
        });

        ImageView_Clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (MAF_SelectedItemID) {
                    case 0:
                        EditText_Equations_1_m.setText("");
                        EditText_Equations_1_h.setText("");
                        EditText_Equations_2_c.setText("");
                        EditText_Equations_2_b.setText("");
                        EditText_Equations_2_a.setText("");
                        TextView_Equations_x1.setText("");
                        TextView_Equations_x2.setText("");
                        break;
                    case 1:
                        Class_Maf_AverageData.MAF_AverageList.clear();
                        Class_Maf_AverageData.Maf_Average_LastID = 0;
                        TextView_Average.setText("");
                        averageAdapter.notifyDataSetChanged();
                        break;
                    case 2:
                        TextView_Percentage.setText("");
                        EditText_Percentage_a.setText("");
                        EditText_Percentage_b.setText("");
                        break;
                    case 3:
                        EditText_Proportion_1_a.setText("");
                        EditText_Proportion_1_b.setText("");
                        EditText_Proportion_1_x.setText("");
                        EditText_Proportion_1_y.setText("");
                        EditText_Proportion_2_a.setText("");
                        EditText_Proportion_2_b.setText("");
                        EditText_Proportion_2_x.setText("");
                        EditText_Proportion_2_y.setText("");
                        break;
                    case 4:

                        break;
                    case 5:
                        RadioButton_CombinationsPermutation_Regular_No.setChecked(true);
                        RadioButton_CombinationsPermutation_Repeatable_No.setChecked(true);
                        RadioButton_CombinationsPermutation_Regular_Yes.setChecked(false);
                        RadioButton_CombinationsPermutation_Repeatable_Yes.setChecked(false);
                        Regular = false;
                        Repeatable = false;

                        EditText_CombinationsPermutation_n.setText("");
                        EditText_CombinationsPermutation_r.setText("");
                        TextView_CombinationsPermutation.setText("");
                        break;

                    case 6:
                        EditText_FractionDecimal_a.setText("");
                        EditText_FractionDecimal_b.setText("");
                        EditText_FractionDecimal_x.setText("");
                        break;
                    case 7:
                        EditText_Efficiency_Input.setText("");
                        EditText_Efficiency_Output.setText("");
                        EditText_Efficiency.setText("");
                        break;
                }
            }
        });

        ImageView_Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.MainAds_Index++;
                MainActivity.MainAds();

                Toast.makeText(getActivity(), Class_Language_Text.Error_2, Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String ShareText = Class_Language_Text.ApplicationName + "\n" + "\n";

                        switch (MAF_SelectedItemID) {
                            case 0:
                                if (Equations == 1) {
                                    ShareText += Class_Language_Text.FragmentMathFormulas_LinearEquation + ":" + "\n";
                                    ShareText += "y = " + EditText_Equations_1_m.getText().toString() + " x + " + EditText_Equations_1_h.getText().toString() + "\n" + "\n";
                                    ShareText += Class_Language_Text.FragmentMathFormulas_Result + ":" + "\n";
                                    ShareText += "x₁ = " + TextView_Equations_x1.getText().toString();
                                } else if (Equations == 2) {
                                    ShareText += Class_Language_Text.FragmentMathFormulas_QuadraticEquation + ":" + "\n";
                                    ShareText += "y = " + EditText_Equations_2_a.getText().toString() + " x² + " + EditText_Equations_2_b.getText().toString() + " x + " + EditText_Equations_2_c.getText().toString() + "\n" + "\n";
                                    ShareText += Class_Language_Text.FragmentMathFormulas_Result + ":" + "\n";
                                    ShareText += "x₁ = " + TextView_Equations_x1.getText().toString() + "\n";
                                    ShareText += "x₂ = " + TextView_Equations_x2.getText().toString() + "\n";
                                }
                                break;
                            case 1:
                                ShareText += Class_Language_Text.FragmentMathFormulas_Item_Average + ":" + "\n";
                                if (Class_Maf_AverageData.Maf_Average_LastID != 0) {
                                    ShareText += "( ";
                                    try {
                                        for (int i = 0; i < Class_Maf_AverageData.Maf_Average_LastID + 1; i++) {
                                            ShareText += Class_Maf_AverageData.MAF_AverageList.get(i).getMAF_Average_Number() + " + ";
                                        }
                                    } catch (Exception e) {

                                    }
                                    ShareText = ShareText.substring(0, ShareText.length() - 3);
                                    ShareText += " )";
                                    ShareText += " ÷ " + Class_Maf_AverageData.Maf_Average_LastID;
                                    ShareText += "\n" + " = " + TextView_Average.getText().toString();
                                } else {
                                    ShareText += "( ) ÷ 0 = 0";
                                }
                                break;
                            case 2:
                                switch (Percentage) {
                                    case 1:
                                        ShareText += Class_Language_Text.FragmentMathFormulas_PercentageIncrease + ":" + "\n";
                                        break;
                                    case 2:
                                        ShareText += Class_Language_Text.FragmentMathFormulas_PercentageDecrease + ":" + "\n";
                                        break;
                                    case 3:
                                        ShareText += Class_Language_Text.FragmentMathFormulas_Percentage + ":" + "\n";
                                        break;
                                }
                                ShareText += TextView_Percentage.getText().toString();
                                break;
                            case 3:
                                switch (Proportion) {
                                    case 1:
                                        ShareText += Class_Language_Text.FragmentMathFormulas_ProportionalDirectly + ":" + "\n";
                                        ShareText += EditText_Proportion_1_a.getText().toString() + " / " + EditText_Proportion_1_b.getText().toString() + " = " + EditText_Proportion_1_x.getText().toString() + " / " + EditText_Proportion_1_y.getText().toString();
                                        break;
                                    case 2:
                                        ShareText += Class_Language_Text.FragmentMathFormulas_ProportionalIndirectly + ":" + "\n";
                                        ShareText += EditText_Proportion_2_a.getText().toString() + " × " + EditText_Proportion_2_b.getText().toString() + " = " + EditText_Proportion_2_x.getText().toString() + " × " + EditText_Proportion_2_y.getText().toString();
                                        break;
                                }
                                break;
                            case 4:

                                break;
                            case 5:
                                ShareText += Class_Language_Text.FragmentMathFormulas_Item_Combinations_Permutation + ":" + "\n" + "\n";
                                ShareText += "n = " + EditText_CombinationsPermutation_n.getText().toString() + "\n";
                                ShareText += "r = " + EditText_CombinationsPermutation_r.getText().toString() + "\n";
                                ShareText += EditText_Efficiency.getText().toString() + "\n";
                                if (Regular == false && Repeatable == false) {
                                    ShareText += Class_Language_Text.FragmentMathFormulas_Combinations + ":" + "\n";
                                } else if (Regular == true && Repeatable == false) {
                                    ShareText += Class_Language_Text.FragmentMathFormulas_Permutation + ":" + "\n";
                                } else if (Regular == false && Repeatable == true) {
                                    ShareText += Class_Language_Text.FragmentMathFormulas_Combinations + ":" + "\n";
                                } else if (Regular == true && Repeatable == true) {
                                    ShareText += Class_Language_Text.FragmentMathFormulas_Permutation + ":" + "\n";
                                }
                                break;
                            case 6:
                                ShareText += Class_Language_Text.FragmentMathFormulas_Item_Fraction_Decimal + ":" + "\n";
                                ShareText += EditText_FractionDecimal_a.getText().toString() + " / " + EditText_FractionDecimal_b.getText().toString() + " = " + EditText_FractionDecimal_x.getText().toString() + "\n";
                                break;
                            case 7:
                                ShareText += Class_Language_Text.FragmentMathFormulas_Item_Efficiency + ":" + "\n";
                                ShareText += Class_Language_Text.FragmentMathFormulas_EfficiencyInput + ": " + EditText_Efficiency_Input.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentMathFormulas_EfficiencyOutput + ": " + EditText_Efficiency_Output.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentMathFormulas_Item_Efficiency + ": " + EditText_Efficiency.getText().toString() + "\n";
                                break;
                        }

                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, ShareText);
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);
                    }
                }, 1000);
            }
        });

        ImageView_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class_Maf_AverageData.MAF_AverageList.add(new Class_Maf_Average(0));
                Class_Maf_AverageData.Maf_Average_LastID++;
                Average();
                averageAdapter.notifyDataSetChanged();
                MainActivity.External_Snackbars(5);
            }
        });

    }


    private void Build_ItemList() {
        arrayListItems = new ArrayList<>();
        itemsAdapter = new Class_Maf_ItemsAdapter(getActivity(), arrayListItems);

        arrayListItems.add(new Class_Maf_Item(0, Class_Language_Text.FragmentMathFormulas_Item_Equations, "ic_maf_equations"));
        arrayListItems.add(new Class_Maf_Item(1, Class_Language_Text.FragmentMathFormulas_Item_Average, "ic_maf_average"));
        arrayListItems.add(new Class_Maf_Item(2, Class_Language_Text.FragmentMathFormulas_Item_Percentage, "ic_maf_percent"));
        arrayListItems.add(new Class_Maf_Item(3, Class_Language_Text.FragmentMathFormulas_Item_Proportion, "ic_maf_proportion"));
//        arrayListItems.add(new Class_Maf_Item(4, Class_Language_Text.FragmentMathFormulas_Item_GCF_LCM, "ic_maf_equations"));
        arrayListItems.add(new Class_Maf_Item(5, Class_Language_Text.FragmentMathFormulas_Item_Combinations_Permutation, "ic_maf_combinations"));
        arrayListItems.add(new Class_Maf_Item(6, Class_Language_Text.FragmentMathFormulas_Item_Fraction_Decimal, "ic_maf_fractional"));
        arrayListItems.add(new Class_Maf_Item(7, Class_Language_Text.FragmentMathFormulas_Item_Efficiency, "ic_maf_efficiency"));

        ListView_MathFormulasItems.setAdapter(itemsAdapter);

        ListView_MathFormulasItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!Class_BroadcastReceiver.Lock_App){
                    MainActivity.MainAds_Index++;
                    MainActivity.MainAds();

                    ImageView_Back.callOnClick();
                    ListView_MathFormulasItems.setVisibility(View.GONE);
                    RelativeLayout_MathFormulasFields.setVisibility(View.VISIBLE);
                    TextView_SelectedField.setText(arrayListItems.get(position).getMAF_Item_Title());
                    String URL = "@drawable/" + arrayListItems.get(position).getMAF_Item_Vector();
                    int ImageSource = getContext().getResources().getIdentifier(URL, null, getContext().getPackageName());
                    ImageView_SelectedField.setImageDrawable(ResourcesCompat.getDrawable(getContext().getResources(), ImageSource, null));
                    MAF_SelectedItemID = arrayListItems.get(position).getMAF_Item_ID();
                    switch (MAF_SelectedItemID) {
                        case 0:
                            Build_Equations();
                            break;
                        case 1:
                            Build_Average();
                            break;
                        case 2:
                            Build_Percentage();
                            break;
                        case 3:
                            Build_Proportion();
                            break;
                        case 4:
                            Build_GCF_LCM();
                            break;
                        case 5:
                            Build_Combinations_Permutation();
                            break;
                        case 6:
                            Build_Fraction_Decimal();
                            break;
                        case 7:
                            Build_Efficiency();
                            break;
                    }
                    MainActivity.External_Snackbars(5);
                    Fragment_BackPressed = true;
                }
            }
        });
    }


    /*/*/ ///// Equations /////
    private void Build_Equations() {
        ScrollView_Equations.setVisibility(View.VISIBLE);
        RelativeLayout_Equations.setVisibility(View.VISIBLE);

        ArrayList<String> Spinner_Data = new ArrayList<>();
        Spinner_Data.addAll(Arrays.asList(Class_Language_Text.FragmentMathFormulas_LinearEquation, Class_Language_Text.FragmentMathFormulas_QuadraticEquation));
        ArrayAdapter<String> Spinner_Adapter;

        Spinner_Adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, Spinner_Data);
        Spinner_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner_Equations.setAdapter(Spinner_Adapter);
        Spinner_Equations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (Spinner_Adapter.getItem(position) == Class_Language_Text.FragmentMathFormulas_LinearEquation) {
                    LinearLayout_Equations_1.setVisibility(View.VISIBLE);
                    LinearLayout_Equations_2.setVisibility(View.GONE);
                    LinearLayout_Equations_x1.setVisibility(View.VISIBLE);
                    LinearLayout_Equations_x2.setVisibility(View.GONE);
                    Equations = 1;
                    LinearEquation(0);
                } else if (Spinner_Adapter.getItem(position) == Class_Language_Text.FragmentMathFormulas_QuadraticEquation) {
                    LinearLayout_Equations_1.setVisibility(View.GONE);
                    LinearLayout_Equations_2.setVisibility(View.VISIBLE);
                    LinearLayout_Equations_x1.setVisibility(View.VISIBLE);
                    LinearLayout_Equations_x2.setVisibility(View.VISIBLE);
                    Equations = 2;
                    QuadraticEquation(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        TextView_Equations_x1.setText("");
        TextView_Equations_x2.setText("");

        EditText_Equations_1_m.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Equations_1_m.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Equations_1_m.getText().toString());
                    if (y == 0) {
                        if (!Negative_Equations_m) {
                            EditText_Equations_1_m.setText("-");
                            EditText_Equations_1_m.setSelection(EditText_Equations_1_m.getText().length());
                            Negative_Equations_m = true;
                        }
                    }
                }
                String z = EditText_Equations_1_m.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Equations_m = false;
                }

                try {
                    LinearEquation(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Equations_1_h.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Equations_1_h.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Equations_1_h.getText().toString());
                    if (y == 0) {
                        if (!Negative_Equations_h) {
                            EditText_Equations_1_h.setText("-");
                            EditText_Equations_1_h.setSelection(EditText_Equations_1_h.getText().length());
                            Negative_Equations_h = true;
                        }
                    }
                }
                String z = EditText_Equations_1_h.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Equations_h = false;
                }

                try {
                    LinearEquation(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Equations_2_a.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Equations_2_a.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Equations_2_a.getText().toString());
                    if (y == 0) {
                        if (!Negative_Equations_a) {
                            EditText_Equations_2_a.setText("-");
                            EditText_Equations_2_a.setSelection(EditText_Equations_2_a.getText().length());
                            Negative_Equations_a = true;
                        }
                    }
                }
                String z = EditText_Equations_2_a.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Equations_a = false;
                }

                try {
                    QuadraticEquation(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Equations_2_b.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Equations_2_b.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Equations_2_b.getText().toString());
                    if (y == 0) {
                        if (!Negative_Equations_b) {
                            EditText_Equations_2_b.setText("-");
                            EditText_Equations_2_b.setSelection(EditText_Equations_2_b.getText().length());
                            Negative_Equations_b = true;
                        }
                    }
                }
                String z = EditText_Equations_2_b.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Equations_b = false;
                }

                try {
                    QuadraticEquation(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Equations_2_c.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Equations_2_c.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Equations_2_c.getText().toString());
                    if (y == 0) {
                        if (!Negative_Equations_c) {
                            EditText_Equations_2_c.setText("-");
                            EditText_Equations_2_c.setSelection(EditText_Equations_2_c.getText().length());
                            Negative_Equations_c = true;
                        }
                    }
                }
                String z = EditText_Equations_2_c.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Equations_c = false;
                }

                try {
                    QuadraticEquation(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

    }

    private void LinearEquation(int keyCode) {
        double m = EditText_Equations_1_m.getText().toString().length();
        double h = EditText_Equations_1_h.getText().toString().length();
        double x = 0;
        double y = 0;

        if (m != 0 && h != 0) {
            m = Double.parseDouble(EditText_Equations_1_m.getText().toString());
            h = Double.parseDouble(EditText_Equations_1_h.getText().toString());
            x = -(h / m);
            TextView_Equations_x1.setText(x + "");
        }

        if (keyCode == 67) {
            if (m == 0 || h == 0) {
                TextView_Equations_x1.setText("");
            }
        }

    }

    private void QuadraticEquation(int keyCode) {
        double a = EditText_Equations_2_a.getText().toString().length();
        double b = EditText_Equations_2_b.getText().toString().length();
        double c = EditText_Equations_2_c.getText().toString().length();
        double x1 = 0;
        double x2 = 0;
        double y = 0;
        double Delta = 0;

        if (a != 0 && b != 0 && c != 0) {
            a = Double.parseDouble(EditText_Equations_2_a.getText().toString());
            b = Double.parseDouble(EditText_Equations_2_b.getText().toString());
            c = Double.parseDouble(EditText_Equations_2_c.getText().toString());
            Delta = Math.pow(b, 2) - 4 * a * c;
            if (Delta > 0) {
                x1 = (-b + Math.sqrt(Delta)) / (2 * a);
                x2 = (-b - Math.sqrt(Delta)) / (2 * a);
                TextView_Equations_x1.setText(x1 + "");
                TextView_Equations_x2.setText(x2 + "");
            } else if (Delta == 0) {
                x1 = -b / (2 * a);
                TextView_Equations_x1.setText(x1 + "");
                TextView_Equations_x2.setText(x1 + "");
            } else if (Delta < 0) {
                TextView_Equations_x1.setText("");
                TextView_Equations_x2.setText("");
            }
        }

        if (keyCode == 67) {
            if (a == 0 || b == 0 || c == 0) {
                TextView_Equations_x1.setText("");
            }
        }
    }
    /////////////////////


    /*/*/ ///// Average /////
    private void Build_Average() {
        RelativeLayout_Average.setVisibility(View.VISIBLE);
        ImageView_Add.setVisibility(View.VISIBLE);

        averageAdapter = new Class_Maf_AverageAdapter(Class_Maf_AverageData.MAF_AverageList, getContext(), new Class_Maf_AverageAdapter.OnItemEventListeners() {
            @Override
            public void OnClickListener(Class_Maf_Average item, int pos, String Input) {
                try {
                    if (Input.length() != 0) {
                        Class_Maf_AverageData.MAF_AverageList.get(pos).setMAF_Average_Number(Double.parseDouble(Input));
                        Average();
                    }
                    UIUtil.hideKeyboard(getActivity());
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }
                averageAdapter.notifyDataSetChanged();
            }

            @Override
            public void OnDeleteListener(Class_Maf_Average item, int pos, String Input) {
                Class_Maf_AverageData.MAF_AverageList.remove(pos);
                Class_Maf_AverageData.Maf_Average_LastID--;
                Average();
                averageAdapter.notifyDataSetChanged();
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        RecyclerView_Average.setLayoutManager(layoutManager);
        RecyclerView_Average.setAdapter(averageAdapter);
        averageAdapter.notifyDataSetChanged();

    }

    private void Average() {
        double x = 0;
        try {
            for (int i = 0; i < Class_Maf_AverageData.Maf_Average_LastID + 1; i++) {
                x += Class_Maf_AverageData.MAF_AverageList.get(i).getMAF_Average_Number();
            }
        } catch (Exception e) {

        }
        x /= Class_Maf_AverageData.Maf_Average_LastID;
        TextView_Average.setText(x + "");
    }
    ///////////////////


    /*/*/ ///// Percentage /////
    private void Build_Percentage() {
        ScrollView_Percentage.setVisibility(View.VISIBLE);
        RelativeLayout_Percentage.setVisibility(View.VISIBLE);

        ArrayList<String> Spinner_Data = new ArrayList<>();
        Spinner_Data.addAll(Arrays.asList(Class_Language_Text.FragmentMathFormulas_PercentageIncrease, Class_Language_Text.FragmentMathFormulas_PercentageDecrease, Class_Language_Text.FragmentMathFormulas_Percentage));
        ArrayAdapter<String> Spinner_Adapter;

        Spinner_Adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, Spinner_Data);
        Spinner_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner_Percentage.setAdapter(Spinner_Adapter);
        Spinner_Percentage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (Spinner_Adapter.getItem(position) == Class_Language_Text.FragmentMathFormulas_PercentageIncrease) {
                    TextView_Percentage.setHint("a - b% = x");
                    Percentage = 1;
                    PercentageIncrease(0);
                } else if (Spinner_Adapter.getItem(position) == Class_Language_Text.FragmentMathFormulas_PercentageDecrease) {
                    TextView_Percentage.setHint("a + b% = x");
                    Percentage = 2;
                    PercentageDecrease(0);
                } else if (Spinner_Adapter.getItem(position) == Class_Language_Text.FragmentMathFormulas_Percentage) {
                    TextView_Percentage.setHint("a × b% = x");
                    Percentage = 3;
                    Percentage(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        EditText_Percentage_a.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Percentage_a.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Percentage_a.getText().toString());
                    if (y == 0) {
                        if (!Negative_Percentage_a) {
                            EditText_Percentage_a.setText("-");
                            EditText_Percentage_a.setSelection(EditText_Percentage_a.getText().length());
                            Negative_Percentage_a = true;
                        }
                    }
                }
                String z = EditText_Percentage_a.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Percentage_a = false;
                }

                try {
                    switch (Percentage) {
                        case 1:
                            PercentageIncrease(keyCode);
                            break;
                        case 2:
                            PercentageDecrease(keyCode);
                            break;
                        case 3:
                            Percentage(keyCode);
                            break;
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Percentage_b.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Percentage_b.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Percentage_b.getText().toString());
                    if (y == 0) {
                        if (!Negative_Percentage_b) {
                            EditText_Percentage_b.setText("-");
                            EditText_Percentage_b.setSelection(EditText_Percentage_b.getText().length());
                            Negative_Percentage_b = true;
                        }
                    }
                }
                String z = EditText_Percentage_b.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Percentage_b = false;
                }

                try {
                    switch (Percentage) {
                        case 1:
                            PercentageIncrease(keyCode);
                            break;
                        case 2:
                            PercentageDecrease(keyCode);
                            break;
                        case 3:
                            Percentage(keyCode);
                            break;
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
    }

    private void PercentageIncrease(int keyCode) {
        double a = EditText_Percentage_a.getText().toString().length();
        double b = EditText_Percentage_b.getText().toString().length();
        double x = 0;

        if (a != 0 && b != 0) {
            a = Double.parseDouble(EditText_Percentage_a.getText().toString());
            b = Double.parseDouble(EditText_Percentage_b.getText().toString());

            x = a - (a * (b / 100));

            TextView_Percentage.setText(a + " - " + b + "% = " + x);
        }

        if (keyCode == 67) {
            if (a == 0 || b == 0) {
                TextView_Percentage.setText("");
                TextView_Percentage.setHint("a - b% = x");
            }
        }
    }

    private void PercentageDecrease(int keyCode) {
        double a = EditText_Percentage_a.getText().toString().length();
        double b = EditText_Percentage_b.getText().toString().length();
        double x = 0;

        if (a != 0 && b != 0) {
            a = Double.parseDouble(EditText_Percentage_a.getText().toString());
            b = Double.parseDouble(EditText_Percentage_b.getText().toString());

            x = a + (a * (b / 100));

            TextView_Percentage.setText(a + " + " + b + "% = " + x);
        }

        if (keyCode == 67) {
            if (a == 0 || b == 0) {
                TextView_Percentage.setText("");
                TextView_Percentage.setHint("a + b% = x");
            }
        }
    }

    private void Percentage(int keyCode) {
        double a = EditText_Percentage_a.getText().toString().length();
        double b = EditText_Percentage_b.getText().toString().length();
        double x = 0;

        if (a != 0 && b != 0) {
            a = Double.parseDouble(EditText_Percentage_a.getText().toString());
            b = Double.parseDouble(EditText_Percentage_b.getText().toString());

            x = a * (b / 100);

            TextView_Percentage.setText(a + " × " + b + "% = " + x);
        }

        if (keyCode == 67) {
            if (a == 0 || b == 0) {
                TextView_Percentage.setText("");
                TextView_Percentage.setHint("a × b% = x");
            }
        }
    }
    //////////////////////


    /*/*/ ///// Proportion /////
    private void Build_Proportion() {
        ScrollView_Proportion.setVisibility(View.VISIBLE);
        RelativeLayout_Proportion.setVisibility(View.VISIBLE);

        ArrayList<String> Spinner_Data = new ArrayList<>();
        Spinner_Data.addAll(Arrays.asList(Class_Language_Text.FragmentMathFormulas_ProportionalDirectly, Class_Language_Text.FragmentMathFormulas_ProportionalIndirectly));
        ArrayAdapter<String> Spinner_Adapter;

        Spinner_Adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, Spinner_Data);
        Spinner_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner_Proportion.setAdapter(Spinner_Adapter);
        Spinner_Proportion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (Spinner_Adapter.getItem(position) == Class_Language_Text.FragmentMathFormulas_ProportionalDirectly) {
                    LinearLayout_Proportion_1.setVisibility(View.VISIBLE);
                    LinearLayout_Proportion_2.setVisibility(View.GONE);
                    EditText_Proportion_1_x.setFocusable(false);
                    EditText_Proportion_1_x.setClickable(false);
                    EditText_Proportion_1_x.setSelected(false);
                    Proportion = 1;
                    ProportionalDirectly(0);
                } else if (Spinner_Adapter.getItem(position) == Class_Language_Text.FragmentMathFormulas_ProportionalIndirectly) {
                    LinearLayout_Proportion_1.setVisibility(View.GONE);
                    LinearLayout_Proportion_2.setVisibility(View.VISIBLE);
                    EditText_Proportion_2_x.setFocusable(false);
                    EditText_Proportion_2_x.setClickable(false);
                    EditText_Proportion_1_x.setSelected(false);
                    Proportion = 2;
                    ProportionalIndirectly(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        EditText_Proportion_1_a.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_Proportion_1_a.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Proportion_1_a.getText().toString());
                    if (y == 0) {
                        if (!Negative_Proportion_1_a) {
                            EditText_Proportion_1_a.setText("-");
                            EditText_Proportion_1_a.setSelection(EditText_Proportion_1_a.getText().length());
                            Negative_Proportion_1_a = true;
                        }
                    }
                }
                String z = EditText_Proportion_1_a.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Proportion_1_a = false;
                }

                try {
                    ProportionalDirectly(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Proportion_1_b.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_Proportion_1_b.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Proportion_1_b.getText().toString());
                    if (y == 0) {
                        if (!Negative_Proportion_1_b) {
                            EditText_Proportion_1_b.setText("-");
                            EditText_Proportion_1_b.setSelection(EditText_Proportion_1_b.getText().length());
                            Negative_Proportion_1_b = true;
                        }
                    }
                }
                String z = EditText_Proportion_1_b.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Proportion_1_b = false;
                }

                try {
                    ProportionalDirectly(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Proportion_1_x.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_Proportion_1_x.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Proportion_1_x.getText().toString());
                    if (y == 0) {
                        if (!Negative_Proportion_1_x) {
                            EditText_Proportion_1_x.setText("-");
                            EditText_Proportion_1_x.setSelection(EditText_Proportion_1_x.getText().length());
                            Negative_Proportion_1_x = true;
                        }
                    }
                }
                String z = EditText_Proportion_1_x.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Proportion_1_x = false;
                }

                try {
                    ProportionalDirectly(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Proportion_1_y.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_Proportion_1_y.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Proportion_1_y.getText().toString());
                    if (y == 0) {
                        if (!Negative_Proportion_1_y) {
                            EditText_Proportion_1_y.setText("-");
                            EditText_Proportion_1_y.setSelection(EditText_Proportion_1_y.getText().length());
                            Negative_Proportion_1_y = true;
                        }
                    }
                }
                String z = EditText_Proportion_1_y.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Proportion_1_y = false;
                }

                try {
                    ProportionalDirectly(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Proportion_2_a.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_Proportion_2_a.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Proportion_2_a.getText().toString());
                    if (y == 0) {
                        if (!Negative_Proportion_2_a) {
                            EditText_Proportion_2_a.setText("-");
                            EditText_Proportion_2_a.setSelection(EditText_Proportion_2_a.getText().length());
                            Negative_Proportion_2_a = true;
                        }
                    }
                }
                String z = EditText_Proportion_2_a.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Proportion_2_a = false;
                }

                try {
                    ProportionalIndirectly(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Proportion_2_b.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_Proportion_2_b.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Proportion_2_b.getText().toString());
                    if (y == 0) {
                        if (!Negative_Proportion_2_b) {
                            EditText_Proportion_2_b.setText("-");
                            EditText_Proportion_2_b.setSelection(EditText_Proportion_2_b.getText().length());
                            Negative_Proportion_2_b = true;
                        }
                    }
                }
                String z = EditText_Proportion_2_b.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Proportion_2_b = false;
                }

                try {
                    ProportionalIndirectly(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Proportion_2_x.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_Proportion_2_x.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Proportion_2_x.getText().toString());
                    if (y == 0) {
                        if (!Negative_Proportion_2_x) {
                            EditText_Proportion_2_x.setText("-");
                            EditText_Proportion_2_x.setSelection(EditText_Proportion_2_x.getText().length());
                            Negative_Proportion_2_x = true;
                        }
                    }
                }
                String z = EditText_Percentage_a.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Proportion_2_x = false;
                }

                try {
                    ProportionalIndirectly(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Proportion_2_y.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_Proportion_2_y.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Proportion_2_y.getText().toString());
                    if (y == 0) {
                        if (!Negative_Proportion_2_y) {
                            EditText_Proportion_2_y.setText("-");
                            EditText_Proportion_2_y.setSelection(EditText_Proportion_2_y.getText().length());
                            Negative_Proportion_2_y = true;
                        }
                    }
                }
                String z = EditText_Proportion_2_y.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Proportion_2_y = false;
                }

                try {
                    ProportionalIndirectly(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

    }

    private void ProportionalDirectly(int keyCode) {
        double a = EditText_Proportion_1_a.getText().toString().length();
        double b = EditText_Proportion_1_b.getText().toString().length();
        double x = 0;
        double y = EditText_Proportion_1_y.getText().toString().length();

        if (a != 0 && b != 0 && y != 0) {
            a = Double.parseDouble(EditText_Proportion_1_a.getText().toString());
            b = Double.parseDouble(EditText_Proportion_1_b.getText().toString());
            y = Double.parseDouble(EditText_Proportion_1_y.getText().toString());

            x = (a * y) / b;

            EditText_Proportion_1_x.setText(x + "");
        }

        if (keyCode == 67) {
            if (a == 0 || b == 0 || y == 0) {
                EditText_Proportion_1_x.setText("");
            }
        }
    }

    private void ProportionalIndirectly(int keyCode) {
        double a = EditText_Proportion_2_a.getText().toString().length();
        double b = EditText_Proportion_2_b.getText().toString().length();
        double x = 0;
        double y = EditText_Proportion_2_y.getText().toString().length();

        if (a != 0 && b != 0 && y != 0) {
            a = Double.parseDouble(EditText_Proportion_2_a.getText().toString());
            b = Double.parseDouble(EditText_Proportion_2_b.getText().toString());
            y = Double.parseDouble(EditText_Proportion_2_y.getText().toString());

            x = (a * b) / y;

            EditText_Proportion_2_x.setText(x + "");
        }

        if (keyCode == 67) {
            if (a == 0 || b == 0 || y == 0) {
                EditText_Proportion_2_x.setText("");
            }
        }
    }
    //////////////////////


    private void Build_GCF_LCM() {


    }


    /*/*/ ///// Combinations Permutation /////
    private void Build_Combinations_Permutation() {
        ScrollView_CombinationsPermutation.setVisibility(View.VISIBLE);
        RelativeLayout_CombinationsPermutation.setVisibility(View.VISIBLE);

        TextView_CombinationsPermutation_Regular.setText(Class_Language_Text.FragmentMathFormulas_CombinationsPermutation_Regular);
        TextView_CombinationsPermutation_Repeatable.setText(Class_Language_Text.FragmentMathFormulas_CombinationsPermutation_Repeatable);
        RadioButton_CombinationsPermutation_Regular_No.setText(Class_Language_Text.FragmentMathFormulas_CombinationsPermutation_No);
        RadioButton_CombinationsPermutation_Repeatable_No.setText(Class_Language_Text.FragmentMathFormulas_CombinationsPermutation_No);
        RadioButton_CombinationsPermutation_Regular_Yes.setText(Class_Language_Text.FragmentMathFormulas_CombinationsPermutation_Yes);
        RadioButton_CombinationsPermutation_Repeatable_Yes.setText(Class_Language_Text.FragmentMathFormulas_CombinationsPermutation_Yes);

        EditText_CombinationsPermutation_n.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_CombinationsPermutation_n.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_CombinationsPermutation_n.getText().toString());
                    if (y == 0) {
                        if (!Negative_CombinationsPermutation_n) {
                            EditText_CombinationsPermutation_n.setText("-");
                            EditText_CombinationsPermutation_n.setSelection(EditText_CombinationsPermutation_n.getText().length());
                            Negative_CombinationsPermutation_n = true;
                        }
                    }
                }
                String z = EditText_CombinationsPermutation_n.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_CombinationsPermutation_n = false;
                }

                try {
                    if (Regular == false && Repeatable == false) {
                        Combinations_1(keyCode);
                    } else if (Regular == true && Repeatable == false) {
                        Permutation_1(keyCode);
                    } else if (Regular == false && Repeatable == true) {
                        Combinations_2(keyCode);
                    } else if (Regular == true && Repeatable == true) {
                        Permutation_2(keyCode);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_CombinationsPermutation_r.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                int x = EditText_CombinationsPermutation_r.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_CombinationsPermutation_r.getText().toString());
                    if (y == 0) {
                        if (!Negative_CombinationsPermutation_r) {
                            EditText_CombinationsPermutation_r.setText("-");
                            EditText_CombinationsPermutation_r.setSelection(EditText_CombinationsPermutation_r.getText().length());
                            Negative_CombinationsPermutation_r = true;
                        }
                    }
                }
                String z = EditText_CombinationsPermutation_r.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_CombinationsPermutation_r = false;
                }

                try {
                    if (Regular == false && Repeatable == false) {
                        Combinations_1(keyCode);
                    } else if (Regular == true && Repeatable == false) {
                        Permutation_1(keyCode);
                    } else if (Regular == false && Repeatable == true) {
                        Combinations_2(keyCode);
                    } else if (Regular == true && Repeatable == true) {
                        Permutation_2(keyCode);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        RadioButton_CombinationsPermutation_Regular_Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Regular = true;
                try {
                    if (Regular == false && Repeatable == false) {
                        Combinations_1(0);
                    } else if (Regular == true && Repeatable == false) {
                        Permutation_1(0);
                    } else if (Regular == false && Repeatable == true) {
                        Combinations_2(0);
                    } else if (Regular == true && Repeatable == true) {
                        Permutation_2(0);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }
            }
        });

        RadioButton_CombinationsPermutation_Regular_No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Regular = false;
                try {
                    if (Regular == false && Repeatable == false) {
                        Combinations_1(0);
                    } else if (Regular == true && Repeatable == false) {
                        Permutation_1(0);
                    } else if (Regular == false && Repeatable == true) {
                        Combinations_2(0);
                    } else if (Regular == true && Repeatable == true) {
                        Permutation_2(0);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }
            }
        });

        RadioButton_CombinationsPermutation_Repeatable_Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Repeatable = true;
                try {
                    if (Regular == false && Repeatable == false) {
                        Combinations_1(0);
                    } else if (Regular == true && Repeatable == false) {
                        Permutation_1(0);
                    } else if (Regular == false && Repeatable == true) {
                        Combinations_2(0);
                    } else if (Regular == true && Repeatable == true) {
                        Permutation_2(0);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }
            }
        });

        RadioButton_CombinationsPermutation_Repeatable_No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Repeatable = false;
                try {
                    if (Regular == false && Repeatable == false) {
                        Combinations_1(0);
                    } else if (Regular == true && Repeatable == false) {
                        Permutation_1(0);
                    } else if (Regular == false && Repeatable == true) {
                        Combinations_2(0);
                    } else if (Regular == true && Repeatable == true) {
                        Permutation_2(0);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void Combinations_1(int keyCode) {
        double n = EditText_CombinationsPermutation_n.getText().toString().length();
        double r = EditText_CombinationsPermutation_r.getText().toString().length();
        double x = 0;

        if (n != 0 && r != 0) {
            n = Double.parseDouble(EditText_CombinationsPermutation_n.getText().toString());
            r = Double.parseDouble(EditText_CombinationsPermutation_r.getText().toString());

            x = Factorial(n) / (Factorial(r) * Factorial(n - r));

            TextView_CombinationsPermutation.setText(x + "");
        }

        if (keyCode == 67) {
            if (n == 0 || r == 0) {
                TextView_CombinationsPermutation.setText("");
            }
        }
    }

    private void Permutation_1(int keyCode) {
        double n = EditText_CombinationsPermutation_n.getText().toString().length();
        double r = EditText_CombinationsPermutation_r.getText().toString().length();
        double x = 0;

        if (n != 0 && r != 0) {
            n = Double.parseDouble(EditText_CombinationsPermutation_n.getText().toString());
            r = Double.parseDouble(EditText_CombinationsPermutation_r.getText().toString());

            x = Factorial(n) / Factorial(n - r);

            TextView_CombinationsPermutation.setText(x + "");
        }

        if (keyCode == 67) {
            if (n == 0 || r == 0) {
                TextView_CombinationsPermutation.setText("");
            }
        }
    }

    private void Combinations_2(int keyCode) {
        double n = EditText_CombinationsPermutation_n.getText().toString().length();
        double r = EditText_CombinationsPermutation_r.getText().toString().length();
        double x = 0;

        if (n != 0 && r != 0) {
            n = Double.parseDouble(EditText_CombinationsPermutation_n.getText().toString());
            r = Double.parseDouble(EditText_CombinationsPermutation_r.getText().toString());

            x = Factorial(n + r - 1) / (Factorial(r) * Factorial(n - 1));

            TextView_CombinationsPermutation.setText(x + "");
        }

        if (keyCode == 67) {
            if (n == 0 || r == 0) {
                TextView_CombinationsPermutation.setText("");
            }
        }
    }

    private void Permutation_2(int keyCode) {
        double n = EditText_CombinationsPermutation_n.getText().toString().length();
        double r = EditText_CombinationsPermutation_r.getText().toString().length();
        double x = 0;

        if (n != 0 && r != 0) {
            n = Double.parseDouble(EditText_CombinationsPermutation_n.getText().toString());
            r = Double.parseDouble(EditText_CombinationsPermutation_r.getText().toString());

            x = Math.pow(n, r);

            TextView_CombinationsPermutation.setText(x + "");
        }

        if (keyCode == 67) {
            if (n == 0 || r == 0) {
                TextView_CombinationsPermutation.setText("");
            }
        }
    }
    ////////////////////////////////////


    /*/*/ ///// Fraction Decimal /////
    private void Build_Fraction_Decimal() {
        ScrollView_FractionDecimal.setVisibility(View.VISIBLE);
        RelativeLayout_FractionDecimal.setVisibility(View.VISIBLE);

        EditText_FractionDecimal_a.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_FractionDecimal_a.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_FractionDecimal_a.getText().toString());
                    if (y == 0) {
                        if (!Negative_FractionDecimal_a) {
                            EditText_FractionDecimal_a.setText("-");
                            EditText_FractionDecimal_a.setSelection(EditText_FractionDecimal_a.getText().length());
                            Negative_FractionDecimal_a = true;
                        }
                    }
                }
                String z = EditText_FractionDecimal_a.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_FractionDecimal_a = false;
                }

                try {
                    Fraction_to_Decimal(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_FractionDecimal_b.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_FractionDecimal_b.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_FractionDecimal_b.getText().toString());
                    if (y == 0) {
                        if (!Negative_FractionDecimal_b) {
                            EditText_FractionDecimal_b.setText("-");
                            EditText_FractionDecimal_b.setSelection(EditText_FractionDecimal_b.getText().length());
                            Negative_FractionDecimal_b = true;
                        }
                    }
                }
                String z = EditText_FractionDecimal_b.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_FractionDecimal_b = false;
                }

                try {
                    Fraction_to_Decimal(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_FractionDecimal_x.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_FractionDecimal_x.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_FractionDecimal_x.getText().toString());
                    if (y == 0) {
                        if (!Negative_FractionDecimal_x) {
                            EditText_FractionDecimal_x.setText("-");
                            EditText_FractionDecimal_x.setSelection(EditText_FractionDecimal_x.getText().length());
                            Negative_FractionDecimal_x = true;
                        }
                    }
                }
                String z = EditText_FractionDecimal_x.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_FractionDecimal_x = false;
                }

                try {
                    Decimal_to_Fraction(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
    }

    private void Fraction_to_Decimal(int keyCode) {
        double a = EditText_FractionDecimal_a.getText().toString().length();
        double b = EditText_FractionDecimal_b.getText().toString().length();
        double x = 0;

        if (a != 0 && b != 0) {
            a = Double.parseDouble(EditText_FractionDecimal_a.getText().toString());
            b = Double.parseDouble(EditText_FractionDecimal_b.getText().toString());

            x = a / b;

            EditText_FractionDecimal_x.setText(x + "");
        }

        if (keyCode == 67) {
            if (a == 0 && b == 0) {
                EditText_FractionDecimal_x.setText("");
            }
        }
    }

    private void Decimal_to_Fraction(int keyCode) {
        double a = 0;
        double b = 0;
        double x = EditText_FractionDecimal_x.getText().toString().length();
        String X = "";
        int i = 0;

        if (x != 0) {
            X = EditText_FractionDecimal_x.getText().toString();
            i = X.indexOf(".");
            X = X.substring(i + 1, X.length());
            i = X.length();

            Toast.makeText(getActivity(), i + "", Toast.LENGTH_SHORT).show();

            x = Double.parseDouble(EditText_FractionDecimal_x.getText().toString());
            b = Math.pow(10, i);
            a = x * b;

            EditText_FractionDecimal_a.setText(a + "");
            EditText_FractionDecimal_b.setText(b + "");
        }

        if (keyCode == 67) {
            if (x == 0) {
                EditText_FractionDecimal_a.setText("");
                EditText_FractionDecimal_b.setText("");
            }
        }
    }
    ////////////////////////////


    /*/*/ ///// Efficiency /////
    private void Build_Efficiency() {
        ScrollView_Efficiency.setVisibility(View.VISIBLE);
        RelativeLayout_Efficiency.setVisibility(View.VISIBLE);

        EditText_Efficiency.setFocusable(false);
        EditText_Efficiency.setClickable(false);
        EditText_Efficiency.setSelected(false);

        EditText_Efficiency_Input.setFocusable(true);
        EditText_Efficiency_Input.setClickable(true);
        EditText_Efficiency_Input.setSelected(true);

        EditText_Efficiency_Output.setFocusable(true);
        EditText_Efficiency_Output.setClickable(true);
        EditText_Efficiency_Output.setSelected(true);

        EditText_Efficiency_Input.setHint(Class_Language_Text.FragmentMathFormulas_EfficiencyInput);
        EditText_Efficiency_Output.setHint(Class_Language_Text.FragmentMathFormulas_EfficiencyOutput);

        EditText_Efficiency_Input.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Efficiency_Input.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Efficiency_Input.getText().toString());
                    if (y == 0) {
                        if (!Negative_Efficiency_Input) {
                            EditText_Efficiency_Input.setText("-");
                            EditText_Efficiency_Input.setSelection(EditText_Efficiency_Input.getText().length());
                            Negative_Efficiency_Input = true;
                        }
                    }
                }
                String z = EditText_Efficiency_Input.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Efficiency_Input = false;
                }

                try {
                    Efficiency(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Efficiency_Output.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Efficiency_Output.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Efficiency_Output.getText().toString());
                    if (y == 0) {
                        if (!Negative_Efficiency_Output) {
                            EditText_Efficiency_Output.setText("-");
                            EditText_Efficiency_Output.setSelection(EditText_Efficiency_Output.getText().length());
                            Negative_Efficiency_Output = true;
                        }
                    }
                }
                String z = EditText_Efficiency_Output.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Efficiency_Output = false;
                }

                try {
                    Efficiency(keyCode);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

    }

    private void Efficiency(int keyCode) {
        double Output = EditText_Efficiency_Output.getText().toString().length();
        double Input = EditText_Efficiency_Input.getText().toString().length();
        double x = 0;

        if (Output != 0 && Input != 0) {
            Output = Double.parseDouble(EditText_Efficiency_Output.getText().toString());
            Input = Double.parseDouble(EditText_Efficiency_Input.getText().toString());

            x = (Output / Input) * 100;

            EditText_Efficiency.setText(x + "");
        }

        if (keyCode == 67) {
            if (Output == 0 && Input == 0) {
                EditText_Efficiency.setText("");
            }
        }
    }
    //////////////////////


    private int Filter(double num) {
        if (num == (int) num) {
            return (int) Math.round(num);
        } else {
            return (int) num;
        }
    }

    private double Factorial(double num) {
        double fact = 1;
        for (int count = 1; count <= num; count++) {
            fact *= count;
        }
        return fact;
    }

}