package com.example.kotlindemo.utils.rxJava

import io.reactivex.Scheduler

interface SchedulerProvider {
    fun computation(): Scheduler?

    fun io(): Scheduler?

    fun ui(): Scheduler?
}