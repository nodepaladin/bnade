package com.bnade.wow.po;

public class Task {

	public static final int ARCHIVE_TASK = 1;
	public static final int HOTITEM_TASK = 2;
	public static final int TSM_APP_DATA_TASK = 3;

	private int type;
	private int realmId;
	private String date;
	private long lastUpdated;

	public Task() {
	}

	public Task(int realmId, String date, int type) {
		this.realmId = realmId;
		this.date = date;
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public long getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public int getRealmId() {
		return realmId;
	}

	public void setRealmId(int realmId) {
		this.realmId = realmId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
