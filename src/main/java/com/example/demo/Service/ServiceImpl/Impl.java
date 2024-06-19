package com.example.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.CloudVendorNotFoundException;
import com.example.demo.Model.CloudVendor;
import com.example.demo.Response.CloudVendorRepository;
import com.example.demo.Service.CloudVendorService;

@Service
public class Impl implements CloudVendorService {

	@Autowired
	CloudVendorRepository cloudVendorRepo;

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepo.save(cloudVendor);
		return "Success";
	}

	@Override
	public Long deleteCloudVendor(Long cloudVendorId) {
		cloudVendorRepo.deleteById(cloudVendorId);
		return null;
	}

	@Override
	public CloudVendor getCloudVendor(Long cloudVendorId) {
		if (cloudVendorRepo.findById(cloudVendorId).isEmpty()) {
			 throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
		}
		return cloudVendorRepo.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {

		return cloudVendorRepo.findAll();
	}

	@Override
	public List<CloudVendor> getByVendorName(String vendorName) {
		return cloudVendorRepo.findByVendorName(vendorName);
	}

	@Override
	public List<CloudVendor> getAllCloudVendors(Long vendorId) {
		 return cloudVendorRepo.findAll();
		
	}

}
