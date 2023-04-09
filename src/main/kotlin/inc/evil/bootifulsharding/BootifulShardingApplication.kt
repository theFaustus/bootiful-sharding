package inc.evil.bootifulsharding

import inc.evil.bootifulsharding.model.Review
import inc.evil.bootifulsharding.repo.ReviewRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
class BootifulShardingApplication {
    companion object {
        private val log: Logger = LoggerFactory.getLogger(this::class.java)
    }
    @Bean
    fun init(reviewRepository: ReviewRepository) = CommandLineRunner {
        run {
//            (0..10000).forEach { i ->
//                reviewRepository.save(Review(text = "Review number $i", author = "Mike Scott", courseId = i))
//            }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
            reviewRepository.findAllById(listOf(1152)).forEach { log.info(it.toString()) }
        }
    }
}

fun main(args: Array<String>) {
    runApplication<BootifulShardingApplication>(*args)
}
