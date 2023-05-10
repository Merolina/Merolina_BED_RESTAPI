package com.gl.security.studentMgmtDebate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.gl.security.studentMgmtDebate.Model.User;
import com.gl.security.studentMgmtDebate.Repository.UserRepository;
import com.gl.security.studentMgmtDebate.Security.MyUserDetails;



public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userRepository.getUserByUsername(username);
		if(user == null)
		{
			throw new UsernameNotFoundException("User Could not be found");
		}
		
		return new MyUserDetails(user);

	}

}
