package com.smartcontact.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.repository.GroupMasterInt;

@Service
public class GroupMasterService {

		@Autowired
		private GroupMasterInt groupMasterRepository;
}
