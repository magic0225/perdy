package startup.perdy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import startup.perdy.repository.MemberInfoRepository;
import startup.perdy.service.MemberInfoService;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    private final EntityManager em;

    public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    @Bean
    public MemberInfoService memberInfoService() {
        return new MemberInfoService(memberInfoRepository());

    }

    @Bean
    public MemberInfoRepository memberInfoRepository() {
        return new MemberInfoRepository(em);
    }


}
