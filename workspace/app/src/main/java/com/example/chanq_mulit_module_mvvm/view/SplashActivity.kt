package com.example.chanq_mulit_module_mvvm.view

import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.chanq_mulit_module_mvvm.R
import com.example.chanq_mulit_module_mvvm.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint
import dev.kyu.navigator.MainNavigator
import dev.kyu.ui.BaseActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override val layoutId: Int = R.layout.activity_splash

    @Inject
    lateinit var mainNavigator: MainNavigator

    override fun initView() {
        Toast.makeText(this, "Splash", Toast.LENGTH_SHORT).show()

        lifecycleScope.launch {
            delay(1000)

            mainNavigator.navigateFrom(
                activity = this@SplashActivity,
                intentBuilder = {
                    putExtra("test", "TEST")
                },
                withFinish = true,
            )
        }
    }
}