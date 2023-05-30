package com.upgrad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private AdditionService additionService;
    private SubtractionService subtractionService;
    private MultiplicationService multiplicationService;
    private DivisionService divisionService;

    @Autowired
    public Calculator(@Qualifier("additionService")AdditionService additionService,
                      @Qualifier("subtractionService")SubtractionService subtractionService,
                      @Qualifier("multiplicationService")MultiplicationService multiplicationService,
                      @Qualifier("divisionService")DivisionService divisionService
    ){
        this.additionService = additionService;
        this.divisionService = divisionService;
        this.multiplicationService = multiplicationService;
        this.subtractionService = subtractionService;
    }
    public void compute(String operation, int x, int y){
        if(operation.equals("add")){
            AdditionService additionService = new AdditionService();
            additionService.operate(x,y);
        }else if (operation.equals("sub")){
            SubtractionService subtractionService = new SubtractionService();
            subtractionService.operate(x,y);
        } else if (operation.equals("mul")) {
            MultiplicationService multiplicationService = new MultiplicationService();
            multiplicationService.operate(x,y);
        }else if(operation.equals("div")){
            DivisionService divisionService1 = new DivisionService();
            divisionService1.operate(x,y);
        }else {
             throw new RuntimeException("No compute services found");
        }
    }
}
