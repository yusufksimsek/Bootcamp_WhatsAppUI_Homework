package com.example.bootcamp_whatsappui_homework.model.repository

import com.example.bootcamp_whatsappui_homework.R
import com.example.bootcamp_whatsappui_homework.model.entity.Contact

fun GetContacts(): List<Contact> {
    return listOf(
        Contact("James Harris", "Let's reschedule our call.", "12:30 PM", R.drawable.person_3),
        Contact("Mary Harris", "Can you send the report?", "1:00 PM", R.drawable.person_2),
        Contact("Doctor Wilson", "Happy birthday!", "1:50 PM", R.drawable.person_9),
        Contact("Alice Johnson", "Got your message!", "2:15 PM", R.drawable.person_5),
        Contact("Olivia Clark", "I'll call you later.", "2:50 PM", R.drawable.person_un),
        Contact("John Doe", "Hey, what's up?", "Yesterday", R.drawable.person_4),
        Contact("Michael Brown", "Let's catch up soon!", "Yesterday", R.drawable.person_6),
        Contact("Emily Davis", "Are you free tomorrow?", "Yesterday", R.drawable.person_1),
        Contact("Sophia Lee", "Have a great day!", "Yesterday", R.drawable.person_8),
        Contact("Keanu Smith", "See you later!", "12/22/24", R.drawable.person_7),
        Contact("Daniel Walker", "What time is the meeting?", "11/22/24", R.drawable.person_un)
    )
}