package app;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import util.Mail;

public class Main {
    public static void main(String[] args) {

        Set<Mail> mails = new TreeSet<>(new Comparator<Mail>() {
            @Override
            public int compare(Mail m1, Mail m2) {
                return m2.getRec_time().compareTo(m1.getRec_time());
            }
        });

        mails.add(new Mail(12345, "test1@gmail.com", "Greetings", "Happy BDay", LocalDateTime.parse("2025-10-10T10:10")));
        mails.add(new Mail(12346, "test2@gmail.com", "Reminder", "Meeting at 5", LocalDateTime.parse("2025-10-12T09:00")));
        mails.add(new Mail(12347, "test3@gmail.com", "Offer", "Discount Coupon", LocalDateTime.parse("2025-09-20T12:30")));
        mails.add(new Mail(12348, "test4@gmail.com", "Hello", "How are you?", LocalDateTime.parse("2025-10-12T10:30")));

        for (Mail mail : mails) {
            System.out.println(mail);
        }
    }
}
