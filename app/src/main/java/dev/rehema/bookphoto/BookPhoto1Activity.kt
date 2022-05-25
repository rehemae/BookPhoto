package dev.rehema.bookphoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookPhoto1Activity : AppCompatActivity() {
    lateinit var btnNext2:Button
    lateinit var btncancel1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_photo1)
        btnNext2=findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            intent= Intent(this,BookPhoto2Activity::class.java)
            startActivity(intent)
        }
        btncancel1=findViewById(R.id.btncancel1)
        btncancel1.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}