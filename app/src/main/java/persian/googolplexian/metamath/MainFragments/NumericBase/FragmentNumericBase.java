package persian.googolplexian.metamath.MainFragments.NumericBase;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryAdListener;
import com.adivery.sdk.AdiveryBannerAdView;

import androidx.fragment.app.Fragment;
import persian.googolplexian.metamath.BroadcastReceiver.Class_BroadcastReceiver;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;
import persian.googolplexian.metamath.R;

public class FragmentNumericBase extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    EditText EditText_Binary, EditText_Octal, EditText_Decimal, EditText_Hex;
    TextView TextView_PrimeNumbers,TextView_Decomposition;
    ImageView ImageView_PrimeNumbers;
    TextView TextView_Roman_Number;

    double InputNumber = 0;
    boolean BackSpace = false;

    private String mParam1;
    private String mParam2;

    public FragmentNumericBase() {

    }

    public static FragmentNumericBase newInstance(String param1, String param2) {
        FragmentNumericBase fragment = new FragmentNumericBase();
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
        View view = inflater.inflate(R.layout.fragment_numeric_base, container, false);

        Find_Views(view);
        Load_Language();
        InApp_ads(view);
        Build_Events();

        return view;
    }

    private void Find_Views(View view) {

        EditText_Binary = (EditText) view.findViewById(R.id.EditText_Binary);
        EditText_Octal = (EditText) view.findViewById(R.id.EditText_Octal);
        EditText_Decimal = (EditText) view.findViewById(R.id.EditText_Decimal);
        EditText_Hex = (EditText) view.findViewById(R.id.EditText_Hex);
        TextView_PrimeNumbers = (TextView) view.findViewById(R.id.TextView_PrimeNumbers);
        TextView_PrimeNumbers.setSelected(true);
        TextView_Decomposition = (TextView) view.findViewById(R.id.TextView_Decomposition);
        ImageView_PrimeNumbers = (ImageView) view.findViewById(R.id.ImageView_PrimeNumbers);
        TextView_Roman_Number = (TextView) view.findViewById(R.id.TextView_Roman_Number);

    }

    private void Load_Language() {
        TextView_PrimeNumbers.setText(Class_Language_Text.FragmentNumericBase_PrimeNumbers);
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

        EditText_Binary.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                boolean RET = false;
                if (keyCode == 7 || keyCode == 8 || keyCode == 67) {
                    if (!EditText_Binary.getText().toString().isEmpty()) {
                        InputNumber = Double.parseDouble(EditText_Binary.getText().toString());
                        EditText_Octal.setText("");
                        EditText_Decimal.setText("");
                        EditText_Hex.setText("");

                        Binary_to_Decimal(InputNumber + "");
                        Binary_to_Hex(Integer.parseInt(EditText_Decimal.getText().toString()));
                        PrimeNumbers(Integer.parseInt(EditText_Decimal.getText().toString()));

                    } else {
                        EditText_Octal.setText("");
                        EditText_Decimal.setText("");
                        EditText_Hex.setText("");
                        ImageView_PrimeNumbers.setImageResource(R.drawable.ic_nub_non);
                    }
                    RET = false;
                } else {
                    RET = true;
                }
                return RET;
            }
        });

        EditText_Decimal.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                boolean RET = false;
                if (!EditText_Decimal.getText().toString().isEmpty()) {
                    InputNumber = Double.parseDouble(EditText_Decimal.getText().toString());
                    EditText_Binary.setText("");
                    EditText_Octal.setText("");
                    EditText_Hex.setText("");

                    Decimal_to_Binary(InputNumber);
                    Decimal_to_Hex((int) InputNumber);
                    PrimeNumbers(InputNumber);

                } else {
                    EditText_Binary.setText("");
                    EditText_Octal.setText("");
                    EditText_Hex.setText("");
                    ImageView_PrimeNumbers.setImageResource(R.drawable.ic_nub_non);
                }
                return RET;
            }
        });

        EditText_Hex.setClickable(false);
        EditText_Hex.setFocusable(false);
        EditText_Hex.setSelected(false);
        EditText_Hex.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == 67) {
                    BackSpace = true;
                }
                return false;
            }
        });
        EditText_Hex.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (!BackSpace) {
//                    String Text;
//                    String En = String.valueOf(s.charAt(count - 1));
//                    En = En.toUpperCase();
//                    if (En.equals("A") || En.equals("B") || En.equals("C") || En.equals("D") || En.equals("E") || En.equals("F")) {
//
//                    }
//                } else {
//                    BackSpace = false;
//                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        EditText_Octal.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                return false;
            }
        });
    }


    private void Binary_to_Decimal(String Input) {
        double Output = 0;
        for (int i = Input.length() - 1, j = 0; i >= 0; i--, j++) {
            if (Input.charAt(i) == '1') {
                Output += Math.pow(2, j);
            }
        }
        EditText_Decimal.append(DeletePoint(Output / 4));

    }

    private void Binary_to_Hex(int Input) {
        String digits = "0123456789ABCDEF";
        if (Input == 0) {
            EditText_Hex.setText("0");
        }
        String hex = "";
        while (Input > 0) {
            int digit = Input % 16;
            hex = digits.charAt(digit) + hex;
            Input = Input / 16;
        }
        EditText_Hex.setText(hex);
    }

    private void Hex_to_Decimal(String Input) {
        String digits = "0123456789ABCDEF";
        Input = Input.toUpperCase();
        int val = 0;
        for (int i = Input.length() - 1, j = 0; i >= 0; i--, j++) {
            char c = Input.charAt(i);

            int d = digits.indexOf(c);
            val += Math.pow(16, j) * d;

        }

        EditText_Decimal.setText(val);
    }


    private void Decimal_to_Binary(double Input) {
        if (Input > 1) {
            Decimal_to_Binary((int) (Input / 2));
        }
        EditText_Binary.append(DeletePoint(Input % 2));
    }

    private void Decimal_to_Hex(int Input) {
        String digits = "0123456789ABCDEF";
        if (Input == 0) {
            EditText_Hex.setText("0");
        }
        String hex = "";
        while (Input > 0) {
            int digit = Input % 16;
            hex = digits.charAt(digit) + hex;
            Input = Input / 16;
        }
        EditText_Hex.setText(hex);
    }


    private void PrimeNumbers(double n) {
        boolean isPrime = true;
        if (n < 2) isPrime = false;

        for (long factor = 2; factor*factor <= n; factor++) {
            if (n % factor == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            ImageView_PrimeNumbers.setImageResource(R.drawable.ic_nub_true);
        } else{
            ImageView_PrimeNumbers.setImageResource(R.drawable.ic_nub_false);
        }
    }


    public static String DeletePoint(double num) {
        if (num == (int) num) {
            return Math.round(num) + "";
        } else {
            return num + "";
        }
    }

}