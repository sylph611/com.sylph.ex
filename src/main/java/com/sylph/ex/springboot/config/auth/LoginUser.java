package com.sylph.ex.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
/**
 * @Target(ElementType.PARAMETER)
 * 어노테이션이 생성 될 수 있는 위치 설정
 * 파라메터로 지정했으니 메소드의 파라메터로 선언된 객체에서만 사용할 수 있다.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
    /**
     * @interface 이 파일을 어노테이션 클래스로 지정한다.
     *
     */
}
