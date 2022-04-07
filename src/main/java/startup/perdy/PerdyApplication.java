package startup.perdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import startup.perdy.domain.MemberInfo;
import startup.perdy.repository.MemberInfoRepository;

@SpringBootApplication
public class PerdyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerdyApplication.class, args);


	}

}
