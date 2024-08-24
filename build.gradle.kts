plugins {
    kotlin("jvm") version "1.8.0" // Kotlin 버전
    id("org.springframework.boot") version "3.3.3" // Spring Boot 버전
    id("io.spring.dependency-management") version "1.1.6" // 의존성 관리
}

group = "com.TreeNut"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17) // Java 버전
    }
}

repositories {
    mavenCentral() // Maven 중앙 저장소
}

dependencies {
    // Spring Boot Starter
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")

    // 데이터베이스 드라이버
    runtimeOnly("mysql:mysql-connector-java:8.0.27")

    // Spring Security
    implementation("org.springframework.security:spring-security-config")
    implementation("org.springframework.security:spring-security-core")
    implementation("org.springframework.security:spring-security-crypto")

    // Kotlin 관련 의존성
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // 테스트 관련 의존성
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform() // JUnit 플랫폼 사용
}
