package org.javaguru.project_3_apple_warehouse.step_9.applewarehouse;

class LightAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}
