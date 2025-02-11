package org.iagxferreira.notesplus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform