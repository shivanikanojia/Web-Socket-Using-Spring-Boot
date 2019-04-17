package com.inexture.webSockets.model;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table("latlong")
public class LatLongModel {

	@PrimaryKey
	private UUID latLongId;
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ssZ")
	private Date currentTime;
	private Double latitude;
	private Double longitude;

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public UUID getLatLongId() {
		return latLongId;
	}

	public void setLatLongId(UUID latLongId) {
		this.latLongId = latLongId;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}
}
