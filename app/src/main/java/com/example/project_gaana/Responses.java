package com.example.project_gaana;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Responses implements Serializable {

	@SerializedName("resultCount")
	private int resultCount;

	@SerializedName("results")
	private List<ResultsItem> results;

	public int getResultCount(){
		return resultCount;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}