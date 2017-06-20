package com.awshousekeeping.services;

import java.util.List;
import java.util.Map;

import com.amazonaws.services.ec2.model.Volume;

public interface AwsEBSResourceService {
	/**
	 * This method used to find all volume list
	 * 
	 * @param accountid
	 * @return
	 */
	Map<String, List<Volume>> getAllRegionsEBSVolume(String accountid);
}
