package basis;

/**
 * Description: int类型测试类
 * Project: javaRelated <br />
 * ClassName: intDemo <br />
 *
 * @Author Wang Shaopeng
 * @Date 2019/3/22 9:56
 */
public class intDemo {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
        Integer c = new Integer(127);
        Integer d = new Integer(127);
        System.out.println(a == c);
        System.out.println(c == d);
    }
}
