package inc.evil.bootifulsharding.model


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "reviews")
data class Review(
    var text: String,
    var author: String,
    @Column(name = "author_telephone")
    var authorTelephone: String? = null,
    @Column(name = "author_email")
    var authorEmail: String? = null,
    @Column(name = "invoice_code")
    var invoiceCode: String? = null,
    @Column(name = "course_id")
    var courseId: Int? = null
) : AbstractEntity()
