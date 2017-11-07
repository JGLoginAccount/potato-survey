package com.libertymutual.goforcode.hello_world_again.models;

public class SurveyResults {

	private int sweetCount;
	private int goldCount;
	private int russetCount;

	public void registerRussetVote() {
		russetCount = russetCount + 1;
	}

	public void registerGoldVote() {
		goldCount = goldCount + 1;
	}

	public void registerSweetdVote() {
		sweetCount = sweetCount + 1;
	}

	public int currentRusset() {
		return russetCount;
	}

	public int currentGold() {
		return goldCount;
	}

	public int currentSweet() {
		return sweetCount;
	}

}
