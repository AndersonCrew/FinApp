package com.android.financiapp.ui.my_card

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.android.financiapp.R

class MyCardFragment : Fragment() {

    private lateinit var myCardViewModel: MyCardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        myCardViewModel =
                ViewModelProvider(this).get(MyCardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_mycard, container, false)
        val rvCard: RecyclerView = root.findViewById(R.id.rvCard)
        val csAddCard: ConstraintLayout = root.findViewById(R.id.csAddCard)
        val vGone: View = root.findViewById(R.id.vGone)
        val btnAdd: ImageView = root.findViewById(R.id.btnAdd)
        rvCard.adapter = CardAdapter()

        vGone.setOnClickListener {  csAddCard.visibility = View.GONE }
        btnAdd.setOnClickListener {  csAddCard.visibility = View.VISIBLE }
        return root
    }
}