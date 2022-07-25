package com.example.kotlindemo.notes_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo.databinding.NoteItemBinding
import com.example.kotlindemo.notes_app.data.model.NoteEntity
import com.example.kotlindemo.notes_app.ui.base.BaseViewHolder

class NoteListAdapter(private var mNoteList : List<NoteEntity> = ArrayList()) : RecyclerView.Adapter<BaseViewHolder>() {

//
//    init {
//        mNoteList = ArrayList()
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val binding = NoteItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NoteListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int {
        return mNoteList.size
    }

    fun addItems(noteData: List<NoteEntity>) {
        mNoteList = noteData
        notifyDataSetChanged()
    }

    inner class NoteListViewHolder(val binding: NoteItemBinding) : BaseViewHolder(binding.root){

        override fun onBind(position: Int) {
            val mNoteEntity = mNoteList[position]
            binding.tvTitle.text = mNoteEntity.title
            binding.tvDesc.text = mNoteEntity.description
        }

    }
}