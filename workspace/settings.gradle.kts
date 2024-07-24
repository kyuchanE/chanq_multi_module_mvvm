pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

//enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
//    versionCatalogs {
//        create("libs") {
//            from(files("libs.versions.toml"))
//        }
//    }
}
rootProject.name = "Chanq_mulit_module_mvvm"
include(":app")
include(":core:data")
include(":core:domain")
include(":core:ui")
include(":feature:lottery")
include(":feature:user")
include(":feature:home")
