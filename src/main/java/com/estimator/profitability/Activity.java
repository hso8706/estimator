package com.estimator.profitability;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String activityName;
    // 다른 필드들도 여기에 추가

    // 생성자, 게터, 세터 메서드도 추가
}