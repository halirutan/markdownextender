buildscript {
  repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
    maven("http://dl.bintray.com/jetbrains/intellij-plugin-service")

  }
  dependencies {
    classpath("org.jetbrains.intellij.plugins:gradle-intellij-plugin:0.5.0-SNAPSHOT")
  }
}

plugins {
  id("java")
}

apply(plugin = "org.jetbrains.intellij")

repositories {
  mavenCentral()
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

sourceSets {
  main {
    java.srcDir("src")
    resources.srcDir("resources")
  }
}

version = "3.0beta16"

configure<org.jetbrains.intellij.IntelliJPluginExtension> {
  version = "LATEST-EAP-SNAPSHOT"
  downloadSources = true
  pluginName = "markdownextender"
  setPlugins("org.intellij.plugins.markdown:191.5109.14")
}

