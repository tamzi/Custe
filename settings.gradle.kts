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
include(":curator")

include(":core:data")
include(":core:database")
include(":core:datastore")
include(":core:domain")
include(":core:model")
include(":core:network")
include(":core:utils")

include(":test:datatest")
include(":test:hilttest")
include(":test:datastoretest")
include(":test:coretests")

include(":feature:about")
include(":feature:setting")
include(":feature:search")
