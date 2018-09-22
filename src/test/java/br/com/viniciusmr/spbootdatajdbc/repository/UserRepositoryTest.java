package br.com.viniciusmr.spbootdatajdbc.repository;

import br.com.viniciusmr.spbootdatajdbc.SpbootDataJdbcApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.viniciusmr.spbootdatajdbc.model.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testInsertNewUser(){
       var user = userRepository.save(User.of("User 1"));
       assertNotNull(user);
       assertNotNull(user.getId());
       assertEquals("User 1", user.getName());
    }

    @Test
    public void testFindAll(){
        userRepository.save(User.of("User 1"));
        userRepository.save(User.of("User 2"));
        List<User> userList = StreamSupport.stream(userRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());Collectors.toList();
        assertNotNull(userList);
        assertEquals(2,userList.size());
    }

    @Test
    public void testUpdateUser(){
        var user = userRepository.save(User.of("User 1"));

        var userToUpdate = userRepository.findById(user.getId());

        userToUpdate.ifPresent(u ->{
                u.setName(u.getName() + " Updated");
                userRepository.save(u);
        });

        assertEquals(user.getName() + " Updated",userRepository.findById(user.getId()).get().getName());
    }

    @Test
    public void testDeleteUser(){
        var user = userRepository.save(User.of("My user"));
        userRepository.deleteById(user.getId());
        assertFalse(userRepository.findById(user.getId()).isPresent());

    }
}