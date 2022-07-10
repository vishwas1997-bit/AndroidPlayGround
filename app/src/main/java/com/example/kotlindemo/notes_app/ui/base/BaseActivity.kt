package com.example.kotlindemo.notes_app.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.kotlindemo.notes_app.App
import com.example.kotlindemo.notes_app.di.component.ActivityComponent
import com.example.kotlindemo.notes_app.di.component.DaggerActivityComponent
import com.example.kotlindemo.notes_app.di.module.ActivityModule

abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel> : AppCompatActivity() {

    lateinit var mViewDataBinding : T
    var mViewModel: V? = null

    @LayoutRes
    abstract fun getLayoutId() : Int

    abstract fun getBindingVariable() : Int

    fun getViewDataBinding() : T{
        return mViewDataBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection(getBuildComponent())
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

    private fun getBuildComponent() : ActivityComponent{
        return DaggerActivityComponent.builder()
            .appComponent((application as App).appComponent)
            .activityModule(ActivityModule(this))
            .build()
    }

    abstract fun performDependencyInjection(buildComponent : ActivityComponent)

    private fun performDataBinding() {
        mViewDataBinding = DataBindingUtil.setContentView(this@BaseActivity,getLayoutId())
        mViewDataBinding.setVariable(getBindingVariable(),mViewModel)
        mViewDataBinding.executePendingBindings()
    }
}