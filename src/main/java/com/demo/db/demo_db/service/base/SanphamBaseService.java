/* 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://app.skaffolder.com/#!/register?friend=5dc0d9f09ef7a1181f8e133e
*
* You will get 10% discount for each one of your friends
* 
*/
package com.demo.db.demo_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.demo.db.demo_db.entity.Sanpham;

import com.demo.db.demo_db.entity.User;

import com.demo.db.demo_db.repositories.SanphamRepository;

@Service
@Transactional
public class SanphamBaseService {

	
	@Autowired
	SanphamRepository sanphamRepository;


    // CRUD METHODS
    
	// CRUD - GET ONE
    	
	public Sanpham getOne(Long id) {
		return sanphamRepository.findOne(id);
	}


}
