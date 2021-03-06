package com.ti.sunrain.logic

import android.app.Activity


object ActivitySet {

    private val activities = ArrayList<Activity>()

    fun addActivity(activity: Activity){
        activities.add(activity)
    }

    fun removeActivity(activity: Activity){
        activities.remove(activity)
    }

    fun finishAllActivities(){
        for(a in activities){
            if(!a.isFinishing){
                a.finish()
            }
        }
        activities.clear()
    }

    fun restartAllActivities(){
        for (a in activities){
            a.recreate()
        }
    }
}