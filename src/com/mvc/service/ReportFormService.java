package com.mvc.service;

import java.util.Date;
import java.util.List;

import com.mvc.entity.PlanProjectForm;

/**
 * 报表业务层
 * 
 * @author wangrui
 * @date 2016-11-15
 */
public interface ReportFormService {

	// 光电院承担规划项目表
	List<PlanProjectForm> findPlanProject(Integer cont_state, Date startTime, Date endTime);
}
