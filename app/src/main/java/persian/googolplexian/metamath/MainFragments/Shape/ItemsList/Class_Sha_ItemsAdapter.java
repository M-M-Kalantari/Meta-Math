package persian.googolplexian.metamath.MainFragments.Shape.ItemsList;

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


public class Class_Sha_ItemsAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Class_Sha_Item> ShapeItems;

    public Class_Sha_ItemsAdapter(Context context, ArrayList<Class_Sha_Item> shapeItems) {
        this.context = context;
        this.ShapeItems = shapeItems;
    }

    @Override
    public int getCount() {
        return ShapeItems.size();
    }

    @Override
    public Object getItem(int position) {
        return ShapeItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_shape,viewGroup,false);
        }

        Class_Sha_Item currentItem = (Class_Sha_Item) getItem(position);
        TextView TextView_ShapeItem = view.findViewById(R.id.TextView_ShapeItem);
        ImageView ImageView_ShapeItem = view.findViewById(R.id.ImageView_ShapeItem);

        TextView_ShapeItem.setText(currentItem.getSHA_Item_Title());
        TextView_ShapeItem.setSelected(true);

        String URL = "@drawable/" + currentItem.getSHA_Item_Vector();
        int ImageSource = context.getResources().getIdentifier(URL,null,context.getPackageName());
        ImageView_ShapeItem.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),ImageSource,null));

        return view;
    }
}
