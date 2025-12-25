package persian.googolplexian.metamath.MainFragments.Calculator.History;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;
import persian.googolplexian.metamath.R;

public class Class_AdapterHistory extends RecyclerView.Adapter<Class_ViewHolderHistory> {

    LayoutInflater inflater;
    ArrayList<Class_History> list;
    OnItemEventListeners listener;

    public Class_AdapterHistory(ArrayList<Class_History> templist, LayoutInflater inf, OnItemEventListeners event) {

        this.list = templist;
        this.inflater = inf;
        this.listener = event;

    }

    @Override
    public Class_ViewHolderHistory onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_history, null);
        return new Class_ViewHolderHistory(v);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(Class_ViewHolderHistory holder, final int position) {

        holder.TextView_ITH_Operation.setText(list.get(position).getText());
        holder.TextView_ITH_Result.setText(list.get(position).getResult());
        holder.TextView_ITH_DateTime.setText(list.get(position).getDateTime());

        holder.ImageView_ITH_Copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnCopyClick(list.get(position), position);
            }
        });

        holder.ImageView_ITH_Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnDeleteItemClick(list.get(position), position);
            }
        });

        holder.ImageView_ITH_Notepad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnNotepadClick(list.get(position), position);
            }
        });

        holder.TextView_ITH_Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnTransferClick(list.get(position), position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface OnItemEventListeners {
        void OnCopyClick(Class_History item, int pos);
        void OnDeleteItemClick(Class_History item, int pos);
        void OnNotepadClick(Class_History item, int pos);
        void OnTransferClick(Class_History item, int pos);
    }

}
