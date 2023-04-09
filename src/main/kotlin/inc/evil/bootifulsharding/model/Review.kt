package inc.evil.bootifulsharding.model


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "reviews")
data class Review(
    var text: String,
    var author: String,
    @Column(name = "course_id")
    var courseId: Int? = null
) : AbstractEntity()
