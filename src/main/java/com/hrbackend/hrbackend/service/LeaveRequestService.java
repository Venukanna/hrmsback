//package com.hrbackend.hrbackend.service;
//
//import com.hrbackend.hrbackend.dto.LeaveRequestDTO;
//import com.hrbackend.hrbackend.entity.LeaveRequest;
//import com.hrbackend.hrbackend.repository.LeaveRequestRepository;
//import jakarta.transaction.Transactional;
//import jakarta.validation.Valid;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class LeaveRequestService {
//    private final LeaveRequestRepository leaveRequestRepository;
//
//    public LeaveRequestService(LeaveRequestRepository leaveRequestRepository) {
//        this.leaveRequestRepository = leaveRequestRepository;
//    }
//
//    public LeaveRequest createLeaveRequest(@Valid LeaveRequestDTO dto) {
//        LeaveRequest request = new LeaveRequest();
//        request.setEmployeeName(dto.getEmployeeName());
//        request.setLeaveType(dto.getLeaveType());
//        request.setStartDate(dto.getStartDate());
//        request.setEndDate(dto.getEndDate());
//        request.setReason(dto.getReason());
//        return leaveRequestRepository.save(request);
//    }
//
//    public List<LeaveRequest> getAllLeaveRequests() {
//        return leaveRequestRepository.findAll();
//    }
//}



package com.hrbackend.hrbackend.service;

import com.hrbackend.hrbackend.dto.LeaveRequestDTO;
import com.hrbackend.hrbackend.entity.LeaveRequest;
import com.hrbackend.hrbackend.repository.LeaveRequestRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class LeaveRequestService {
    private final LeaveRequestRepository leaveRequestRepository;

    public LeaveRequestService(LeaveRequestRepository leaveRequestRepository) {
        this.leaveRequestRepository = leaveRequestRepository;
    }

    public LeaveRequest createLeaveRequest(@Valid LeaveRequestDTO dto) {
        LeaveRequest request = new LeaveRequest();
        request.setEmployeeName(dto.getEmployeeName());
        request.setLeaveType(dto.getLeaveType());
        request.setStartDate(dto.getStartDate());
        request.setEndDate(dto.getEndDate());
        request.setReason(dto.getReason());
        return leaveRequestRepository.save(request);
    }

    public List<LeaveRequest> getAllLeaveRequests() {
        return leaveRequestRepository.findAll();
    }

//    public LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest) {
//        return null;
//    }

    public LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest) {
        return leaveRequestRepository.save(leaveRequest);
    }

}