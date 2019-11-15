package com.maoz.line.repository;

import com.maoz.line.entity.LineLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineLogRepository extends JpaRepository<LineLog, Long> {
}
