package startup.perdy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startup.perdy.domain.MemberInfo;
import startup.perdy.repository.MemberInfoRepository;

import javax.transaction.Transactional;

@Transactional
public class MemberInfoService {

    private MemberInfoRepository memberInfoRepository;

    public MemberInfoService(MemberInfoRepository memberInfoRepository) {
        this.memberInfoRepository = memberInfoRepository;
    }

    public MemberInfo getMemName(Long memNo) {
        return memberInfoRepository.findByName(memNo);
    }
    public MemberInfo setMemInfo(MemberInfo memberInfo) {
        return memberInfoRepository.saveMember(memberInfo);
    }
}
