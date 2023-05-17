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
rootProject.name = ("Custe")
include (":app")
include(":custard")

include(":core:data")
include(":core:database")
include(":core:datastore")
include(":core:domain")
include(":core:model")
include(":core:network")
include(":core:utils")
