package february;

/**
 * @author qingchen
 * @date 13/2/2023 下午 5:04
 */

public class Day14 {
    enum words{
        DEMOCRATIC(1, "民主的 adj."),
        INVENT(2,"发明；虚构 v."),
        INFINITE(3,"无限的 adj."),
        IMPART(4,"通知；传授 v."),
        AGONY(5,"极大的痛苦（精神上或者肉体上）"),
        INFECTIOUS(6,"传染性的 adj."),
        ATTRACT(7,"吸引注意；引起 v."),
        LEGITIMATE(8,"合法的，合理的 adj."),
        VOCATION(9,"职业 n."),
        SOLID(10,"固体；坚固的，固体的 n. adj."),
        ASSIGNMENT(11,"分配，指派；作业，任务 n."),
        INSPIRE(12,"鼓舞；激起灵感"),
        ACCEPT(13,"接受"),
        SPECIFY(14,"指定，详细说明"),
        FURNACE(15,"炉子，熔炉"),
        SPIRIT(16,"精神；酒精"),
        ELEVATOR(17,"电梯"),
        SUMMON(18,"召唤；鼓起（勇气）"),
        ATTRACTIVE(19,"吸引人的 adj."),
        BARREL(20,"桶；枪管"),
        CARESS(21,"爱抚，抚摸"),
        HERB(22,"草药；香草，草本植物"),
        DILEMMA(23,"困境，进退两难"),

        ;

        int num;
        String translation;

        words(int num, String translation) {
            this.num = num;
            this.translation = translation;
        }
    }


}
