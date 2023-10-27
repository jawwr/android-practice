package com.example.learningkt.present.service

import com.example.learningkt.data.Day
import com.example.learningkt.data.DayOfWeek
import com.example.learningkt.data.Lesson
import com.example.learningkt.data.Schedule
import com.example.learningkt.data.Week
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
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.WEDNESDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.THURSDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.FRIDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.SATURDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
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
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.WEDNESDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.THURSDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.FRIDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "some lesson 123",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 234",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 345",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 15
                                minutes = 0
                            }
                        )
                    )
                ),
                Day(
                    DayOfWeek.SATURDAY,
                    1,
                    listOf(
                        Lesson(
                            title = "some lesson 1",
                            teacher = "something person",
                            auditorium = "auditorium 1",
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
                            title = "some lesson 2",
                            teacher = "something person",
                            auditorium = "auditorium 2",
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
                            title = "some lesson 3",
                            teacher = "something person",
                            auditorium = "auditorium 3",
                            startTime = Date().apply {
                                hours = 10
                                minutes = 0
                            },
                            endTime = Date().apply {
                                hours = 22
                                minutes = 0
                            }
                        )
                    )
                )
            )
        )
    )

    fun getSchedule() = schedule

    fun getDayByNumber(number: Int, weekNumber: Int): Day {
        val week = getWeekByNumber(weekNumber)
        if (number < 0 || number >= week.days.size) {
            throw RuntimeException("Wrong day number")
        }
        return week.days[number]
    }

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

    fun getDayByDayOfWeek(dayOfWeek: DayOfWeek): Day {
        return getDayByDayOfWeek(dayOfWeek, getNowWeekNumber())
    }

    fun getDayNow(): Day {
        return getDayByDayOfWeek(DayOfWeek.getByNumber(Date().day - 1), getNowWeekNumber())
    }

    fun getWeekNow(): Week {
        return if (getNowWeekNumber() == 0) {
            schedule.firstWeekSchedule
        } else {
            schedule.secondWeekSchedule
        }
    }

    fun getNowWeekNumber(): Int {
        val diff = Date().time - Date().apply {
            month = 9
            date = 1
        }.time
        return (((diff / (1000 * 60 * 60 * 24)) / 7) % 2).toInt() + 1
    }
}
