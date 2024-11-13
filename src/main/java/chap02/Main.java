package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g = ctx.getBean("greeter", Greeter.class);
        String msg = g.greet("스프링") ;
        System.out.println(msg) ;
        ctx.close();
    }

}

//  AnnotationConfigApplicationContext : 자바 애노테이션을 이용한 클래스로부터 객체 설정 정보를 가져온다.
// GenericXmlApplicationContext : XML 로부터 객체 설정 정보를 가져온다.
// GenericGroovyApplicationContext : 그루비 코드를 이용해 설정 정보를 가져온다.
