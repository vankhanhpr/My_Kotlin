package com.example.vankhanhpr.tabhost

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * Created by VANKHANHPR on 6/22/2017.
 */

class tab2:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var y=inflater!!.inflate(R.layout.tab1_view2, container, false)
        return y
    }
}