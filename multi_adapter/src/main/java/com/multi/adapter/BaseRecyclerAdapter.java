package com.multi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Machenike on 2018/4/4.
 */

public  class BaseRecyclerAdapter
        extends RecyclerView.Adapter<BaseRecyclerViewHolder> {
    private List<BaseType> dataList;
    private ViewHolderFactory viewHolderFactory;
    private Context context;
    public BaseRecyclerAdapter(Context context, List<BaseType> dataList) {
        this.dataList = dataList;
        this.context=context;
    }

    public void createViewHolderFactory(ViewHolderFactory viewHolderFactory){
        this.viewHolderFactory=viewHolderFactory;
    }
    @Override
    public int getItemViewType(int position) {
        return dataList.get(position).getType();
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context)
                .inflate(viewType, parent, false);
        BaseRecyclerViewHolder baseRecyclerViewHolder=viewHolderFactory.getViewHolder(viewType,itemView);

        Log.e("lzf_adapter",viewType+" "+baseRecyclerViewHolder.getAdapterPosition()+"  "+baseRecyclerViewHolder);
        return baseRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(BaseRecyclerViewHolder holder, int position) {
        Log.e("lzf_holder",holder.toString());
        holder.setViewData(dataList.get(position).getBean());
    }

    @Override
    public int getItemCount() {
        return dataList==null?0:dataList.size();
    }
}
