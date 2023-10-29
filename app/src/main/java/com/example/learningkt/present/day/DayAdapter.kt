package com.example.learningkt.present.day

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learningkt.R
import com.example.learningkt.data.Lesson
import com.example.learningkt.databinding.ScheduleItemLessonBinding
import java.util.Date

class DayAdapter(
    private val isShowLessonNow: Boolean = false
) : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {
    private val lessons = mutableListOf<Lesson>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayAdapter.DayViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ScheduleItemLessonBinding.inflate(inflater, parent, false)
        return when (viewType) {
            DAY_VIEW_TYPE -> DayViewHolderImpl(binding)
            DAY_WITH_HIGHLIGHT_VIEW_TYPE -> DayWithHighlightViewHolder(binding)
            else -> throw NotImplementedError()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (isShowLessonNow) {
            DAY_WITH_HIGHLIGHT_VIEW_TYPE
        } else {
            DAY_VIEW_TYPE
        }
    }

    override fun getItemCount(): Int = lessons.size

    override fun onBindViewHolder(holder: DayAdapter.DayViewHolder, position: Int) {
        holder.bind(lessons[position])
    }

    fun submitList(list: List<Lesson>) {
        this.lessons.addAll(list)
        notifyDataSetChanged()
    }

    abstract inner class DayViewHolder(
        protected val binding: ScheduleItemLessonBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        abstract fun bind(data: Lesson)
    }

    inner class DayViewHolderImpl(
        binding: ScheduleItemLessonBinding
    ) : DayViewHolder(binding) {
        override fun bind(data: Lesson) = with(binding) {
            lessonStartTime.text = "${data.startTime.hours}:${data.startTime.minutes}"
            lessonEndTime.text = "${data.endTime.hours}:${data.endTime.minutes}"
            lessonAuditorium.text = "Аудитория: ${data.auditorium}"
            lessonName.text = data.title
            lessonTeacher.text = "Преподаватель: ${data.teacher}"
        }
    }

    inner class DayWithHighlightViewHolder(
        binding: ScheduleItemLessonBinding
    ) : DayViewHolder(binding) {
        override fun bind(data: Lesson) = with(binding) {
            val now = Date()
            if (now.before(data.endTime) && now.after(data.startTime)) {
                itemView.setBackgroundResource(R.drawable.rounded_highlight_lesson_card)
            }
            lessonStartTime.text = "${data.startTime.hours}:${data.startTime.minutes}"
            lessonEndTime.text = "${data.endTime.hours}:${data.endTime.minutes}"
            lessonAuditorium.text = "Аудитория: ${data.auditorium}"
            lessonName.text = data.title
            lessonTeacher.text = "Преподаватель: ${data.teacher}"
        }
    }

    companion object {
        private const val DAY_WITH_HIGHLIGHT_VIEW_TYPE = 1
        private const val DAY_VIEW_TYPE = 2
    }
}