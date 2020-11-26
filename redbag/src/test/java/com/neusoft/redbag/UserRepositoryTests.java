package com.neusoft.redbag;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository repository;

   @Test
   public void save(){
       User user = new User();
       user.setUsername("edsfws");
       user.setPassword("2180");
       user.setEmail("dsads");
       repository.save(user);
   }
    @Test
    public void update(){
        User user = new User();
        user.setId("4028778175fe84190175fe8427ac0000");
        user.setUsername("哈哈");
        user.setPassword("7777");
        repository.save(user);
    }

    @Test
    public void delete(){
        String id = "4028778175fe86d20175fe86e0580000";
        repository.deleteById(id);
    }


    @Test
    public void findById(){
        String id = "4028778175fe86030175fe86124b0000";
        Optional<User> optional = repository.findById(id);
        User user = optional.get();
        System.out.println(user);
    }

    @Test
    public void findAll(){
        List<User> list = repository.findAll();
        for(User u : list){
            System.out.println(u);
        }
    }
}
