package com.example.learningkt.present.day

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learningkt.databinding.FragmentDayScheduleBinding
import com.example.learningkt.data.PersonData

class DayScheduleFragment : Fragment() {
    private var binding: FragmentDayScheduleBinding? = null
    private val persons = mutableListOf<PersonData>()
    private var adapter: PersonsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        for (i in 0..10) {
            persons.add(
                PersonData(
                    "https://thispersondoesnotexist.com/",
                    "Person $i",
                    "Message $i"
                )
            )
        }
        adapter = PersonsAdapter()
        binding?.myRecycler?.adapter = adapter

        adapter?.submitList(persons)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDayScheduleBinding.inflate(inflater, container, false)
        return binding?.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = DayScheduleFragment()
    }
}
