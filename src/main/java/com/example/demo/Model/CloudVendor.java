package com.example.demo.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
@ApiModel(description = "This tabel holds cloud vendor details.")
public class CloudVendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vendor_id")
	@ApiModelProperty(notes = "The Id should be unique.")
	private Long vendorId; // Changed to Long to support auto-increment

	@Column(name = "vendor_name")
	private String vendorName;

	@Column(name = "vendor_address")
	private String vendorAddress;

	@Column(name = "vendor_phone_number")
	private String vendorPhoneNumber;

	// Default constructor
	public CloudVendor() {
	}

	// Parameterized constructor
	public CloudVendor(String vendorName, String vendorAddress, String vendorPhoneNumber) {
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

	// Getters and Setters
	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}

	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

	@Override
	public String toString() {
		return "CloudVendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", vendorPhoneNumber=" + vendorPhoneNumber + "]";
	}
}
