package gov.nist.oar.rmm.authsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gov.nist.oar.rmm.authsecurity.domain.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
