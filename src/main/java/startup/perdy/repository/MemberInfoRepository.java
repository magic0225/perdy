package startup.perdy.repository;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import startup.perdy.domain.MemberInfo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class MemberInfoRepository implements MemberRepository {

    private final EntityManager em;

    public MemberInfoRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public MemberInfo findByName(Long memNo) {
        MemberInfo memberInfo = em.find(MemberInfo.class, memNo);
        return memberInfo;
    }

    @Override
    public MemberInfo saveMember(MemberInfo memberInfo) {
        em.persist(memberInfo);
        return memberInfo;
    }





}
