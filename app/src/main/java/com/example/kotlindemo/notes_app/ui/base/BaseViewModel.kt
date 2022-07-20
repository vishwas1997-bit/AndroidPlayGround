package com.example.kotlindemo.notes_app.ui.base

import androidx.lifecycle.ViewModel
import com.example.kotlindemo.Utils.rxJava.SchedulerProvider
import com.example.kotlindemo.notes_app.data.DataManger
import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference

abstract class BaseViewModel<N>(
    private val dataManger: DataManger,
    private val schedulerProvider: SchedulerProvider) : ViewModel() {

    private var compositeDisposable: CompositeDisposable = CompositeDisposable()
    private lateinit var mNavigator: WeakReference<N>

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

    fun getNavigator(): N? {
        return mNavigator.get()
    }

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }

    open fun getCompositeDisposable(): CompositeDisposable? {
        return compositeDisposable
    }

    fun getDataManager(): DataManger? {
        return dataManger
    }

    @JvmName("getSchedulerProvider1")
    fun getSchedulerProvider(): SchedulerProvider? {
        return schedulerProvider
    }
}