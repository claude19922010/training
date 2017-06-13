package com.train.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 培训计划管理
 * 
 * @author caoguojin
 * 
 */
@Entity
@Table(name = "T_TRAINING_PLAN")
public class TrainingPlan extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "PROJECT_ID_", length = 60)
	private String projectId;

	@Column(name = "PROJECT_NAME_", length = 60)
	private String projectName;

	@Column(name = "TRAINING_TYPE_", length = 60)
	private String trainingType;

	@Column(name = "PERIODS_")
	private int periods;

	@Column(name = "DAYS_")
	private int days;

	@Column(name = "PEOPLES_")
	private int peoples;

	@Column(name = "PXLGZT_", length = 60)
	private String pxlgzt;

	@Column(name = "PXZZXS_", length = 60)
	private String pxzzxs;

	@Column(name = "PXSSFS_", length = 60)
	private String pxssfs;

	@Column(name = "PXDXMS_", length = 1000)
	private String pxdxms;

	@Column(name = "ZBDW_", length = 60)
	private String zbdw;

	@Column(name = "CBDW_", length = 60)
	private String cbdw;

	@Column(name = "XBDW_", length = 60)
	private String xbdw;

	@Column(name = "PXDD_", length = 100)
	private String pxdd;

	@Column(name = "NDKSSJ_")
	private Date ndkssj;

	@Column(name = "NDJSSJ_")
	private Date ndjssj;

	@Column(name = "NDPXXS_")
	private String ndpxxs;

	@Column(name = "PXSHY_")
	private String pxshy;

	@Column(name = "PXSHY_NAME_")
	private String pxshyName;

	@Column(name = "STATE_")
	private int state;

	@Column(name = "CLD_SH_")
	private int cldsh;

	@Column(name = "APPLY_USER_", length = 60)
	private String applyUser;

	@Column(name = "APPLY_DEPT_ID_", length = 60)
	private String applyDeptId;

	@Column(name = "CZ_NAME_", length = 120)
	private String czName;

	@Column(name = "CZ_USERNAME_", length = 60)
	private String czUsername;

	public String getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}

	public String getApplyDeptId() {
		return applyDeptId;
	}

	public void setApplyDeptId(String applyDeptId) {
		this.applyDeptId = applyDeptId;
	}

	public String getPxshyName() {
		return pxshyName;
	}

	public void setPxshyName(String pxshyName) {
		this.pxshyName = pxshyName;
	}

	public int getCldsh() {
		return cldsh;
	}

	public void setCldsh(int cldsh) {
		this.cldsh = cldsh;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTrainingType() {
		return trainingType;
	}

	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}

	public int getPeriods() {
		return periods;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getPeoples() {
		return peoples;
	}

	public void setPeoples(int peoples) {
		this.peoples = peoples;
	}

	public String getPxlgzt() {
		return pxlgzt;
	}

	public void setPxlgzt(String pxlgzt) {
		this.pxlgzt = pxlgzt;
	}

	public String getPxzzxs() {
		return pxzzxs;
	}

	public void setPxzzxs(String pxzzxs) {
		this.pxzzxs = pxzzxs;
	}

	public String getPxssfs() {
		return pxssfs;
	}

	public void setPxssfs(String pxssfs) {
		this.pxssfs = pxssfs;
	}

	public String getPxdxms() {
		return pxdxms;
	}

	public void setPxdxms(String pxdxms) {
		this.pxdxms = pxdxms;
	}

	public String getZbdw() {
		return zbdw;
	}

	public void setZbdw(String zbdw) {
		this.zbdw = zbdw;
	}

	public String getCbdw() {
		return cbdw;
	}

	public void setCbdw(String cbdw) {
		this.cbdw = cbdw;
	}

	public String getXbdw() {
		return xbdw;
	}

	public void setXbdw(String xbdw) {
		this.xbdw = xbdw;
	}

	public String getPxdd() {
		return pxdd;
	}

	public void setPxdd(String pxdd) {
		this.pxdd = pxdd;
	}

	public Date getNdkssj() {
		return ndkssj;
	}

	public void setNdkssj(Date ndkssj) {
		this.ndkssj = ndkssj;
	}

	public Date getNdjssj() {
		return ndjssj;
	}

	public void setNdjssj(Date ndjssj) {
		this.ndjssj = ndjssj;
	}

	public String getNdpxxs() {
		return ndpxxs;
	}

	public void setNdpxxs(String ndpxxs) {
		this.ndpxxs = ndpxxs;
	}

	public String getPxshy() {
		return pxshy;
	}

	public void setPxshy(String pxshy) {
		this.pxshy = pxshy;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getCzName() {
		return czName;
	}

	public void setCzName(String czName) {
		this.czName = czName;
	}

	public String getCzUsername() {
		return czUsername;
	}

	public void setCzUsername(String czUsername) {
		this.czUsername = czUsername;
	}

}
