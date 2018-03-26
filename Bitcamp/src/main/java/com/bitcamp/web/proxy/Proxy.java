package com.bitcamp.web.proxy;

import org.springframework.ui.Model;

import lombok.Data;

@Data
public abstract class Proxy {
    public abstract void execute(Model model,Object o);
}