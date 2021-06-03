package com.smartcontact.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcontact.manager.entity.DocRefCode;
import com.smartcontact.manager.entity.GroupMaster;
import com.smartcontact.manager.repository.GroupMasterInt;

@Service
public class GroupMasterService {

		@Autowired
		private GroupMasterInt groupMasterRepository;

		public List<GroupMaster> getAllRecord() {
			// TODO Auto-generated method stub
			List<GroupMaster> lis=(List<GroupMaster>)groupMasterRepository.findAll();
			return lis;
		
		}

		public GroupMaster addGroupName(GroupMaster groupEntity) {
			// TODO Auto-generated method stub
			
			GroupMaster groupEntity2=groupMasterRepository.save(groupEntity);
			return groupEntity2;
		}

		public void deleteGroupById(int id) {
			// TODO Auto-generated method stub
			
			groupMasterRepository.deleteById(id);
		}

		public GroupMaster updatedGroup(GroupMaster groupEntity, int id) {
			// TODO Auto-generated method stub
			groupEntity.setGroup_id(id);
			 return groupMasterRepository .save(groupEntity);
		}

		public GroupMaster getGroupById(int group_id) {
			// TODO Auto-generated method stub
			Optional<GroupMaster> groupMaster= groupMasterRepository.findById(group_id);
			GroupMaster groupMaster2=groupMaster.get();
			return groupMaster2;
		}
		
		
		
		
		
		
}
