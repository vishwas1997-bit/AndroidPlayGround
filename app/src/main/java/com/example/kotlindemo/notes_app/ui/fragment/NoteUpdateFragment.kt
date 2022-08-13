package com.example.kotlindemo.notes_app.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.databinding.library.baseAdapters.BR
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.FragmentNoteAddBinding
import com.example.kotlindemo.notes_app.NoteViewModel
import com.example.kotlindemo.notes_app.di.component.FragmentComponent
import com.example.kotlindemo.notes_app.ui.base.BaseFragment

class NoteUpdateFragment : BaseFragment<FragmentNoteAddBinding,NoteViewModel>() {

    lateinit var mFragmentBinding: FragmentNoteAddBinding
    private var title: String? = null
    private var desc: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString("title")
            desc = it.getString(desc)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(title: String, desc: String) =
            NoteUpdateFragment().apply {
                arguments = Bundle().apply {
                    putString("title", title)
                    putString("desc", desc)
                }
            }
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_note_add
    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun performDependencyInjection(buildComponent: FragmentComponent) {
        buildComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mFragmentBinding = getViewDataBinding()
        mFragmentBinding.tvTitle.setText(title)
        mFragmentBinding.tvDescription.setText(desc)
    }

    override fun onStop() {
        super.onStop()
        mViewModel?.updateNote(mFragmentBinding.tvTitle.text.toString(),mFragmentBinding.tvDescription.text.toString())
    }
}