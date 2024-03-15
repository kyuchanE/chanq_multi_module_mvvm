pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Chanq_mulit_module_mvvm"
include(":app")
include(":core:data")
include(":core:domain")
include(":core:ui")
include(":feature:lottery")
include(":feature:user")
