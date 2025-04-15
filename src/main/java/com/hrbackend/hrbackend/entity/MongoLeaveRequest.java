package com.hrbackend.hrbackend.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "leave_requests")
@Getter
@Setter
public class MongoLeaveRequest {
    @Id
    private String id;

    private String employeeName;
    private String leaveType;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status = "PENDING";
    private LocalDate createdAt = LocalDate.now();

    // Additional fields if needed
    private String approverComments;
    private boolean isApproved = false;
}