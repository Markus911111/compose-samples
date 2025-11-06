# Building Compose Samples

This repository contains multiple Android sample projects demonstrating Jetpack Compose.

## Repository Structure

The repository is organized as a Gradle multi-project build with the following structure:

- Each sample (JetNews, Jetchat, Jetsnack, Jetcaster, Reply, JetLagged) is an independent Android project
- Root-level Gradle configuration provides convenience tasks to build all samples

## Building All Samples

From the root directory, you can use the following commands:

### Build all samples
```bash
./gradlew build
```

### Assemble debug builds
```bash
./gradlew assembleDebug
```

### Clean all samples
```bash
./gradlew clean
```

### Run tests
```bash
./gradlew test
```

### Check code formatting
```bash
./gradlew spotlessCheck
```

### Apply code formatting
```bash
./gradlew spotlessApply
```

## Building Individual Samples

You can also build samples individually by navigating to their directory:

```bash
cd JetNews
./gradlew assembleDebug
```

## Using Recursive Scripts

The repository also includes shell scripts in the `scripts/` directory for running commands across all samples:

```bash
./scripts/gradlew_recursive.sh build
./scripts/format.sh
./scripts/verify_samples.sh
```

## Requirements

- JDK 17 or higher
- Android SDK
- Gradle 8.13+ (wrapper included)

For more information about individual samples, see their respective README files.
