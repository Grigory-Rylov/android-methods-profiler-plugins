# YAMP Plugin interface.

## How to create your own plugin
1. Create `org.pf4j.Plugin` subclass with inner class implements 
`CallTraceAnalyzer` and annotate with @Extension:
```
class SamplePlugin(pluginWrapper: PluginWrapper) : Plugin(pluginWrapper) {
    @Extension
    class SampleAnalyzer : CallTraceAnalyzer {
        override fun analyzeCallTrace(input: AnalyzerResult, thread: ThreadItem?, callback: Callback) {
            callback.onResultReady(SampleResultImpl(input))
        }

        // Name for plugins menu
        override fun analyzerName(): String = "Scopes analyzer"
    }
}

```

2. Enable annotation processing in build.gradle:
for kotlin
```
apply plugin: 'kotlin'
apply plugin: 'kotlin-kapt'

```

3. Add dependencies
```
    implementation 'com.github.Grigory-Rylov:android-methods-profiler-core:1.0.3'
    implementation 'com.github.Grigory-Rylov:android-methods-profiler-plugins:1.1.0'
    implementation 'org.pf4j:pf4j:3.4.1'
    kapt 'org.pf4j:pf4j:3.4.1'
```

4. Create manifest
```
jar {
    manifest {
        attributes(
                "Manifest-Version": "1.0",
                "Created-By": "Grigory Rylov",
                "Plugin-Class": "com.example.SamplePlugin",
                "Plugin-Id": "sample-plugin",
                "Plugin-Version": "0.0.1",
                "Class-Path": configurations.compile.collect { it.getName() }.join(' ')
                )
    }
}

```
5. Build jar `./gradlew clean jar`. 

6. Place JAR into `~/anroid-methods-profile/plugins` folder.

## Download
**Step 1.** Add the JitPack repository to your build file
```
allprojects {
    repositories {
	    ...
	    maven { url 'https://jitpack.io' }
	}
}
```	

**Step 2.** Add the dependency
```
dependencies {
    implementation 'com.github.Grigory-Rylov:android-methods-profiler-core:$version'
}
```
