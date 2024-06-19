package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);

	public String updateCloudVendor(CloudVendor cloudVendor);

	public Long deleteCloudVendor(Long cloudVendorId);

	public CloudVendor getCloudVendor(Long cloudVendorId);

	public List<CloudVendor> getAllCloudVendors(Long vendorId);

	public List<CloudVendor> getByVendorName(String vendorName);

	List<CloudVendor> getAllCloudVendors();

}
