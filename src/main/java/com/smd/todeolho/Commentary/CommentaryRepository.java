package com.smd.todeolho.Commentary;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.query.Param;

// import java.util.List;

public interface CommentaryRepository extends JpaRepository<Commentary, Long> {
    // List<Commentary> findByPublicWorksId(@Param(value = "public_works") Long publicWorksId);
}