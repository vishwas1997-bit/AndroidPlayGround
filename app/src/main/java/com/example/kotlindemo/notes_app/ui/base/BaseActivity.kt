package com.example.kotlindemo.notes_app.ui.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel> : AppCompatActivity() {

    lateinit var mViewDataBinding : T
    lateinit var mViewModel: V

    @LayoutRes
    abstract fun getLayoutId() : Int

    abstract fun getBindingVariable() : Int

    fun getViewDataBinding() : T{
        return mViewDataBinding
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        performDataBinding()
    }

    fun performDataBinding() {
        mViewDataBinding = DataBindingUtil.setContentView(this@BaseActivity,getLayoutId())
        mViewDataBinding.setVariable(getBindingVariable(),mViewModel)
        mViewDataBinding.executePendingBindings()
    }
}