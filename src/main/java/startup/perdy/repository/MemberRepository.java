package startup.perdy.repository;

import java.util.List;
import startup.perdy.domain.MemberInfo;

public interface MemberRepository {

    MemberInfo findByName(Long memNo);
    MemberInfo saveMember(MemberInfo memberInfo);
}
