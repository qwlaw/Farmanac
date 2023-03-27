package com.example.farmanac

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate
import java.time.LocalTime

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuIcon: ImageView = findViewById(R.id.menu_icon)
        val title: TextView = findViewById(R.id.toolbar_title)

        val homeIcon: ImageView = findViewById(R.id.home_icon)
        val guideIcon: ImageView = findViewById(R.id.guide_icon)
        val forumIcon: ImageView = findViewById(R.id.forum_icon)
        val profileIcon: ImageView = findViewById(R.id.profile_icon)

        switchFragment(HomeFragment())

        menuIcon.setOnClickListener { onClick("menu icon") }

        title.setOnClickListener { title.swapName() }

        homeIcon.setOnClickListener { switchFragment(HomeFragment()) }
        guideIcon.setOnClickListener { switchFragment(GuideFragment()) }
        forumIcon.setOnClickListener { switchFragment(ForumFragment())
        }
        profileIcon.setOnClickListener { switchFragment(ProfileFragment()) }
    }

    private fun switchFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun TextView.swapName() {
        this.text = if (this.text == "Farmanac") "My application" else "Farmanac"
    }

    private fun onClick(name: String) {
        Toast.makeText(this, "You clicked the $name", Toast.LENGTH_SHORT).show()
    }
}
