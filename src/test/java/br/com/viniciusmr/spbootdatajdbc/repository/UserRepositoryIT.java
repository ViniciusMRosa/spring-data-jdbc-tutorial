package br.com.viniciusmr.spbootdatajdbc.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.viniciusmr.spbootdatajdbc.model.User;

@RunWith(SpringRunner.class)
public class UserRepositoryIT{

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testINsert(){
       User usuario = userRepository.save(new User(1L,"Usuário"));    
       assertNotNull(usuario);
       assertEquals(1, usuario.getId().intValue());
       assertEquals("Usuário", usuario.getName());
    }

}