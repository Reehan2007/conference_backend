package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.model.Paper;

public interface PaperRepository extends JpaRepository<Paper, Long> {
}