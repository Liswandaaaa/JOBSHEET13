package com.example.job13bintang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    private lateinit var namaEdit: EditText
    private lateinit var nisEdit: EditText
    private lateinit var umurEdit: EditText
    private lateinit var submitBtn: Button
    private val NAME_KEY: String = "nama"
    private val NIS_KEY: String = "nis"
    private val AGE_KEY: String = "umur"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        namaEdit = findViewById(R.id.namaEdit)
        nisEdit = findViewById(R.id.nisEdit)
        umurEdit = findViewById(R.id.umurEdit)
        submitBtn = findViewById(R.id.submitBtn)
        submitBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(NIS_KEY, nisEdit.text.toString())
            intent.putExtra(AGE_KEY, umurEdit.text.toString())
            startActivity(intent)
        }
    }
}
