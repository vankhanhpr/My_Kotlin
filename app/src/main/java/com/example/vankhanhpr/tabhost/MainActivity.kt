package com.example.vankhanhpr.tabhost

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.*
import android.support.v4.view.ViewPager
import android.widget.TabHost
import java.util.*
import android.widget.TabWidget
import android.widget.TextView
import android.app.Dialog
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tab1_view0.*


class MainActivity : FragmentActivity(),TabHost.OnTabChangeListener, ViewPager.OnPageChangeListener {



    private var mTabHost:FragmentTabHost?=null
    private var mViewPager:ViewPager?=null
    private var mPageAdapter:android.support.v4.view.PagerAdapter?=null
    private var tabwidget:TabWidget?=null

    override fun onPageScrollStateChanged(state: Int)
    {
       var x=0
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        var c=0
    }

    override fun onPageSelected(position: Int) {
        this.mTabHost!!.setCurrentTab(position)
    }

    override fun onTabChanged(tabId: String?) {
        val pos = this.mTabHost!!.getCurrentTab()
        this.mViewPager!!.setCurrentItem(pos)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mTabHost = findViewById(android.R.id.tabhost) as FragmentTabHost
        tabwidget= findViewById(android.R.id.tabs) as TabWidget
        mTabHost!!.setup(this, getSupportFragmentManager(),R.id.realtabcontent)


        mTabHost!!.addTab(mTabHost!!.newTabSpec("tab0").setIndicator("",getResources().getDrawable(R.drawable.ic_camera)),
                tab0::class.java, null)
        mTabHost!!.addTab(mTabHost!!.newTabSpec("tab1").setIndicator("Chats"),
                tab1::class.java, null)

        mTabHost!!.addTab(mTabHost!!.newTabSpec("tab2").setIndicator("Status"),
                tab2::class.java, null)
        mTabHost!!.addTab(mTabHost!!.newTabSpec("tab3").setIndicator("Calls"),
                tab2::class.java, null)



        mTabHost!!.getTabWidget().getChildAt(0).getLayoutParams().width = 40;
        //set màu cho text và nền trong tabhost
        for (i in 0..mTabHost!!.getTabWidget().getChildCount() - 1) {
            //mTabHost!!.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FF0000"))

            var textview = mTabHost!!.getTabWidget().getChildAt(i).findViewById(android.R.id.title) as TextView
            textview.setTextColor(Color.parseColor("#FFFFFF"))
        }
        intialiseViewPager()

        //Xử lí kích chuột chọn tab phía trên
        mTabHost!!.setOnTabChangedListener(TabHost.OnTabChangeListener {
            mViewPager!!.setCurrentItem(mTabHost!!.getCurrentTab())
        })

        //xử lí mở dialog nút 3 chấm trên cùng
        imv_dialog.setOnClickListener( )
        {
            /*var dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_layout);
            dialog.setTitle("")
            dialog.show()*/
           // menuInflater.inflate(R.menu.main,null)
        }

    }
    //Xử lý với view pager của tabhost
    private fun intialiseViewPager() {

        val fragments = Vector<Fragment>()
        fragments.add(Fragment.instantiate(this, tab0::class.java!!.getName()))
        fragments.add(Fragment.instantiate(this, tab1::class.java!!.getName()))
        fragments.add(Fragment.instantiate(this, tab2::class.java!!.getName()))
        fragments.add(Fragment.instantiate(this, tab3::class.java!!.getName()))
        this.mPageAdapter = PagerAdapter(getSupportFragmentManager(),fragments)
        this.mViewPager = super.findViewById(R.id.viewpager) as ViewPager
        this.mViewPager!!.setAdapter(this.mPageAdapter)
        this.mViewPager!!.setOnPageChangeListener(this)
    }
}
