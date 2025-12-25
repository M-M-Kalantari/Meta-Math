package persian.googolplexian.metamath.MainFragments.MathFormulas.AverageList;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import persian.googolplexian.metamath.R;

public class Class_Maf_AverageAdapter extends RecyclerView.Adapter<Class_Maf_AverageViewHolder>{

    List<Class_Maf_Average> fieldList;
    Context context;
    OnItemEventListeners AverageListeners;
    public static boolean Negative_Average = false;

    public Class_Maf_AverageAdapter(List<Class_Maf_Average> fieldList, Context context, OnItemEventListeners averageListeners) {
        this.fieldList = fieldList;
        this.context = context;
        this.AverageListeners = averageListeners;
    }

    @NonNull
    @Override
    public Class_Maf_AverageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_average, parent, false);
        return new Class_Maf_AverageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Class_Maf_AverageViewHolder holder, int position) {
        int ID = position;

        holder.EditText_Average.setText(Class_Maf_AverageData.MAF_AverageList.get(ID).getMAF_Average_Number() + "");

        holder.EditText_Average.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                int x = holder.EditText_Average.getText().length();
                double y = 0;
                if (x == 2 && keyCode != 67) {
                    y = Double.parseDouble(holder.EditText_Average.getText().toString());
                    if (y == 0) {
                        if (!Negative_Average) {
                            holder.EditText_Average.setText("-");
                            holder.EditText_Average.setSelection(holder.EditText_Average.getText().length());
                            Negative_Average = true;
                        }
                    }
                }
                String z = holder.EditText_Average.getText().toString();
                if (z.indexOf("-") == -1) {
                    Negative_Average = false;
                }

                holder.ImageView_Average_Check.setVisibility(View.VISIBLE);
                return false;
            }
        });

        holder.ImageView_Average_Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AverageListeners.OnClickListener(fieldList.get(ID), ID, holder.EditText_Average.getText().toString());
                holder.ImageView_Average_Check.setVisibility(View.GONE);
            }
        });

        holder.ImageView_Average_Trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AverageListeners.OnDeleteListener(fieldList.get(ID), ID, holder.EditText_Average.getText().toString());
            }
        });
    }

    @Override
    public int getItemCount() {
        return fieldList.size();
    }

    public interface OnItemEventListeners {
        void OnClickListener(Class_Maf_Average item, int pos, String Input);
        void OnDeleteListener(Class_Maf_Average item, int pos, String Input);
    }
}
