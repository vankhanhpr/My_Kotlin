package com.example.user.fracment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.vankhanhpr.tabhost.R
import com.example.vankhanhpr.tabhost.Before_Login
import kotlinx.android.synthetic.main.login.*

public class loginkl : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        btn_login1.setOnClickListener()
        {
            var intent = Intent(this, Before_Login::class.java)
            startActivity(intent)
        }
    }
}