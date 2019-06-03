package com.cootnet.june3project

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

abstract  class BaseActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when (p0.itemId) {
            R.id.first_icon -> {
                startActivity(Intent(this, MainActivity::class.java))
                return true
            }
            R.id.second_icon -> {
                startActivity(Intent(this, Main2Activity::class.java))
                return true
            }
            R.id.third_icon -> {
                startActivity(Intent(this, Main3Activity::class.java))
                return true
            }

        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContenView())

        val btnv = findViewById<BottomNavigationView>(R.id.bottom_navigation)
    
        btnv.setOnNavigationItemSelectedListener(this)

    }

    abstract fun getContenView(): Int

    abstract fun getItemId(): Int
}
