package starter;


import com.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ChApplication {
    @Autowired
    public HelloService helloService;

    @RequestMapping("/")
    public String index(){
        return  helloService.sayHello();
    }
    public  static  void main (String[]args){
        SpringApplication.run(ChApplication.class,args);
    }
}
