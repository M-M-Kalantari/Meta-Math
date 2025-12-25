package persian.googolplexian.metamath.MainFragments.MathFormulas.ItemsList;

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
import persian.googolplexian.metamath.MainFragments.MathFormulas.FragmentMathFormulas;
import persian.googolplexian.metamath.R;

public class Class_Maf_ItemsAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Class_Maf_Item> MathFormulasItems;

    public Class_Maf_ItemsAdapter(Context context, ArrayList<Class_Maf_Item> mathFormulasItems) {
        this.context = context;
        this.MathFormulasItems = mathFormulasItems;
    }

    @Override
    public int getCount() {
        return MathFormulasItems.size();
    }

    @Override
    public Object getItem(int position) {
        return MathFormulasItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_math_formulas,viewGroup,false);
        }

        Class_Maf_Item currentItem = (Class_Maf_Item) getItem(position);
        TextView TextView_MathFormulasItem = view.findViewById(R.id.TextView_MathFormulasItem);
        ImageView ImageView_MathFormulasItem = view.findViewById(R.id.ImageView_MathFormulasItem);

        TextView_MathFormulasItem.setText(currentItem.getMAF_Item_Title());
        TextView_MathFormulasItem.setSelected(true);

        String URL = "@drawable/" + currentItem.getMAF_Item_Vector();
        int ImageSource = context.getResources().getIdentifier(URL,null,context.getPackageName());
        ImageView_MathFormulasItem.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),ImageSource,null));

        return view;
    }
}
