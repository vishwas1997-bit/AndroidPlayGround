package com.example.kotlindemo.notes_app

import androidx.core.util.Supplier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelProviderFactory<T : ViewModel>(viewModelClass: Class<T>?, viewModelSupplier: Supplier<T>?) : ViewModelProvider.NewInstanceFactory() {

    private var viewModelClass: Class<T>? = null
    private var viewModelSupplier: Supplier<T>? = null

//    fun ViewModelProviderFactory() {
//        this.viewModelClass = viewModelClass
//        this.viewModelSupplier = viewModelSupplier
//    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(viewModelClass!!)) {
            viewModelSupplier!!.get() as T
        } else {
            throw IllegalArgumentException("Unknown Class name " + viewModelClass!!.name)
        }
    }
}