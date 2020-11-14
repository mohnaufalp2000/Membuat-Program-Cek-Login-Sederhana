package com.example.cekloginsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cekloginsederhana.model.User
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val PERSON = "person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val person = intent.getParcelableExtra<User>(PERSON) as User

        dt_email.text = person.email

    }
}