package dev.rehema.bookphoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookPhoto4Activity : AppCompatActivity() {
    lateinit var btncancel5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_photo4)
        btncancel5=findViewById(R.id.btncancel5)
        btncancel5.setOnClickListener {
            intent= Intent(this,BookPhoto3Activity::class.java)
            startActivity(intent)
        }
    }
}