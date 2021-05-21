package com.android.financiapp.ui.transaction

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.android.financiapp.R
import com.android.financiapp.event.Event

class TransactionAdapter: RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    class TransactionViewHolder( itemView: View): RecyclerView.ViewHolder(itemView) {
         var tvTime: TextView?= null
         var csAmazon: ConstraintLayout?= null
         var csApple: ConstraintLayout?= null
         var csAlex: ConstraintLayout?= null
         var csBeatriz: ConstraintLayout?= null

        init {
            tvTime = itemView.findViewById(R.id.tvTitle)
            csAmazon = itemView.findViewById(R.id.csAmazon)
            csApple = itemView.findViewById(R.id.csApple)
            csAlex = itemView.findViewById(R.id.csAlex)
            csBeatriz = itemView.findViewById(R.id.csBeatriz)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_transaction, parent, false)
        return TransactionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        if(position == 0) {
            holder.tvTime?.text = "Today"
        } else {
            holder.tvTime?.text = "Yesterday"
        }

        holder.csAmazon?.setOnClickListener { gotoDetail() }
        holder.csApple?.setOnClickListener { gotoDetail() }
        holder.csAlex?.setOnClickListener { gotoDetail() }
        holder.csBeatriz?.setOnClickListener { gotoDetail() }
    }

    private fun gotoDetail() {
        Event.goToDetailTransaction()
    }
}