package com.example.kotlindemo.notes_app.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.kotlindemo.BR
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.FragmentNoteListBinding
import com.example.kotlindemo.notes_app.NoteViewModel
import com.example.kotlindemo.notes_app.di.component.FragmentComponent
import com.example.kotlindemo.notes_app.ui.NoteNavigator
import com.example.kotlindemo.notes_app.ui.base.BaseFragment

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class NoteListFragment : BaseFragment<FragmentNoteListBinding,NoteViewModel>(), NoteNavigator {

    lateinit var mFragmentNoteListBinding: FragmentNoteListBinding

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
            NoteListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mFragmentNoteListBinding = getViewDataBinding()
        mViewModel?.setNavigator(this)
        mFragmentNoteListBinding.fabBtn.setOnClickListener {
            mViewModel?.addNote()
        }
    }



    override fun getLayoutId(): Int {
        return R.layout.fragment_note_list
    }

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun performDependencyInjection(buildComponent: FragmentComponent) {
        buildComponent.inject(this)
    }

    override fun openAddNoteFragment() {
        Navigation.findNavController(mFragmentNoteListBinding.root)
            .navigate(R.id.action_noteListFragment_to_noteAddFragment)
    }

    override fun openUpdateNoteFragment() {
        TODO("Not yet implemented")
    }
}