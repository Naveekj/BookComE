package com.booknet.bookcomm.model.dao;

import com.booknet.bookcomm.model.LocalUser;
import org.springframework.data.repository.CrudRepository;

public interface LocalUserDAO extends CrudRepository<LocalUser, Long> {
}
