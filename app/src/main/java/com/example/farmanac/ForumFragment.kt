package com.example.farmanac

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate
import java.time.LocalTime

class ForumFragment : Fragment() {

/*
    val recyclerview: RecyclerView = findViewById(R.id.forum_recycler_view)

    val forums = ArrayList<Forum>()
    forums.add(Forum("JellyFish", "Cabbage", "Cabbage is a vegetable", LocalDate.of(2023, 3, 26), LocalTime.of(11, 28)))

    recyclerview.layoutManager = LinearLayoutManager(this)
    recyclerview.adapter = ForumAdapter(applicationContext, forums)*/

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_forum, container, false)

        val recyclerview: RecyclerView = view.findViewById(R.id.forum_recycler_view)

        val forums = ArrayList<Forum>()
        forums.add(Forum(1, R.drawable.baseline_account_circle_24, "JellyFish", "Cabbage", "Cabbage is a vegetable", LocalDate.of(2023, 3, 26), LocalTime.of(11, 28)))
        forums.add(Forum(2, R.drawable.baseline_account_circle_24, "LCH", "Carrot", "Carrot is a vegetable", LocalDate.of(2023, 3, 26), LocalTime.of(11, 28)))
        forums.add(Forum(3, R.drawable.baseline_account_circle_24, "LQW", "Potato", "Potato is a vegetable", LocalDate.of(2023, 3, 26), LocalTime.of(11, 28)))
        forums.add(Forum(4, R.drawable.baseline_account_circle_24, "LQT", "Ginger", "Ginger is a vegetable", LocalDate.of(2023, 3, 26), LocalTime.of(11, 28)))
        forums.add(Forum(5, R.drawable.baseline_account_circle_24, "TMF", "Dolphin", "Dolphin is not a vegetable", LocalDate.of(2023, 3, 26), LocalTime.of(11, 28)))

        recyclerview.setHasFixedSize(true)
        recyclerview.layoutManager = LinearLayoutManager(view.context)
        recyclerview.adapter = ForumAdapter(view.context, forums)

        return view
    }

}