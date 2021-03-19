package com.wong.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankbookService {
	
	@Autowired
	private BankBookDAO bakBankBookDAO;
	
	
	public List<BankBookDTO> getList()throws Exception {
	     
		 return bakBankBookDAO.getList();
	 }
}
