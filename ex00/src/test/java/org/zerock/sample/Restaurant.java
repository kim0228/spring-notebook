package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;


@Component
// component는 해당 클래스가 스프링에서 객체로 만들어서 관리하는 대상임을 명시하는 
// 어노테이션이다.
@Data
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
