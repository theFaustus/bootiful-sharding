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

@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
class BootifulShardingApplication
{
    companion object {
        private val log: Logger = LoggerFactory.getLogger(this::class.java)
    }
    @Bean
    fun init(reviewService: ReviewService, reviewRepository: ReviewRepository) = CommandLineRunner {
        run {
//            (0..1000).forEach { i ->
//                reviewService.save(Review(text = "Review number $i", author = "Mike Scott", courseId = i))
//            }
            (1..10).forEach { i ->
                reviewService.findById(i)
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
