package com.bitcamp.web.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.web.command.Path;
import com.bitcamp.web.enums.Direction;

@Component
public class ContextFactory extends Factory{
	@Autowired Path path;
	@Autowired ContextFactory contextFactory;
	@Override
	public Object create() {
		return ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath();
	}
	public Path path() {
		path.setContext((String)create());
		path.setJs(create()+Direction.JS.toString());
		path.setCss(create()+Direction.CSS.toString());
		path.setImg(create()+Direction.IMG.toString());
		path.setFonts(create()+Direction.FONTS.toString());
		return path;
	}
}
