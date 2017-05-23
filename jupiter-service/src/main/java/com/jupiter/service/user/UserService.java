package com.jupiter.service.user;

import com.jupiter.model.JUser;

public interface UserService {

	void save(JUser user);

	void delete(JUser user);

	void update(JUser user);

	void list(JUser user);

}
