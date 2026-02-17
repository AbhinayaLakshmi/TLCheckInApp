package com.example.tlcheckinapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkincoming: Button = findViewById(R.id.checkin)
        val checkoutgoing: Button = findViewById(R.id.checkout)
        val text: TextView = findViewById(R.id.text)

        var res = 0

        checkincoming.setOnClickListener {
            res++
            text.text = res.toString()
        }

        checkoutgoing.setOnClickListener {
            if (res > 0) {
                res--
                text.text = res.toString()
            }
        }
    }
}
