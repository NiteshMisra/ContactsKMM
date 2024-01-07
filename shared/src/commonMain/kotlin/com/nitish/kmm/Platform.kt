package com.nitish.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform