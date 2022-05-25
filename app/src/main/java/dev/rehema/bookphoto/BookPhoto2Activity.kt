package dev.rehema.bookphoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookPhoto2Activity : AppCompatActivity() {
    lateinit var btnNext3:Button
    lateinit var btncancel3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_photo2)
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            intent= Intent(this,BookPhoto3Activity::class.java)
            startActivity(intent)
        }
        btncancel3=findViewById(R.id.btncancel3)
        btncancel3.setOnClickListener {
            intent= Intent(this,BookPhoto1Activity::class.java)
            startActivity(intent)
        }

    }
}