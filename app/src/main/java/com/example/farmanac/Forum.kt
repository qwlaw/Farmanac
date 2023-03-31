package com.example.farmanac

import java.time.LocalDate
import java.time.LocalTime

class Forum(
    var id: Int,
    var profilePic: Int,
    var username: String,
    var title: String,
    var description: String,
    var uploadDate: LocalDate,
    var uploadTime: LocalTime
    )
{
    companion object {
        val forums = ArrayList<Forum>()
    }


}