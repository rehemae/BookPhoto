package dev.rehema.bookphoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookPhoto3Activity : AppCompatActivity() {
    lateinit var btnNext4:Button
    lateinit var btncancel4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_photo3)
        btnNext4=findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            intent= Intent(this,BookPhoto4Activity::class.java)
            startActivity(intent)
        }
        btncancel4=findViewById(R.id.btncancel4)
        btncancel4.setOnClickListener {
            intent= Intent(this,BookPhoto2Activity::class.java)
            startActivity(intent)
        }

    }
}