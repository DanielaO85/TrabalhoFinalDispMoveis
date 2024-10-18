package com.example.todo

import android.content.ContentResolver
import android.database.Cursor
import android.provider.ContactsContract

class ContactsUtils {

    fun getContacts(contentResolver: ContentResolver): List<String> {
        val contacts = mutableListOf<String>()
        val cursor: Cursor? = contentResolver.query(
            ContactsContract.CommonDataKinds.Email.CONTENT_URI,
            null, null, null, null
        )

        cursor?.use {
            while (it.moveToNext()) {
                val email = it.getString(it.getColumnIndex(ContactsContract.CommonDataKinds.Email.DATA))
                contacts.add(email)
            }
        }
        return contacts
    }

}