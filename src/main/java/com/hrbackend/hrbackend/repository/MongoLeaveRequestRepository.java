package com.hrbackend.hrbackend.repository;

import com.hrbackend.hrbackend.entity.MongoLeaveRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoLeaveRequestRepository extends MongoRepository<MongoLeaveRequest, String> {
    // Custom MongoDB queries can be added here
    // Example:
    // List<MongoLeaveRequest> findByEmployeeName(String employeeName);
}