package exam02;

import java.lang.reflect.Method;
import java.util.Arrays;

public record Ex02() {
    public static void main(String[] args) throws Exception {
        Class<Student> cls = Student.class;
        // 클래스 위에 적용된 애노테이션 정보 S
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);
        String[] value = myAnno.value();
        System.out.println(Arrays.toString(value)); // [여기는 메서드!, 여기는 study 메서드!]
        int min = myAnno.min();
        int max = myAnno.max();
        System.out.printf("min : %d , max : %d%n", min, max); //min : 10 , max : 100
        // 메서드 위에 적용된 애노테이션 정보 E
        Method method = cls.getDeclaredMethod("study");
        MyAnno myAnno2 = method.getAnnotation(MyAnno.class);
        String[] value2 = myAnno2.value();
        System.out.println(Arrays.toString(value2)); // 여기는 메서드!
        int min2 = myAnno2.min();
        int max2 = myAnno2.max();
        System.out.printf("min : %d, max : %d%n",min2,max2); //min : 1, max : 10
        // 메서드 위에 적용된 애노테이션 정보 E



    }
}
