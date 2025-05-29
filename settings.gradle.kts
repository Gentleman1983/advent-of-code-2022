plugins {
    id("com.gradle.develocity") version("4.0.1")
}

rootProject.name = "advent-of-code-2022"

include("aoc2022")
include("aoc2022:aoc2022-java")
include("aoc2022:aoc2022-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")
