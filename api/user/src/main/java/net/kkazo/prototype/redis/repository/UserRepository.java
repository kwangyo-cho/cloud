package net.kkazo.prototype.redis.repository;

import com.google.common.collect.Lists;
import net.kkazo.prototype.redis.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

	private List<User> userList = Lists.newArrayList(
		User.build("1", "멍멍")
		, User.build("2", "왈왈")
		, User.build("3", "으르렁")

	);

	public List<User> find() {
		return userList;
	}
}
