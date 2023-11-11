package com.example.kotlindemo.notes_app.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.kotlindemo.App
import com.example.kotlindemo.notes_app.di.component.DaggerFragmentComponent
import com.example.kotlindemo.notes_app.di.component.FragmentComponent
import com.example.kotlindemo.notes_app.di.module.FragmentModule
import javax.inject.Inject

abstract class BaseFragment<B : ViewDataBinding,V : BaseViewModel<*>> : Fragment() {

    private lateinit var mViewDataBinding : B

    @set:Inject
    var mViewModel: V? = null
    lateinit var mRootView : View

    @LayoutRes
    abstract fun getLayoutId() : Int

    abstract fun getBindingVariable() : Int

    fun getViewDataBinding() : B{
        return mViewDataBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection(getBuildComponent())
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mViewDataBinding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        mRootView = mViewDataBinding.root
        return mRootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewDataBinding.setVariable(getBindingVariable(), mViewModel)
        mViewDataBinding.lifecycleOwner = this
        mViewDataBinding.executePendingBindings()
    }

    abstract fun performDependencyInjection(buildComponent : FragmentComponent)

    private fun getBuildComponent() : FragmentComponent{
        return DaggerFragmentComponent
            .builder()
            .appComponent((context!!.applicationContext as App).appComponent)
            .fragmentModule(FragmentModule(this))
            .build()
    }
}