package persian.googolplexian.metamath.MainFragments.Converter.ItemsList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.core.content.res.ResourcesCompat;
import persian.googolplexian.metamath.R;

public class Class_Con_ItemsAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Class_Con_Item> ConverterItems;

    public Class_Con_ItemsAdapter(Context context, ArrayList<Class_Con_Item> converterItems) {
        this.context = context;
        this.ConverterItems = converterItems;
    }

    @Override
    public int getCount() {
        return ConverterItems.size();
    }

    @Override
    public Object getItem(int position) {
        return ConverterItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_converter,viewGroup,false);
        }

        Class_Con_Item currentItem = (Class_Con_Item) getItem(position);
        TextView TextView_ConverterItem = view.findViewById(R.id.TextView_ConverterItem);
        ImageView ImageView_ConverterItem = view.findViewById(R.id.ImageView_ConverterItem);

        TextView_ConverterItem.setText(currentItem.getCON_Item_Title());
        TextView_ConverterItem.setSelected(true);

        String URL = "@drawable/" + currentItem.getCON_Item_Vector();
        int ImageSource = context.getResources().getIdentifier(URL,null,context.getPackageName());
        ImageView_ConverterItem.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),ImageSource,null));

        return view;
    }
}
