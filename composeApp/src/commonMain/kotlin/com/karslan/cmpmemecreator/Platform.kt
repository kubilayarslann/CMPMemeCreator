package com.karslan.cmpmemecreator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform