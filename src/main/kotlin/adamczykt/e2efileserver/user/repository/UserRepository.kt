package adamczykt.e2efileserver.user.repository

import adamczykt.e2efileserver.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository : JpaRepository<User, UUID> {
    fun findByUsername(username: String): User?
}