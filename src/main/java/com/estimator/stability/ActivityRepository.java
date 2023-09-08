package com.estimator.stability;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
    // 특별한 쿼리 메서드가 필요하면 여기에 추가
}
