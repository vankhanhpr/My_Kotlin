package com.example.vankhanhpr.tabhost

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.user.fracment.loginkl
import kotlinx.android.synthetic.main.thefist_2.*

/**
 * Created by VANKHANHPR on 6/23/2017.
 */
class  WelCome: Activity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thefist_2)
        btn_next.setOnClickListener()
        {
            var intent = Intent(this, loginkl::class.java)
            startActivity(intent)
        }


    }
}

