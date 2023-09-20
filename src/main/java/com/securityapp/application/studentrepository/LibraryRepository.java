package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library,Long> {
}
