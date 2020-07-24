package com.gospec.domain;

public class BoardTeamDto {

	private String username;
	private int postNo;
	private String title;
	private String contest;
	private int memeberMax;
	private int memberCur;
	private String registTime;
	private int contestNo;
	private String teamId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContest() {
		return contest;
	}

	public void setContest(String contest) {
		this.contest = contest;
	}

	public int getMemeberMax() {
		return memeberMax;
	}

	public void setMemeberMax(int memeberMax) {
		this.memeberMax = memeberMax;
	}

	public int getMemberCur() {
		return memberCur;
	}

	public void setMemberCur(int memberCur) {
		this.memberCur = memberCur;
	}

	public String getRegistTime() {
		return registTime;
	}

	public void setRegistTime(String registTime) {
		this.registTime = registTime;
	}

	public int getContestNo() {
		return contestNo;
	}

	public void setContestNo(int contestNo) {
		this.contestNo = contestNo;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

}
