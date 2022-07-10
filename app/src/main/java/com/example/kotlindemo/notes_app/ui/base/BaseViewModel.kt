package com.example.kotlindemo.notes_app.ui.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference

abstract class BaseViewModel<N> : ViewModel() {

    private lateinit var compositeDisposable : CompositeDisposable
    private lateinit var mNavigator : WeakReference<N>



    override fun onCleared() {
//        compositeDisposable.clear()
        super.onCleared()
    }

    fun getNavigator() : N? {
        return mNavigator.get()
    }

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }
}