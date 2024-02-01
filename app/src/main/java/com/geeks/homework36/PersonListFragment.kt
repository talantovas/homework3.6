package com.geeks.homework36

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.geeks.homework36.databinding.FragmentPersonListBinding

class PersonListFragment : Fragment() {

    private lateinit var binding : FragmentPersonListBinding
    private val personList  = arrayListOf(
        Person("Sezim","Talantova"),
        Person("Erkeaym","Begimbaeva"),
        Person("Medina","Sharsheeva"),
        Person("Ayana","Yrysmendeeva"),
        Person("Jamal","Karypbekova"),
        Person("Jalil","Karypbekov"),
        Person("Aman","Esenov"),
        Person("Esen","Amanov"),
        Person("Tilek","Maksatov"),
        Person("Maksat","Tilekov")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = Adapter(personList)
        binding.rvPersons.adapter = adapter

    }
}

