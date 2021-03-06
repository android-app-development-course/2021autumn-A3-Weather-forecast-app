package com.ti.sunrain.logic.dao

import java.text.SimpleDateFormat
import java.util.*


object WeatherDao {

    /**
     * Realtime UNIX changed into Time
     */
    fun changeUNIXIntoString(unixTime:Long):String{
        val utcTime = SimpleDateFormat("HH:mm",Locale.getDefault())
        utcTime.timeZone = TimeZone.getTimeZone("GMT+8:00")
        return utcTime.format(unixTime*1000)
    }
}