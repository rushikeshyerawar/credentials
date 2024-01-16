package com.mindscape.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class imagedata {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String imageName;
	private byte[] imageData;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public byte[] getImageData() {
		return imageData;
	}
	public imagedata(int id, String imageName, byte[] imageData) {
		super();
		this.id = id;
		this.imageName = imageName;
		this.imageData = imageData;
	}
	public imagedata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	@Override
	public String toString() {
		return "imagedata [id=" + id + ", imageName=" + imageName + ", imageData=" + Arrays.toString(imageData) + "]";
	}
}
