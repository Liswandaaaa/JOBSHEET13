package com.example.job13bintang

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class SecondActivity : AppCompatActivity() {
    private lateinit var namaView: TextView
    private lateinit var nisView: TextView
    private lateinit var umurView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        namaView = findViewById(R.id.namaView)
        nisView = findViewById(R.id.nisView)
        umurView = findViewById(R.id.umurView)
        val extras = intent.extras
        namaView.text = extras?.getString("nama")
        nisView.text = extras?.getString("nis")
        umurView.text = extras?.getString("umur")
    }
}