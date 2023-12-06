package com.smd.todeolho.Commentary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface CommentaryRepository extends JpaRepository<Commentary, Long> {
    List<Commentary> findByPublicWorksId(@Param(value = "public_works") Long publicWorksId);
}