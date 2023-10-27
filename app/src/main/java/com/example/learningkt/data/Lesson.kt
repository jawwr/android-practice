package com.example.learningkt.data

import java.util.Date

data class Lesson(
    val title: String,
    val teacher: String,
    val auditorium: String,
    val startTime: Date,
    val endTime: Date
)
