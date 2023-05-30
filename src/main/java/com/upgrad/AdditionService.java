package com.upgrad;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AdditionService implements MathService{
    @Override
    public void operate(int x, int y) {
        System.out.println("Sum = "+(x+y));
    }
}
