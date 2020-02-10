package @init.package@;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@EnableTransactionManagement
@MapperScan({"@init.package@.domain.dao"})
@SpringBootApplication
public class @init.camelName@Application {

    public static void main(String[] args) {
        SpringApplication.run(@init.camelName@Application.class, args);
    }
}
