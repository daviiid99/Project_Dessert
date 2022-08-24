package com.example.android_version

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val mAdapter : RecyclerAdapter = RecyclerAdapter()
    lateinit var mRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()

    }

    fun setUpRecyclerView() {
        var mRecyclerView = findViewById<RecyclerView>(R.id.androidVersion)
        mRecyclerView = findViewById(R.id.androidVersion) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getAndroidVersion(), this)
        mRecyclerView.adapter = mAdapter
    }


    fun getAndroidVersion() : MutableList<AospVersion>{
        var versions : MutableList<AospVersion> = ArrayList()
        versions.add(AospVersion("Android 1.0", "Apple Pie", "API 1", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/apple_pie.png", "September 23, 2008", "About", "https://android.googlesource.com/platform/manifest/+/refs/heads/android-1.6_r2/default.xml"))
        versions.add(AospVersion("Android 1.1", "Banana Bread", "API 2", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/banana_bread.png", "February 9, 2009", "About", "https://android.googlesource.com/platform/manifest/+/refs/heads/android-1.6_r2/default.xml"))
        versions.add(AospVersion("Android Cupcake", "Cupcake", "API 3", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/cupcake.png", "April 27, 2009", "About", "https://android.googlesource.com/platform/manifest/+/refs/heads/android-1.6_r2/default.xml"))
        versions.add(AospVersion("Android Donut", "Donut", "API 4", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/donut.png", "September 15, 2009", "About", "https://android.googlesource.com/platform/manifest/+/refs/heads/android-1.6_r2/default.xml"))
        versions.add(AospVersion("Android Eclair", "Eclair", "API 5-7", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/eclair.png", "October 27, 2009 - January 11, 2010", "About", "https://android.googlesource.com/platform/manifest/+/refs/heads/android-2.1_r2/default.xml" ))
        versions.add(AospVersion("Android Froyo", "Froyo", "API 8", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/froyo.png", "May 20, 2010", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-2.2.3_r2.1/default.xml"))
        versions.add(AospVersion("Android Gingerbread", "Gingerbread", "API 9-10", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/gingerbread.png", "December 6, 2010 - February 9, 2011", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-2.3.7_r1/default.xml"))
        versions.add(AospVersion("Android Honeycomb", "Honeycomb", "API 11-13", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/honeycomb.png", "February 22, 2011 - July 15, 2011", "About", "https://android.googlesource.com/platform/manifest/+/refs/heads/android-1.6_r2/default.xml"))
        versions.add(AospVersion("Android Ice Cream Sandwich", "Ice Cream Sandwich", "API 14-15", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/ice_cream_sandwich.png", "October 18, 2011 - December 16, 2011 ", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-4.0.4_r2.1/default.xml"))
        versions.add(AospVersion("Android Jelly Bean", "Jelly Bean", "API 16-18", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/jelly_bean.png", "July 9, 2012 - July 24, 2013", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-4.3.1_r1/default.xml"))
        versions.add(AospVersion("Android KitKat", "Key Lime Pie", "API 19-20", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/kitkat.png", "October 31, 2013 - June 25, 2014", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-4.4.4_r2/default.xml"))
        versions.add(AospVersion("Android Lollipop", "Lemon Meringue Pie", "API 21-22", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/lollipop.png", "November 4, 2014 - March 2, 2015", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-5.1.1_r38/default.xml"))
        versions.add(AospVersion("Android Marshmallow", "Macadamia Nut Cookie", "API 23", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/marshmallow.png", "October 2, 2015", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-6.0.1_r81/default.xml"))
        versions.add(AospVersion("Android Nougat", "New York Cheesecake", "API 24-25", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/nougat.png", "August 22, 2016 - October 4, 2016", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-7.1.2_r39/default.xml"))
        versions.add(AospVersion("Android Oreo", "Oatmeal Cookie", "API 26-27", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/oreo.png", "August 21, 2017 - December 5, 2017", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-security-8.1.0_r93/default.xml"))
        versions.add(AospVersion("Android Pie", "Pistachio Ice Cream", "API 28", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/pie.png", "August 6, 2018", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-security-9.0.0_r76/default.xml"))
        versions.add(AospVersion("Android 10", "Quince Tart", "API 29", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/quincetart.png", "September 3, 2019", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-security-10.0.0_r69/default.xml"))
        versions.add(AospVersion("Android 11", "Red Velvet Cake", "API 30", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/red_velvet_cake.png", "September 8, 2020", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-security-11.0.0_r58/default.xml"))
        versions.add(AospVersion("Android 12", "Snow Cone", "API 31", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/snowcone.png", "October 4, 2021", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-security-12.0.0_r38/default.xml"))
        versions.add(AospVersion("Android 12L", "Snow Cone v2", "API 32", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/snowcone.png", "March 7, 2022", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-12.1.0_r22/default.xml"))
        versions.add(AospVersion("Android 13", "Tiramisu", "API 33", "https://github.com/daviiid99/Project_Dessert/raw/master/desserts/tiramisu.png", "August 15, 2022", "About", "https://android.googlesource.com/platform/manifest/+/refs/tags/android-13.0.0_r3/default.xml"))
        return versions
    }
}