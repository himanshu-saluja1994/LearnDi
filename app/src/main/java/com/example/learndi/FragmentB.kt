package com.example.learndi

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import dagger.android.DaggerFragment
import javax.inject.Inject


class FragmentB : dagger.android.support.DaggerFragment() {

    @Inject
    lateinit var dInstance: ClassD

    @Inject
    lateinit var cInstance: ClassC

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view?.findViewById<TextView>(R.id.text_view_1)?.text = dInstance.hashCode().toString()
        view?.findViewById<TextView>(R.id.text_view_2)?.text = cInstance.hashCode().toString()
    }

}