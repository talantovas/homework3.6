package com.geeks.homework36


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.geeks.homework36.databinding.ListItemBinding

class Adapter(private val personList : List<Person>): RecyclerView.Adapter<PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent , false))
    }

    override fun getItemCount(): Int = personList.size


    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(personList[position])
    }


}
class PersonViewHolder( val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(person: Person){
            binding.tvFirstName.text = person.firstName
            binding.tvLastName.text = person.lastName
        }
}