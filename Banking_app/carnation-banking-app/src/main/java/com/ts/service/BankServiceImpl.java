package com.ts.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Bank;
import com.ts.model.ResponseDTO;
import com.ts.model.UserDetailsDTO;
import com.ts.repository.BankRepository;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankRepository bankRepository;
	
	@Override
	public Bank register(Bank bank) {

		boolean creatingNewAcc = true; 
		Long acc = null;

		
		while(creatingNewAcc) {
			Random random = new Random(); //0 - 100000
			Long tempAcc = random.nextLong(100000); // 234, 657, 9999, 234
			
			Optional<Bank> existingAcc = bankRepository.findByAccountNumber(acc);
			
			if(!existingAcc.isPresent()) {
				acc = tempAcc;
				creatingNewAcc = false;
			}

		}
		bank.setAccountNumber(acc);
		
		return bankRepository.save(bank);
		
	}

	@Override
	public List<UserDetailsDTO> getAllUsers() {
		// only show username and account number
		List<Bank> accounts = bankRepository.findAll();
		List<UserDetailsDTO> userdetails = new ArrayList<>();
		for(Bank account: accounts) {
			UserDetailsDTO ud = new UserDetailsDTO(account.getName(), account.getAccountNumber());
			userdetails.add(ud);
		}
		return userdetails;
	}

	@Override
	public String transfer(Long fromAccount, Long toAccount, Long amount) {
		
		Bank fromAcc = bankRepository.findByAccountNumber(fromAccount).get();
		Bank toAcc = bankRepository.findByAccountNumber(toAccount).get();
				
		//check accounts are available or not
		
		//check balance of fromAccount (>=amount)

		fromAcc.setBalance(fromAcc.getBalance() - amount);
		
		toAcc.setBalance(toAcc.getBalance() + amount);
		
		bankRepository.save(fromAcc);
		bankRepository.save(toAcc);
		
		return "Amount transfer successfully";
	}

	@Override
	public ResponseDTO delete(Long accNo) {
		bankRepository.deleteByAccNo(accNo);
		return new ResponseDTO("Account deleted successfully");
	}

}
