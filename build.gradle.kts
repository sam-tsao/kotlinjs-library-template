plugins {
    kotlin("multiplatform") version "1.4.32"
    `maven-publish`
}

group = "com.example"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    js(LEGACY) {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }

    sourceSets {
        val jsMain by getting
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
