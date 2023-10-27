package com.example.learningkt.data

enum class DayOfWeek(val value: String) {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    companion object {
        private val days = DayOfWeek.values()
        fun getByNumber(number: Int): DayOfWeek {
            if (number < 0 || number >= days.size) {
                throw RuntimeException("Wrong day number")
            }
            return days[number]
        }
    }
}