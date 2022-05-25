package dev.rehema.bookphoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            intent= Intent(this,BookPhoto1Activity::class.java)
            startActivity(intent)
        }
    }
}