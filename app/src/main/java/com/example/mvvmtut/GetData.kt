package com.example.mvvmtut

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class GetData:LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getData() {
        println("get data")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun senData() {
        println("send data")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun create() {
        println("create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume() {
        println("resume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause() {
        println("pause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroy() {
        println("destroy")
    }
}