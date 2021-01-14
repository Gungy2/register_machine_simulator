plugins {
    java
    kotlin("jvm") version "1.4.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.antlr:antlr4:4.9")
    implementation("com.github.ajalt.clikt:clikt:3.1.0")
}
