package com.example.multithreading

import android.util.Log
import kotlin.math.log

class Thread1:Thread() {

    override fun run() {
        super.run()


        //do work=>

        Log.v("testThread",Thread.currentThread().name)
    }
}