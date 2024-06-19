package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CloudVendor;
import com.example.demo.Response.ResponseHandler;
import com.example.demo.Service.CloudVendorService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v21")
public class CloudVendorController {

	@Autowired
	CloudVendorService cloudVendorService;

	// Read specific cloud vendor details from DB

	@GetMapping("/vendor/{vendorId}")
	@ApiOperation(value="CloudVendorService cloudVendoerService")
	public ResponseEntity<Object> getCloudVendorDetails(@PathVariable Long vendorId) {
		return ResponseHandler.responseBuilder("Requested vendor details are given here:", HttpStatus.OK,
				cloudVendorService.getAllCloudVendors(vendorId));
	}

	// Read All cloud Vendor Details from DB
	@GetMapping("/vendors")
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendors();
	}

	@PostMapping("/vendors")
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor created Successfully";

	}

	@PutMapping("/vendors")
	public String updateCloiudVendorDetails(@PathVariable CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "updated successfully";
	}

	@DeleteMapping("/vendor/{vendorId}")
	public Long deleteCloudVendorDetails(@PathVariable Long vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return null;
	}

}
