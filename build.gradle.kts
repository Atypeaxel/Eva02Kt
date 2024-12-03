plugins {
    kotlin("jvm") version "2.0.0"
}

group = "fr.atypeaxel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:5.2.1")
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.2")
    implementation("ch.qos.logback:logback-classic:1.5.6")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}