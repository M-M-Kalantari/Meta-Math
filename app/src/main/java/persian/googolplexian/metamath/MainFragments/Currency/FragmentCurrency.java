package persian.googolplexian.metamath.MainFragments.Currency;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryAdListener;
import com.adivery.sdk.AdiveryBannerAdView;
import com.google.android.material.textfield.TextInputLayout;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.MainFragments.Currency.ItemsList.Class_Cur_Item;
import persian.googolplexian.metamath.MainFragments.Currency.ItemsList.Class_Cur_ItemsAdapter;
import persian.googolplexian.metamath.MainFragments.MathFormulas.AverageList.Class_Maf_Average;
import persian.googolplexian.metamath.MainFragments.MathFormulas.AverageList.Class_Maf_AverageData;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;
import persian.googolplexian.metamath.R;

import static persian.googolplexian.metamath.MainActivity.Fragment_BackPressed;

public class FragmentCurrency extends Fragment {

    RelativeLayout RelativeLayout_Currency;

    public static ListView ListView_CurrencyItems;
    ArrayList<Class_Cur_Item> arrayListItems;
    Class_Cur_ItemsAdapter itemsAdapter;

    public static RelativeLayout RelativeLayout_CurrencyFields;
    LinearLayout LinearLayout_SelectedField;
    ImageView ImageView_SelectedField;
    TextView TextView_SelectedField;
    ImageView ImageView_Back, ImageView_Clean, ImageView_Share;

    ScrollView ScrollView_Financial;
    RelativeLayout RelativeLayout_Financial;
    LinearLayout LinearLayout_Financial_Input;
    Switch Switch_CompoundInterest;
    EditText EditText_Amount, EditText_InterestRates, EditText_InvestmentDuration;
    boolean Negative_Amount = false;
    boolean Negative_InterestRates = false;
    boolean Negative_InvestmentDuration = false;
    LinearLayout LinearLayout_Financial_Output;
    EditText EditText_TotalAmount, EditText_Interest;
    TextInputLayout TextInputLayout_TotalAmount, TextInputLayout_Interest;

    public static int CUR_SelectedItemID = 0;
    public static int CUR_SelectedFieldID = 0;
    public static String CUR_InputText = "";
    public static double CUR_InputNumber = 0;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public FragmentCurrency() {
        // Required empty public constructor
    }

    public static FragmentCurrency newInstance(String param1, String param2) {
        FragmentCurrency fragment = new FragmentCurrency();
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
        View view = inflater.inflate(R.layout.fragment_currency, container, false);

        Find_Views(view);
        Load_Language();
        InApp_ads(view);
        Build_ItemList();
        Build_Events();

        return view;
    }

    private void Find_Views(View view) {
        RelativeLayout_Currency = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Currency);

        ListView_CurrencyItems = (ListView) view.findViewById(R.id.ListView_CurrencyItems);

        RelativeLayout_CurrencyFields = (RelativeLayout) view.findViewById(R.id.RelativeLayout_CurrencyFields);

        LinearLayout_SelectedField = (LinearLayout) view.findViewById(R.id.LinearLayout_SelectedField);
        ImageView_SelectedField = (ImageView) view.findViewById(R.id.ImageView_SelectedField);
        TextView_SelectedField = (TextView) view.findViewById(R.id.TextView_SelectedField);
        TextView_SelectedField.setSelected(true);

        ImageView_Clean = (ImageView) view.findViewById(R.id.ImageView_Clean);
        ImageView_Back = (ImageView) view.findViewById(R.id.ImageView_Back);
        ImageView_Share = (ImageView) view.findViewById(R.id.ImageView_Share);

        ScrollView_Financial = (ScrollView) view.findViewById(R.id.ScrollView_Financial);
        RelativeLayout_Financial = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Financial);
        LinearLayout_Financial_Input = (LinearLayout) view.findViewById(R.id.LinearLayout_Financial_Input);
        Switch_CompoundInterest = (Switch) view.findViewById(R.id.Switch_CompoundInterest);
        EditText_Amount = (EditText) view.findViewById(R.id.EditText_Amount);
        EditText_InterestRates = (EditText) view.findViewById(R.id.EditText_InterestRates);
        EditText_InvestmentDuration = (EditText) view.findViewById(R.id.EditText_InvestmentDuration);
        LinearLayout_Financial_Output = (LinearLayout) view.findViewById(R.id.LinearLayout_Financial_Output);
        EditText_TotalAmount = (EditText) view.findViewById(R.id.EditText_TotalAmount);
        EditText_Interest = (EditText) view.findViewById(R.id.EditText_Interest);
        TextInputLayout_TotalAmount = (TextInputLayout) view.findViewById(R.id.TextInputLayout_TotalAmount);
        TextInputLayout_Interest = (TextInputLayout) view.findViewById(R.id.TextInputLayout_Interest);

    }

    private void Load_Language() {

        Switch_CompoundInterest.setText(Class_Language_Text.FragmentCurrency_Item_Compound_Interest);
        EditText_Amount.setHint(Class_Language_Text.FragmentCurrency_Amount);
        EditText_InterestRates.setHint(Class_Language_Text.FragmentCurrency_InterestRates + " (%)");
        EditText_InvestmentDuration.setHint(Class_Language_Text.FragmentCurrency_InvestmentDuration);
        TextInputLayout_TotalAmount.setHint(Class_Language_Text.FragmentCurrency_TotalAmount);
        TextInputLayout_Interest.setHint(Class_Language_Text.FragmentCurrency_Interest);

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

    private void Build_ItemList() {
        arrayListItems = new ArrayList<>();
        itemsAdapter = new Class_Cur_ItemsAdapter(getActivity(), arrayListItems);

//        arrayListItems.add(new Class_Cur_Item(0, Class_Language_Text.FragmentCurrency_Item_Loan, "ic_cur_bank"));
        arrayListItems.add(new Class_Cur_Item(1, Class_Language_Text.FragmentCurrency_Item_Simple_Interest, "ic_cur_coin"));
        arrayListItems.add(new Class_Cur_Item(2, Class_Language_Text.FragmentCurrency_Item_Compound_Interest, "ic_cur_coins"));

        ListView_CurrencyItems.setAdapter(itemsAdapter);

        ListView_CurrencyItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.MainAds_Index++;
                MainActivity.MainAds();

                ImageView_Back.callOnClick();
                ListView_CurrencyItems.setVisibility(View.GONE);
                RelativeLayout_CurrencyFields.setVisibility(View.VISIBLE);
                TextView_SelectedField.setText(arrayListItems.get(position).getCUR_Item_Title());
                String URL = "@drawable/" + arrayListItems.get(position).getCUR_Item_Vector();
                int ImageSource = getContext().getResources().getIdentifier(URL, null, getContext().getPackageName());
                ImageView_SelectedField.setImageDrawable(ResourcesCompat.getDrawable(getContext().getResources(), ImageSource, null));
                CUR_SelectedItemID = arrayListItems.get(position).getCUR_Item_ID();
                switch (CUR_SelectedItemID) {
                    case 0:

                        break;
                    case 1:
                        Build_Investment();
                        Switch_CompoundInterest.setChecked(false);
                        break;
                    case 2:
                        Build_Investment();
                        Switch_CompoundInterest.setChecked(true);
                        break;
                }
                MainActivity.External_Snackbars(5);
                Fragment_BackPressed = true;
            }
        });
    }

    private void Build_Events() {

        ImageView_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListView_CurrencyItems.setVisibility(View.VISIBLE);
                RelativeLayout_CurrencyFields.setVisibility(View.GONE);
                ScrollView_Financial.setVisibility(View.GONE);
                RelativeLayout_Financial.setVisibility(View.GONE);
            }
        });

        ImageView_Clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_Amount.setText("");
                EditText_InterestRates.setText("");
                EditText_InvestmentDuration.setText("");
                EditText_TotalAmount.setText("");
                EditText_Interest.setText("");
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

                        switch (CUR_SelectedItemID) {
                            case 0:

                                break;
                            case 1:
                                ShareText += Class_Language_Text.FragmentCurrency_Item_Simple_Interest + ":" + "\n";
                                ShareText += Class_Language_Text.FragmentCurrency_Amount + ": " + EditText_Amount.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentCurrency_InterestRates + ": " + EditText_InterestRates.getText().toString() + "%" + "\n";
                                ShareText += Class_Language_Text.FragmentCurrency_InvestmentDuration + ": " + EditText_InvestmentDuration.getText().toString() + "\n" + "\n";

                                ShareText += Class_Language_Text.FragmentCurrency_TotalAmount + ": " + EditText_TotalAmount.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentCurrency_Interest + ": " + EditText_Interest.getText().toString() + "\n";
                                break;
                            case 2:
                                ShareText += Class_Language_Text.FragmentCurrency_Item_Compound_Interest + ":" + "\n";
                                ShareText += Class_Language_Text.FragmentCurrency_Amount + ": " + EditText_Amount.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentCurrency_InterestRates + ": " + EditText_InterestRates.getText().toString() + "%" + "\n";
                                ShareText += Class_Language_Text.FragmentCurrency_InvestmentDuration + ": " + EditText_InvestmentDuration.getText().toString() + "\n" + "\n";

                                ShareText += Class_Language_Text.FragmentCurrency_TotalAmount + ": " + EditText_TotalAmount.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentCurrency_Interest + ": " + EditText_Interest.getText().toString() + "\n";
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

    }


    private void Build_Investment() {
        ScrollView_Financial.setVisibility(View.VISIBLE);
        RelativeLayout_Financial.setVisibility(View.VISIBLE);

        EditText_TotalAmount.setFocusable(false);
        EditText_TotalAmount.setClickable(false);
        EditText_TotalAmount.setSelected(false);
        EditText_Interest.setFocusable(false);
        EditText_Interest.setClickable(false);
        EditText_Interest.setSelected(false);

        EditText_Amount.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_Amount.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_Amount.getText().toString());
                    if (y == 0) {
                        if (!Negative_Amount) {
                            EditText_Amount.setText("-");
                            EditText_Amount.setSelection(EditText_Amount.getText().length());
                            Negative_Amount = true;
                        }
                    }
                }
                String z = EditText_Amount.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Amount = false;
                }

                try {
                    if (Switch_CompoundInterest.isChecked()) {
                        Compound_Interest(keyCode);
                    } else {
                        Simple_Interest(keyCode);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_InterestRates.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_InterestRates.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_InterestRates.getText().toString());
                    if (y == 0) {
                        if (!Negative_InterestRates) {
                            EditText_InterestRates.setText("-");
                            EditText_InterestRates.setSelection(EditText_InterestRates.getText().length());
                            Negative_InterestRates = true;
                        }
                    }
                }
                String z = EditText_InterestRates.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_InterestRates = false;
                }

                try {
                    if (Switch_CompoundInterest.isChecked()) {
                        Compound_Interest(keyCode);
                    } else {
                        Simple_Interest(keyCode);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_InvestmentDuration.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                int x = EditText_InvestmentDuration.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(EditText_InvestmentDuration.getText().toString());
                    if (y == 0) {
                        if (!Negative_InvestmentDuration) {
                            EditText_InvestmentDuration.setText("-");
                            EditText_InvestmentDuration.setSelection(EditText_InvestmentDuration.getText().length());
                            Negative_InvestmentDuration = true;
                        }
                    }
                }
                String z = EditText_InvestmentDuration.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_InvestmentDuration = false;
                }

                try {
                    if (Switch_CompoundInterest.isChecked()) {
                        Compound_Interest(keyCode);
                    } else {
                        Simple_Interest(keyCode);
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        Switch_CompoundInterest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Compound_Interest(0);
                    TextView_SelectedField.setText(arrayListItems.get(1).getCUR_Item_Title());
                    String URL = "@drawable/" + arrayListItems.get(1).getCUR_Item_Vector();
                    int ImageSource = getContext().getResources().getIdentifier(URL, null, getContext().getPackageName());

                } else {
                    Simple_Interest(0);
                    TextView_SelectedField.setText(arrayListItems.get(0).getCUR_Item_Title());
                    String URL = "@drawable/" + arrayListItems.get(0).getCUR_Item_Vector();
                    int ImageSource = getContext().getResources().getIdentifier(URL, null, getContext().getPackageName());

                }
            }
        });
    }

    private void Compound_Interest(int keyCode) {
        double Amount = EditText_Amount.getText().length();
        double InterestRates = EditText_InterestRates.getText().length();
        double InvestmentDuration = EditText_InvestmentDuration.getText().length();
        double Interest = 0;
        double TotalInterest = 0;

        if (Amount != 0 && InterestRates != 0 && InvestmentDuration != 0) {
            Amount = Double.parseDouble(EditText_Amount.getText().toString());
            InterestRates = Double.parseDouble(EditText_InterestRates.getText().toString());
            InvestmentDuration = Double.parseDouble(EditText_InvestmentDuration.getText().toString());

            for (int i = 1; i <= InvestmentDuration; i++) {
                Interest = Amount * (InterestRates / 100);
                Amount += Interest;
                TotalInterest += Interest;
            }

            BigDecimal BigDecimal_Amount = new BigDecimal(Amount);
            BigDecimal BigDecimal_Interest = new BigDecimal(TotalInterest);
            double x = Math.round(BigDecimal_Amount.doubleValue() * 100000);
            double y = Math.round(BigDecimal_Interest.doubleValue() * 100000);
            EditText_TotalAmount.setText((x / 100000) + "");
            EditText_Interest.setText((y / 100000) + "");
        }

        if (keyCode == 67) {
            if (Amount == 0 && InterestRates == 0 && InvestmentDuration == 0) {
                EditText_TotalAmount.setText( "");
                EditText_Interest.setText("");
            }
        }

    }

    private void Simple_Interest(int keyCode) {
        double Amount = EditText_Amount.getText().length();
        double InterestRates = EditText_InterestRates.getText().length();
        double InvestmentDuration = EditText_InvestmentDuration.getText().length();
        double Interest = 0;
        double TotalInterest = 0;

        if (Amount != 0 && InterestRates != 0 && InvestmentDuration != 0) {
            Amount = Double.parseDouble(EditText_Amount.getText().toString());
            InterestRates = Double.parseDouble(EditText_InterestRates.getText().toString());
            InvestmentDuration = Double.parseDouble(EditText_InvestmentDuration.getText().toString());

            Interest = Amount * (InterestRates / 100);
            TotalInterest = Interest * InvestmentDuration;
            Amount += TotalInterest;

            BigDecimal BigDecimal_Amount = new BigDecimal(Amount);
            BigDecimal BigDecimal_Interest = new BigDecimal(TotalInterest);
            double x = Math.round(BigDecimal_Amount.doubleValue() * 100000);
            double y = Math.round(BigDecimal_Interest.doubleValue() * 100000);
            EditText_TotalAmount.setText((x / 100000) + "");
            EditText_Interest.setText((y / 100000) + "");
        }

        if (keyCode == 67) {
            if (Amount == 0 && InterestRates == 0 && InvestmentDuration == 0) {
                EditText_TotalAmount.setText( "");
                EditText_Interest.setText("");
            }
        }

    }

}