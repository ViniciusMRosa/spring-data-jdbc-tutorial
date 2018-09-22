package br.com.viniciusmr.spbootdatajdbc.repository;

import br.com.viniciusmr.spbootdatajdbc.model.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "users",path = "users")
public interface UserRepository extends CrudRepository<User,Long>{

    @Query("select id,name from user where name like :name")
    Optional<User> findByName(@Param("name") String name);
}