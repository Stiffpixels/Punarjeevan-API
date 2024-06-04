package com.punarjeevan.root.model;


import java.util.Map;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Saves {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int saveId;
	
	@JdbcTypeCode( SqlTypes.JSON )
	private Map<String, String> playerSave;

	public int getUserId() {
		return saveId;
	}

	public void setSaveId(int saveId) {
		this.saveId = saveId;
	}

	public Map<String, String> getPlayerSave() {
		return playerSave;
	}

	public void setPlayerSave(Map<String, String> playerSave) {
		this.playerSave = playerSave;
	}
}
