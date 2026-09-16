plugins { id("org.jetbrains.kotlin.jvm"); id("io.ktor.plugin") version "2.3.6" }
dependencies {
    implementation("io.ktor:ktor-server-core:2.3.6")
    implementation("io.ktor:ktor-server-netty:2.3.6")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.6")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.6")
    implementation("io.ktor:ktor-server-cors:2.3.6")
    implementation("ch.qos.logback:logback-classic:1.4.11")
}
application{ mainClass.set("com.prucare.backend.ApplicationKt") }
