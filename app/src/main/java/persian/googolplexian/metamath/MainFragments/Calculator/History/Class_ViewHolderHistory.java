package persian.googolplexian.metamath.MainFragments.Calculator.History;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import persian.googolplexian.metamath.R;

public class Class_ViewHolderHistory extends RecyclerView.ViewHolder {

    LinearLayout LinearLayout_ITH;
    TextView TextView_ITH_Operation, TextView_ITH_Result,TextView_ITH_DateTime;
    ImageView ImageView_ITH_Copy, ImageView_ITH_Delete,ImageView_ITH_Notepad;

    public Class_ViewHolderHistory(View itemView) {
        super(itemView);
        LinearLayout_ITH = (LinearLayout) itemView.findViewById(R.id.LinearLayout_ITH);
        TextView_ITH_Operation = (TextView) itemView.findViewById(R.id.TextView_ITH_Operation);
        TextView_ITH_Result = (TextView) itemView.findViewById(R.id.TextView_ITH_Result);
        TextView_ITH_DateTime = (TextView) itemView.findViewById(R.id.TextView_ITH_DateTime);
        ImageView_ITH_Copy = (ImageView) itemView.findViewById(R.id.ImageView_ITH_Copy);
        ImageView_ITH_Delete = (ImageView) itemView.findViewById(R.id.ImageView_ITH_Delete);
        ImageView_ITH_Notepad = (ImageView) itemView.findViewById(R.id.ImageView_ITH_Notepad);
    }

}
