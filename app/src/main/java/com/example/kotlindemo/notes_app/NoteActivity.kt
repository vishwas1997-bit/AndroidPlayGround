package com.example.kotlindemo.notes_app

import android.os.Bundle
import android.view.MenuItem
import com.example.kotlindemo.BR
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.ActivityNoteBinding
import com.example.kotlindemo.notes_app.di.component.ActivityComponent
import com.example.kotlindemo.notes_app.ui.base.BaseActivity

class NoteActivity : BaseActivity<ActivityNoteBinding,NoteViewModel>() {

    private lateinit var mActivityNoteBinding: ActivityNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityNoteBinding = getViewDataBinding()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Notes"
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_note
    }

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun performDependencyInjection(buildComponent: ActivityComponent) {
        buildComponent.inject(this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}