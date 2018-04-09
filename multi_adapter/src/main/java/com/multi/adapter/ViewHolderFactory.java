package com.multi.adapter;

import android.view.View;

/**
 * Created by Machenike on 2018/4/4.
 */

public abstract class ViewHolderFactory {
    public abstract BaseRecyclerViewHolder getViewHolder(int viewType, View itemView);
}
