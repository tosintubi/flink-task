plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.4.3"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.hibernate.validator:hibernate-validator")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("io.github.oshai:kotlin-logging-jvm:7.0.4")

	testImplementation("io.mockk:mockk:1.13.16")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.rest-assured:rest-assured:5.5.1")
	testImplementation("io.rest-assured:kotlin-extensions:5.5.1")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
