package com.liborrow.webinterface.business.impl.manager;

import java.util.List;

import com.liborrow.webinterface.business.contract.manager.UserManager;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public class UserManagerImpl extends AbstractManagerImpl implements UserManager {
	
	public UserLightDTO loginUser(String email, String password)
	{
		return getDaoFactory().getUserDao().login(email, password);
	}
	
	public UserLightDTO findById(long idUser) {
		return getDaoFactory().getUserDao().findById(idUser);
	}
}
