package com.jeswin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeswin.entity.Lead;
import com.jeswin.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;
	@Override
	public void saveLeaddata(Lead lead) {

		leadRepo.save(lead);

	}

}
