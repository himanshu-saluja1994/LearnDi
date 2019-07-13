package com.example.learndi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_a).setOnClickListener {
            val i = Intent(this@MainActivity, ActivityA::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.button_b).setOnClickListener {
            val i = Intent(this@MainActivity, ActivityB::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.button_c).setOnClickListener {
            val i = Intent(this@MainActivity, ActivityC::class.java)
            startActivity(i)
        }
    }
}
