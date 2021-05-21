package com.android.financiapp.ui.my_card

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.android.financiapp.R

class CardAdapter: RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    class CardViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
         var csMain: ConstraintLayout ?= null
        init {
            csMain = view.findViewById(R.id.csMain)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mycard, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        var background = 0
        when(position) {
            0 -> {
                background = R.drawable.card_purple
            }

            1 -> {
                background = R.drawable.card_gray
            }

            2 -> {
                background = R.drawable.card_green
            }

            3 -> {
                background = R.drawable.card_pink
            }

            4 -> {
                background = R.drawable.card_orange
            }

            5 -> {
                background = R.drawable.card_jade_green
            }

            else -> {
                background = R.drawable.card_black
            }
        }

        holder.csMain?.setBackgroundResource(background)
    }
}