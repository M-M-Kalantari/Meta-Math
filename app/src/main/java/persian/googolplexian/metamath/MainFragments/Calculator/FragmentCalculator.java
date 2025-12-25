package persian.googolplexian.metamath.MainFragments.Calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.adivery.sdk.Adivery;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.text.SimpleDateFormat;
import java.util.Date;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import persian.googolplexian.metamath.MainFragments.Calculator.History.Class_AdapterHistory;
import persian.googolplexian.metamath.MainFragments.Calculator.History.Class_History;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.MainFragments.Calculator.Notepad.Class_AdapterNotepad;
import persian.googolplexian.metamath.MainFragments.Calculator.Notepad.Class_Notepad;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;
import persian.googolplexian.metamath.R;

import static persian.googolplexian.metamath.MainActivity.ClipboardString;
import static persian.googolplexian.metamath.MainFragments.Calculator.Calculator_FinalVersion_1.*;

public class FragmentCalculator extends Fragment implements View.OnClickListener {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    CoordinatorLayout CoordinatorLayout_Calculator;
    LinearLayout LinearLayout_Main;

    LinearLayout LinearLayout_Screen;
    public static TextView TextView_EnterResult, TextView_AutoResult;
    public static ImageView ImageView_Spe_History, ImageView_Spe_Notepad;
    ImageView ImageView_Spe_Backspace, ImageView_Spe_CleanUp, ImageView_Spe_Copy, ImageView_Spe_Clipboard;

    LinearLayout LinearLayout_Keyboard;
    LinearLayout LinearLayout_KB_001, LinearLayout_KB_002, LinearLayout_KB_003, LinearLayout_KB_004, LinearLayout_KB_005;
    ImageView ImageView_Num_PlusMinus, ImageView_Num_Zero, ImageView_Num_Point, ImageView_Num_One, ImageView_Num_Two, ImageView_Num_Three, ImageView_Num_Four, ImageView_Num_Five, ImageView_Num_Six, ImageView_Num_Seven, ImageView_Num_Eight, ImageView_Num_Nine;
    ImageView ImageView_4BMO_DivisionSign, ImageView_4BMO_TimesSign, ImageView_Equal, ImageView_4BMO_PlusSign, ImageView_4BMO_MinusSign;
    ImageView ImageView_Opr_ParenthesesLeft, ImageView_Opr_ParenthesesRight, ImageView_Opr_E_to_power, ImageView_Opr_E, ImageView_Opr_Pi, ImageView_Opr_Percent, ImageView_Opr_1_divided_by_x, ImageView_Opr_ln, ImageView_Opr_Log, ImageView_Opr_Root_2, ImageView_Opr_Root_3, ImageView_Opr_Absolute_value, ImageView_Opr_Factorial, ImageView_Opr_Power_2, ImageView_Opr_Power_3, ImageView_Opr_10_to_Power, ImageView_Opr_2_to_Power, ImageView_Opr_Power_y, ImageView_Opr_Root_y;
    ImageView ImageView_Tri_hyp, ImageView_Tri_arc, ImageView_Tri_sin, ImageView_Tri_csc, ImageView_Tri_tan, ImageView_Tri_cos, ImageView_Tri_sec, ImageView_Tri_cot, ImageView_Tri_Deg, ImageView_Tri_Rad;
    public static ImageView ImageView_Opr_OtherOperations;


    String TemporaryMemory  = "";
    String FirstNumber = "";
    String SecondNumber = "";
    String ResultNumber = "";
    String DS_FirstNumber = "";
    String DS_SecondNumber = "";
    String DS_ResultNumber = "";
    String AC_FirstNumber = "";
    String AC_SecondNumber = "";
    String AC_ResultNumber = "";
    double FirstNum = 0;
    double SecondNum = 0;
    String Sign = "";
    boolean PlusMinus = false;
    boolean Point = false;
    boolean Screen_On = false;
    boolean hyp = false;
    boolean arc = false;
    String Angle = "DEG";
    int PageNumber = 0;

    private String mParam1;
    private String mParam2;

    public FragmentCalculator() {
        // Required empty public constructor
    }

    public static FragmentCalculator newInstance(String param1, String param2) {
        FragmentCalculator fragment = new FragmentCalculator();
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
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        Find_Views(view);
        InApp_ads(view);
        Special_Keys();
        Number_Keyboard();
        MainOperations_Keyboard();
        Operations_Keyboard();
        Trigonometry_Keyboard();

        return view;
    }

    private void Find_Views(View view) {

        CoordinatorLayout_Calculator = (CoordinatorLayout) view.findViewById(R.id.CoordinatorLayout_Calculator);
        LinearLayout_Main = (LinearLayout) view.findViewById(R.id.LinearLayout_Main);

        LinearLayout_Screen = (LinearLayout) view.findViewById(R.id.LinearLayout_Screen);
        TextView_EnterResult = (TextView) view.findViewById(R.id.TextView_EnterResult);
        TextView_AutoResult = (TextView) view.findViewById(R.id.TextView_AutoResult);

        ImageView_Spe_Backspace = (ImageView) view.findViewById(R.id.ImageView_Spe_Backspace);
        ImageView_Spe_CleanUp = (ImageView) view.findViewById(R.id.ImageView_Spe_CleanUp);
        ImageView_Spe_Copy = (ImageView) view.findViewById(R.id.ImageView_Spe_Copy);
        ImageView_Spe_Clipboard = (ImageView) view.findViewById(R.id.ImageView_Spe_Clipboard);
        ImageView_Spe_History = (ImageView) view.findViewById(R.id.ImageView_Spe_History);
        ImageView_Spe_Notepad = (ImageView) view.findViewById(R.id.ImageView_Spe_Notepad);

        LinearLayout_Keyboard = (LinearLayout) view.findViewById(R.id.LinearLayout_Keyboard);

        LinearLayout_KB_001 = (LinearLayout) view.findViewById(R.id.LinearLayout_KB_001);
        LinearLayout_KB_002 = (LinearLayout) view.findViewById(R.id.LinearLayout_KB_002);
        LinearLayout_KB_003 = (LinearLayout) view.findViewById(R.id.LinearLayout_KB_003);
        LinearLayout_KB_004 = (LinearLayout) view.findViewById(R.id.LinearLayout_KB_004);
        LinearLayout_KB_005 = (LinearLayout) view.findViewById(R.id.LinearLayout_KB_005);

        ImageView_4BMO_DivisionSign = (ImageView) view.findViewById(R.id.ImageView_4BMO_DivisionSign);
        ImageView_4BMO_TimesSign = (ImageView) view.findViewById(R.id.ImageView_4BMO_TimesSign);
        ImageView_Equal = (ImageView) view.findViewById(R.id.ImageView_Equal);
        ImageView_4BMO_PlusSign = (ImageView) view.findViewById(R.id.ImageView_4BMO_PlusSign);
        ImageView_4BMO_MinusSign = (ImageView) view.findViewById(R.id.ImageView_4BMO_MinusSign);

        ImageView_Num_PlusMinus = (ImageView) view.findViewById(R.id.ImageView_Num_PlusMinus);
        ImageView_Num_Zero = (ImageView) view.findViewById(R.id.ImageView_Num_Zero);
        ImageView_Num_Point = (ImageView) view.findViewById(R.id.ImageView_Num_Point);
        ImageView_Num_One = (ImageView) view.findViewById(R.id.ImageView_Num_One);
        ImageView_Num_Two = (ImageView) view.findViewById(R.id.ImageView_Num_Two);
        ImageView_Num_Three = (ImageView) view.findViewById(R.id.ImageView_Num_Three);
        ImageView_Num_Four = (ImageView) view.findViewById(R.id.ImageView_Num_Four);
        ImageView_Num_Five = (ImageView) view.findViewById(R.id.ImageView_Num_Five);
        ImageView_Num_Six = (ImageView) view.findViewById(R.id.ImageView_Num_Six);
        ImageView_Num_Seven = (ImageView) view.findViewById(R.id.ImageView_Num_Seven);
        ImageView_Num_Eight = (ImageView) view.findViewById(R.id.ImageView_Num_Eight);
        ImageView_Num_Nine = (ImageView) view.findViewById(R.id.ImageView_Num_Nine);

        ImageView_Opr_ParenthesesRight = (ImageView) view.findViewById(R.id.ImageView_Opr_ParenthesesRight);
        ImageView_Opr_ParenthesesLeft = (ImageView) view.findViewById(R.id.ImageView_Opr_ParenthesesLeft);
        ImageView_Opr_E_to_power = (ImageView) view.findViewById(R.id.ImageView_Opr_E_to_power);
        ImageView_Opr_E = (ImageView) view.findViewById(R.id.ImageView_Opr_E);
        ImageView_Opr_Pi = (ImageView) view.findViewById(R.id.ImageView_Opr_Pi);
        ImageView_Opr_Percent = (ImageView) view.findViewById(R.id.ImageView_Opr_Percent);
        ImageView_Opr_1_divided_by_x = (ImageView) view.findViewById(R.id.ImageView_Opr_1_divided_by_x);
        ImageView_Opr_ln = (ImageView) view.findViewById(R.id.ImageView_Opr_ln);
        ImageView_Opr_Log = (ImageView) view.findViewById(R.id.ImageView_Opr_Log);
        ImageView_Opr_Root_2 = (ImageView) view.findViewById(R.id.ImageView_Opr_Root_2);
        ImageView_Opr_Root_3 = (ImageView) view.findViewById(R.id.ImageView_Opr_Root_3);
        ImageView_Opr_Absolute_value = (ImageView) view.findViewById(R.id.ImageView_Opr_Absolute_value);
        ImageView_Opr_Factorial = (ImageView) view.findViewById(R.id.ImageView_Opr_Factorial);
        ImageView_Opr_Power_2 = (ImageView) view.findViewById(R.id.ImageView_Opr_Power_2);
        ImageView_Opr_Power_3 = (ImageView) view.findViewById(R.id.ImageView_Opr_Power_3);
        ImageView_Opr_OtherOperations = (ImageView) view.findViewById(R.id.ImageView_Opr_OtherOperations);
        ImageView_Opr_10_to_Power = (ImageView) view.findViewById(R.id.ImageView_Opr_10_to_Power);
        ImageView_Opr_2_to_Power = (ImageView) view.findViewById(R.id.ImageView_Opr_2_to_Power);
        ImageView_Opr_Power_y = (ImageView) view.findViewById(R.id.ImageView_Opr_Power_y);
        ImageView_Opr_Root_y = (ImageView) view.findViewById(R.id.ImageView_Opr_Root_y);

        ImageView_Tri_hyp = (ImageView) view.findViewById(R.id.ImageView_Tri_hyp);
        ImageView_Tri_arc = (ImageView) view.findViewById(R.id.ImageView_Tri_arc);
        ImageView_Tri_sin = (ImageView) view.findViewById(R.id.ImageView_Tri_sin);
        ImageView_Tri_csc = (ImageView) view.findViewById(R.id.ImageView_Tri_csc);
        ImageView_Tri_tan = (ImageView) view.findViewById(R.id.ImageView_Tri_tan);
        ImageView_Tri_cos = (ImageView) view.findViewById(R.id.ImageView_Tri_cos);
        ImageView_Tri_sec = (ImageView) view.findViewById(R.id.ImageView_Tri_sec);
        ImageView_Tri_cot = (ImageView) view.findViewById(R.id.ImageView_Tri_cot);
        ImageView_Tri_Deg = (ImageView) view.findViewById(R.id.ImageView_Tri_Deg);
        ImageView_Tri_Rad = (ImageView) view.findViewById(R.id.ImageView_Tri_Rad);

    }

    private void InApp_ads(View view) {

        Adivery.configure(getActivity().getApplication(), "89b4c01a-d9fb-4aa0-ad89-739b526fe037");

        Adivery.prepareInterstitialAd(getContext(), "5dfb9e67-3178-495d-9ae6-5d08181f0822");

        Adivery.prepareInterstitialAd(getContext(), "cc3ef646-a1aa-43e1-983a-e738e7ccc775");

    }

    /*/*/// Key Board /////
    private void Special_Keys() {

        ImageView_Spe_Backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TemporaryMemory = TextView_EnterResult.getText().toString();
                if (TemporaryMemory.length() == 1) {
                    TextView_EnterResult.setText("0");
                    ResultNumber = "";
                    PlusMinus = false;
                    Point = false;
                } else if (TemporaryMemory.length() > 0) {
                    TextView_EnterResult.setText(TemporaryMemory.substring(0, TextView_EnterResult.length() - 1));
                }
                AutoCalculation();
            }
        });

        ImageView_Spe_Backspace.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TextView_EnterResult.setText("0");
                ResultNumber = "";
                PlusMinus = false;
                Point = false;
                AutoCalculation();
                return true;
            }
        });

        ImageView_Spe_CleanUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView_EnterResult.setText("0");
                TextView_AutoResult.setText("");
                TemporaryMemory = "";
                FirstNumber = "";
                SecondNumber = "";
                ResultNumber = "";
                FirstNum = 0;
                SecondNum = 0;
                PlusMinus = false;
                Point = false;
                AutoCalculation();
            }
        });

        ImageView_Spe_History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.BottomSheetBehavior_History.setState(BottomSheetBehavior.STATE_EXPANDED);
                Build_History();

                if (Adivery.isLoaded("5dfb9e67-3178-495d-9ae6-5d08181f0822")) {
                    Adivery.showAd("5dfb9e67-3178-495d-9ae6-5d08181f0822");
                }

            }
        });

        ImageView_Spe_Notepad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.BottomSheetBehavior_NotePad.setState(BottomSheetBehavior.STATE_EXPANDED);
                TemporaryMemory = TextView_EnterResult.getText().toString();
                Build_NotePad();

                if (Adivery.isLoaded("cc3ef646-a1aa-43e1-983a-e738e7ccc775")) {
                    Adivery.showAd("cc3ef646-a1aa-43e1-983a-e738e7ccc775");
                }

                MainActivity.External_Snackbars(1);
            }
        });

        ImageView_Spe_Notepad.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                MainActivity.BottomSheetBehavior_NotePad_Enter.setState(BottomSheetBehavior.STATE_EXPANDED);
                MainActivity.NotePad_Update = false;
                MainActivity.EditText_BSNE_EnterNumber.setText(TextView_EnterResult.getText().toString());
                return true;
            }
        });

        ImageView_Spe_Copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardString = TextView_EnterResult.getText().toString();
                MainActivity.ImageView_Copy.callOnClick();
                Toast.makeText(getActivity(), Class_Language_Text.MainActivity_Toast_1, Toast.LENGTH_SHORT).show();
            }
        });

        ImageView_Spe_Clipboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.ImageView_Clipboard.callOnClick();
                TextView_EnterResult.setText(ClipboardString);
            }
        });

    }

    private void Number_Keyboard() {

        ImageView_Num_PlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TemporaryMemory = TextView_EnterResult.getText().toString();
                if (TemporaryMemory.contains("-")) {
                    PlusMinus = true;
                } else {
                    PlusMinus = false;
                }

                if (!PlusMinus) {
                    TextView_EnterResult.setText("-" + TemporaryMemory);
                    PlusMinus = true;
                } else {
                    TextView_EnterResult.setText(TemporaryMemory.substring(1, TextView_EnterResult.length()));
                    PlusMinus = false;
                }
                AutoCalculation();
            }
        });

        ImageView_Num_Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TemporaryMemory = TextView_EnterResult.getText().toString();
                if (TemporaryMemory.contains(".")) {
                    Point = true;
                } else {
                    Point = false;
                }

                if (!Point) {
                    if (TextView_EnterResult.length() == 0) {
                        TextView_EnterResult.setText("0.");
                    } else {
                        TextView_EnterResult.setText(TemporaryMemory + ".");
                    }
                    Point = true;
                }
                AutoCalculation();
            }
        });

        ImageView_Num_Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("0");
            }
        });

        ImageView_Num_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("1");
            }
        });

        ImageView_Num_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("2");
            }
        });

        ImageView_Num_Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("3");
            }
        });

        ImageView_Num_Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("4");
            }
        });

        ImageView_Num_Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("5");
            }
        });

        ImageView_Num_Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("6");
            }
        });

        ImageView_Num_Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("7");
            }
        });

        ImageView_Num_Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("8");
            }
        });

        ImageView_Num_Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type("9");
            }
        });

    }

    private void Type(String Letter) {
        TemporaryMemory = TextView_EnterResult.getText().toString();

        if (TemporaryMemory.length() <= 15) {
            if (TemporaryMemory.equals("0")) {
                TextView_EnterResult.setText(Letter);
            } else if (TemporaryMemory.equals("-0")) {
                TextView_EnterResult.setText("-" + TemporaryMemory.substring(2, TemporaryMemory.length()) + Letter);
            } else {
                TextView_EnterResult.setText(TemporaryMemory + Letter);
            }
        } else {
            MainActivity.External_Snackbars(4);
        }
        AutoCalculation();
    }

    private void MainOperations_Keyboard() {

        ImageView_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TemporaryMemory = TextView_EnterResult.getText().toString();
                Calculator(TemporaryMemory);
                TextView_EnterResult.setText(OutPut[1]);
                TextView_AutoResult.setText("");
                HistoryInsert( OutPut[0], "= " + OutPut[1]);
            }
        });

        ImageView_4BMO_PlusSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetSign("+");
            }
        });

        ImageView_4BMO_MinusSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetSign("-");
            }
        });

        ImageView_4BMO_TimesSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetSign("×");
            }
        });

        ImageView_4BMO_DivisionSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetSign("÷");
            }
        });

    }

    private void SetSign(String sign) {
        TemporaryMemory = TextView_EnterResult.getText().toString();


        String[] AllOperations = {"+", "-", "×", "÷"};
        String MathExpression = TextView_EnterResult.getText().toString();
        String LastCharacter;
        int Length = TextView_EnterResult.length();
        if (!MathExpression.isBlank()){
            LastCharacter = String.valueOf(MathExpression.charAt(Length-1));
            if (LastCharacter.equals(AllOperations[0]) || LastCharacter.equals(AllOperations[1]) || LastCharacter.equals(AllOperations[2]) || LastCharacter.equals(AllOperations[3])) {
                MathExpression = MathExpression.substring(0,Length-1);
            }
        }
        TextView_EnterResult.setText(MathExpression + sign);
        AutoCalculation();
    }

    private void Operations_Keyboard() {

        ImageView_Opr_OtherOperations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageView_Opr_ParenthesesRight.setVisibility(View.GONE);
                ImageView_Opr_ParenthesesLeft.setVisibility(View.GONE);
                ImageView_Opr_E_to_power.setVisibility(View.GONE);
                ImageView_Opr_E.setVisibility(View.GONE);
                ImageView_Opr_Pi.setVisibility(View.GONE);
                ImageView_Opr_Percent.setVisibility(View.GONE);
                ImageView_Opr_1_divided_by_x.setVisibility(View.GONE);
                ImageView_Opr_ln.setVisibility(View.GONE);
                ImageView_Opr_Log.setVisibility(View.GONE);
                ImageView_Opr_Root_2.setVisibility(View.GONE);
                ImageView_Opr_Root_3.setVisibility(View.GONE);
                ImageView_Opr_Absolute_value.setVisibility(View.GONE);
                ImageView_Opr_Factorial.setVisibility(View.GONE);
                ImageView_Opr_Power_2.setVisibility(View.GONE);
                ImageView_Opr_Power_3.setVisibility(View.GONE);
                ImageView_Opr_10_to_Power.setVisibility(View.GONE);
                ImageView_Opr_2_to_Power.setVisibility(View.GONE);
                ImageView_Opr_Power_y.setVisibility(View.GONE);
                ImageView_Opr_Root_y.setVisibility(View.GONE);

                ImageView_Tri_hyp.setVisibility(View.GONE);
                ImageView_Tri_arc.setVisibility(View.GONE);
                ImageView_Tri_sin.setVisibility(View.GONE);
                ImageView_Tri_csc.setVisibility(View.GONE);
                ImageView_Tri_tan.setVisibility(View.GONE);
                ImageView_Tri_cos.setVisibility(View.GONE);
                ImageView_Tri_sec.setVisibility(View.GONE);
                ImageView_Tri_cot.setVisibility(View.GONE);
                ImageView_Tri_Deg.setVisibility(View.GONE);
                ImageView_Tri_Rad.setVisibility(View.GONE);

                switch (PageNumber) {
                    case 0:
                        LinearLayout_KB_002.setWeightSum(7);
                        LinearLayout_KB_003.setWeightSum(7);
                        LinearLayout_KB_004.setWeightSum(7);
                        LinearLayout_KB_005.setWeightSum(7);
                        ImageView_Opr_E.setVisibility(View.VISIBLE);
                        ImageView_Opr_Pi.setVisibility(View.VISIBLE);
                        ImageView_Opr_Percent.setVisibility(View.VISIBLE);
                        ImageView_Opr_1_divided_by_x.setVisibility(View.VISIBLE);
                        ImageView_Opr_ln.setVisibility(View.VISIBLE);
                        ImageView_Opr_Log.setVisibility(View.VISIBLE);
                        ImageView_Opr_Root_2.setVisibility(View.VISIBLE);
                        ImageView_Opr_Root_3.setVisibility(View.VISIBLE);
                        ImageView_Opr_Absolute_value.setVisibility(View.VISIBLE);
                        ImageView_Opr_Factorial.setVisibility(View.VISIBLE);
                        ImageView_Opr_Power_2.setVisibility(View.VISIBLE);
                        ImageView_Opr_Power_3.setVisibility(View.VISIBLE);
                        ImageView_Opr_2_to_Power.setVisibility(View.VISIBLE);
                        ImageView_Opr_Power_y.setVisibility(View.VISIBLE);
                        ImageView_Opr_Root_y.setVisibility(View.VISIBLE);
                        PageNumber = 1;
                        ImageView_Opr_OtherOperations.setImageResource(R.drawable.ic_cal_operations_dots_nine_1);
                        break;

                    case 1:
                        LinearLayout_KB_002.setWeightSum(7);
                        LinearLayout_KB_003.setWeightSum(7);
                        LinearLayout_KB_004.setWeightSum(7);
                        LinearLayout_KB_005.setWeightSum(7);
                        ImageView_Opr_Pi.setVisibility(View.VISIBLE);
                        ImageView_Opr_Percent.setVisibility(View.VISIBLE);
                        ImageView_Opr_1_divided_by_x.setVisibility(View.VISIBLE);
                        ImageView_Opr_ln.setVisibility(View.VISIBLE);
                        ImageView_Opr_Log.setVisibility(View.VISIBLE);
                        ImageView_Opr_Root_2.setVisibility(View.VISIBLE);
                        ImageView_Opr_Root_3.setVisibility(View.VISIBLE);
                        ImageView_Opr_Absolute_value.setVisibility(View.VISIBLE);
                        ImageView_Opr_Factorial.setVisibility(View.VISIBLE);
                        ImageView_Opr_Power_2.setVisibility(View.VISIBLE);
                        ImageView_Opr_Power_3.setVisibility(View.VISIBLE);
                        ImageView_Opr_Power_y.setVisibility(View.VISIBLE);
                        ImageView_Opr_Root_y.setVisibility(View.VISIBLE);
                        ImageView_Opr_E_to_power.setVisibility(View.VISIBLE);
                        ImageView_Opr_10_to_Power.setVisibility(View.VISIBLE);
                        PageNumber = 2;
                        ImageView_Opr_OtherOperations.setImageResource(R.drawable.ic_cal_operations_dots_nine_2);
                        break;

                    case 2:
                        LinearLayout_KB_002.setWeightSum(6);
                        LinearLayout_KB_003.setWeightSum(6);
                        LinearLayout_KB_004.setWeightSum(6);
                        LinearLayout_KB_005.setWeightSum(6);
                        ImageView_Opr_Pi.setVisibility(View.VISIBLE);
                        ImageView_Tri_hyp.setVisibility(View.VISIBLE);
                        ImageView_Tri_arc.setVisibility(View.VISIBLE);
                        ImageView_Tri_sin.setVisibility(View.VISIBLE);
                        ImageView_Tri_csc.setVisibility(View.VISIBLE);
                        ImageView_Tri_tan.setVisibility(View.VISIBLE);
                        ImageView_Tri_cos.setVisibility(View.VISIBLE);
                        ImageView_Tri_sec.setVisibility(View.VISIBLE);
                        ImageView_Tri_cot.setVisibility(View.VISIBLE);
                        ImageView_Tri_Deg.setVisibility(View.VISIBLE);
                        ImageView_Tri_Rad.setVisibility(View.VISIBLE);
                        PageNumber = 3;
                        ImageView_Opr_OtherOperations.setImageResource(R.drawable.ic_cal_operations_dots_nine_3);
                        break;

                    case 3:
                        LinearLayout_KB_002.setWeightSum(5);
                        LinearLayout_KB_003.setWeightSum(5);
                        LinearLayout_KB_004.setWeightSum(5);
                        LinearLayout_KB_005.setWeightSum(5);
                        ImageView_Opr_Pi.setVisibility(View.VISIBLE);
                        ImageView_Opr_Percent.setVisibility(View.VISIBLE);
                        ImageView_Opr_Log.setVisibility(View.VISIBLE);
                        ImageView_Opr_Root_2.setVisibility(View.VISIBLE);
                        ImageView_Opr_Factorial.setVisibility(View.VISIBLE);
                        ImageView_Opr_Power_2.setVisibility(View.VISIBLE);
                        ImageView_Opr_Power_y.setVisibility(View.VISIBLE);
                        PageNumber = 0;
                        ImageView_Opr_OtherOperations.setImageResource(R.drawable.ic_cal_operations_dots_nine_0);
                        break;
                }
            }
        });

        ImageView_Opr_ParenthesesLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        ImageView_Opr_ParenthesesRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageView_Opr_E_to_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Math.E;
                    SecondNumber = TextView_EnterResult.getText().toString();
                    SecondNum = Double.parseDouble(SecondNumber);
                    TemporaryMemory = Math.pow(FirstNum, SecondNum) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("e ^ " + SecondNumber, "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TemporaryMemory = Math.E + "";
                TextView_EnterResult.setText(TemporaryMemory);
                AutoCalculation();
            }
        });

        ImageView_Opr_Pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TemporaryMemory = Math.PI + "";
                TextView_EnterResult.setText(TemporaryMemory);
                AutoCalculation();
            }
        });

        ImageView_Opr_Percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = FirstNum / 100 + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_1_divided_by_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = 1 / FirstNum + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("⅟ " + FirstNum, "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.log(FirstNum) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("ln( " + FirstNum + " )", "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.log10(FirstNum) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("log( " + FirstNum + " )", "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_Root_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.sqrt(FirstNum) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("√( " + FirstNum + " )", "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_Root_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.cbrt(FirstNum) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("∛( " + FirstNum + " )", "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_Absolute_value.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.abs(FirstNum) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("| " + FirstNum + " |", "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_Factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    double fact = 1, n;
                    n = Double.parseDouble(TextView_EnterResult.getText().toString());
                    for (int count = 1; count <= n; count++) {
                        fact *= count;
                    }
                    TextView_EnterResult.setText(fact + "");
                    HistoryInsert(FirstNum + "!", "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_Power_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.pow(FirstNum, 2) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert(FirstNum + " ^ 2", "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_Power_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.pow(FirstNum, 3) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert(FirstNum + " ^ 3", "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_10_to_Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.pow(10, FirstNum) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("10 ^ " + FirstNum, "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_2_to_Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check_the_Input()) {
                    FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                    TemporaryMemory = Math.pow(2, FirstNum) + "";
                    TextView_EnterResult.setText(TemporaryMemory);
                    HistoryInsert("2 ^ " + FirstNum, "= " + TemporaryMemory);
                    AutoCalculation();
                }
            }
        });

        ImageView_Opr_Power_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Type("^");
//                ResultNumber = Math.pow(FirstNum, SecondNum) + "";
            }
        });

        ImageView_Opr_Root_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Type("root");
//                ResultNumber = Math.pow(FirstNum, (1 / SecondNum)) + "";
            }
        });

    }

    private boolean Check_the_Input() {
        boolean Check_the_Input = false;
        TemporaryMemory = TextView_EnterResult.getText().toString();
        if (TemporaryMemory.equals("0") || TemporaryMemory.equals("-0") || TemporaryMemory.equals("")) {
            MainActivity.External_Snackbars(2);
            return false;
        } else {
            return true;
        }
    }

    private void Trigonometry_Keyboard() {

        ImageView_Tri_hyp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hyp == false) {
                    ImageView_Tri_sin.setImageResource(R.drawable.ic_cal_trigonometry_sinh);
                    ImageView_Tri_csc.setImageResource(R.drawable.ic_cal_trigonometry_csch);
                    ImageView_Tri_tan.setImageResource(R.drawable.ic_cal_trigonometry_tanh);
                    ImageView_Tri_cos.setImageResource(R.drawable.ic_cal_trigonometry_cosh);
                    ImageView_Tri_sec.setImageResource(R.drawable.ic_cal_trigonometry_sech);
                    ImageView_Tri_cot.setImageResource(R.drawable.ic_cal_trigonometry_coth);
                    hyp = true;
                    ImageView_Tri_hyp.setBackgroundResource(R.drawable.bg_shape_010);
                    arc = false;
                    ImageView_Tri_arc.setBackgroundResource(R.drawable.bg_selector_002);
                } else {
                    ImageView_Tri_sin.setImageResource(R.drawable.ic_cal_trigonometry_sin);
                    ImageView_Tri_csc.setImageResource(R.drawable.ic_cal_trigonometry_csc);
                    ImageView_Tri_tan.setImageResource(R.drawable.ic_cal_trigonometry_tan);
                    ImageView_Tri_cos.setImageResource(R.drawable.ic_cal_trigonometry_cos);
                    ImageView_Tri_sec.setImageResource(R.drawable.ic_cal_trigonometry_sec);
                    ImageView_Tri_cot.setImageResource(R.drawable.ic_cal_trigonometry_cot);
                    hyp = false;
                    ImageView_Tri_hyp.setBackgroundResource(R.drawable.bg_selector_002);
                    arc = false;
                    ImageView_Tri_arc.setBackgroundResource(R.drawable.bg_selector_002);
                }
            }
        });

        ImageView_Tri_arc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arc == false) {
                    ImageView_Tri_sin.setImageResource(R.drawable.ic_cal_trigonometry_asin);
                    ImageView_Tri_csc.setImageResource(R.drawable.ic_cal_trigonometry_acsc);
                    ImageView_Tri_tan.setImageResource(R.drawable.ic_cal_trigonometry_atan);
                    ImageView_Tri_cos.setImageResource(R.drawable.ic_cal_trigonometry_acos);
                    ImageView_Tri_sec.setImageResource(R.drawable.ic_cal_trigonometry_asec);
                    ImageView_Tri_cot.setImageResource(R.drawable.ic_cal_trigonometry_acot);
                    arc = true;
                    ImageView_Tri_arc.setBackgroundResource(R.drawable.bg_shape_010);
                    hyp = false;
                    ImageView_Tri_hyp.setBackgroundResource(R.drawable.bg_selector_002);
                } else {
                    ImageView_Tri_sin.setImageResource(R.drawable.ic_cal_trigonometry_sin);
                    ImageView_Tri_csc.setImageResource(R.drawable.ic_cal_trigonometry_csc);
                    ImageView_Tri_tan.setImageResource(R.drawable.ic_cal_trigonometry_tan);
                    ImageView_Tri_cos.setImageResource(R.drawable.ic_cal_trigonometry_cos);
                    ImageView_Tri_sec.setImageResource(R.drawable.ic_cal_trigonometry_sec);
                    ImageView_Tri_cot.setImageResource(R.drawable.ic_cal_trigonometry_cot);
                    arc = false;
                    ImageView_Tri_arc.setBackgroundResource(R.drawable.bg_selector_002);
                    hyp = false;
                    ImageView_Tri_hyp.setBackgroundResource(R.drawable.bg_selector_002);
                }
            }
        });

        ImageView_Tri_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                if (hyp == false && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.sin(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("sin( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.sin(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("sin( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == false && arc == true) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.asin(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("arcsin( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.asin(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("arcsin( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == true && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.sinh(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("sinh( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.sinh(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("sinh( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                }
                TextView_EnterResult.setText(TemporaryMemory);
                AutoCalculation();
            }
        });

        ImageView_Tri_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                if (hyp == false && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.cos(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("cos( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.cos(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("cos( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == false && arc == true) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.acos(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("arccos( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.acos(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("arccos( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == true && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.cosh(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("cosh( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.cosh(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("cosh( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                }
                TextView_EnterResult.setText(TemporaryMemory);
                AutoCalculation();
            }
        });

        ImageView_Tri_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                if (hyp == false && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.tan(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("tan( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.tan(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("tan( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == false && arc == true) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.atan(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("arctan( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.atan(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("arctan( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == true && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = Math.rint(Math.tanh(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("tanh( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = Math.rint(Math.tanh(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("tanh( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                }
                TextView_EnterResult.setText(TemporaryMemory);
                AutoCalculation();
            }
        });

        ImageView_Tri_csc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                if (hyp == false && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.sin(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("csc( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.sin(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("csc( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == false && arc == true) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.asin(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("arccsc( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.asin(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("arccsc( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == true && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.sinh(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("csch( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.sinh(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("csch( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                }
                TextView_EnterResult.setText(TemporaryMemory);
                AutoCalculation();
            }
        });

        ImageView_Tri_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                if (hyp == false && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.cos(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("sec( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.cos(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("sec( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == false && arc == true) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.acos(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("arcsec( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.acos(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("arcsec( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == true && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.cosh(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("sech( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.cosh(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("sech( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                }
                TextView_EnterResult.setText(TemporaryMemory);
                AutoCalculation();
            }
        });

        ImageView_Tri_cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstNum = Double.parseDouble(TextView_EnterResult.getText().toString());
                if (hyp == false && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.tan(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("cot( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.tan(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("cot( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == false && arc == true) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.atan(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("arccot( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.atan(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("arccot( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                } else if (hyp == true && arc == false) {
                    if (Angle == "DEG") {
                        TemporaryMemory = 1 / Math.rint(Math.tanh(Math.toRadians(FirstNum))) + "";
                        HistoryInsert("coth( " + FirstNum + "° )", "= " + TemporaryMemory);
                    } else if (Angle == "RAD") {
                        TemporaryMemory = 1 / Math.rint(Math.tanh(Math.toDegrees(FirstNum))) + "";
                        HistoryInsert("coth( " + FirstNum + " )", "= " + TemporaryMemory);
                    }
                }
                TextView_EnterResult.setText(TemporaryMemory);
                AutoCalculation();
            }
        });

        ImageView_Tri_Deg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Angle = "DEG";
                ImageView_Tri_Deg.setBackgroundResource(R.drawable.bg_shape_010);
                ImageView_Tri_Rad.setBackgroundResource(R.drawable.bg_selector_002);
            }
        });

        ImageView_Tri_Rad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Angle = "RAD";
                ImageView_Tri_Rad.setBackgroundResource(R.drawable.bg_shape_010);
                ImageView_Tri_Deg.setBackgroundResource(R.drawable.bg_selector_002);
            }
        });

    }

    private void AutoCalculation() {
        TemporaryMemory = TextView_EnterResult.getText().toString();
        Calculator(TemporaryMemory);
        TextView_AutoResult.setText(OutPut[1]);
    }
    ///////////////////////

    private void HistoryInsert(String Text, String Result) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
        String currentDateandTime = sdf.format(new Date());

        long DataBaseResult;
        Class_History temp = new Class_History();
        temp.setText(Text + "");
        temp.setResult(Result + "");
        temp.setDateTime(currentDateandTime + "");
        DataBaseResult = Class_History.HistoryDataBaseInsert(getActivity(), temp);
    }

    public void Build_History() {
        MainActivity.HistoryList = Class_History.HistoryDataBaseSelectAll(getActivity(), null, null, null);
        MainActivity.HistoryAdapter = new Class_AdapterHistory(MainActivity.HistoryList, getLayoutInflater(), new Class_AdapterHistory.OnItemEventListeners() {
            @Override
            public void OnCopyClick(Class_History item, int pos) {

            }

            @Override
            public void OnDeleteItemClick(Class_History item, int pos) {
                MainActivity.DeleteHistoryItem(item, item.getID(), pos);
            }

            @Override
            public void OnNotepadClick(Class_History item, int pos) {
                MainActivity.BottomSheetBehavior_NotePad_Enter.setState(BottomSheetBehavior.STATE_EXPANDED);
                MainActivity.NotePad_Update = false;
                MainActivity.EditText_BSNE_EnterNumber.setText(item.getResult());
                MainActivity.EditText_BSNE_EnterTitle.setText("");
            }

            @Override
            public void OnTransferClick(Class_History item, int pos) {
                ImageView_Spe_CleanUp.callOnClick();

                TextView_EnterResult.setText(item.getResult().substring(2, item.getResult().length()));
                MainActivity.BottomSheetBehavior_History.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });
        LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        MainActivity.RecyclerView_BSH_History.setLayoutManager(lm);
        MainActivity.RecyclerView_BSH_History.setAdapter(MainActivity.HistoryAdapter);
        MainActivity.HistoryAdapter.notifyDataSetChanged();
        MainActivity.RecyclerView_BSH_History.smoothScrollToPosition(MainActivity.HistoryList.size());
    }

    public void Build_NotePad() {
        MainActivity.NotepadList = Class_Notepad.NotepadDataBaseSelectAll(getActivity(), null, null, null);
        MainActivity.NotepadAdapter = new Class_AdapterNotepad(MainActivity.NotepadList, getLayoutInflater(), new Class_AdapterNotepad.OnItemEventListeners() {
            @Override
            public void OnCopyClick(Class_Notepad item, int pos) {

            }

            @Override
            public void OnDeleteItemClick(Class_Notepad item, int pos) {

                MainActivity.DeleteNotePadItem(item, item.getID(), pos);

            }

            @Override
            public void OnEditClick(Class_Notepad item, int pos) {
                MainActivity.BottomSheetBehavior_NotePad.setState(BottomSheetBehavior.STATE_COLLAPSED);
                MainActivity.BottomSheetBehavior_NotePad_Enter.setState(BottomSheetBehavior.STATE_EXPANDED);
                MainActivity.NotePad_Update = true;
                MainActivity.id = item.getID();
                MainActivity.EditText_BSNE_EnterNumber.setText(item.getNumber());
                MainActivity.EditText_BSNE_EnterTitle.setText(item.getTitle());
            }

            @Override
            public void OnTransferClick(Class_Notepad item, int pos) {
                ImageView_Spe_CleanUp.callOnClick();

                TextView_EnterResult.setText(item.getNumber());
                MainActivity.BottomSheetBehavior_NotePad.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });

        LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        MainActivity.RecyclerView_BSN_NotePad.setLayoutManager(lm);
        MainActivity.RecyclerView_BSN_NotePad.setAdapter(MainActivity.NotepadAdapter);
        MainActivity.NotepadAdapter.notifyDataSetChanged();
        MainActivity.RecyclerView_BSN_NotePad.smoothScrollToPosition(MainActivity.NotepadList.size());
    }

    @Override
    public void onClick(View view) {

    }
}