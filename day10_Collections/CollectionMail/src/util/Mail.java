package util;

import java.time.LocalDateTime;

public class Mail {
    private long mailId;
    private String from;
    private String subject;
    private String body;
    private LocalDateTime rec_time;

    public Mail() {}

    public Mail(long mailId, String from, String subject, String body, LocalDateTime rec_time) {
        this.mailId = mailId;
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.rec_time = rec_time;
    }

    public LocalDateTime getRec_time() {
        return rec_time;
    }

    @Override
    public String toString() {
        return "Mail [mailId=" + mailId + ", from=" + from + ", subject=" + subject + 
               ", body=" + body + ", rec_time=" + rec_time + "]";
    }
}
