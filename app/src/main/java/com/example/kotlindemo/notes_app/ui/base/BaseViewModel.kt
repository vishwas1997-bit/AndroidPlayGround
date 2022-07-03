package com.example.kotlindemo.notes_app.ui.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {

    lateinit var compositeDisposable : CompositeDisposable


    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

}