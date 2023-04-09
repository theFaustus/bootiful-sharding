package inc.evil.bootifulsharding.repo

import inc.evil.bootifulsharding.model.Review
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import java.time.LocalDate
import java.time.LocalDateTime

@Repository
interface ReviewRepository : R2dbcRepository<Review, Int> {
    @Query("select * from reviews r where date(r.created_at) = :date")
    fun findAllByCreatedAt(date: LocalDate): Flux<Review>
    fun findAllByAuthor(author: String): Flux<Review>
    fun findAllByCreatedAtBetween(startDateTime: LocalDateTime, endDateTime: LocalDateTime): Flux<Review>

}
