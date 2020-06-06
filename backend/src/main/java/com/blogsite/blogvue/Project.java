package com.blogsite.blogvue;

import java.net.URL;
import java.util.ArrayList;


public class Project {

	private String projectName;
	private String purpose;
	private URL repoAddress;
	private ArrayList<String> attributes;
	
	public Project(String projectName, String purpose, URL repoAddress, ArrayList<String> attributes) {
		super();
		this.projectName = projectName;
		this.purpose = purpose;
		this.repoAddress = repoAddress;
		this.attributes = attributes;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public URL getRepoAddress() {
		return repoAddress;
	}

	public void setRepoAddress(URL repoAddress) {
		this.repoAddress = repoAddress;
	}

	public ArrayList<String> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<String> attributes) {
		this.attributes = attributes;
	}
}