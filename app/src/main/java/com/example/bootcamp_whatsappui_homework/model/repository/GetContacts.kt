package com.example.bootcamp_whatsappui_homework.model.repository

import com.example.bootcamp_whatsappui_homework.R
import com.example.bootcamp_whatsappui_homework.model.entity.Contact

fun GetContacts(): List<Contact> {
    return listOf(
        Contact("James Harris", "Let's reschedule our call.", "12:30 PM", R.drawable.person_3),
        Contact("Keanu Smith", "See you later!", "1:00 PM", R.drawable.person_7),
        Contact("Alice Johnson", "Got your message!", "2:15 PM", R.drawable.person_5),
        Contact("John Doe", "Hey, what's up?", "3:00 PM", R.drawable.person_4),
        Contact("Michael Brown", "Let's catch up soon!", "4:45 PM", R.drawable.person_6),
        Contact("Olivia Clark", "I'll call you later.", "5:00 PM", R.drawable.person_un),
        Contact("Emily Davis", "Are you free tomorrow?", "5:30 PM", R.drawable.person_1),
        Contact("Doctor Wilson", "Happy birthday!", "Yesterday", R.drawable.person_9),
        Contact("Sophia Lee", "Have a great day!", "Yesterday", R.drawable.person_8),
        Contact("Mary Harris", "Can you send the report?", "12/22/24", R.drawable.person_2),
        Contact("Daniel Walker", "What time is the meeting?", "11/22/24", R.drawable.person_un)
    )
}