package com.android.financiapp.ui.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.financiapp.R

class PagesFragment : Fragment() {

    private lateinit var pagesViewModel: PagesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        pagesViewModel =
                ViewModelProvider(this).get(PagesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pages, container, false)
        return root
    }
}