import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import kotlinx.html.script

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.kobwebx.markdown)
}

group = "com.kindredcircl.web"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            head.add {
                link {
                    href =
                        "https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css"
                    rel = "stylesheet"
                }
                script {
                    src = "https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"
                }
                link {
                    rel = "stylesheet"
                    href = "https://fonts.googleapis.com/icon?family=Material+Icons"
                }
                link {
                    rel = "stylesheet"
                    href = "https://fonts.googleapis.com/icon?family=Inter"
                }
                link {
                    rel = "stylesheet"
                    href = "https://fonts.googleapis.com/icon?family=Poppins"
                }
            }
        }
    }
}

kotlin {
    // This example is frontend only. However, for a fullstack app, you can uncomment the includeServer parameter
    // and the `jvmMain` source set below.
    configAsKobwebApplication("web" /*, includeServer = true*/)

    sourceSets {
//        commonMain.dependencies {
//          // Add shared dependencies between JS and JVM here if building a fullstack app
//        }

        jsMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            implementation(libs.kobwebx.markdown)
        }

        // Uncomment the following if you pass `includeServer = true` into the `configAsKobwebApplication` call.
//        jvmMain.dependencies {
//            compileOnly(libs.kobweb.api) // Provided by Kobweb backend at runtime
//        }
    }
}
