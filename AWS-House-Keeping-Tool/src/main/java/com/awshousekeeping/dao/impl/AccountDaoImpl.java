package com.awshousekeeping.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.resource.cci.ResultSet;

import org.apache.log4j.Logger;

import com.awshousekeeping.dao.AccountDao;
import com.awshousekeeping.model.Account;
import com.awshousekeeping.utils.BusinessException;
import com.awshousekeeping.utils.CommonUtility;
import com.awshousekeeping.utils.DBConnect;

public class AccountDaoImpl implements AccountDao {

	static final Logger logger = Logger.getLogger(UserManagementDaoImpl.class);

	public boolean addAccount(Account a) throws BusinessException {
		Connection con = DBConnect.getConnecttion();
		String sql = "insert into account(account_id,created_on,created_by,updated_on,updated_by,hsps_id,project_expire_date,free_trial_expire_date,AWS_account_owner_name,hsps_expire_date,email_id_of_owner,project_name,project_id,account_type,hsps_description,business_unit,AWS_account_number,AWS_account_alias,AWS_access_key,AWS_secret_key,AWS_access_key_XXXX,AWS_secret_key_XXXX ) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;

		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, a.getAccountId());
			ps.setDate(2, CommonUtility.sqlDateConversion(a.getCreatedOn()));
			ps.setString(3, a.getCreatedBy());
			ps.setDate(4, CommonUtility.sqlDateConversion(a.getUpdatedOn()));
			ps.setString(5, a.getUpdatedBy());
			ps.setInt(6, a.getHspsId());
			ps.setDate(7, CommonUtility.sqlDateConversion(a.getProjectExpireDate()));
			ps.setDate(8, CommonUtility.sqlDateConversion(a.getFreeTrialExpireDate()));
			ps.setString(9, a.getAwsAccountOwnerName());
			ps.setDate(10, CommonUtility.sqlDateConversion(a.getHspsExpireDate()));
			ps.setString(11, a.getEmailIdOfOwner());
			ps.setString(12, a.getProjectName());
			ps.setInt(13, a.getProjectId());
			ps.setString(14, a.getAccountType());
			ps.setString(15, a.getHspsDescription());
			ps.setInt(16, a.getBusinessUnit());
			ps.setInt(17, a.getAwsAccountNumber());
			ps.setString(18, a.getAwsAccountAlias());
			ps.setInt(19, a.getAwsAccessKey());
			ps.setInt(20, a.getAwsSecretKey());
			ps.setString(21, a.getAwsAccessKeyXXXX());
			ps.setString(22, a.getAwsSecretKeyXXXX());

			ps.executeUpdate();
			con.close();
			ps.close();
		} catch (SQLException e) {
			logger.error("Error while adding account", e);
			throw new BusinessException("Error While Adding Account", e);
		}

		return true;
	}

	@Override
	public boolean saveAccount(Account a) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(int accountId) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAccount(Account a) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> getAllAccount() throws BusinessException {
		// TODO Auto-generated method stub
	
			List<Account> accounts = new ArrayList();

			Connection con = DBConnect.getConnecttion();
			String sql = "select * from account";
			try {
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
				ResultSet rs = (ResultSet) ps.executeQuery();
				while (rs.next()) {
					
					Account a = new Account();
					
					
					
					a.setAccountId(rs.getInt("account_id"));
					a.setCreatedOn(rs.getDate("created_on"));
					a.setCreatedBy(rs.getString("created_by"));
					a.setUpdatedOn(rs.getDate("updated_on"));
					a.setUpdatedBy(rs.getString("updated_by"));
					a.setHspsId(rs.getInt("hsps_id"));
					a.setProjectExpireDate(rs.getDate("project_expire_date"));
					a.setFreeTrialExpireDate(rs.getDate("free_trial_expire_date"));
					a.setAwsAccountOwnerName(rs.getString("AWS_account_owner_name"));
					a.setHspsExpireDate(rs.getDate("hsps_expire_date"));
					a.setEmailIdOfOwner(rs.getString("email_id_of_owner"));
					a.setProjectName(rs.getString("project_name"));
					a.setProjectId(rs.getInt("project_id"));
					a.setAccountType(rs.getString("account_type"));
					a.setHspsDescription(rs.getString("hsps_description"));
					a.setBusinessUnit(rs.getInt("business_unit"));
					a.setAwsAccountNumber(rs.getInt("AWS_account_number"));
					a.setAwsAccountAlias(rs.getString("AWS_account_alias"));
					a.setAwsAccessKey(rs.getInt("AWS_access_key"));
					a.setAwsSecretKey(rs.getInt("AWS_secret_key"));
					a.setAwsAccessKeyXXXX(rs.getString("AWS_access_key_XXXX"));
					a.setAwsSecretKeyXXXX(rs.getString("AWS_secret_key_XXXX"));
					
					accounts.add(a);
				}

				con.close();
			} catch (SQLException e) {
				logger.error(e);
			}
			return accounts;
		}
}