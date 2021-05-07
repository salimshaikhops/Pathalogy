package com.pathalogy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathalogy.repository.GroupMasterInt;

@Service
public class GroupMasterService {

		@Autowired
		private GroupMasterInt groupMasterRepository;
}
