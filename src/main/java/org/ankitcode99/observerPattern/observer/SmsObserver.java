package org.ankitcode99.observerPattern.observer;

public class SmsObserver implements ObserverInterface{
    private String phoneNum;

    public SmsObserver(String phoneNum){
        this.phoneNum = phoneNum;
    }

    @Override
    public void update() {
        sendSms(phoneNum);
    }

    private void sendSms(String phoneNum) {
        System.out.println("Stock availability SMS sent to "+phoneNum);
    }
}
