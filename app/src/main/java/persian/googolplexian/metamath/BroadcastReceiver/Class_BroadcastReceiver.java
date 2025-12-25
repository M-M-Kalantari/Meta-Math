package persian.googolplexian.metamath.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import persian.googolplexian.metamath.MainFragments.Converter.FragmentConverter;
import persian.googolplexian.metamath.MainFragments.MathFormulas.FragmentMathFormulas;
import persian.googolplexian.metamath.MainFragments.NumericBase.FragmentNumericBase;
import persian.googolplexian.metamath.MainFragments.Shape.FragmentShape;
import persian.googolplexian.metamath.Menu.Language.Class_Language_Text;

public class Class_BroadcastReceiver extends BroadcastReceiver {

    public static boolean Lock_App = false;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (CheckNetwork(context)) {
            Toast.makeText(context, Class_Language_Text.Error_4, Toast.LENGTH_SHORT).show();
            Lock_App = false;
            FragmentConverter.Lock_FragmentConverter();
            FragmentMathFormulas.Lock_FragmentMathFormulas();
            FragmentShape.Lock_FragmentShape();
        } else {
            Toast.makeText(context, Class_Language_Text.Error_5, Toast.LENGTH_SHORT).show();
            Lock_App = true;
            FragmentConverter.Lock_FragmentConverter();
            FragmentMathFormulas.Lock_FragmentMathFormulas();
            FragmentShape.Lock_FragmentShape();
        }
    }

    private boolean CheckNetwork(Context mContext) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            return (networkInfo != null && networkInfo.isConnected());
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
}
