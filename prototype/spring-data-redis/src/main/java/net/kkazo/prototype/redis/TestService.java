package net.kkazo.prototype.redis;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.stream.IntStream;
import net.kkazo.prototype.redis.domain.Test;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	private TestRepository repository;

	public TestService(TestRepository repository) {
		this.repository = repository;
	}

	public void test() throws Exception {

		IntStream.range(0, 10).forEach(i -> {
			Test test = new Test();
			test.setId(i + "");
			test.setName("test " + i);
			test.setCreated(LocalDateTime.now());
			test.setUuid(UUID.randomUUID());

			repository.save(test);
		});

		repository.findAll().forEach(System.out::println);
	}
}
