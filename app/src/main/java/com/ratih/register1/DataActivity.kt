package com.ratih.register1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val setUsername = intent.getStringExtra("amplopNama")
        val setEmail = intent.getStringExtra("amplopEmail")
        val setPassword = intent.getStringExtra("amplopPassword")
        val setKonfirmasi = intent.getStringExtra("amplopkonfirmasi")


        tv_username.text = setUsername
        tv_email.text = setEmail
        tv_password.text = setPassword
        tv_konfir.text = setKonfirmasi










    }
}