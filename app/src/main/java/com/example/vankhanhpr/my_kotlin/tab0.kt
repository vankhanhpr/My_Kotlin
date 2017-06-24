package com.example.vankhanhpr.tabhost

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.tab1_view0.*
import android.provider.MediaStore
import android.content.Intent
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import android.graphics.Bitmap
import android.app.Activity.RESULT_OK
import com.example.vankhanhpr.my_kotlin.R
import kotlinx.android.synthetic.main.tab1_view0.view.*


/**
 * Created by VANKHANHPR on 6/23/2017.
 */

class tab0: Fragment() {

    val REQUEST_IMAGE_CAPTURE =0

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var y:View= inflater!!.inflate(R.layout.tab1_view0, container, false)

        y.btn_camera.setOnClickListener ()
        {
            Toast.makeText(context,"click",Toast.LENGTH_SHORT).show()
            var takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (takePictureIntent.resolveActivity(activity.getPackageManager()!!) != null) {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
            }

        }
        return y;
    }

    public fun dispatchTakePictureIntent()
    {

    }
    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val extras = data!!.extras
            val imageBitmap = extras.get("data") as Bitmap
            imv_camera.setImageBitmap(imageBitmap)
        }
    }

}