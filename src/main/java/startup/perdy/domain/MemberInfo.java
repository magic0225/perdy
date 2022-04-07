package startup.perdy.domain;

import jdk.jfr.Name;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "member_info")
@Getter @Setter
@DynamicInsert
@DynamicUpdate
public class MemberInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Name("mem_no")
    private Long memNo;
    @Name("mem_id")
    private String memId;
    @Name("mem_pwd")
    private String memPwd;
    @Name("mem_type")
    private String memType;
    @Name("mem_name")
    private String memName;
    @Name("mem_sex")
    private String memSex;
    @Name("mem_phone")
    private String memPhone;
    @Name("ins_date")
    private LocalDateTime insDate;
    @Name("upd_date")

    private LocalDateTime updDate;



}
