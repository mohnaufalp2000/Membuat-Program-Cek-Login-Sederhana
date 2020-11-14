package com.example.cekloginsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cekloginsederhana.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            val email : String = edt_email.text.toString()
            val password : String = edt_pass.text.toString()
            val user = User(email, password)

            if(user.email == "mohammadnp2000@gmail.com" && user.password == "1234567" || user.email == "udacoding@gmail.com" && user.password == "1234567"){
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.PERSON, user)
                startActivity(intent)
        }
            else{
                Toast.makeText(applicationContext, "Email atau Password anda salah!", Toast.LENGTH_LONG).show()
            }


        }

    }
}