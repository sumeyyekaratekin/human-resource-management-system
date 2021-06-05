package com.sumeyye.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumeyye.hrms.business.abstracts.JobPositionService;
import com.sumeyye.hrms.dataAccess.abstracts.JobPositionDao;
import com.sumeyye.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao  jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        super();
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();
    }
    
    @Override
    public void add(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
    }
}