package com.example.chanq_mulit_module_mvvm.view

import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.chanq_mulit_module_mvvm.R
import com.example.chanq_mulit_module_mvvm.databinding.ActivitySplashBinding
import dev.kyu.ui.BaseActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override val layoutId: Int = R.layout.activity_splash

    override fun initView() {
        Toast.makeText(this, "Splash", Toast.LENGTH_SHORT).show()

        lifecycleScope.launch {
            delay(1000)

        }
    }
}