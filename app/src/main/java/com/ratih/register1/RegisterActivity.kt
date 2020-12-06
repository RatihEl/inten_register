package com.ratih.register1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_register.setOnClickListener(this)

    }

    override fun onClick(p0: View) {

        val inputUsername = text_username.text.toString().trim()
        val inputEmail = text_email.text.toString().trim()
        val inputPassword = text_password.text.toString().trim()
        val inputKonfrim = text_confirm_pass.text.toString().trim()

        val isEmptyfield = false
        when {
            inputUsername.isEmpty() -> {
                isEmptyfield
                text_username.error = getString(R.string.txt_errorr)

            }
            inputEmail.isEmpty() -> {
                isEmptyfield == true
                text_email.error = getString(R.string.txt_error1)

            }

            inputPassword.isEmpty() -> {
                isEmptyfield == true
                text_password.error = getString(R.string.txt_error2)
            }

            inputKonfrim.isEmpty() -> {
                isEmptyfield
                text_confirm_pass.error = getString(R.string.txt_error3)

            }
        }

        if (!isEmptyfield) {
            val intentData = Intent(this, DataActivity::class.java)
            intentData.putExtra("amplopNama", inputUsername )
            intentData.putExtra("amplopEmail", inputEmail)
            intentData.putExtra("amplopPassword", inputPassword)
            intentData.putExtra("amplopkonfirmasi", inputKonfrim)
            startActivity(intentData)

        }

    }
}