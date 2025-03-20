package com.hrbackend.hrbackend.repository;

import com.hrbackend.hrbackend.entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
}