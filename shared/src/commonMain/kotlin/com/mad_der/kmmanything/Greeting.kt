package com.mad_der.kmmanything

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}