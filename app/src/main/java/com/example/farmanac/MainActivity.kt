package com.example.farmanac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leftIcon: ImageView = findViewById(R.id.left_icon)
        val title: TextView = findViewById(R.id.toolbar_title)
        val homeIcon: ImageView = findViewById(R.id.home_icon)
        val guideIcon: ImageView = findViewById(R.id.guide_icon)
        val forumIcon: ImageView = findViewById(R.id.forum_icon)
        val profileIcon: ImageView = findViewById(R.id.profile_icon)

        leftIcon.setOnClickListener { onClick("left icon") }

        title.setOnClickListener { title.swapName() }

        homeIcon.setOnClickListener { switchFragment(HomeFragment()) }
        guideIcon.setOnClickListener { switchFragment(GuideFragment()) }
        forumIcon.setOnClickListener { switchFragment(ForumFragment()) }
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
