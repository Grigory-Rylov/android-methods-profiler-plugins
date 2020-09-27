# YAMP Plugin interface.

## How to create your own plugin
1. Implement interface `CallTraceAnalyzer` in your plugin. 

2. Plugin authors should then bundle their plugins into JAR files.

3. Place JAR into `~/anroid-methods-profile/plugins` folder.

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
