package com.example.companyV2.controller;

import com.example.companyV2.repositories.UserRepository;
import com.example.companyV2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/allusers")
    public String allusers(Model m) {
        List <User> list;
        list = userRepository.findAll();
        m.addAttribute("list",list);

        return "allusers";
    }

    @GetMapping(value = "deleteUser/{id}")
    public String delete(@PathVariable int id){
        userRepository.deleteById(id);
        return "redirect:/allusers";
    }

    @GetMapping(value="/editUser/{id}")
    public String edit(@PathVariable int id, Model m){
        User user =userRepository.getOne(id);
        m.addAttribute("command",user);
        return "editUserForm";
    }

    @PostMapping("/editSave")
    @Transactional
    public String editSave(@ModelAttribute("user") User user) {
        System.out.println(user);
        /*User userUpdate = userRepository.getOne(user.getId());
        userUpdate.setFirstname(user.getFirstname());
        userUpdate.setEmail(user.getEmail());
        userUpdate.setLastname(user.getLastname());*/
        //userRepository.saveAndFlush(userUpdate);
        userRepository.save(user);

        return "redirect:/allusers";
    }

    @GetMapping("/user")
    public String getUser(@ModelAttribute("user") User user) {

        return "user";
    }

    @PostMapping("/user")
    public String addRegistration(@RequestParam String cnp,
                                  @RequestParam String firstname,
                                  @RequestParam String lastname,
                                  @RequestParam String email,
                                  @RequestParam String password){

        /*String cnp = body.get("cnp");
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        String email = body.get("email");
        String password = body.get("password");*/

        userRepository.save(new User(cnp,firstname, lastname, email, password));
        return  "redirect:user";
    }

}

