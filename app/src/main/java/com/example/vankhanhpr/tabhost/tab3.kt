package com.example.vankhanhpr.tabhost

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by VANKHANHPR on 6/23/2017.
 */
class tab3 : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var z=inflater!!.inflate(R.layout.tab1_view3, container, false)
        return z
    }
}