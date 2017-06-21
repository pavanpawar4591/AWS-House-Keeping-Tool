package com.awshousekeeping.services.impl;

import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.model.ListUsersResult;
import com.awshousekeeping.services.AwsIamUserService;
import com.awshousekeeping.utils.AllAWSClientBuilder;
import com.awshousekeeping.utils.BusinessException;

/**
 * 
 * @author pavan_pawar
 *
 */
public class AwsIamUserServiceImpl implements AwsIamUserService {

	@Override
	public ListUsersResult getAllIAMUSers(int acountID) throws BusinessException {

		try {
			AmazonIdentityManagement iamClient = AllAWSClientBuilder.getIAMClient(acountID);
			return iamClient.listUsers();

		} catch (Exception e) {

			throw new BusinessException("error at get user", e);
		}

	}

}