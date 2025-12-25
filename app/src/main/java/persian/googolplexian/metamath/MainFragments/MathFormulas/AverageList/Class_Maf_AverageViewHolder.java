package persian.googolplexian.metamath.MainFragments.MathFormulas.AverageList;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;
import persian.googolplexian.metamath.R;

public class Class_Maf_AverageViewHolder extends RecyclerView.ViewHolder {

    EditText EditText_Average;
    ImageView ImageView_Average_Trash, ImageView_Average_Check;

    public Class_Maf_AverageViewHolder(View itemView) {
        super(itemView);

        EditText_Average = (EditText) itemView.findViewById(R.id.EditText_Average);
        ImageView_Average_Trash = (ImageView) itemView.findViewById(R.id.ImageView_Average_Trash);
        ImageView_Average_Check = (ImageView) itemView.findViewById(R.id.ImageView_Average_Check);
    }
}
