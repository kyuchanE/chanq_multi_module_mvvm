package dev.kyu.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import dev.kyu.ui.utils.bind

abstract class BaseActivity<B: ViewDataBinding>: AppCompatActivity() {

    /**
     * view data binding
     */
    protected lateinit var binding: B
        private set

    /**
     * data binding layoutId
     */
    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = bind(layoutId)
        binding.lifecycleOwner = this
        initView()
    }

    abstract fun initView()
}