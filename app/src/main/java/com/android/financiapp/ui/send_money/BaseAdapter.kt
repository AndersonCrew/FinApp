package com.android.financiapp.ui.send_money

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.financiapp.R
import com.android.financiapp.ui.saving.SavingAdapter

class BaseAdapter(private val resId: Int, private val count: Int): RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseAdapter.BaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(resId, parent, false)
        return BaseAdapter.BaseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return count
    }

    class BaseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

    }

}