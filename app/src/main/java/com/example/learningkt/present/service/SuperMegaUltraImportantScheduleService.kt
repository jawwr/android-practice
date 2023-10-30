package com.example.learningkt.present.service

import com.example.learningkt.data.Day
import com.example.learningkt.data.DayOfWeek
import com.example.learningkt.data.Lesson
import com.example.learningkt.data.Schedule
import com.example.learningkt.data.Week
import java.util.Calendar
import java.util.Date

object SuperMegaUltraImportantScheduleService {
    private val schedule = Schedule(
        groupName = "ПрИ-302",
        firstWeekSchedule = Week(
            days = listOf(
                Day(
                    DayOfWeek.TUESDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Экономика программной инженерии",
                            teacher = "Ткач",
                            auditorium = "(2к) 221",
                            startTime = Date().apply {
                                hours = 15
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 16
                                minutes = 30
                            }
                        ),
                        Lesson(
                            title = "Базы и хранилища данных",
                            teacher = "Барабанщиков",
                            auditorium = "413",
                            startTime = Date().apply {
                                hours = 18
                                minutes = 20
                            },
                            endTime = Date().apply {
                                hours = 19
                                minutes = 50
                            }
                        ),
                        Lesson(
                            title = "Базы и хранилища данных",
                            teacher = "Барабанщиков",
                            auditorium = "413",
                            startTime = Date().apply {
                                hours = 19
                                minutes = 55
                            },
                            endTime = Date().apply {
                                hours = 21
                                minutes = 25
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.WEDNESDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Управление ИТ-проектами и жизненным циклом ПО",
                            teacher = "xQc",
                            auditorium = "200",
                            startTime = Date().apply {
                                hours = 18
                                minutes = 20
                            },
                            endTime = Date().apply {
                                hours = 19
                                minutes = 50
                            }
                        ),
                        Lesson(
                            title = "Управление ИТ-проектами и жизненным циклом ПО",
                            teacher = "xQc",
                            auditorium = "200",
                            startTime = Date().apply {
                                hours = 19
                                minutes = 55
                            },
                            endTime = Date().apply {
                                hours = 21
                                minutes = 25
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.THURSDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Анализ данных",
                            teacher = "Алюков",
                            auditorium = "A-13",
                            startTime = Date().apply {
                                hours = 16
                                minutes = 40
                            },
                            endTime = Date().apply {
                                hours = 18
                                minutes = 10
                            }
                        ),
                        Lesson(
                            title = "Базы и хранилища данных",
                            teacher = "Барабанщиков",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 18
                                minutes = 20
                            },
                            endTime = Date().apply {
                                hours = 19
                                minutes = 50
                            }
                        ),
                        Lesson(
                            title = "Базы и хранилища данных",
                            teacher = "Барабанщиков",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 19
                                minutes = 55
                            },
                            endTime = Date().apply {
                                hours = 21
                                minutes = 25
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.FRIDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Разработка интернет-приложений",
                            teacher = "Павличенков",
                            auditorium = "Online",
                            startTime = Date().apply {
                                hours = 19
                                minutes = 30
                            },
                            endTime = Date().apply {
                                hours = 20
                                minutes = 30
                            }
                        ),
                        Lesson(
                            title = "Разработка интернет-приложений",
                            teacher = "Павличенков",
                            auditorium = "Online",
                            startTime = Date().apply {
                                hours = 20
                                minutes = 30
                            },
                            endTime = Date().apply {
                                hours = 21
                                minutes = 30
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.SATURDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Технологии прикладного программирования",
                            teacher = "Веригин Н.",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 9
                                minutes = 40
                            },
                            endTime = Date().apply {
                                hours = 11
                                minutes = 10
                            }
                        ),
                        Lesson(
                            title = "Технологии прикладного программирования",
                            teacher = "Веригин Н.",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 11
                                minutes = 20
                            },
                            endTime = Date().apply {
                                hours = 12
                                minutes = 50
                            }
                        ),
                        Lesson(
                            title = "Технологии прикладного программирования",
                            teacher = "Веригин Н.",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 13
                                minutes = 15
                            },
                            endTime = Date().apply {
                                hours = 14
                                minutes = 45
                            }
                        ),
                        Lesson(
                            title = "Технологии прикладного программирования",
                            teacher = "Веригин Н.",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 15
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 16
                                minutes = 30
                            }
                        )
                    )
                )
            )
        ),
        secondWeekSchedule = Week(
            days = listOf(
                Day(
                    DayOfWeek.TUESDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Экономика программной инженерии",
                            teacher = "Ткач",
                            auditorium = "(2к) 304",
                            startTime = Date().apply {
                                hours = 14
                                minutes = 40
                            },
                            endTime = Date().apply {
                                hours = 18
                                minutes = 10
                            }
                        ),
                        Lesson(
                            title = "Экономика программной инженерии",
                            teacher = "Ткач",
                            auditorium = "(2к) 304",
                            startTime = Date().apply {
                                hours = 18
                                minutes = 20
                            },
                            endTime = Date().apply {
                                hours = 19
                                minutes = 50
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.WEDNESDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Управление ИТ-проектами и жизненным циклом ПО",
                            teacher = "xQc",
                            auditorium = "200",
                            startTime = Date().apply {
                                hours = 18
                                minutes = 20
                            },
                            endTime = Date().apply {
                                hours = 19
                                minutes = 50
                            }
                        ),
                        Lesson(
                            title = "Управление ИТ-проектами и жизненным циклом ПО",
                            teacher = "xQc",
                            auditorium = "200",
                            startTime = Date().apply {
                                hours = 19
                                minutes = 55
                            },
                            endTime = Date().apply {
                                hours = 21
                                minutes = 25
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.THURSDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Анализ данных",
                            teacher = "Алюков",
                            auditorium = "132Б",
                            startTime = Date().apply {
                                hours = 16
                                minutes = 40
                            },
                            endTime = Date().apply {
                                hours = 18
                                minutes = 10
                            }
                        ),
                        Lesson(
                            title = "Анализ данных",
                            teacher = "Алюков",
                            auditorium = "132Б",
                            startTime = Date().apply {
                                hours = 18
                                minutes = 20
                            },
                            endTime = Date().apply {
                                hours = 19
                                minutes = 50
                            }
                        ),
                        Lesson(
                            title = "Базы и хранилища данных",
                            teacher = "Барабанщиков",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 19
                                minutes = 55
                            },
                            endTime = Date().apply {
                                hours = 21
                                minutes = 25
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.FRIDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Разработка интернет-приложений",
                            teacher = "Павличенков",
                            auditorium = "Online",
                            startTime = Date().apply {
                                hours = 19
                                minutes = 30
                            },
                            endTime = Date().apply {
                                hours = 20
                                minutes = 30
                            }
                        ),
                        Lesson(
                            title = "Разработка интернет-приложений",
                            teacher = "Павличенков",
                            auditorium = "Online",
                            startTime = Date().apply {
                                hours = 20
                                minutes = 30
                            },
                            endTime = Date().apply {
                                hours = 21
                                minutes = 30
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.SATURDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "Тестирование программного обеспечения",
                            teacher = "Булавин",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 9
                                minutes = 40
                            },
                            endTime = Date().apply {
                                hours = 11
                                minutes = 10
                            }
                        ),
                        Lesson(
                            title = "Тестирование программного обеспечения",
                            teacher = "Булавин",
                            auditorium = "132",
                            startTime = Date().apply {
                                hours = 11
                                minutes = 20
                            },
                            endTime = Date().apply {
                                hours = 12
                                minutes = 50
                            }
                        )
                    )
                )
            )
        )
    )

    fun getWeekByNumber(number: Int): Week {
        if (number != 1 && number != 2) {
            throw RuntimeException("Wrong week number")
        }
        return if (number == 1) {
            schedule.firstWeekSchedule
        } else {
            schedule.secondWeekSchedule
        }
    }

    fun getDayByDayOfWeek(dayOfWeek: DayOfWeek, weekNumber: Int): Day {
        val week = getWeekByNumber(weekNumber)
        return week.days.firstOrNull { it.ofWeek == dayOfWeek }
            ?: throw RuntimeException("Day of week ${dayOfWeek.name} in week number $weekNumber does not exist")
    }

    fun getDayNow(): Day {
        val today = Date().day
        val dayNumber = if (today == 0) 6 else today - 1
        val dayOfWeek = DayOfWeek.getByNumber(dayNumber)
        return runCatching { getDayByDayOfWeek(dayOfWeek, getNowWeekNumber()) }
            .getOrDefault(createEmptyDay(dayOfWeek))
    }

    fun getWeekNow(): Week {
        return if (getNowWeekNumber() == 1) {
            schedule.firstWeekSchedule
        } else {
            schedule.secondWeekSchedule
        }
    }

    fun getNowWeekNumber(): Int {
        val currentDate = Date()
        val calendar = Calendar.getInstance().apply { time = currentDate }
        val currentWeek = calendar.get(Calendar.WEEK_OF_YEAR)

        val firstSeptember = Calendar.getInstance().apply {
            set(Calendar.MONTH, Calendar.SEPTEMBER)
            set(Calendar.DAY_OF_MONTH, 1)
        }
        val startWeek = firstSeptember.get(Calendar.WEEK_OF_YEAR)

        return (currentWeek - startWeek) % 2 + 1
    }

    private fun createEmptyDay(dayOfWeek: DayOfWeek): Day = Day(dayOfWeek, 0, listOf())
}
