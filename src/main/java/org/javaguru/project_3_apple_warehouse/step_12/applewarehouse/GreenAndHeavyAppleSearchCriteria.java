package org.javaguru.project_3_apple_warehouse.step_12.applewarehouse;

class GreenAndHeavyAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria greenApples = new GreenAppleSearchCriteria();
    private HeavyAppleSearchCriteria heavyApples = new HeavyAppleSearchCriteria();

    @Override
    public boolean test(Apple apple) {
        return greenApples.test(apple) && heavyApples.test(apple);
    }

}