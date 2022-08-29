package org.example.polymorphism;

public class SberApplication extends BankApplication{
    @Override
    public String getType() {
        return "APPLICATION_SUITABLE_FOR_SBER";
    }
}
