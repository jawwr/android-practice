package com.example.learningkt.present.day

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learningkt.databinding.FragmentDayScheduleBinding
import com.example.learningkt.present.service.SuperMegaUltraImportantScheduleService

class DayScheduleFragment : Fragment() {
    private var binding: FragmentDayScheduleBinding? = null
    private var adapter: DayAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = DayAdapter(true)

        val daySchedule = SuperMegaUltraImportantScheduleService.getDayNow()

        binding?.dayLessonRecycler?.adapter = adapter
        binding?.dayTitle?.text = daySchedule.ofWeek.value

        adapter?.submitList(daySchedule.lessons)
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
