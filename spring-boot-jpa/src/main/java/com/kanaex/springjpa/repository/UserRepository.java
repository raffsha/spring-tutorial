package com.kanaex.springjpa.repository;

import com.kanaex.springjpa.model.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, String> {

}
