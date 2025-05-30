plugins {
    alias(aoc2022Libs.plugins.kotlin.jvm)
}

dependencies {
    api(project(":aoc-utils"))

    implementation(aoc2022Libs.commons.lang3)
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation(aoc2022Libs.equalsverifier)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Implementation-Title"] = project.name
        attributes["Implementation-Version"] = project.version
    }
}
