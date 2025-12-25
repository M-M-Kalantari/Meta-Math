package persian.googolplexian.metamath.MainFragments.Converter.FieldsList;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

import androidx.recyclerview.widget.RecyclerView;
import persian.googolplexian.metamath.R;

public class Class_Con_FieldViewHolder extends RecyclerView.ViewHolder{

    TextInputLayout TextInputLayout_Field;
    EditText EditText_Field;
    ImageView ImageView_Field;

    public Class_Con_FieldViewHolder(View itemView) {
        super(itemView);
        TextInputLayout_Field = (TextInputLayout) itemView.findViewById(R.id.TextInputLayout_Field);
        EditText_Field = (EditText) itemView.findViewById(R.id.EditText_Field);
        ImageView_Field = (ImageView) itemView.findViewById(R.id.ImageView_Field);
    }

}
