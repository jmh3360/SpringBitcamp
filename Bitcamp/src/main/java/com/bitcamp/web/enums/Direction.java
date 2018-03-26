package com.bitcamp.web.enums;

public enum Direction {
	resources,js,img,css,fonts,
	JS{
		@Override
		public String toString() {
			return "/"+resources+"/"+js;
		}
	},
	IMG{
		@Override
		public String toString() {
			return "/"+resources+"/"+img;
		}
	},
	CSS{
		@Override
		public String toString() {
			return "/"+resources+"/"+css;
		}
	},
	FONTS{
		@Override
		public String toString() {
			return "/"+resources+"/"+fonts;
		}
	}
}
