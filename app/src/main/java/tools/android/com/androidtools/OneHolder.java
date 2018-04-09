package tools.android.com.androidtools;

import android.view.View;
import android.widget.TextView;
import com.multi.adapter.BaseRecyclerViewHolder;

/**
 * Created by Machenike on 2018/4/4.
 */

public class OneHolder extends BaseRecyclerViewHolder<StudentInfo> {
    public TextView textView;

    public OneHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void findView(View itemView) {
        textView = itemView.findViewById(R.id.text);
    }

    @Override
    public void setViewData(StudentInfo model) {
        textView.setText(model.getName() + "类型一  " + getAdapterPosition());
    }
}
