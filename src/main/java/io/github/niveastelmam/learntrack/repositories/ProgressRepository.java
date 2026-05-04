package io.github.niveastelmam.learntrack.repositories;

import io.github.niveastelmam.learntrack.models.Progress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Long> {
}
