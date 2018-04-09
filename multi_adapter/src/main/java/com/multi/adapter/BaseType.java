package com.multi.adapter;

/**
 * Created by Machenike on 2018/4/9.
 */

public abstract class BaseType<Bean> implements IType{
    private Bean bean;

    public Bean getBean() {
        return bean;
    }

    public void setBean(Bean bean) {
        this.bean = bean;
    }

    @Override
    public int getType() {
        return getLayoutId();
    }

    protected abstract int getLayoutId();

    public static <T>  BaseType<T> addType(final int layoutId, T t){

        BaseType<T> baseType = new BaseType<T>() {
            @Override
            protected int getLayoutId() {
                return layoutId;
            }
        };
        baseType.setBean(t);
        return baseType;
    }
}
