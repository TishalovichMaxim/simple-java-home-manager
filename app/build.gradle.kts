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
        languageVersion = JavaLanguageVersion.of(21)
    }
}

val sjhmMainClass = "by.tishalovichm.sjhm.App"

application {
    mainClass = sjhmMainClass
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = sjhmMainClass
    }
}
