package persian.googolplexian.metamath.MainFragments.Converter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryAdListener;
import com.adivery.sdk.AdiveryBannerAdView;

import net.yslibrary.android.keyboardvisibilityevent.util.UIUtil;

import java.util.ArrayList;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import persian.googolplexian.metamath.BroadcastReceiver.Class_BroadcastReceiver;
import persian.googolplexian.metamath.MainActivity;
import persian.googolplexian.metamath.MainFragments.Converter.FieldsList.Class_Con_Field;
import persian.googolplexian.metamath.MainFragments.Converter.FieldsList.Class_Con_FieldAdapter;
import persian.googolplexian.metamath.MainFragments.Converter.FieldsList.Class_Con_FieldData;
import persian.googolplexian.metamath.MainFragments.Converter.ItemsList.Class_Con_Item;
import persian.googolplexian.metamath.MainFragments.Converter.ItemsList.Class_Con_ItemsAdapter;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;
import persian.googolplexian.metamath.R;

import static persian.googolplexian.metamath.MainActivity.Fragment_BackPressed;

public class FragmentConverter extends Fragment {

    RelativeLayout RelativeLayout_Converter;

    ///// Lock /////
    public static RelativeLayout RelativeLayout_Lock_FragmentConverter;
    ImageView ImageView_Lock;
    TextView TextView_Lock;
    ////////////////

    public static ListView ListView_ConverterItems;
    ArrayList<Class_Con_Item> arrayListItems;
    Class_Con_ItemsAdapter itemsAdapter;

    public static RelativeLayout RelativeLayout_ConverterFields;
    LinearLayout LinearLayout_SelectedField;
    ImageView ImageView_SelectedField;
    TextView TextView_SelectedField;
    ImageView ImageView_Clean, ImageView_Back, ImageView_Share;
    RecyclerView RecyclerView_ConverterFields;
    Class_Con_FieldAdapter fieldsAdapter;

    public static int CON_SelectedItemID = 0;
    public static int CON_SelectedFieldID = 0;
    public static String CON_InputText = "";
    public static double CON_InputNumber = 0;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public FragmentConverter() {

    }

    public static FragmentConverter newInstance(String param1, String param2) {
        FragmentConverter fragment = new FragmentConverter();
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
        View view = inflater.inflate(R.layout.fragment_converter, container, false);

        Find_Views(view);
        Load_Language();
        Lock_FragmentConverter();
        InApp_ads(view);
        Build_ItemList();
        Build_Events();

        return view;
    }

    private void Find_Views(View view) {
        RelativeLayout_Converter = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Converter);

        /*/*/ ///// Lock /////
        RelativeLayout_Lock_FragmentConverter = (RelativeLayout) view.findViewById(R.id.RelativeLayout_Lock_FragmentConverter);
        ImageView_Lock = (ImageView) view.findViewById(R.id.ImageView_Lock);
        TextView_Lock = (TextView) view.findViewById(R.id.TextView_Lock);
        ////////////////

        ListView_ConverterItems = (ListView) view.findViewById(R.id.ListView_Items);

        RelativeLayout_ConverterFields = (RelativeLayout) view.findViewById(R.id.RelativeLayout_ConverterFields);
        LinearLayout_SelectedField = (LinearLayout) view.findViewById(R.id.LinearLayout_SelectedField);
        ImageView_SelectedField = (ImageView) view.findViewById(R.id.ImageView_SelectedField);
        TextView_SelectedField = (TextView) view.findViewById(R.id.TextView_SelectedField);
        TextView_SelectedField.setSelected(true);
        RecyclerView_ConverterFields = (RecyclerView) view.findViewById(R.id.RecyclerView_ConverterFields);

        ImageView_Clean = (ImageView) view.findViewById(R.id.ImageView_Clean);
        ImageView_Back = (ImageView) view.findViewById(R.id.ImageView_Back);
        ImageView_Share = (ImageView) view.findViewById(R.id.ImageView_Share);

    }

    private void Load_Language() {
        TextView_Lock.setText(Class_Language_Text.Error_0);
    }

    public static void Lock_FragmentConverter() {
        try {
            if (Class_BroadcastReceiver.Lock_App) {
                RelativeLayout_Lock_FragmentConverter.setVisibility(View.VISIBLE);
            } else {
                RelativeLayout_Lock_FragmentConverter.setVisibility(View.GONE);
            }
        } catch (Exception e) {

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
        itemsAdapter = new Class_Con_ItemsAdapter(getActivity(), arrayListItems);

        arrayListItems.add(new Class_Con_Item(0, Class_Language_Text.FragmentConverter_Item_UnitsPrefix, "ic_con_units"));
        arrayListItems.add(new Class_Con_Item(1, Class_Language_Text.FragmentConverter_Item_Length, "ic_con_length"));
        arrayListItems.add(new Class_Con_Item(2, Class_Language_Text.FragmentConverter_Item_Area, "ic_con_area"));
        arrayListItems.add(new Class_Con_Item(3, Class_Language_Text.FragmentConverter_Item_Volume, "ic_con_volume"));
        arrayListItems.add(new Class_Con_Item(4, Class_Language_Text.FragmentConverter_Item_Weight, "ic_con_weight"));
        arrayListItems.add(new Class_Con_Item(5, Class_Language_Text.FragmentConverter_Item_Time, "ic_con_clock"));
        arrayListItems.add(new Class_Con_Item(6, Class_Language_Text.FragmentConverter_Item_Temperature, "ic_con_temperature"));
        arrayListItems.add(new Class_Con_Item(7, Class_Language_Text.FragmentConverter_Item_Power, "ic_con_power"));
        arrayListItems.add(new Class_Con_Item(8, Class_Language_Text.FragmentConverter_Item_Energy, "ic_con_energy"));
        arrayListItems.add(new Class_Con_Item(9, Class_Language_Text.FragmentConverter_Item_Fuel, "ic_con_fuel"));
        arrayListItems.add(new Class_Con_Item(10, Class_Language_Text.FragmentConverter_Item_Pressure, "ic_con_pressure"));
        arrayListItems.add(new Class_Con_Item(11, Class_Language_Text.FragmentConverter_Item_Data, "ic_con_data"));
        arrayListItems.add(new Class_Con_Item(12, Class_Language_Text.FragmentConverter_Item_Speed, "ic_con_speed"));
        arrayListItems.add(new Class_Con_Item(13, Class_Language_Text.FragmentConverter_Item_Sound, "ic_con_sound"));
        arrayListItems.add(new Class_Con_Item(14, Class_Language_Text.FragmentConverter_Item_Frequency, "ic_con_frequency"));
        arrayListItems.add(new Class_Con_Item(15, Class_Language_Text.FragmentConverter_Item_Density, "ic_con_density"));
        arrayListItems.add(new Class_Con_Item(16, Class_Language_Text.FragmentConverter_Item_Angle, "ic_con_angle"));
//        arrayListItems.add(new Class_Con_Item(17, Class_Language_Text.FragmentConverter_Item_ShoesSize, "ic_con_shoes"));

        ListView_ConverterItems.setAdapter(itemsAdapter);

        ListView_ConverterItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!Class_BroadcastReceiver.Lock_App) {
                    MainActivity.MainAds_Index++;
                    MainActivity.MainAds();

                    ListView_ConverterItems.setVisibility(View.GONE);
                    RelativeLayout_ConverterFields.setVisibility(View.VISIBLE);
                    TextView_SelectedField.setText(arrayListItems.get(position).getCON_Item_Title());
                    String URL = "@drawable/" + arrayListItems.get(position).getCON_Item_Vector();
                    int ImageSource = getContext().getResources().getIdentifier(URL, null, getContext().getPackageName());
                    ImageView_SelectedField.setImageDrawable(ResourcesCompat.getDrawable(getContext().getResources(), ImageSource, null));
                    CON_SelectedItemID = arrayListItems.get(position).getCON_Item_ID();
                    Build_FieldList(arrayListItems.get(position).getCON_Item_ID());
                    Fragment_BackPressed = true;
                }
            }
        });
    }

    private void Build_FieldList(int ItemID) {

        Class_Con_FieldData.CON_FieldList.clear();
        switch (ItemID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Yotta (Y) - 10²⁴"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Zetta (Z) - 10²¹"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Exa (E) - 10¹⁸"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Peta (P) - 10¹⁵"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Tera (T) - 10¹²"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Giga (G) - 10⁹"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Mega (M) - 10⁶"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Kilo (k) - 10³"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(8, "", "Hecto (h) - 10²"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(9, "", "Deca (da) - 10¹"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(10, "", "10⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(11, "", "Deci (d) - 10⁻¹"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(12, "", "Centi (c) - 10⁻²"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(13, "", "Milli (m) - 10⁻³"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(14, "", "Micro (μ) - 10⁻⁶"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(15, "", "Nano (n) - 10⁻⁹"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(16, "", "Pico (p) - 10⁻¹²"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(17, "", "Femto (f) - 10⁻¹⁵"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(18, "", "Atto (a) - 10⁻¹⁸"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(19, "", "Zepto (z) - 10⁻²¹"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(20, "", "Yocto (y) - 10⁻²⁴"));
                Class_Con_FieldData.CON_Field_LastID = 20;
                break;


            case 1:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Nanometers (nm)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Micrometer (μm)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Millimeter (mm)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Centimeter (cm)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Meter (m)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Kilometer (km)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Inch (in)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Foot (ft)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(8, "", "Yard (yd)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(9, "", "Mile (mi)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(10, "", "Angstrom (A)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(11, "", "Light Year (ly)"));
                Class_Con_FieldData.CON_Field_LastID = 11;
                break;


            case 2:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Millimeter² (mm²)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Centimeter² (cm²)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Meter² (m²)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Kilometer² (km²)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Inch² (in²)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Foot² (ft²)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Yard² (yd²)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Mile² (mi²)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(8, "", "Hectare (ha)"));
                Class_Con_FieldData.CON_Field_LastID = 8;
                break;


            case 3:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Liter"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Deciliter"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Milliliter = Centimeter³ (cm³)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Meter³ (m³)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Inch³ (in³)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Foot³ (ft³)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Yard³ (yd³)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Gallon US"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(8, "", "Gallon UK"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(9, "", "Cup US"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(10, "", "Cup UK"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(11, "", "Cup EU"));
                Class_Con_FieldData.CON_Field_LastID = 11;
                break;


            case 4:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Milligram (mg)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Gram (g)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Kilogram (kg)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Ton (t)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Pound (lbs)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Ounce (oz)"));
                Class_Con_FieldData.CON_Field_LastID = 5;
                break;


            case 5:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Microseconds"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "MilliSeconds"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Seconds"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Minutes"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Hours"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Days"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Weeks"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Months"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(8, "", "Years"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(9, "", "Decades"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(10, "", "Centuries"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(11, "", "Millenniums"));
                Class_Con_FieldData.CON_Field_LastID = 11;
                break;


            case 6:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Celsius (θ)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Fahrenheit (F)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Kelvin (K)"));
                Class_Con_FieldData.CON_Field_LastID = 2;
                break;


            case 7:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Megawatt (MW)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Kilowatt (kW)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Watt (W)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Horse Power Mechanic (hp)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Horse Power Metric (hp)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Horse Power Electric (hp)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Pound-foot/hour (lbf.ft/h)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Erg/second (erg/s)"));
                Class_Con_FieldData.CON_Field_LastID = 7;
                break;


            case 8:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Megajoule (MJ)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Kilojoule (kJ)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Joule (J)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Kilowatt-hour (kWh)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Watt-hour (Wh)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Food Calorie (kcal - Cal)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Calorie (cal)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Pound-force foot (lbf.ft)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(8, "", "Erg (erg)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(9, "", "Electron Volts (eV)"));
                Class_Con_FieldData.CON_Field_LastID = 9;
                break;


            case 9:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Litres / 100km"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Kilometers / Litre"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Miles / Litre"));
                Class_Con_FieldData.CON_Field_LastID = 2;
                break;


            case 10:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Kilopascal (kPa)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Pascal (Pa)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Bar"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Atmosphere (atm)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Pounds / inch² (psi)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Millimeter mercury (mmHg) = Torr"));
                Class_Con_FieldData.CON_Field_LastID = 5;
                break;


            case 11:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Bit"));

                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Kilobit (kb) - 10³"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Megabit (Mb) - 10⁶"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Gigabit (Gb) - 10⁹"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Terabit (Tb) - 10¹²"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Petabit (Pb) - 10¹⁵"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Exabit (Eb) - 10¹⁸"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Zettabit (Zb) - 10²¹"));

                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(8, "", "Kibibit (kib) - 2¹⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(9, "", "Mebibit (Mib) - 2²⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(10, "", "Gibibit (Gib) - 2³⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(11, "", "Tebibit (Tib) - 2⁴⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(12, "", "Pebibit (Pib) - 2⁵⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(13, "", "Exbibit (Eib) - 2⁶⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(14, "", "Zebibit (Zib) - 2⁷⁰"));


                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(15, "", "Byte"));

                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(16, "", "Kilobyte (kB) - 10³"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(17, "", "Megabyte (MB) - 10⁶"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(18, "", "Gigabyte (GB) - 10⁹"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(19, "", "Terabyte (TB) - 10¹²"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(20, "", "Petabyte (PB) - 10¹⁵"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(21, "", "Exabyte (EB) - 10¹⁸"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(22, "", "Zettabyte (ZB) - 10²¹"));

                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(23, "", "Kibibyte (kiB) - 2¹⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(24, "", "Mebibyte (MiB) - 2²⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(25, "", "Gibibyte (GiB) - 2³⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(26, "", "Tebibyte (TiB) - 2⁴⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(27, "", "Pebibyte (PiB) - 2⁵⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(28, "", "Exbibyte (EiB) - 2⁶⁰"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(29, "", "Zebibyte (ZiB) - 2⁷⁰"));

                Class_Con_FieldData.CON_Field_LastID = 29;
                break;


            case 12:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Meters / Second (m/s)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Kilometers / hour (km/h)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Miles / hour (mi/h)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Knot (kt)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Mach (M)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Speed of Light"));
                Class_Con_FieldData.CON_Field_LastID = 5;
                break;


            case 13:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Bel (B)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Decibel (dB)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Neper (Np)"));
                Class_Con_FieldData.CON_Field_LastID = 2;
                break;


            case 14:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Gigahertz (GHz)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Megahertz (MHz)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Kilohertz (kHz)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Hertz (Hz = RPS)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Revolutions / minute (RPM)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(5, "", "Degrees / minute (°/min)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(6, "", "Degrees / second (°/s)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(7, "", "Radians / minute (rad/min)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(8, "", "Radians / second (rad/s)"));
                Class_Con_FieldData.CON_Field_LastID = 9;
                break;


            case 15:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Kilogram / meter³ (kg/m³)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Kilogram / liter (kg/L)"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Gram / milliliter (g/mL = g/cm³)"));
                Class_Con_FieldData.CON_Field_LastID = 2;
                break;


            case 16:
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(0, "", "Radians"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(1, "", "Degrees"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(2, "", "Gradians"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(3, "", "Minutes"));
                Class_Con_FieldData.CON_FieldList.add(new Class_Con_Field(4, "", "Seconds"));
                Class_Con_FieldData.CON_Field_LastID = 4;
                break;
        }
        MainActivity.External_Snackbars(5);

        fieldsAdapter = new Class_Con_FieldAdapter(Class_Con_FieldData.CON_FieldList, getContext(), new Class_Con_FieldAdapter.OnItemEventListeners() {
            @Override
            public void OnClickListener(Class_Con_Field item, int pos, String Input) {
                CON_SelectedFieldID = Class_Con_FieldData.CON_FieldList.get(pos).getCON_Field_ID();
                try {
                    if (Input.length() != 0) {
                        CON_InputNumber = Double.parseDouble(Input);
                        switch (CON_SelectedItemID) {
                            case 0:
                                Class_Con_Calculation.Calculation_UnitsPrefix(CON_InputNumber);
                                break;

                            case 1:
                                Class_Con_Calculation.Calculation_Length(CON_InputNumber);
                                break;

                            case 2:
                                Class_Con_Calculation.Calculation_Area(CON_InputNumber);
                                break;

                            case 3:
                                Class_Con_Calculation.Calculation_Volume(CON_InputNumber);
                                break;

                            case 4:
                                Class_Con_Calculation.Calculation_Weight(CON_InputNumber);
                                break;

                            case 5:
                                Class_Con_Calculation.Calculation_Time(CON_InputNumber);
                                break;

                            case 6:
                                Class_Con_Calculation.Calculation_Temperature(CON_InputNumber);
                                break;

                            case 7:
                                Class_Con_Calculation.Calculation_Power(CON_InputNumber);
                                break;

                            case 8:
                                Class_Con_Calculation.Calculation_Energy(CON_InputNumber);
                                break;

                            case 9:
                                Class_Con_Calculation.Calculation_Fuel(CON_InputNumber);
                                break;

                            case 10:
                                Class_Con_Calculation.Calculation_Pressure(CON_InputNumber);
                                break;

                            case 11:
                                Class_Con_Calculation.Calculation_Data(CON_InputNumber);
                                break;

                            case 12:
                                Class_Con_Calculation.Calculation_Speed(CON_InputNumber);
                                break;

                            case 13:
                                Class_Con_Calculation.Calculation_Sound(CON_InputNumber);
                                break;

                            case 14:
                                Class_Con_Calculation.Calculation_Frequency(CON_InputNumber);
                                break;

                            case 15:
                                Class_Con_Calculation.Calculation_Density(CON_InputNumber);
                                break;

                            case 16:
                                Class_Con_Calculation.Calculation_Angle(CON_InputNumber);
                                break;
                        }
                    }
                    UIUtil.hideKeyboard(getActivity());
                } catch (Exception e) {
                    Toast.makeText(getActivity(), Class_Language_Text.Error_1, Toast.LENGTH_SHORT).show();
                }
                fieldsAdapter.notifyDataSetChanged();
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        RecyclerView_ConverterFields.setLayoutManager(layoutManager);
        RecyclerView_ConverterFields.setAdapter(fieldsAdapter);
        fieldsAdapter.notifyDataSetChanged();
    }

    private void Build_Events() {

        ImageView_Clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Class_Con_FieldData.CON_FieldList.clear();
                Build_FieldList(CON_SelectedItemID);
            }
        });

        ImageView_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListView_ConverterItems.setVisibility(View.VISIBLE);
                RelativeLayout_ConverterFields.setVisibility(View.GONE);
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
                        ShareText += arrayListItems.get(CON_SelectedItemID).getCON_Item_Title() + ":" + "\n" + "\n";

                        for (int i = 0; i <= Class_Con_FieldData.CON_Field_LastID; i++) {
                            ShareText += (i + 1) + "- " + Class_Con_FieldData.CON_FieldList.get(i).getCON_Field_Hint() + ": \t" + Class_Con_FieldData.CON_FieldList.get(i).getCON_Field_Text() + "\n" + "\n";
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

}
