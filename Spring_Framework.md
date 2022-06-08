# Spring_Framework

* __Spring Framework란?__
  * 자바 플랫폼을 위한 오픈소스 애플리케이션 프래임워크이며 스프링(Spring)으로 불린다.
  * 동적인 웹 사이트를 개발하기 위한 여러 가지 서비스를 제공하며, 전자 정부 표준 프레임워크의 기반 기술로 대한민국 공공기관의 웹 서비스 개발 시 사용을 권장하고 있다.
    * __[Spring 공식 사이트](https://spring.io/)__

---

* __Spring Framework의 특징__

|      __DI__<br/>(Dependency Injection)<br/>의존성 주입       | 설정 파일이나 어노테이션을 통해 객체간의 의존 관계를 설정하여 개발자가 직접 의존하는 객체를 생성할 필요가 없다 . |
| :----------------------------------------------------------: | ------------------------------------------------------------ |
| __Spring AOP<br> (Aspect Oriented Programming) <br> 관점 지향 프로그래밍__ | 트랜잭션, 로깅, 보안 등 여러 모듈, 여러 계층에서 공통으로 필요로 하는 기능의 경우 해당 기능들을 분리하여 관리한다. |
|             __POJO <br>(Plain Old Java Object)__             | <br/>일반적인 J2EE 프레임워크에 비해 특정 라이브러리를 사용할 필요가 없어 개발이 쉬우며, 기존 라이브러리의 지원이 용이하다. <br/> |
|         __IOC<br>(Inversion of Control)  제어 반전__         | <br/>컨트롤의 제어권이 개발자가 아니라 프레임워크에 있다는 뜻으로 <br>객체의 생성부터 모든 생명주기의 관리까지 프레임워크가 주도하고 <br/>있다.  객체를 생성하고, 직접 호출하는 프로그램이 아니라, 만들어둔 <br>자원을 호출 해서 사용한다. <br/> |
|                       __Spring JDBC__                        | <br/>Mybatis나 Hibernate 등의 데이터베이스를 처리하는 영속성 프레임워크와 연결할 수 있는 인터페이스를 제공한다. <br/> |
|                        __Spring MVC__                        | <br/>MVC 디자인 패턴을 통해 웹 어플리케이션의 `Model`, `View`,<br/>`Controller`  사이 의 의존 관계를 DI 컨테이너에서 관리하여 <br/>개발자가 아닌  서버가 객체들을 관리하는 웹 애플리케이션을 구축 할 수 있다 |
|         __PSA <br/>(Portable Service Abstraction)__          | <br/>스프링은 다른 여러 모듈을 사용함에 있어 별도의 추상화 레이어를 <br/> 제공한다.  예를 들어 JPA를 사용할 때에서 Spring JPA를 사용하여 <br/> 추상화하므로 실제 구현에 있어서 Hibernate를 사용하든 <br/> EclipseLink를 사용하든 개발자는 이 모듈의 의존 없이 프로그램에 <br/> 집중할 수 있다. <br/> |

---

# Spring IOC (Inversion of Control)

* __IOC(제어 반전) 란 ?__
  * IOC란, `Inversion of Control`의 약자로 프로그램을 구동하는데 필요한 객체에 대한 생성, 변경 등의 관리를 프로그램을 개발하는 사람이 아닌 프로그램을 구동하는 컨테이너에서 직접 관리하는 것을 말한다. 스프링은 IOC 구조를 통해 구동 시 필요한 객체의 생성부터 __생명주기__까지 해당 객체에 대한 관리를 직접 수행한다.

*  __Spring IOC 컨테이너__
  * 스프링에서 관리하는 객체를 `Bean(빈)` 이라고 하고, 해당 빈들을 관리한다는 의미로 컨테이너를  `Bean Factory` 라고 한다.
* __IOC 컨테이너의 역할__
  1. 객체의 생명주기와 의존성을 관리한다.
  2. VO (DTO / POJO) 객체의 생성, 초기화, 소멸 등의 처리를 담당한다.
  3. 개발자가 직접 객체를 생성할 수 있지만 해당 권한을 컨테이너에 맡김으로써 소스 코드 구현의 시간을 단축할 수 있다.
* __IOC 컨테이너와 Bean 객체__

|                  __Bean__<br>빈                  | -스프링이 IOC방식으로 관리하는Class<br>-스프링이 직접 생성과 제어릴 담당하는 객체 |
| :----------------------------------------------: | ------------------------------------------------------------ |
|          __Bean Factory <br>빈 팩토리__          | \- 스프링의 IOC를 담당하는 핵심 컨테이너 <br>- Bean을 등록, 생성, 조회, 반환하는 기능을 담당 |
| __ApplicationContext<br> 애플리케이션 컨텍스트__ | \- BeanFactory를 확장한 IoC 컨테이너 <br>- Bean을 등록하고 관리하는 기능은 BeanFactory와 동일하지만<br> 스프링이 제공하는 각종 부가 서비스를 추가로 제공함 |
|        __GenericXmlApplication Context__         | \- ApplicationContext 를 구현한 Class <br>- 일반적인 XML 형태의 문서를 읽어 컨테이너 역할을 수행 |
|  __Configuration metadata <br>설정 메타 정보__   | \- ApplicationContext 또는 BeanFactory가 IOC를 적용하기<br> 위해 사용하는 설정 정보 <br>- 설정 메타 정보는 IOC 컨테이너에 의해 관리되는 Bean <br>객체를 생성하고 구성할 때 사용 |

---

# Spring DI

* __DI(의존성 주입) 란?__
  * `DI`란, `Dependency Injection` 의 약자로 IOC 구현의 핵심 기술이라고 할 수 있다.  사용하는 객체를 직접 생성하여 만드는 것이 아니라 컨테이너가 빈의 설정 정보를 읽어와 자동으로 해당 객체에 연결하는 것을 의미한다. 이렇게 의존성을 주입 받게 되면 이후 해당 객체를 수정해야 할 상황이 발생했을 때 소스 코드의 수정을 최소화 할 수 있다. 
* __DI의 장점__
  1. 개발자가 작성해야 할 코드가 단순해진다.
  2. 각 객체 간의 종속 관계(결합도)를 해소할 수 있다.

* __Spring DI (Dependency Injection) 종류__

  * __Setter 메소드를 통한 의존성 주입(property)__

    ```xml
    <bean id=“객체의 이름＂ class=“클래스 풀네임“>
    <property name=“name” value=“OOO”/>
    <property name=“name” ref=“OOO”/>
    </bean>
    
    - name 속성 : Class에서 선언한 필드 변수의 이름
    - value 속성 : 단순 값 또는 Bean이 아닌 객체를 주입할 때 사용
    - ref 속성 : Bean 이름을 이용해 주입할 Bean을 찾음
    ```

    

  * __생성자를 통한 의존성 주입(constructor-arg)__

    ```xml
    <bean id=“불러 올 객체＂ class=“클래스 풀네임“>
    <constructor-arg index=“0” value=“OOO”/>
    <constructor-arg name=“OOO” ref=“OOO”/>
    </bean>
    
    - Constructor 주입 방식은 새엉자의 파라미터를 이용하기 때문에 한번에 여러 
    개의 객체 주입 가능
    - 필드 선언 순서에 따라 index 속성을 통해서도 접근이 가능하다
    ```

    

  * __메소드를 통한 의존성 주입__

    * 의존성을 입력 받는 일반 메소드를 만들고 이를 통해 의존성을 주입

---
