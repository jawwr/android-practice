package com.example.learningkt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learningkt.databinding.FragmentRootBinding
import com.example.learningkt.present.day.DayScheduleFragment
import com.example.learningkt.present.week.WeekScheduleFragment

class RootFragment : Fragment() {
    private var binding: FragmentRootBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRootBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.bottomNavigationView?.setOnItemSelectedListener {
            selectTab(it.itemId)
            true
        }

        selectTab(R.id.navigation_week_schedule)
    }

    private fun selectTab(itemId: Int) {
        val navHost = binding?.bottomNavHost?.id ?: return
        val transaction = childFragmentManager.beginTransaction()
        when (itemId) {
            R.id.navigation_week_schedule -> transaction.replace(
                navHost,
                WeekScheduleFragment.newInstance()
            )

            R.id.navigation_day_schedule -> transaction.replace(
                navHost,
                DayScheduleFragment.newInstance()
            )
        }
        transaction.commit()
    }

    companion object {
        @JvmStatic
        fun newInstance() = RootFragment()
    }
}
