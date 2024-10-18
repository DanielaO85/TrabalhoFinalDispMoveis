package com.example.todo

object AlarmScheduler {

//    fun scheduleAlarm(context: Context, taskId: Long, taskTitle: String, triggerTime: Long) {
//        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
//
//        val intent = Intent(context, TaskAlarmReceiver::class.java).apply {
//            putExtra("TASK_TITLE", taskTitle)
//        }
//
//        val pendingIntent = PendingIntent.getBroadcast(
//            context,
//            taskId.toInt(),
//            intent,
//            PendingIntent.FLAG_UPDATE_CURRENT
//        )
//
//        //alarmManager.setExact(AlarmManager.RTC_WAKEUP, triggerTime, pendingIntent)
//        alarmManager.setRepeating(
//            AlarmManager.RTC_WAKEUP,
//            System.currentTimeMillis() + interval,
//            interval,
//            pendingIntent)
//    }
}