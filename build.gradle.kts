import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.3"
	id("io.spring.dependency-management") version "1.0.13.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
	kotlin("plugin.jpa") version "1.3.72"
}

group = "inc.evil"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-aop")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.apache.shardingsphere:shardingsphere-jdbc-core:5.3.2")
	implementation("org.apache.shardingsphere:shardingsphere-cluster-mode-core:5.3.2")
	implementation("org.apache.shardingsphere:shardingsphere-cluster-mode-repository-zookeeper:5.3.2")
	implementation("org.apache.shardingsphere:shardingsphere-cluster-mode-repository-api:5.3.2")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//	implementation("com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.8.0")
	implementation("org.yaml:snakeyaml:1.33")
	implementation("com.squareup.okhttp3:okhttp:3.14.9")
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
	runtimeOnly("org.postgresql:postgresql")
	runtimeOnly("com.mysql:mysql-connector-j")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.graphql:spring-graphql-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
