package com.example.android_version
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var versions : MutableList<AospVersion> = ArrayList()
    lateinit var context : Context

    fun RecyclerAdapter(versions: MutableList<AospVersion>, context : Context){
        this.versions = versions
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int ){
        val version = versions.get(position)
        holder.bind(version, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int) : ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.aosp_version_layout, parent, false))
    }

    override fun getItemCount() : Int {
        return versions.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val os = view.findViewById(R.id.tvVersion) as TextView
        val dessert = view.findViewById(R.id.tvDessert) as TextView
        val sdk = view.findViewById(R.id.tvApi) as TextView
        val photo = view.findViewById(R.id.icon) as ImageView
        val launch = view.findViewById(R.id.tvLaunch) as TextView
        val btnChangeActivity = view.findViewById(R.id.btnActivity) as Button
        val btnGetSource = view.findViewById(R.id.btnSource) as Button

        fun bind(version : AospVersion, context: Context){
            os.text = version.version
            dessert.text = version.dessert
            sdk.text = version.sdk
            launch.text = version.launch
            btnChangeActivity.text = version.button

            btnGetSource.setOnClickListener {
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse(version.url)
                startActivity(context, openURL, Bundle.EMPTY)

            }
            btnChangeActivity.setOnClickListener (View.OnClickListener{ Toast.makeText(context, os.text, Toast.LENGTH_SHORT).show()} )
            photo.loadUrl(version.photo)

        }


        fun ImageView.loadUrl(url : String){
            Picasso.with(context).load(url).into(this)
        }


    }

}