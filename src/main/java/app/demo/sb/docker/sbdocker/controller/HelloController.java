package app.demo.sb.docker.sbdocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.demo.sb.docker.sbdocker.models.Employee;

@Controller 
public class HelloController{

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name, Model model) throws Exception {

      Employee emp = new Employee();

      emp.setFirstName("Larry");
      emp.setLastName("Ellison");
      emp.setEmail("iamtheceo@oracle.com");
      emp.setPhone("000-0000-0000");
      emp.setHireDate("2019-12-11");
      emp.setJobTitle("CEO");

      model.addAttribute("firstName", emp.getFirstName());
      model.addAttribute("lastName", emp.getLastName());
      model.addAttribute("email", emp.getEmail());
      model.addAttribute("phone", emp.getPhone());
      model.addAttribute("hireDate", emp.getHireDate());
      model.addAttribute("jobTitle", emp.getJobTitle());

      System.out.println(model.getAttribute("firstName"));
      
      return "hello";
   }

}