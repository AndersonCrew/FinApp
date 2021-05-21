package com.android.financiapp.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.financiapp.R
import com.android.financiapp.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {
    private var binding: ActivityForgotPasswordBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        binding?.imgBack?.setOnClickListener { onBackPressed() }
        setContentView(binding?.root)

    }
}