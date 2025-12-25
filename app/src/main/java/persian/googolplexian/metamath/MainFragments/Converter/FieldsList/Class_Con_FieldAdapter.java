package persian.googolplexian.metamath.MainFragments.Converter.FieldsList;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import persian.googolplexian.metamath.R;

public class Class_Con_FieldAdapter extends RecyclerView.Adapter<Class_Con_FieldViewHolder> {

    List<Class_Con_Field> fieldList;
    Context context;
    OnItemEventListeners Converterlistener;
    public static boolean Negative_Converter = false;

    public Class_Con_FieldAdapter(List<Class_Con_Field> fieldList, Context context, Class_Con_FieldAdapter.OnItemEventListeners Converterlistener) {
        this.fieldList = fieldList;
        this.context = context;
        this.Converterlistener = Converterlistener;
    }

    @NonNull
    @Override
    public Class_Con_FieldViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.field_converter, parent, false);
        return new Class_Con_FieldViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Class_Con_FieldViewHolder holder, int position) {

        int FieldID = position;

        holder.TextInputLayout_Field.setHint(Class_Con_FieldData.CON_FieldList.get(FieldID).getCON_Field_Hint());
        holder.EditText_Field.setText(Class_Con_FieldData.CON_FieldList.get(FieldID).getCON_Field_Text());

        holder.EditText_Field.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                int x = holder.EditText_Field.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(holder.EditText_Field.getText().toString());
                    if (y == 0) {
                        if (!Negative_Converter) {
                            holder.EditText_Field.setText("-");
                            holder.EditText_Field.setSelection(holder.EditText_Field.getText().length());
                            Negative_Converter = true;
                        }
                    }
                }
                String z = holder.EditText_Field.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Converter = false;
                }

                holder.ImageView_Field.setVisibility(View.VISIBLE);
                return false;
            }
        });

        holder.ImageView_Field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Converterlistener.OnClickListener(fieldList.get(FieldID), FieldID, holder.EditText_Field.getText().toString());
                holder.ImageView_Field.setVisibility(View.GONE);
//                holder.EditText_Field.setSelection(holder.EditText_Field.getText().length());
//                holder.EditText_Field.setSelected(false);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fieldList.size();
    }

    public interface OnItemEventListeners {
        void OnClickListener(Class_Con_Field item, int pos, String Input);
    }
}