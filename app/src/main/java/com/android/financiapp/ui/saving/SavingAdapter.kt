package com.android.financiapp.ui.saving

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.financiapp.R

class SavingAdapter: RecyclerView.Adapter<SavingAdapter.SavingViewHolder>() {

    class SavingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private var tvTitle: TextView?= null
        private var tvCategory: TextView?= null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_saving, parent, false)
        return SavingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: SavingViewHolder, position: Int) {

    }
}