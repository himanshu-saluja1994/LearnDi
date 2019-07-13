package com.example.learndi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class ActivityC : DaggerAppCompatActivity() {

    @Inject
    lateinit var component: TestSubComponent.Builder


    lateinit var testSubComponent: TestSubComponent



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val x = ClassX();
        testSubComponent = component.classX(x).classC(ClassC()).build()
        setContentView(R.layout.activity_c)

        findViewById<TextView>(R.id.text_view).text = x.hashCode().toString()
        findViewById<TextView>(R.id.text_view_1).text = testSubComponent.helperClass().x.hashCode().toString()
//        val fragment = FragmentC()
//        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }
}
