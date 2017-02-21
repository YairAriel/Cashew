/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

/**
 *
 * @author Yair Ariel
 */
public class Income {
    
    private String incomeSource;

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }
    
    public Income(String incomeSource) {
        setIncomeSource(incomeSource);
    }
    
    @Override 
    public String toString(){
        return super.toString() + ", incomeSource=" + getIncomeSource() + '}';
    }
}
