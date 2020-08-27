package com.kodilla.exception.main;

import com.kodilla.exception.nullpointer.MessageNotSentException;
import com.kodilla.exception.nullpointer.MessageSender;
import com.kodilla.exception.nullpointer.User;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {
    public static void main(String args[]) {
        //first challenge
//        FileReader fileReader = new FileReader();
//        try {
//            fileReader.readFile();
//        } catch (FileReaderException e) {
//            System.out.println("Error: problem z odczytem pliku źródłowego.");
//        }
        //second challenge
//        SecondChallenge secondChallenge = new SecondChallenge();
//        try {
//            secondChallenge.probablyIWillThrowException(1.2, 1.5);
//        } catch (Exception e) {
//            System.out.println("Jakiś błąd.");;
//        }
        User user = null;
        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not send, but my program still running very well!");
        }

        System.out.println("Processing other logic!");
    }
}
