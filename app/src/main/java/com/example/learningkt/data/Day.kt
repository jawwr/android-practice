package com.example.learningkt.data

data class Day(
    val ofWeek: DayOfWeek,
    val startWith: Int,
    val lessons: List<Lesson>
)
