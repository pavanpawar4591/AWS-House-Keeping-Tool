package com.awshousekeeping.services;

import com.amazonaws.services.identitymanagement.model.ListUsersResult;
import com.awshousekeeping.utils.BusinessException;

/**
 * 
 * @author pavan_pawar
 *
 */

public interface AwsIamUserService {

	public ListUsersResult getAllIAMUSers(int accountId) throws BusinessException;

}