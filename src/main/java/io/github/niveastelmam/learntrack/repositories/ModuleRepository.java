package io.github.niveastelmam.learntrack.repositories;

import io.github.niveastelmam.learntrack.models.ModuleCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleCourse, Long> {
}
