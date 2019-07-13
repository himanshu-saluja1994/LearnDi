package com.example.learndi

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity

import kotlinx.android.synthetic.main.activity_b.*
import javax.inject.Inject

class ActivityB : DaggerAppCompatActivity() {

    @Inject
    lateinit var dInstance: ClassD

    @Inject
    lateinit var cInstance: ClassC

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //AndroidInjection.inject(this)
        setContentView(R.layout.activity_b)
        findViewById<TextView>(R.id.text_view).text = dInstance.hashCode().toString()
        findViewById<TextView>(R.id.text_view_1).text = cInstance.hashCode().toString()
        val fragmentB = FragmentB()
        supportFragmentManager.beginTransaction().replace(R.id.container, fragmentB).commit()

    }

}
