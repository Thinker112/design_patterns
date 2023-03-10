package cn.yyb.creational.abstractFactory02.impl;

import cn.yyb.creational.abstractFactory02.Castle;

// Elven implementations ->
public class ElfCastle implements Castle {
    static final String DESCRIPTION = "This is the Elven castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
