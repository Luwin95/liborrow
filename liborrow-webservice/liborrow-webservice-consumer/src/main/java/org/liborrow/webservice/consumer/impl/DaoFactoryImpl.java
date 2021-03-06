package org.liborrow.webservice.consumer.impl;

import org.liborrow.webservice.consumer.contract.DaoFactory;
import org.liborrow.webservice.consumer.contract.dao.AuthorDao;
import org.liborrow.webservice.consumer.contract.dao.BookDao;
import org.liborrow.webservice.consumer.contract.dao.BorrowDao;
import org.liborrow.webservice.consumer.contract.dao.MagazineDao;
import org.liborrow.webservice.consumer.contract.dao.UserDao;

public class DaoFactoryImpl implements DaoFactory {
	private AuthorDao authorDao;
	private BookDao bookDao;
	private MagazineDao magazineDao;
	private BorrowDao borrowDao;
	private UserDao userDao;
	
	@Override
	public AuthorDao getAuthorDao() {
		return authorDao;
	}
	
	@Override
	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}
	
	@Override
	public BookDao getBookDao() {
		return bookDao;
	}
	
	@Override
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public MagazineDao getMagazineDao() {
		return magazineDao;
	}
	
	@Override
	public void setMagazineDao(MagazineDao magazineDao) {
		this.magazineDao = magazineDao;
	}

	@Override
	public BorrowDao getBorrowDao() {
		return borrowDao;
	}

	@Override
	public void setBorrowDao(BorrowDao borrowDao) {
		this.borrowDao = borrowDao;
	}

	@Override
	public UserDao getUserDao() {
		return userDao;
	}

	@Override
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	
}
