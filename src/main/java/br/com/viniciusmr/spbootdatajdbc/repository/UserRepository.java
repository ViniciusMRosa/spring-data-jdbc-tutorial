package br.com.viniciusmr.spbootdatajdbc.repository;

import br.com.viniciusmr.spbootdatajdbc.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User,Long>{

}