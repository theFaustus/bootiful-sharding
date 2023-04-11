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
class BootifulShardingApplication {
    companion object {
        private val log: Logger = LoggerFactory.getLogger(this::class.java)
    }

    @Bean
    fun init(reviewService: ReviewService, reviewRepository: ReviewRepository) = CommandLineRunner {
        run {
            (0..10).forEach { i ->
                val current = ThreadLocalRandom.current()
                reviewService.save(
                    Review(
                        text = "Review number $i",
                        author = "Mike Scott",
                        authorEmail = "mike.scott${current.nextInt(1, 1000)}@mail.com",
                        authorTelephone = current.nextInt(69445899, 69999999).toString(),
                        invoiceCode = UUID.randomUUID().toString(),
                        courseId = i
                    )
                )
            }
            (1..10).forEach { i ->
                log.info(reviewService.findById(i).toString())
                reviewRepository.findAllByAuthor("Mike $i")
                reviewRepository.findAllByCourseId(i)
                reviewRepository.findAllById(listOf(1, 1000))
            }

        }
    }
}

fun main(args: Array<String>) {
    runApplication<BootifulShardingApplication>(*args)
}
