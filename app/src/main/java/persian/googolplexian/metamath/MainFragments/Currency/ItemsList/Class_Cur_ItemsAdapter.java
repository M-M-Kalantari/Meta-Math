package persian.googolplexian.metamath.MainFragments.Currency.ItemsList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.core.content.res.ResourcesCompat;
import persian.googolplexian.metamath.MainFragments.Converter.ItemsList.Class_Con_Item;
import persian.googolplexian.metamath.R;


public class Class_Cur_ItemsAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Class_Cur_Item> CurrencyItems;

    public Class_Cur_ItemsAdapter(Context context, ArrayList<Class_Cur_Item> currencyItems) {
        this.context = context;
        this.CurrencyItems = currencyItems;
    }

    @Override
    public int getCount() {
        return CurrencyItems.size();
    }

    @Override
    public Object getItem(int position) {
        return CurrencyItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_currency,viewGroup,false);
        }

        Class_Cur_Item currentItem = (Class_Cur_Item) getItem(position);
        TextView TextView_CurrencyItem = view.findViewById(R.id.TextView_CurrencyItem);
        ImageView ImageView_CurrencyItem = view.findViewById(R.id.ImageView_CurrencyItem);

        TextView_CurrencyItem.setText(currentItem.getCUR_Item_Title());
        TextView_CurrencyItem.setSelected(true);

        String URL = "@drawable/" + currentItem.getCUR_Item_Vector();
        int ImageSource = context.getResources().getIdentifier(URL,null,context.getPackageName());
        ImageView_CurrencyItem.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),ImageSource,null));

        return view;
    }
}
