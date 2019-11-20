package com.educrm.branchservice.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.educrm.branchservice.model.Branch;

public class BranchDAO {

	//private int branchIdIncrementer = 0;
	private Map<Long, Branch> branchMap = new HashMap<>();
	
	public List<Branch> getAllBranches() {
		return  branchMap.values().stream().collect(Collectors.toList());
	}
	
	public Branch getBranchDetails(long branchId) {
		return branchMap.get(branchId);
	}
	
	public Branch saveBranch(Branch branch) {
		return branchMap.put(branch.getId(), branch);
	}
	
	
}
