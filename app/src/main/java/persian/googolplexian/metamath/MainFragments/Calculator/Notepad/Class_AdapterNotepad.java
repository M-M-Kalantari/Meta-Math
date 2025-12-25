package persian.googolplexian.metamath.MainFragments.Calculator.Notepad;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;
import persian.googolplexian.metamath.R;

public class Class_AdapterNotepad extends RecyclerView.Adapter<Class_ViewHolderNotepad> {

    LayoutInflater inflater;
    ArrayList<Class_Notepad> list;
    OnItemEventListeners listener;

    public Class_AdapterNotepad(ArrayList<Class_Notepad> templist, LayoutInflater inf, OnItemEventListeners event) {

        this.list = templist;
        this.inflater = inf;
        this.listener = event;

    }

    @Override
    public Class_ViewHolderNotepad onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_notepad, null);
        return new Class_ViewHolderNotepad(v);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(Class_ViewHolderNotepad holder, final int position) {

        holder.TextView_ITN_Title.setText(list.get(position).getTitle());
        holder.TextView_ITN_Number.setText(list.get(position).getNumber());
        holder.TextView_ITN_DateTime.setText(list.get(position).getDateTime());

        holder.ImageView_ITN_Copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnCopyClick(list.get(position), position);
            }
        });

        holder.ImageView_ITN_Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnDeleteItemClick(list.get(position), position);
            }
        });

        holder.ImageView_ITN_Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnEditClick(list.get(position), position);
            }
        });

        holder.TextView_ITN_Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnTransferClick(list.get(position), position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface OnItemEventListeners {
        void OnCopyClick(Class_Notepad item, int pos);
        void OnDeleteItemClick(Class_Notepad item, int pos);
        void OnEditClick(Class_Notepad item, int pos);
        void OnTransferClick(Class_Notepad item, int pos);
    }

}
