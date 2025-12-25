package persian.googolplexian.metamath.MainFragments.Calculator.Notepad;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import persian.googolplexian.metamath.R;

public class Class_ViewHolderNotepad extends RecyclerView.ViewHolder {

    LinearLayout LinearLayout_ITN;
    TextView TextView_ITN_Title, TextView_ITN_Number, TextView_ITN_DateTime;
    ImageView ImageView_ITN_Copy, ImageView_ITN_Delete,ImageView_ITN_Edit;

    public Class_ViewHolderNotepad(View itemView) {
        super(itemView);
        LinearLayout_ITN = (LinearLayout) itemView.findViewById(R.id.LinearLayout_ITN);
        TextView_ITN_Title = (TextView) itemView.findViewById(R.id.TextView_ITN_Title);
        TextView_ITN_Number = (TextView) itemView.findViewById(R.id.TextView_ITN_Number);
        TextView_ITN_DateTime = (TextView) itemView.findViewById(R.id.TextView_ITN_DateTime);
        ImageView_ITN_Copy = (ImageView) itemView.findViewById(R.id.ImageView_ITN_Copy);
        ImageView_ITN_Delete = (ImageView) itemView.findViewById(R.id.ImageView_ITN_Delete);
        ImageView_ITN_Edit = (ImageView) itemView.findViewById(R.id.ImageView_ITN_Edit);
    }

}
