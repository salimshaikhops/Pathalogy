package com.pathalogy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathalogy.repository.PermissionInt;

@Service
public class PermissionService {
	@Autowired
	private PermissionInt permissionRepository;
}
