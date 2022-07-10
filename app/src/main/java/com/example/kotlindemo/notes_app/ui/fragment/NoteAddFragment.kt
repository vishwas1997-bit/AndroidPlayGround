package com.example.kotlindemo.notes_app.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlindemo.BR
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.FragmentNoteAddBinding
import com.example.kotlindemo.databinding.FragmentNoteListBinding
import com.example.kotlindemo.notes_app.NoteViewModel
import com.example.kotlindemo.notes_app.di.component.FragmentComponent
import com.example.kotlindemo.notes_app.ui.base.BaseFragment


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class NoteAddFragment : BaseFragment<FragmentNoteAddBinding, NoteViewModel>() {

    lateinit var mFragmentNoteListBinding: FragmentNoteAddBinding

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NoteAddFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mFragmentNoteListBinding = getViewDataBinding();
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_note_add
    }

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun performDependencyInjection(buildComponent: FragmentComponent) {
        buildComponent.inject(this)
    }
}