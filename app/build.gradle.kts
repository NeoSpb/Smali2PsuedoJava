
plugins {
    application
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.13")
}

application {
    mainClass.set("gng.smali2pj.Main")
}
