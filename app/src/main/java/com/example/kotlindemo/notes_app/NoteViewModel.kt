package com.example.kotlindemo.notes_app

import android.text.TextUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlindemo.notes_app.data.DataManger
import com.example.kotlindemo.notes_app.data.model.NoteEntity
import com.example.kotlindemo.notes_app.ui.NoteNavigator
import com.example.kotlindemo.notes_app.ui.base.BaseViewModel
import com.example.kotlindemo.utils.rxJava.SchedulerProvider

class NoteViewModel(dataManger: DataManger, schedulerProvider: SchedulerProvider) :
    BaseViewModel<NoteNavigator>(dataManger, schedulerProvider) {

    var noteListLiveData: MutableLiveData<List<NoteEntity>> = MutableLiveData()

    init {
        getNoteData()
    }

    fun onAddNoteClick() {
        getNavigator()?.openAddNoteFragment()
    }

    //    getCompositeDisposable()?.add(
//    getDataManager()?.insertNote(noteEntity)
//    .subscribeOn(getSchedulerProvider().io())
//    .observeOn(getSchedulerProvider().ui())
//    .subscribe { it ->
//        if (it) {
//            return@subscribe
//        }
//    }!!
//    )
    fun addNote(title: String, desc: String) {
        if (!TextUtils.isEmpty(title) || !TextUtils.isEmpty(desc)) {
            val noteEntity = NoteEntity(0, title, desc)
            getCompositeDisposable().add(
                getDataManager().insertNote(noteEntity)
                    .subscribeOn(getSchedulerProvider().io())
                    .observeOn(getSchedulerProvider().ui())
                    .subscribe()!!
            )
        }
    }

    private fun getNoteData() {
        getCompositeDisposable().add(getDataManager()
            .getNoteList()
            .subscribeOn(getSchedulerProvider().io())
            .observeOn(getSchedulerProvider().ui())
            .subscribe { noteListLiveData.value = it }
        )
    }

    fun getNoteLiveData(): LiveData<List<NoteEntity>> {
        return noteListLiveData
    }
}