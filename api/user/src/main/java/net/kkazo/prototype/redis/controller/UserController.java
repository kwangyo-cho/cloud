package net.kkazo.prototype.redis.controller;

import net.kkazo.prototype.redis.domain.User;
import net.kkazo.prototype.redis.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/users")
	public List<User> find() {
		return userRepository.find();
	}
}
