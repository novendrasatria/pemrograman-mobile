package com.novendra.satria.pertemuan9

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var initialCountA: Int = 0
    private set
    var initialCountB = 0
    private set

    val currentCountA: Int
    get(){
        initialCountA++
        return initialCountA
    }
    val currentCountB: Int
    get(){
        initialCountB++
        return initialCountB
    }
}