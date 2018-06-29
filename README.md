[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/beryx-gist/badass-jlink-example/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/beryx-gist/badass-jlink-example/master.svg?label=Build)](https://travis-ci.org/beryx-gist/badass-jlink-example)

## Badass JLink Plugin Example ##

A small application that shows how to use the [Badass JLink Plugin](https://github.com/beryx/badass-jlink-plugin/).

The plugin is configured in `build.gradle` as follows:

```
plugins {
    id 'org.beryx.jlink' version '1.0.2'
}

jlink {
    launcherName = 'hello'
    mergedModule {
        requires 'java.naming';
        requires 'java.xml';
        requires 'java.xml.bind';
    }
}
```

### Usage
**Running with gradle:**
```
./gradlew run
```

The following text should appear on your screen:
```
LOG: Hello, modular java!
```


**Creating and executing a custom runtime image:**
```
./gradlew jlink
cd build/image/bin
./hello
```

The following text should appear on your screen:
```
LOG: Hello, modular java!
```
