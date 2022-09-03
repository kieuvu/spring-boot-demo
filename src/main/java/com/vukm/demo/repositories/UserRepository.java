package com.vukm.demo.repositories;

import com.vukm.demo.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author kieuvu
 * Created on 03/09/2022.
 */

public interface UserRepository extends CrudRepository<User, Long> {}