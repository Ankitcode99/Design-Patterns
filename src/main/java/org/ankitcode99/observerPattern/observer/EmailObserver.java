package org.ankitcode99.observerPattern.observer;

public class EmailObserver implements ObserverInterface{

    private String email;

    public EmailObserver(String email){
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email) {
        System.out.println("Stock availability email sent to "+email);
    }
}
