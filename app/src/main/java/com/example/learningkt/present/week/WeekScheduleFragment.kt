package com.example.learningkt.present.week

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learningkt.databinding.FragmentWeekScheduleBinding
import com.example.learningkt.present.day.WeekAdapter
import com.example.learningkt.present.service.SuperMegaUltraImportantScheduleService

class WeekScheduleFragment : Fragment() {
    private var binding: FragmentWeekScheduleBinding? = null
    private var adapter: WeekAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = WeekAdapter()

        val weekSchedule = SuperMegaUltraImportantScheduleService.getWeekNow()

        binding?.weekLessonRecycler?.adapter = adapter

        adapter?.submitWeek(weekSchedule)
    }

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
