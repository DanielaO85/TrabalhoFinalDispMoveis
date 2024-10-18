package com.example.todo

import android.content.ContentValues
import android.content.Context
import android.provider.CalendarContract

class CalendarUtils {

    fun addEventToCalendar(context: Context, title: String, description: String, beginTime: Long, endTime: Long) {
        val values = ContentValues().apply {
            put(CalendarContract.Events.DTSTART, beginTime)
            put(CalendarContract.Events.DTEND, endTime)
            put(CalendarContract.Events.TITLE, title)
            put(CalendarContract.Events.DESCRIPTION, description)
            put(CalendarContract.Events.CALENDAR_ID, 1) // ID do calendário
            put(CalendarContract.Events.EVENT_TIMEZONE, "UTC")
        }

        val uri = context.contentResolver.insert(CalendarContract.Events.CONTENT_URI, values)
    }

    fun addAttendeesToEvent(context: Context, eventId: Long, email: String) {
        val values = ContentValues().apply {
            put(CalendarContract.Attendees.ATTENDEE_EMAIL, email)
            put(CalendarContract.Attendees.EVENT_ID, eventId)
        }

        context.contentResolver.insert(CalendarContract.Attendees.CONTENT_URI, values)
    }


}