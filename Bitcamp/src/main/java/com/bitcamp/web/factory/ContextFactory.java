package com.bitcamp.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

//컴포넌트는 
@Component
public class ContextFactory extends Factory{
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	@Override
	public Object create() {
			
//		getRequest앞에 가로를 넣어 가로안에 (ServletRequestAttributes) RequestContextHolder.
//		currentRequestAttributes() 이 내용을 넣는다.
//		상속구조를 짤 땐 추팩을 사용한다. 
		return ((ServletRequestAttributes) RequestContextHolder.
				currentRequestAttributes()).getRequest().getContextPath();
	}
	public String path(String tag) {
		logger.info("ContextFactory path()에 넘어온 tag 값은 {} 이다.",tag);
		return create()+"/resources/"+tag;
	}

}
