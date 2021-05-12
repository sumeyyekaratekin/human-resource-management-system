package com.sumeyye.hrms.business.abstracts;

import java.util.List;

import com.sumeyye.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
    List<JobPosition> getAll();
}
