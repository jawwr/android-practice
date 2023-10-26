package com.example.learningkt.present.day

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.learningkt.databinding.ChatItemPersonBinding
import com.example.learningkt.data.PersonData

class PersonsAdapter : RecyclerView.Adapter<PersonsAdapter.PersonViewHolder>() {
    private val list = mutableListOf<PersonData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChatItemPersonBinding.inflate(inflater, parent, false)
        return PersonViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<PersonData>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class PersonViewHolder(
        private val binding: ChatItemPersonBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: PersonData) = with(binding) {
            personName?.text = data.name
            messageTextView?.text = data.message
            personAvatar.load(data.avatar)
            messageCounter?.text = "1"
            messageTimeView?.text = "12:56"
        }
    }
}
