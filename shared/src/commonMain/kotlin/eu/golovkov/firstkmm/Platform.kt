package eu.golovkov.firstkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform