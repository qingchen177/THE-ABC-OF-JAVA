package february;

import lombok.Getter;

/**
 * @author qingchen
 * @date 20/2/2023 下午 17:31
 */
@Getter
public enum Day20 {

    hurl(1,"猛投"),
    interact(2,"互动"),
    sanitation(3,"卫生环境、卫生设备"),
    aid(4,"援助，有助于"),
    incompetence(5,"无能"),
    propose(6,"提出"),
    delicate(7,"精细的，细微的"),
    deprive(8,"剥夺"),
    payroll(9,"工资总额"),
    lawsuit(10,"诉讼"),
    needle(11,"针，指针"),
    branch(12,"分支"),
    conventional(13,"传统的"),
    retailer(14,"零售商"),
    untrustworthy(15,"不值得信任的"),
    frighten(16,"使害怕"),
    compliment(17,"恭维"),
    complement(18,"补充"),
    arise(19,"出现"),
    plough(20,"犁"),
    carpenter(21,"木匠"),
    endure(22,"忍受"),
    affiliate(23,"使隶属于"),
    organic(24,"有机的"),
    rare(25,"罕见的"),
    sheer(26,"纯粹的"),
    embrace(27,"采纳，接受")
    ;

    private Integer code;
    private String translation;

    Day20(Integer code, String translation) {
        this.code = code;
        this.translation = translation;

    }
}
