package com.example.learningkt.present.week

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learningkt.databinding.FragmentWeekScheduleBinding

class WeekScheduleFragment : Fragment() {
    private var binding: FragmentWeekScheduleBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeekScheduleBinding.inflate(inflater, container, false)
        return binding?.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = WeekScheduleFragment()
    }
}
