plugins {
    `java-library`

    id("com.github.johnrengelman.shadow")
}

// This project is not published, it is bundled into :sdk:trace

description = "Internal use only - shaded dependencies of OpenTelemetry SDK for Tracing"
extra["moduleName"] = "io.opentelemetry.sdk.trace.internal"

dependencies {
    implementation("org.jctools:jctools-core")
}

tasks {
    shadowJar {
        minimize()

        relocate("org.jctools", "io.opentelemetry.internal.shaded.jctools")
    }
}
