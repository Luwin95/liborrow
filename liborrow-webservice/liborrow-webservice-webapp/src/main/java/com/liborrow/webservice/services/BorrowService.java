package com.liborrow.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;

import com.liborrow.webservice.AbstractService;

@WebService(name = "BorrowClient", serviceName = "BorrowService", portName = "BorrowPort", targetNamespace="model.generated.webinterface.liborrow.com")
public class BorrowService extends AbstractService {
	
	@WebMethod
	public BorrowDTO getBorrow(long id)
	{
		return getManagerFactory().getBorrowManager().findBorrowById(id);
	}
	
	@WebMethod
	public List<BorrowDTO> getUserBorrows(UserLightDTO user)
	{
		return getManagerFactory().getBorrowManager().findOnGoingBorrowsByUser(user);
	}
	
	@WebMethod
	public List<BorrowDTO> getAllBorrows()
	{
		return getManagerFactory().getBorrowManager().findAllBorrows();
	}

	@WebMethod
	public boolean markBorrowAsExtended(BorrowDTO borrow)
	{
		return getManagerFactory().getBorrowManager().markAsExtended(borrow);
	}
	
	@WebMethod
	public void saveNewBorrow(BorrowDTO borrow)
	{
		getManagerFactory().getBorrowManager().newBorrow(borrow);
	}
	
	@WebMethod
	public void updateBorrow(BorrowDTO borrow)
	{
		getManagerFactory().getBorrowManager().updateBorrow(borrow);
	}
	
	@WebMethod
	public void deleteBorrow(BorrowDTO borrow)
	{
		getManagerFactory().getBorrowManager().deleteBorrow(borrow);
	}

	@WebMethod
	public List<BorrowDTO> findLateBorrows()
	{
		return getManagerFactory().getBorrowManager().findLateBorrows();
	}
}
