package com.example.kotlindemo.Utils.rxJava

import io.reactivex.Scheduler

interface SchedulerProvider {
    fun computation(): Scheduler?

    fun io(): Scheduler?

    fun ui(): Scheduler?
}