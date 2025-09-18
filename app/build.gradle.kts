plugins {
    application
    id("io.freefair.lombok") version "9.0.0-rc2"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation(libs.guava)
    implementation(libs.jackson)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

application {
    mainClass = "by.tishalovichm.sjhm.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.register<Exec>("myTask") {
    commandLine("cmd", "/C", "mkdir", "DELETE_ME")
}
