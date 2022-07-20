package com.example.kotlindemo.notes_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo.databinding.NoteItemBinding
import com.example.kotlindemo.notes_app.ui.base.BaseViewHolder

class NoteListAdapter : RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val binding = NoteItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NoteListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    class NoteListViewHolder(val binding: NoteItemBinding) : BaseViewHolder(binding.root){

        override fun onBind(position: Int) {
            binding.tvTitle
            binding.tvDesc
        }

    }
}