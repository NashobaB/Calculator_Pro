package com.calculator_pro.coreybannon.calculatorpro;

/**
 * Created by coreybannon on 04/06/2017.
 */

public class Calculations {
    public double equals(double current_val, double last_val, char action){
        if(action == '+'){
            last_val += current_val;
        }else if(action == '-'){
            last_val -= current_val;
        }else if(action == 'x'){
            last_val *= current_val;
        }else if(action == '/'){
            last_val /= current_val;
        }else{
            last_val = 0;
        }
        return last_val;
    }
}
