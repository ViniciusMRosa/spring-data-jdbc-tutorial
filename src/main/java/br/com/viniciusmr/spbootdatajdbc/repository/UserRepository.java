package br.com.viniciusmr.spbootdatajdbc.repository;

import br.com.viniciusmr.spbootdatajdbc.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{

}