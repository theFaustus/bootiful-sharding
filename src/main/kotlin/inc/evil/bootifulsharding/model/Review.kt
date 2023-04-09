package inc.evil.bootifulsharding.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("reviews")
data class Review(
    @Id
    override val id: Int? = null,
    var text: String,
    var author: String,
    @Column("course_id")
    var courseId: Int? = null
) : AbstractAuditingEntity<Int>()
