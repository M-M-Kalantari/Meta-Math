package persian.googolplexian.metamath.MainFragments.Shape;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryAdListener;
import com.adivery.sdk.AdiveryBannerAdView;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import persian.googolplexian.metamath.BroadcastReceiver.Class_BroadcastReceiver;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.MainFragments.Shape.ItemsList.Class_Sha_Item;
import persian.googolplexian.metamath.MainFragments.Shape.ItemsList.Class_Sha_ItemsAdapter;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;
import persian.googolplexian.metamath.R;

import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static persian.googolplexian.metamath.MainActivity.Fragment_BackPressed;


public class FragmentShape extends Fragment {

    RelativeLayout RelativeLayout_Shape;

    ///// Lock /////
    public static RelativeLayout RelativeLayout_Lock_FragmentShape;
    ImageView ImageView_Lock;
    TextView TextView_Lock;
    ////////////////

    public static ListView ListView_ShapeItems;
    ArrayList<Class_Sha_Item> arrayListItems;
    Class_Sha_ItemsAdapter itemsAdapter;

    public static RelativeLayout RelativeLayout_ShapeFields;
    LinearLayout LinearLayout_SelectedField;
    ImageView ImageView_SelectedField;
    TextView TextView_SelectedField;
    ImageView ImageView_Clean, ImageView_Back, ImageView_Share;

    LinearLayout LinearLayout_Shape_Input;
    Switch Switch_Shape;
    EditText EditText_Input_A, EditText_Input_B, EditText_Input_C, EditText_Input_D;
    LinearLayout LinearLayout_Shape_Output;
    TextInputLayout TextInputLayout_Output_X, TextInputLayout_Output_Y, TextInputLayout_Output_Z;
    EditText EditText_Output_X, EditText_Output_Y, EditText_Output_Z;


    public static int SHA_SelectedItemID = 0;
    public static int SHA_SelectedFieldID = 0;
    public static String SHA_InputText = "";
    public static double SHA_InputNumber = 0;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public FragmentShape() {
        // Required empty public constructor
    }

    public static FragmentShape newInstance(String param1, String param2) {
        FragmentShape fragment = new FragmentShape();
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
        View view = inflater.inflate(R.layout.fragment_shape, container, false);

        Find_Views(view);
        Load_Language();
        Lock_FragmentShape();
        InApp_ads(view);
        Build_ItemList();
        Build_Events();

        return view;
    }

    private void Find_Views(View view) {
        RelativeLayout_Shape = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Shape);

        /*/*/ ///// Lock /////
        RelativeLayout_Lock_FragmentShape = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Lock_FragmentShape);
        ImageView_Lock = (ImageView) view.findViewById(R.id.ImageView_Lock);
        TextView_Lock = (TextView) view.findViewById(R.id.TextView_Lock);
        ////////////////

        ListView_ShapeItems = (ListView) view.findViewById(R.id.ListView_Items);

        RelativeLayout_ShapeFields = (RelativeLayout) view.findViewById(R.id.RelativeLayout_ShapeFields);
        LinearLayout_SelectedField = (LinearLayout) view.findViewById(R.id.LinearLayout_SelectedField);
        ImageView_SelectedField = (ImageView) view.findViewById(R.id.ImageView_SelectedField);
        TextView_SelectedField = (TextView) view.findViewById(R.id.TextView_SelectedField);
        TextView_SelectedField.setSelected(true);

        ImageView_Clean = (ImageView) view.findViewById(R.id.ImageView_Clean);
        ImageView_Back = (ImageView) view.findViewById(R.id.ImageView_Back);
        ImageView_Share = (ImageView) view.findViewById(R.id.ImageView_Share);

        LinearLayout_Shape_Input = (LinearLayout) view.findViewById(R.id.LinearLayout_Shape_Input);
        Switch_Shape = (Switch) view.findViewById(R.id.Switch_Shape);
        EditText_Input_A = (EditText) view.findViewById(R.id.EditText_Input_A);
        EditText_Input_B = (EditText) view.findViewById(R.id.EditText_Input_B);
        EditText_Input_C = (EditText) view.findViewById(R.id.EditText_Input_C);
        EditText_Input_D = (EditText) view.findViewById(R.id.EditText_Input_D);
        LinearLayout_Shape_Output = (LinearLayout) view.findViewById(R.id.LinearLayout_Shape_Output);
        TextInputLayout_Output_X = (TextInputLayout) view.findViewById(R.id.TextInputLayout_Output_X);
        TextInputLayout_Output_Y = (TextInputLayout) view.findViewById(R.id.TextInputLayout_Output_Y);
        TextInputLayout_Output_Z = (TextInputLayout) view.findViewById(R.id.TextInputLayout_Output_Z);
        EditText_Output_X = (EditText) view.findViewById(R.id.EditText_Output_X);
        EditText_Output_Y = (EditText) view.findViewById(R.id.EditText_Output_Y);
        EditText_Output_Z = (EditText) view.findViewById(R.id.EditText_Output_Z);

    }

    private void Load_Language() {
        TextView_Lock.setText(Class_Language_Text.Error_0);
    }

    public static void Lock_FragmentShape() {
        try {
            if (Class_BroadcastReceiver.Lock_App){
                RelativeLayout_Lock_FragmentShape.setVisibility(View.VISIBLE);
            }else {
                RelativeLayout_Lock_FragmentShape.setVisibility(View.GONE);
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

    private void Build_ItemList() {
        arrayListItems = new ArrayList<>();
        itemsAdapter = new Class_Sha_ItemsAdapter(getActivity(), arrayListItems);

        arrayListItems.add(new Class_Sha_Item(0, Class_Language_Text.FragmentShape_Item_Triangle, "ic_sha_triangle"));
        arrayListItems.add(new Class_Sha_Item(1, Class_Language_Text.FragmentShape_Item_Square, "ic_sha_square"));
        arrayListItems.add(new Class_Sha_Item(2, Class_Language_Text.FragmentShape_Item_Rectangle, "ic_sha_rectangle"));
        arrayListItems.add(new Class_Sha_Item(3, Class_Language_Text.FragmentShape_Item_Parallelogram, "ic_sha_parallelogram"));
        arrayListItems.add(new Class_Sha_Item(4, Class_Language_Text.FragmentShape_Item_Rhombus, "ic_sha_rhombus"));
        arrayListItems.add(new Class_Sha_Item(5, Class_Language_Text.FragmentShape_Item_Trapezoid, "ic_sha_trapezoid"));
        arrayListItems.add(new Class_Sha_Item(6, Class_Language_Text.FragmentShape_Item_Circle, "ic_sha_circle"));
        arrayListItems.add(new Class_Sha_Item(7, Class_Language_Text.FragmentShape_Item_Ellipse, "ic_sha_ellipse"));
        arrayListItems.add(new Class_Sha_Item(8, Class_Language_Text.FragmentShape_Item_Cube, "ic_sha_cube"));
        arrayListItems.add(new Class_Sha_Item(9, Class_Language_Text.FragmentShape_Item_Cuboid, "ic_sha_cuboid"));
        arrayListItems.add(new Class_Sha_Item(10, Class_Language_Text.FragmentShape_Item_Cylinder, "ic_sha_cylinder"));
        arrayListItems.add(new Class_Sha_Item(11, Class_Language_Text.FragmentShape_Item_Cone, "ic_sha_cone"));
        arrayListItems.add(new Class_Sha_Item(12, Class_Language_Text.FragmentShape_Item_Pyramid, "ic_sha_pyramid"));
        arrayListItems.add(new Class_Sha_Item(13, Class_Language_Text.FragmentShape_Item_Sphere, "ic_sha_sphere"));

        ListView_ShapeItems.setAdapter(itemsAdapter);

        ListView_ShapeItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!Class_BroadcastReceiver.Lock_App){
                    MainActivity.MainAds_Index++;
                    MainActivity.MainAds();

                    ImageView_Clean.callOnClick();
                    ListView_ShapeItems.setVisibility(View.GONE);
                    RelativeLayout_ShapeFields.setVisibility(View.VISIBLE);
                    TextView_SelectedField.setText(arrayListItems.get(position).getSHA_Item_Title());
                    String URL = "@drawable/" + arrayListItems.get(position).getSHA_Item_Vector();
                    int ImageSource = getContext().getResources().getIdentifier(URL, null, getContext().getPackageName());
                    ImageView_SelectedField.setImageDrawable(ResourcesCompat.getDrawable(getContext().getResources(), ImageSource, null));
                    SHA_SelectedItemID = arrayListItems.get(position).getSHA_Item_ID();

                    SwitchShapes();

                    Fragment_BackPressed = true;
                }
            }
        });
    }

    private void Build_Events() {

        ImageView_Clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText_Input_A.setText("");
                EditText_Input_B.setText("");
                EditText_Input_C.setText("");
                EditText_Input_D.setText("");
                EditText_Output_X.setText("");
                EditText_Output_Y.setText("");
                EditText_Output_Z.setText("");

            }
        });

        ImageView_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListView_ShapeItems.setVisibility(View.VISIBLE);
                RelativeLayout_ShapeFields.setVisibility(View.GONE);
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
                        String ShareText = Class_Language_Text.ApplicationName + "\n" + "\n" + "\n";

                        ShareText += TextView_SelectedField.getText().toString() + ": " + "\n" + "\n";

                        switch (SHA_SelectedItemID) {
                            case 0:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a " + "( " + Class_Language_Text.FragmentShape_Base + " )" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Side + " b" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Side + " c" + " = " + EditText_Input_C.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Height + " h" + " = " + EditText_Input_D.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Perimeter + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Area + " = " + EditText_Output_Y.getText().toString() + "\n";
                                break;

                            case 1:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Perimeter + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Area + " = " + EditText_Output_Y.getText().toString() + "\n";
                                break;

                            case 2:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Side + " b" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Perimeter + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Area + " = " + EditText_Output_Y.getText().toString() + "\n";
                                break;

                            case 3:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a " + "( " + Class_Language_Text.FragmentShape_Base + " )" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Side + " b" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Height + " h" + " = " + EditText_Input_C.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Perimeter + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Area + " = " + EditText_Output_Y.getText().toString() + "\n";
                                break;

                            case 4:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Height + " h1" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Height + " h2" + " = " + EditText_Input_C.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Perimeter + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Area + " = " + EditText_Output_Y.getText().toString() + "\n";
                                break;

                            case 5:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Side + " b" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Height + " h" + " = " + EditText_Input_C.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Perimeter + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Area + " = " + EditText_Output_Y.getText().toString() + "\n";
                                break;

                            case 6:
                                ShareText += Class_Language_Text.FragmentShape_Radius + " r" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Diameter + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Perimeter + " = " + EditText_Output_Y.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Area + " = " + EditText_Output_Z.getText().toString() + "\n";
                                break;

                            case 7:
                                ShareText += Class_Language_Text.FragmentShape_Radius + " r1" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Radius + " r2" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Perimeter + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Area + " = " + EditText_Output_Y.getText().toString() + "\n";
                                break;

                            case 8:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_LateralArea + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_TotalArea + " = " + EditText_Output_Y.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Volume + " = " + EditText_Output_Z.getText().toString() + "\n";
                                break;

                            case 9:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Side + " b" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Side + " c" + " = " + EditText_Input_C.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_TotalArea + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Volume + " = " + EditText_Output_Y.getText().toString() + "\n";
                                break;

                            case 10:
                            case 11:
                                ShareText += Class_Language_Text.FragmentShape_Radius + " r" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Height + " h" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_LateralArea + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_TotalArea + " = " + EditText_Output_Y.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Volume + " = " + EditText_Output_Z.getText().toString() + "\n";
                                break;

                            case 12:
                                ShareText += Class_Language_Text.FragmentShape_Side + " a" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Height + " h" + " = " + EditText_Input_B.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_LateralArea + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_TotalArea + " = " + EditText_Output_Y.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Volume + " = " + EditText_Output_Z.getText().toString() + "\n";
                                break;

                            case 13:
                                ShareText += Class_Language_Text.FragmentShape_Radius + " r" + " = " + EditText_Input_A.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_TotalArea + " = " + EditText_Output_X.getText().toString() + "\n";
                                ShareText += Class_Language_Text.FragmentShape_Volume + " = " + EditText_Output_Y.getText().toString() + "\n";
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


    private void SwitchShapes() {

        EditText_Input_A.setVisibility(View.GONE);
        EditText_Input_B.setVisibility(View.GONE);
        EditText_Input_C.setVisibility(View.GONE);
        EditText_Input_D.setVisibility(View.GONE);

        TextInputLayout_Output_X.setVisibility(View.GONE);
        TextInputLayout_Output_X.setErrorEnabled(false);
        TextInputLayout_Output_Y.setVisibility(View.GONE);
        TextInputLayout_Output_Y.setErrorEnabled(false);
        TextInputLayout_Output_Z.setVisibility(View.GONE);
        TextInputLayout_Output_Z.setErrorEnabled(false);
        EditText_Output_X.setVisibility(View.GONE);
        EditText_Output_Y.setVisibility(View.GONE);
        EditText_Output_Z.setVisibility(View.GONE);

        EditText_Output_X.setClickable(false);
        EditText_Output_X.setFocusable(false);
        EditText_Output_X.setSelected(false);
        EditText_Output_Y.setClickable(false);
        EditText_Output_Y.setFocusable(false);
        EditText_Output_Y.setSelected(false);
        EditText_Output_Z.setClickable(false);
        EditText_Output_Z.setFocusable(false);
        EditText_Output_Z.setSelected(false);

        switch (SHA_SelectedItemID) {
            case 0:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                EditText_Input_C.setVisibility(View.VISIBLE);
                EditText_Input_D.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a " + "( " + Class_Language_Text.FragmentShape_Base + " )");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Side + " b");
                EditText_Input_C.setHint(Class_Language_Text.FragmentShape_Side + " c");
                EditText_Input_D.setHint(Class_Language_Text.FragmentShape_Height + " h");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_Perimeter);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Area);
                break;

            case 1:
                EditText_Input_A.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_Perimeter);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Area);
                break;

            case 2:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Side + " b");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_Perimeter);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Area);
                break;

            case 3:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                EditText_Input_C.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a " + "( " + Class_Language_Text.FragmentShape_Base + " )");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Side + " b");
                EditText_Input_C.setHint(Class_Language_Text.FragmentShape_Height + " h");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_Perimeter);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Area);
                break;

            case 4:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                EditText_Input_C.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Height + " h1");
                EditText_Input_C.setHint(Class_Language_Text.FragmentShape_Height + " h2");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_Perimeter);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Area);
                break;

            case 5:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                EditText_Input_C.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Side + " b");
                EditText_Input_C.setHint(Class_Language_Text.FragmentShape_Height + " h");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_Perimeter);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Area);
                break;

            case 6:
                EditText_Input_A.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Z.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_Z.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Radius + " r");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_Diameter);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Perimeter);
                TextInputLayout_Output_Z.setHint(Class_Language_Text.FragmentShape_Area);
                break;

            case 7:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Radius + " r1");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Radius + " r2");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_Perimeter);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Area);
                break;

            case 8:
                EditText_Input_A.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Z.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_Z.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_LateralArea);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_TotalArea);
                TextInputLayout_Output_Z.setHint(Class_Language_Text.FragmentShape_Volume);
                break;

            case 9:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                EditText_Input_C.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Side + " b");
                EditText_Input_C.setHint(Class_Language_Text.FragmentShape_Side + " c");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_TotalArea);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Volume);
                break;

            case 10:
            case 11:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Z.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_Z.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Radius + " r");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Height + " h");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_LateralArea);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_TotalArea);
                TextInputLayout_Output_Z.setHint(Class_Language_Text.FragmentShape_Volume);
                break;

            case 12:
                EditText_Input_A.setVisibility(View.VISIBLE);
                EditText_Input_B.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Z.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_Z.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Side + " a");
                EditText_Input_B.setHint(Class_Language_Text.FragmentShape_Height + " h");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_LateralArea);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_TotalArea);
                TextInputLayout_Output_Z.setHint(Class_Language_Text.FragmentShape_Volume);
                break;

            case 13:
                EditText_Input_A.setVisibility(View.VISIBLE);
                TextInputLayout_Output_X.setVisibility(View.VISIBLE);
                TextInputLayout_Output_Y.setVisibility(View.VISIBLE);
                EditText_Output_X.setVisibility(View.VISIBLE);
                EditText_Output_Y.setVisibility(View.VISIBLE);

                EditText_Input_A.setHint(Class_Language_Text.FragmentShape_Radius + " r");
                TextInputLayout_Output_X.setHint(Class_Language_Text.FragmentShape_TotalArea);
                TextInputLayout_Output_Y.setHint(Class_Language_Text.FragmentShape_Volume);
                break;
        }

        EditText_Input_A.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int KeyCode, KeyEvent keyEvent) {

                if (KeyCode == 67) {
                    double x = EditText_Input_A.getText().toString().length();
                    if (x == 0) {
                        EditText_Output_X.setText("");
                        EditText_Output_Y.setText("");
                        EditText_Output_Z.setText("");
                    }
                }

                try {
                    switch (SHA_SelectedItemID) {
                        case 0:
                            Triangle();
                            break;
                        case 1:
                            Square();
                            break;
                        case 2:
                            Rectangle();
                            break;
                        case 3:
                            Parallelogram();
                            break;
                        case 4:
                            Rhombus();
                            break;
                        case 5:
                            Trapezoid();
                            break;
                        case 6:
                            Circle();
                            break;
                        case 7:
                            Ellipse();
                            break;
                        case 8:
                            Cube();
                            break;
                        case 9:
                            Cuboid();
                            break;
                        case 10:
                            Cylinder();
                            break;
                        case 11:
                            Cone();
                            break;
                        case 12:
                            Pyramid();
                            break;
                        case 13:
                            Sphere();
                            break;
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Input_B.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int KeyCode, KeyEvent keyEvent) {

                if (KeyCode == 67) {
                    double x = EditText_Input_B.getText().toString().length();
                    if (x == 0) {
                        EditText_Output_X.setText("");
                        EditText_Output_Y.setText("");
                        EditText_Output_Z.setText("");
                    }
                }

                try {
                    switch (SHA_SelectedItemID) {
                        case 0:
                            Triangle();
                            break;
                        case 1:
                            Square();
                            break;
                        case 2:
                            Rectangle();
                            break;
                        case 3:
                            Parallelogram();
                            break;
                        case 4:
                            Rhombus();
                            break;
                        case 5:
                            Trapezoid();
                            break;
                        case 6:
                            Circle();
                            break;
                        case 7:
                            Ellipse();
                            break;
                        case 8:
                            Cube();
                            break;
                        case 9:
                            Cuboid();
                            break;
                        case 10:
                            Cylinder();
                            break;
                        case 11:
                            Cone();
                            break;
                        case 12:
                            Pyramid();
                            break;
                        case 13:
                            Sphere();
                            break;
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Input_C.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int KeyCode, KeyEvent keyEvent) {

                if (KeyCode == 67) {
                    double x = EditText_Input_C.getText().toString().length();
                    if (x == 0) {
                        EditText_Output_X.setText("");
                        EditText_Output_Y.setText("");
                        EditText_Output_Z.setText("");
                    }
                }

                try {
                    switch (SHA_SelectedItemID) {
                        case 0:
                            Triangle();
                            break;
                        case 1:
                            Square();
                            break;
                        case 2:
                            Rectangle();
                            break;
                        case 3:
                            Parallelogram();
                            break;
                        case 4:
                            Rhombus();
                            break;
                        case 5:
                            Trapezoid();
                            break;
                        case 6:
                            Circle();
                            break;
                        case 7:
                            Ellipse();
                            break;
                        case 8:
                            Cube();
                            break;
                        case 9:
                            Cuboid();
                            break;
                        case 10:
                            Cylinder();
                            break;
                        case 11:
                            Cone();
                            break;
                        case 12:
                            Pyramid();
                            break;
                        case 13:
                            Sphere();
                            break;
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

        EditText_Input_D.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int KeyCode, KeyEvent keyEvent) {

                if (KeyCode == 67) {
                    double x = EditText_Input_D.getText().toString().length();
                    if (x == 0) {
                        EditText_Output_X.setText("");
                        EditText_Output_Y.setText("");
                        EditText_Output_Z.setText("");
                    }
                }

                try {
                    switch (SHA_SelectedItemID) {
                        case 0:
                            Triangle();
                            break;
                        case 1:
                            Square();
                            break;
                        case 2:
                            Rectangle();
                            break;
                        case 3:
                            Parallelogram();
                            break;
                        case 4:
                            Rhombus();
                            break;
                        case 5:
                            Trapezoid();
                            break;
                        case 6:
                            Circle();
                            break;
                        case 7:
                            Ellipse();
                            break;
                        case 8:
                            Cube();
                            break;
                        case 9:
                            Cuboid();
                            break;
                        case 10:
                            Cylinder();
                            break;
                        case 11:
                            Cone();
                            break;
                        case 12:
                            Pyramid();
                            break;
                        case 13:
                            Sphere();
                            break;
                    }
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });


    }

    private void Triangle() {
        double a = EditText_Input_A.getText().toString().length();
        double b = EditText_Input_B.getText().toString().length();
        double c = EditText_Input_C.getText().toString().length();
        double h = EditText_Input_D.getText().toString().length();
        double P = 0;
        double A = 0;

        if (a != 0 && b != 0 && c != 0 && h != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());
            b = Double.parseDouble(EditText_Input_B.getText().toString());
            c = Double.parseDouble(EditText_Input_C.getText().toString());
            h = Double.parseDouble(EditText_Input_D.getText().toString());

            if (a == b && b == c) {
                TextView_SelectedField.setText(Class_Language_Text.FragmentShape_Item_EquilateralTriangle);
                P = a + b + c;
                EditText_Output_X.setText(P + "");
            } else if (a == b || a == c || b == c) {
                TextView_SelectedField.setText(Class_Language_Text.FragmentShape_Item_IsoscelesTriangle);
                P = a + b + c;
                EditText_Output_X.setText(P + "");
            } else if ((pow(a, 2) == (pow(b, 2) + pow(c, 2)) || (pow(b, 2) == (pow(a, 2) + pow(c, 2))) || (pow(c, 2) == (pow(a, 2) + pow(b, 2))))) {
                TextView_SelectedField.setText(Class_Language_Text.FragmentShape_Item_RightAngleTriangle);
                P = a + b + c;
                EditText_Output_X.setText(P + "");
            } else if ((a < (b + c))) {
                if (b < (a + c)) {
                    if (c < (a + b)) {
                        TextView_SelectedField.setText(Class_Language_Text.FragmentShape_Item_Triangle);
                        P = a + b + c;
                        EditText_Output_X.setText(P + "");
                    } else {
                        TextView_SelectedField.setText(Class_Language_Text.FragmentShape_Item_Triangle);
                        EditText_Output_X.setText("");
                        TextInputLayout_Output_X.setError("c < (a + b)");
                    }
                } else {
                    TextView_SelectedField.setText(Class_Language_Text.FragmentShape_Item_Triangle);
                    EditText_Output_X.setText("");
                    TextInputLayout_Output_X.setError("b < (a + c)");
                }
            } else {
                TextView_SelectedField.setText(Class_Language_Text.FragmentShape_Item_Triangle);
                EditText_Output_X.setText("");
                TextInputLayout_Output_X.setError("a < (b + c)");
            }

            A = (a * h) / 2;
            EditText_Output_Y.setText(A + "");
        }
    }

    private void Square() {
        double a = EditText_Input_A.getText().toString().length();
        double P = 0;
        double A = 0;

        if (a != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());

            P = a * 4;
            A = pow(a, 2);
            EditText_Output_X.setText(P + "");
            EditText_Output_Y.setText(A + "");
        }
    }

    private void Rectangle() {
        double a = EditText_Input_A.getText().toString().length();
        double b = EditText_Input_B.getText().toString().length();
        double P = 0;
        double A = 0;

        if (a != 0 && b != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());
            b = Double.parseDouble(EditText_Input_B.getText().toString());

            P = (a + b) * 2;
            A = a * b;
            EditText_Output_X.setText(P + "");
            EditText_Output_Y.setText(A + "");
        }
    }

    private void Parallelogram() {
        double a = EditText_Input_A.getText().toString().length();
        double b = EditText_Input_B.getText().toString().length();
        double h = EditText_Input_C.getText().toString().length();
        double P = 0;
        double A = 0;

        if (a != 0 && b != 0 && h != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());
            b = Double.parseDouble(EditText_Input_B.getText().toString());
            h = Double.parseDouble(EditText_Input_C.getText().toString());

            P = (a + b) * 2;
            A = a * h;
            EditText_Output_X.setText(P + "");
            EditText_Output_Y.setText(A + "");
        }
    }

    private void Rhombus() {
        double a = EditText_Input_A.getText().toString().length();
        double h1 = EditText_Input_B.getText().toString().length();
        double h2 = EditText_Input_C.getText().toString().length();
        double P = 0;
        double A = 0;

        if (a != 0 && h1 != 0 && h2 != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());
            h1 = Double.parseDouble(EditText_Input_B.getText().toString());
            h2 = Double.parseDouble(EditText_Input_C.getText().toString());

            P = a * 4;
            A = (h1 * h2) / 2;
            EditText_Output_X.setText(P + "");
            EditText_Output_Y.setText(A + "");
        }
    }

    private void Trapezoid() {
        double a = EditText_Input_A.getText().toString().length();
        double b = EditText_Input_B.getText().toString().length();
        double h = EditText_Input_C.getText().toString().length();
        double P = 0;
        double A = 0;

        if (a != 0 && b != 0 && h != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());
            b = Double.parseDouble(EditText_Input_B.getText().toString());
            h = Double.parseDouble(EditText_Input_C.getText().toString());

            P = (sqrt(pow((abs(b - a) / 2), 2) + pow(h, 2)) * 2) + a + b;
            A = ((a + b) * h) / 2;
            EditText_Output_X.setText(P + "");
            EditText_Output_Y.setText(A + "");
        }
    }

    private void Circle() {
        double r = EditText_Input_A.getText().toString().length();
        double P = 0;
        double A = 0;

        if (r != 0) {
            r = Double.parseDouble(EditText_Input_A.getText().toString());

            P = 2 * PI * r;
            A = PI * pow(r, 2);
            EditText_Output_X.setText((r * 2) + "");
            EditText_Output_Y.setText(P + "");
            EditText_Output_Z.setText(A + "");
        }
    }

    private void Ellipse() {
        double a = EditText_Input_A.getText().toString().length();
        double b = EditText_Input_B.getText().toString().length();
        double P = 0;
        double A = 0;

        if (a != 0 && b != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());
            b = Double.parseDouble(EditText_Input_B.getText().toString());

            P = PI * (((double) 3 / (double) 2) * (a + b) - sqrt(a * b));
            A = PI * a * b;
            EditText_Output_X.setText("≈ " + P);
            EditText_Output_Y.setText(A + "");
        }
    }

    private void Cube() {
        double a = EditText_Input_A.getText().toString().length();
        double AL = 0;
        double AT = 0;
        double V = 0;

        if (a != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());

            AL = 4 * pow(a, 2);
            AT = 6 * pow(a, 2);
            V = pow(a, 3);
            EditText_Output_X.setText(AL + "");
            EditText_Output_Y.setText(AT + "");
            EditText_Output_Z.setText(V + "");
        }
    }

    private void Cuboid() {
        double a = EditText_Input_A.getText().toString().length();
        double b = EditText_Input_B.getText().toString().length();
        double c = EditText_Input_C.getText().toString().length();
        double AT = 0;
        double V = 0;

        if (a != 0 && b != 0 && c != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());
            b = Double.parseDouble(EditText_Input_B.getText().toString());
            c = Double.parseDouble(EditText_Input_C.getText().toString());

            AT = (2 * a * b) + (2 * a * c) + (2 * b * c);
            V = a * b * c;
            EditText_Output_X.setText(AT + "");
            EditText_Output_Y.setText(V + "");
        }
    }

    private void Cylinder() {
        double r = EditText_Input_A.getText().toString().length();
        double h = EditText_Input_B.getText().toString().length();
        double AL = 0;
        double AT = 0;
        double V = 0;

        if (r != 0 && h != 0) {
            r = Double.parseDouble(EditText_Input_A.getText().toString());
            h = Double.parseDouble(EditText_Input_B.getText().toString());

            AL = (2 * PI * r) * h;
            AT = AL + (2 * (PI * pow(r, 2)));
            V = (PI * pow(r, 2)) * h;
            EditText_Output_X.setText(AL + "");
            EditText_Output_Y.setText(AT + "");
            EditText_Output_Z.setText(V + "");
        }
    }

    private void Cone() {
        double r = EditText_Input_A.getText().toString().length();
        double h = EditText_Input_B.getText().toString().length();
        double AL = 0;
        double AT = 0;
        double V = 0;

        if (r != 0 && h != 0) {
            r = Double.parseDouble(EditText_Input_A.getText().toString());
            h = Double.parseDouble(EditText_Input_B.getText().toString());

            AT = PI * r * (r + sqrt(pow(r, 2) + pow(h, 2)));
            AL = AT - (PI * pow(r, 2));
            V = ((double) 1 / (double) 3) * PI * pow(r, 2) * h;
            EditText_Output_X.setText(AL + "");
            EditText_Output_Y.setText(AT + "");
            EditText_Output_Z.setText(V + "");
        }
    }

    private void Pyramid() {
        double a = EditText_Input_A.getText().toString().length();
        double h = EditText_Input_B.getText().toString().length();
        double AL = 0;
        double AT = 0;
        double V = 0;

        if (a != 0 && h != 0) {
            a = Double.parseDouble(EditText_Input_A.getText().toString());
            h = Double.parseDouble(EditText_Input_B.getText().toString());

            AL = 2 * a * sqrt(pow(h, 2) + pow(a / 2, 2));
            AT = AL + pow(a, 2);
            V = (pow(a, 2) * h) / 3;
            EditText_Output_X.setText(AL + "");
            EditText_Output_Y.setText(AT + "");
            EditText_Output_Z.setText(V + "");
        }
    }

    private void Sphere() {
        double r = EditText_Input_A.getText().toString().length();
        double AT = 0;
        double V = 0;

        if (r != 0) {
            r = Double.parseDouble(EditText_Input_A.getText().toString());

            AT = 4 * PI * pow(r, 2);
            V = (4 * PI * pow(r, 3)) / 3;
            EditText_Output_X.setText(AT + "");
            EditText_Output_Y.setText(V + "");
        }
    }

}