package com.neusoft.redbag;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping()
    public User save(@RequestBody User user){
        return repository.save(user);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id")String id){
        Optional<User> optinal = repository.findById(id);
        // 假设获取不到前面的就会主动调用后面参数的内容
        // 对象::new  创建对象的简写  jdk8以上
        return optinal.orElseGet(User::new);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")String id){
            repository.deleteById(id);
    }

}
