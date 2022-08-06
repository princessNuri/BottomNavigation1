package com.example.bottomnavigation1.ekt

import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

fun ImageView.loadImage(url: String){
    Glide.with(this).load(url).circleCrop().into(this);

}