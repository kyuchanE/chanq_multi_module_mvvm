package dev.kyu.ui.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

////////////////////////////// DataBinding //////////////////////////////

val Context.layoutInflater: LayoutInflater get() = LayoutInflater.from(this)

val View.layoutInflater get() = context.layoutInflater
fun <T : ViewDataBinding> View.bind() = DataBindingUtil.bind<T>(this) as T
fun <T : ViewDataBinding> LayoutInflater.bind(layoutId: Int, parent: ViewGroup? = null, attachToParent: Boolean = false): T {
    return DataBindingUtil.inflate(this, layoutId, parent, attachToParent)
}
fun <T : ViewDataBinding> Activity.bind(layoutId: Int): T {
    return DataBindingUtil.setContentView(this, layoutId)
}
fun <T : ViewDataBinding> Activity.bindView(layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false): T {
    return DataBindingUtil.inflate(layoutInflater, layoutId, parent, attachToRoot)
}

fun <T : ViewDataBinding> Fragment.bindView(layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false): T {
    return DataBindingUtil.inflate(layoutInflater, layoutId, parent, attachToRoot)
}


////////////////////////////// View //////////////////////////////

fun View.show(): View {
    visibility = View.VISIBLE
    return this
}

fun View.hide(): View {
    visibility = View.INVISIBLE
    return this
}

fun View.gone(): View {
    visibility = View.GONE
    return this
}

fun View.setShowOrGone(isShow: Boolean): View {
    visibility = if (isShow) {
        View.VISIBLE
    } else {
        View.GONE
    }
    return this
}

inline fun <reified T: Activity> Activity.startActivityWithAnimation(
    intentBuilder: Intent.() -> Intent = { this },
    withFinish: Boolean = true
) {
    startActivity(Intent(this, T::class.java).intentBuilder())
    if (Build.VERSION.SDK_INT >= 34) {
        overrideActivityTransition(
            Activity.OVERRIDE_TRANSITION_OPEN,
            android.R.anim.fade_in,
            android.R.anim.fade_out,
        )
    } else {
        @Suppress("DEPRECATION")
        overridePendingTransition(
            android.R.anim.fade_in,
            android.R.anim.fade_out,
        )
    }
    if (withFinish) finish()
}