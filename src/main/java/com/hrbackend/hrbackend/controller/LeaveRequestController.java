//package com.hrbackend.hrbackend.controller;
//
//import com.hrbackend.hrbackend.dto.LeaveRequestDTO;
//import com.hrbackend.hrbackend.entity.LeaveRequest;
//import com.hrbackend.hrbackend.service.LeaveRequestService;
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/leave-requests")
//@CrossOrigin(origins = "http://localhost:3000")
//public class LeaveRequestController {
//    private final LeaveRequestService leaveRequestService;
//
//    public LeaveRequestController(LeaveRequestService leaveRequestService) {
//        this.leaveRequestService = leaveRequestService;
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public LeaveRequest createLeaveRequest(@Valid @RequestBody LeaveRequestDTO dto) {
//        return leaveRequestService.createLeaveRequest(dto);
//    }
//
//    @GetMapping
//    public List<LeaveRequest> getAllLeaveRequests() {
//        return leaveRequestService.getAllLeaveRequests();
//    }
//}

//package com.hrbackend.hrbackend.controller;
//
//import com.hrbackend.hrbackend.dto.LeaveRequestDTO;
//import com.hrbackend.hrbackend.service.LeaveRequestService;
//import com.hrdashboard.entity.LeaveRequest;
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/leave-requests") // Base URL for leave requests
//@CrossOrigin(origins = "http://localhost:3000") // Allow CORS from your frontend
//public class LeaveRequestController {
//
//    private final LeaveRequestService leaveRequestService;
//
//    public LeaveRequestController(LeaveRequestService leaveRequestService) {
//        this.leaveRequestService = leaveRequestService;
//    }
//
//    // Endpoint to create a new leave request
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED) // Respond with 201 Created status
//    public LeaveRequest createLeaveRequest(@Valid @RequestBody LeaveRequestDTO dto) {
//        return leaveRequestService.createLeaveRequest(dto); // Call service to handle the creation
//    }
//
//    // Endpoint to get all leave requests
//    @GetMapping
//    public List<LeaveRequest> getAllLeaveRequests() {
//        return leaveRequestService.getAllLeaveRequests(); // Call service to retrieve all leave requests
//    }
//}


//package com.hrbackend.hrbackend.controller;
//
//import com.hrbackend.hrbackend.entity.LeaveRequest;
//import com.hrbackend.hrbackend.service.LeaveRequestService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/leave-requests")
//public class LeaveRequestController {
//
//    @Autowired
//    private LeaveRequestService leaveRequestService;
//
//    @GetMapping
//    public List<LeaveRequest> getAllLeaveRequests() {
//        return leaveRequestService.getAllLeaveRequests();
//    }
//
////    @PostMapping
////    public LeaveRequest createLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
////        return leaveRequestService.saveLeaveRequest(leaveRequest);
////    }
//
//    public LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest) {
//        return leaveRequestRepository.save(leaveRequest); // Save to DB
//    }
//
//}

package com.hrbackend.hrbackend.controller;

import com.hrbackend.hrbackend.entity.LeaveRequest;
import com.hrbackend.hrbackend.service.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leave-requests")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true") // Fix CORS issue
public class LeaveRequestController {

    @Autowired
    private LeaveRequestService leaveRequestService; // Use service, not repository

    @GetMapping
    public List<LeaveRequest> getAllLeaveRequests() {
        return leaveRequestService.getAllLeaveRequests();
    }

    @PostMapping
    public LeaveRequest createLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
        return leaveRequestService.saveLeaveRequest(leaveRequest); // Call Service, Not Repository
    }
}
