package com.example.learningkt.present.day

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learningkt.data.DayOfWeek
import com.example.learningkt.data.Lesson
import com.example.learningkt.databinding.ScheduleItemLessonBinding
import com.example.learningkt.present.service.SuperMegaUltraImportantScheduleService
import java.util.Date

class DayAdapter : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {
    private val lessons = mutableListOf<Lesson>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ScheduleItemLessonBinding.inflate(inflater, parent, false)
        return DayViewHolder(binding)
    }

    override fun getItemCount(): Int = lessons.size


    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        holder.bind(lessons[position])
    }

    fun submitList(list: List<Lesson>) {
        this.lessons.addAll(list)
        notifyDataSetChanged()
    }

    class DayViewHolder(
        private val binding: ScheduleItemLessonBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Lesson) = with(binding) {
            val now = Date()
            if (now.before(data.endTime) && now.after(data.startTime)) {
                itemView.setBackgroundColor(Color.DKGRAY)
            }
            lessonStartTime.text = "${data.startTime.hours}:${data.startTime.minutes}"
            lessonEndTime.text = "${data.endTime.hours}:${data.endTime.minutes}"
            lessonAuditorium.text = "Аудитория: ${data.auditorium}"
            lessonName.text = data.title
            lessonTeacher.text = "Преподаватель: ${data.teacher}"
        }
    }
}