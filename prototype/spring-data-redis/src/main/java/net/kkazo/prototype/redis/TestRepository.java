package net.kkazo.prototype.redis;

import net.kkazo.prototype.redis.domain.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Test, String> {

}
