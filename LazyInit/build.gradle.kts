plugins {
    kotlin("multiplatform") version "2.0.21"
}

repositories {
    mavenCentral()
}

kotlin {
    macosArm64("macosArm64") {
        binaries {
            executable {
                entryPoint = "main"
                baseName = "lazyinit"
            }
        }
    }

    linuxX64("linuxX64") {
        binaries {
            executable {
                entryPoint = "main"
                baseName = "lazyinit"
            }
        }
    }

    linuxArm64("linuxArm64") {
        binaries {
            executable {
                entryPoint = "main"
                baseName = "lazyinit"
            }
        }
    }
}