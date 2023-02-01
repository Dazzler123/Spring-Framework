package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerRepoTest {

    @Autowired
    CustomerRepo repo;

    @Test
    public void testOne() {
//        Customer dasun_shanaka = repo.findCustomerByName("Dasun Shanaka");
//        Customer c2 = repo.readByName("Dasun Shanaka");
//        Customer c3 = repo.getByName("Dasun Shanaka");
//        Customer c4 = repo.queryByName("Dasun Shanaka");
//        Customer c5 = repo.searchByName("Dasun Shanaka");
//        Customer c6 = repo.streamByName("Dasun Shanaka");
//        List<Customer> c7 = repo.findByName("Dasun Shanaka");
//
//        Long c8 = repo.countByName("Dasun Shanaka");
//        boolean c9 = repo.existsByName("Dasun Shanaka");
//
//        repo.deleteByName("Dasun Shanaka");
//        repo.removeByName("Dasun Perera");
//
//        System.out.println(dasun_shanaka.toString());
//        System.out.println(c2.toString());
//        System.out.println(c3.toString());
//        System.out.println(c4.toString());
//        System.out.println(c5.toString());
//        System.out.println(c6.toString());
//        System.out.println(c7.toString());
//
//
//        System.out.println(c8.toString());
//        System.out.println(c9);


         assertThrows(RuntimeException.class,()->{

         });

    }


}