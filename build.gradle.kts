plugins {
    id("java")
}

group = "carchase"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.badlogicgames.gdx:gdx:1.12.1")
    implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:1.12.1") {
        exclude(group = "org.jcraft", module = "jorbis")
    }
    implementation ("com.badlogicgames.gdx:gdx-platform:1.12.1:natives-desktop")
}

tasks.test {
    useJUnitPlatform()
}