package com.hackerNews.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * TopComment class
 * @author Pragya Jha
 *
 */

@ToString
public class TopComment {
	private String text;
	private String by;
	private int age;
	//@JsonIgnore
	private int totalComments;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public TopComment(String text, String by, int age, int totalComments) {
		super();
		this.text = text;
		this.by = by;
		this.age = age;
		this.totalComments = totalComments;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTotalComments() {
		return totalComments;
	}
	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}
}
