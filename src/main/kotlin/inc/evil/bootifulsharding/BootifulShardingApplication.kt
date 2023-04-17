package inc.evil.bootifulsharding

import inc.evil.bootifulsharding.model.Review
import inc.evil.bootifulsharding.repo.ReviewRepository
import inc.evil.bootifulsharding.service.ReviewService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.scheduling.annotation.EnableScheduling
import java.time.LocalDate
import java.util.UUID
import java.util.concurrent.ThreadLocalRandom
import kotlin.streams.toList

@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
class BootifulShardingApplication

fun main(args: Array<String>) {
    runApplication<BootifulShardingApplication>(*args)
}
