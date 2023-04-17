package com.example.farmanac

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.time.LocalDate
import java.time.LocalTime

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuIcon: ImageView = findViewById(R.id.menu_icon)
        val title: TextView = findViewById(R.id.toolbar_title)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_icon -> {
                    switchFragment(HomeFragment())
                    true
                }
                R.id.guide_icon -> {
                    switchFragment(GuideFragment())
                    true
                }
                R.id.forum_icon -> {
                    switchFragment(ForumFragment())
                    true
                }
                else -> {
                    switchFragment(ProfileFragment())
                    true
                }
            }
        }

        switchFragment(HomeFragment())

        menuIcon.setOnClickListener { menuClick("menu icon") }

        title.setOnClickListener { title.swapName() }

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

    private fun makeToast() {
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show()
    }

    private fun menuClick(name: String) {
        Toast.makeText(this, "You clicked the $name", Toast.LENGTH_SHORT).show()
    }

}
