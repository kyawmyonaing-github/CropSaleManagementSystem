package com.d_code.csms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="crop")
public class Crop {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="crop_code")
	private String cropCode;
	
	@Column(name="crop_name_en")
	private String cropNameEn;
	
	@Column(name="crop_name_jp")
	private String cropNameJp;
	
	@Column(name="crop_name_mm")
	private String cropNameMm;
	
	@Column(name="crop_image")
	private String cropImage;
	
	@Column(name="crop_barcode")
	private String cropBarcode;
	
	@Column(name="crop_qty")
	private char cropQty;
	
	@Column(name="crop_quant")
	private int cropQuant;
	
	@Column(name="corp_price")
	private double corpPrice;
	
	@Column(name="deleted_flag")
	private boolean deletedFlag;
	
	@Column(name="corp_status")
	private int corpStatus;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", shape=Shape.STRING)
	@Column(name="crop_created_at")
	private String cropCreatedAt;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", shape=Shape.STRING)
	@Column(name="crop_updated_at")
	private String cropUpdatedAt;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", shape=Shape.STRING)
	@Column(name="crop_deleted_at")
	private String cropDeletedAt;
	
	@Column(name="version")
	@Version
	private int version;

	// define constructors - no argument
	public Crop() {
		
	}

	// define constructors - usings fields
	public Crop(String cropCode, String cropNameEn, String cropNameJp, String cropNameMm, String cropImage,
			String cropBarcode, char cropQty, int cropQuant, double corpPrice, boolean deletedFlag, int corpStatus,
			String cropCreatedAt, String cropUpdatedAt, String cropDeletedAt, int version) {
		this.cropCode = cropCode;
		this.cropNameEn = cropNameEn;
		this.cropNameJp = cropNameJp;
		this.cropNameMm = cropNameMm;
		this.cropImage = cropImage;
		this.cropBarcode = cropBarcode;
		this.cropQty = cropQty;
		this.cropQuant = cropQuant;
		this.corpPrice = corpPrice;
		this.deletedFlag = deletedFlag;
		this.corpStatus = corpStatus;
		this.cropCreatedAt = cropCreatedAt;
		this.cropUpdatedAt = cropUpdatedAt;
		this.cropDeletedAt = cropDeletedAt;
		this.version = version;
	}

	// define getter/setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCropCode() {
		return cropCode;
	}

	public void setCropCode(String cropCode) {
		this.cropCode = cropCode;
	}

	public String getCropNameEn() {
		return cropNameEn;
	}

	public void setCropNameEn(String cropNameEn) {
		this.cropNameEn = cropNameEn;
	}

	public String getCropNameJp() {
		return cropNameJp;
	}

	public void setCropNameJp(String cropNameJp) {
		this.cropNameJp = cropNameJp;
	}

	public String getCropNameMm() {
		return cropNameMm;
	}

	public void setCropNameMm(String cropNameMm) {
		this.cropNameMm = cropNameMm;
	}

	public String getCropImage() {
		return cropImage;
	}

	public void setCropImage(String cropImage) {
		this.cropImage = cropImage;
	}

	public String getCropBarcode() {
		return cropBarcode;
	}

	public void setCropBarcode(String cropBarcode) {
		this.cropBarcode = cropBarcode;
	}

	public char getCropQty() {
		return cropQty;
	}

	public void setCropQty(char cropQty) {
		this.cropQty = cropQty;
	}

	public int getCropQuant() {
		return cropQuant;
	}

	public void setCropQuant(int cropQuant) {
		this.cropQuant = cropQuant;
	}

	public double getCorpPrice() {
		return corpPrice;
	}

	public void setCorpPrice(double corpPrice) {
		this.corpPrice = corpPrice;
	}

	public boolean isDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public int getCorpStatus() {
		return corpStatus;
	}

	public void setCorpStatus(int corpStatus) {
		this.corpStatus = corpStatus;
	}

	public String getCropCreatedAt() {
		return cropCreatedAt;
	}

	public void setCropCreatedAt(String cropCreatedAt) {
		this.cropCreatedAt = cropCreatedAt;
	}

	public String getCropUpdatedAt() {
		return cropUpdatedAt;
	}

	public void setCropUpdatedAt(String cropUpdatedAt) {
		this.cropUpdatedAt = cropUpdatedAt;
	}

	public String getCropDeletedAt() {
		return cropDeletedAt;
	}

	public void setCropDeletedAt(String cropDeletedAt) {
		this.cropDeletedAt = cropDeletedAt;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	// define tostring
	@Override
	public String toString() {
		return "Crop [id=" + id + ", cropCode=" + cropCode + ", cropNameEn=" + cropNameEn + ", cropNameJp=" + cropNameJp
				+ ", cropNameMm=" + cropNameMm + ", cropImage=" + cropImage + ", cropBarcode=" + cropBarcode
				+ ", cropQty=" + cropQty + ", cropQuant=" + cropQuant + ", corpPrice=" + corpPrice + ", deletedFlag="
				+ deletedFlag + ", corpStatus=" + corpStatus + ", cropCreatedAt=" + cropCreatedAt + ", cropUpdatedAt="
				+ cropUpdatedAt + ", cropDeletedAt=" + cropDeletedAt + ", version=" + version + "]";
	}
	
}
