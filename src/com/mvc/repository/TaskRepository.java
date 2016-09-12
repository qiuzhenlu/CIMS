/**
 * 
 */
package com.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mvc.entity.Task;

/**
 * 普通任务、文书任务
 * 
 * @author zjn
 * @date 2016年9月9日
 */
public interface TaskRepository extends JpaRepository<Task, Long> {

	// 根据用户ID和状态筛选任务列表,task_state:0 表示为接收，1表示执行中，2表示已完成
	@Query("select t from Task t where receiver_id = :receiver_id and task_state=:task_state and task_isdelete=0 ")
	public List<Task> findAllByState(@Param("receiver_id") Integer receiver_id,
			@Param("task_state") Integer task_state);

}
