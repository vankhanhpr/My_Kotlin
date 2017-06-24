package com.example.vankhanhpr.tabhost

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.thefirst_1.*

/**
 * Created by VANKHANHPR on 6/23/2017.
 */

class Before_Login :Activity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thefirst_1)
        btn_thefirst.setOnClickListener()
        {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}