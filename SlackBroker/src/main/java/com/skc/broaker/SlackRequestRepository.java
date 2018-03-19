/**
 * 
 */
package com.skc.broaker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sitakant
 *
 */
@Repository
public interface SlackRequestRepository extends JpaRepository<SlackRequestEntity, Long> {

}
