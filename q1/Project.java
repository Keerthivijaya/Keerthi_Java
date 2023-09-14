package com.gl.gradedproject.q1;


import java.io.Serializable;

public class Project implements Serializable{
	
	String projectcode;
	String projectname;
	int projectstrength;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String projectcode, String projectname, int projectstrength) {
		super();
		this.projectcode = projectcode;
		this.projectname = projectname;
		this.projectstrength = projectstrength;
	}
	public String getProjectcode() {
		return projectcode;
	}
	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public int getProjectstrength() {
		return projectstrength;
	}
	public void setProjectstrength(int projectstrength) {
		this.projectstrength = projectstrength;
	}
	@Override
	public String toString() {
		return "Project [projectcode=" + projectcode + ", projectname=" + projectname + ", projectstrength="
				+ projectstrength + "]";
	}
}