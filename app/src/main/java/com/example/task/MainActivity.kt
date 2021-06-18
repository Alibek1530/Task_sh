package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigate)
        navController = findNavController(R.id.main_nav_fragment)


        bottomNavigationView.setOnNavigationItemSelectedListener OnNavigationItemSelectedListener@{

            when (it.itemId) {

                R.id.ichome -> {

                    navController.popBackStack()
                    navController.navigate(R.id.homeFragment)
                    navController.popBackStack()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.search -> {

                    navController.popBackStack()
                    navController.navigate(R.id.searchFragment)
                    return@OnNavigationItemSelectedListener true

                }
                R.id.shopping -> {

                    navController.popBackStack()
                    navController.navigate(R.id.shoppingFragment)
                    return@OnNavigationItemSelectedListener true

                }
                R.id.icprofile -> {

                    navController.popBackStack()
                    navController.navigate(R.id.profileFragment)
                    return@OnNavigationItemSelectedListener true

                }
                else -> {
                    return@OnNavigationItemSelectedListener false
                }
            }
        }


    }
}