package com.example.demo.Response;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.CloudVendor;

public interface CloudVendorRepository  extends JpaRepository<CloudVendor ,Long>{
	List<CloudVendor> findByVendorName(String vendorName);

}
