package com.gdg.devfest_18kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var list = ArrayList<String>()
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add("Kotlin")
        list.add("Flutter")
        list.add("Github")
        list.add("Google")
        list.add("JetBrain")

        findViewById<TextView>(R.id.text).setText(list[count % list.size]);
    }

    fun toast(view : View) {
        val myToast = Toast.makeText(this, list.get(count % list.size), Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun change(view : View) {
        count ++
        findViewById<TextView>(R.id.text).setText(list[count % list.size]);

    }
}