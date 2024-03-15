package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentsapp.fragments.CategoryFragment
import com.example.fragmentsapp.fragments.ThirdFragment
import com.example.fragmentsapp.fragments.FourthFragment
import com.example.fragmentsapp.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavbar : BottomNavigationView
    private var  MainActivityTag = "MENU_ITEM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavbar = findViewById(R.id.bottom_nav_menu)
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,homeFragment).commit()

        bottomNavbar.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home_menu -> {
                    Log.i(MainActivityTag,"Home Seleccionado")
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment).commit()
                }
                R.id.category_menu -> {
                    Log.i(MainActivityTag,"Category Seleccionado")
                    val categoryFragment = CategoryFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,categoryFragment).commit()
                }
                R.id.third_menu -> {
                    Log.i(MainActivityTag,"Editar Seleccionado")
                    val thirdFragment = ThirdFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,thirdFragment).commit()
                }
                R.id.fourth_menu -> {
                    Log.i(MainActivityTag,"Vista Seleccionado")
                    val fourthFragment = FourthFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fourthFragment).commit()
                }
            }
            true
        }
    }
}