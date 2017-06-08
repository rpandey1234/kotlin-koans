package iii_conventions

import iii_conventions.TimeInterval.*
import java.util.*

fun MyDate.nextDay() = addTimeIntervals(DAY, 1)

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    when (timeInterval) {
        TimeInterval.DAY -> c.add(Calendar.DAY_OF_MONTH, number)
        TimeInterval.WEEK -> c.add(Calendar.WEEK_OF_MONTH, number)
        TimeInterval.YEAR -> c.add(Calendar.YEAR, number)
    }
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))

//    c.set(year + if (timeInterval == YEAR) number else 0, month, dayOfMonth)
//    var timeInMillis = c.timeInMillis
//    val millisecondsInADay = 24 * 60 * 60 * 1000L
//    timeInMillis += number * when (timeInterval) {
//        DAY -> millisecondsInADay
//        WEEK -> 7 * millisecondsInADay
//        YEAR -> 0L
//    }
//    val result = Calendar.getInstance()
//    result.timeInMillis = timeInMillis
//    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}