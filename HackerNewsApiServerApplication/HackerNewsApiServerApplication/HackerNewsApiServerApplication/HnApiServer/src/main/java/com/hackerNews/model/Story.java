package com.hackerNews.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * Story class
 * @author Pragya Jha
 *
 */

public class Story implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Fields to be returned in response
	 */
	private String by;
	private int score;
	private int time;
	private String title;
	private String url;
	
	/**
	 * Fields to be used but not returned in response
	 */
//	@Getter(onMethod = @(@JsonIgnore))
//	@Setter(onMethod = @(@JsonProperty))
	private int[] kids;

	@JsonIgnore
	public String getBy() {
		return by;
	}

	@JsonProperty
	public void setBy(String by) {
		this.by = by;
	}

	@JsonIgnore
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int[] getKids() {
		return kids;
	}

	public void setKids(int[] kids) {
		this.kids = kids;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//	@Getter(onMethod = @__(@JsonIgnore))
//	@Setter(onMethod = @__(@JsonProperty))
	private String type;



	/**
	 * Overriding equals() to compare objects excluding score and kids because they
	 * can change but other fields remain same
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Story other = (Story) obj;
		if (by == null) {
			if (other.by != null)
				return false;
		} else if (!by.equals(other.by))
			return false;
		if (time != other.time)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((by == null) ? 0 : by.hashCode());
		result = prime * result + time;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

}
