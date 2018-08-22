package service;

import com.sinochem.domain.AcpsAcctMast;
import com.sinochem.service.AcpsAcctMastService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcpsAcctMastServiceTest {
    @Autowired
    AcpsAcctMastService acpsAcctMastService;

    @Test
    public void listAcpsAcctMast() {
        List<AcpsAcctMast> list = acpsAcctMastService.listAcpsAcctMast();
        System.out.println(list);
    }
}
