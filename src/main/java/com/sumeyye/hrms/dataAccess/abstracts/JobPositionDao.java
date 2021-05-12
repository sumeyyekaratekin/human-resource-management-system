package com.sumeyye.hrms.dataAccess.abstracts;

import com.sumeyye.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {

}
