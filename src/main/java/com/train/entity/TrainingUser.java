package com.train.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 培训人员
 * @author caoguojin
 *
 */
@Entity
@Table(name = "T_TRAINING_USER")
public class TrainingUser extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "BUS_KEY_")
	private String busKey;
	
	@Column(name = "CNAME_")
	private String cname;

	@Column(name = "ENAME_")
	private String ename;

	@Column(name = "USERNAME_")
	private String username;

	@Column(name = "JOIN_")
	private boolean join=true;
	
	@Column(name = "DEPT_ID_")
	private String deptId;
	
	@Column(name = "DEPT_NAME_")
	private String deptName;

	
	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public boolean getJoin() {
		return join;
	}

	public void setJoin(boolean join) {
		this.join = join;
	}

	public String getUsername() {
		return username;
	}

	public String getBusKey() {
		return busKey;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setBusKey(String busKey) {
		this.busKey = busKey;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
