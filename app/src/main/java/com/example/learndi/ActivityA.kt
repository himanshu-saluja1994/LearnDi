package com.example.learndi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class ActivityA : DaggerAppCompatActivity() {

    @Inject
    lateinit var dInstance: ClassD

    @Inject
    lateinit var cInstance: ClassC

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //AndroidInjection.inject(this)
        setContentView(R.layout.activity_activity)
        findViewById<TextView>(R.id.text_view).text = dInstance.hashCode().toString()
        findViewById<TextView>(R.id.text_view_1).text = cInstance.hashCode().toString()
        val fragmentA = FragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.container, fragmentA).commit()

    }
}
