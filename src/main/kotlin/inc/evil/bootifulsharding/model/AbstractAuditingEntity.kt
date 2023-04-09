package inc.evil.bootifulsharding.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.relational.core.mapping.Column
import java.io.Serializable
import java.time.Instant
import java.time.LocalDateTime

@JsonIgnoreProperties(value = ["createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate"], allowGetters = true)
abstract class AbstractAuditingEntity<T> : Serializable {
    abstract val id: T?

    @CreatedDate
    @Column("created_at")
    var createdAt: LocalDateTime? = null

    @LastModifiedDate
    @Column("last_modified_at")
    var lastModifiedAt: LocalDateTime? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}
