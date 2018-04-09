package com.multi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Machenike on 2018/4/4.
 */

public abstract class BaseRecyclerViewHolder<T>
        extends RecyclerView.ViewHolder {

    public BaseRecyclerViewHolder(View itemView) {
        super(itemView);
        findView(itemView);
    }
    public abstract void findView(View itemView);
    public abstract void setViewData(T model);
}
