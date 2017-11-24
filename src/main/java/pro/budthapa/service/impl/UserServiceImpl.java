package pro.budthapa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.budthapa.domain.AppUser;
import pro.budthapa.repository.UserRepository;
import pro.budthapa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public AppUser saveUser(AppUser user) {
		return userRepository.save(user);
	}

}
