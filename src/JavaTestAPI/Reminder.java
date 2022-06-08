package JavaTestAPI;

import java.util.*;

public class Reminder implements Comparable {
    private Calendar expiration;
    private String text;
    private boolean important;
    private boolean popped;

    public Reminder() {
    }


    public Reminder(Calendar expiration, String test, boolean important, boolean popped) {
        this.expiration = expiration;
        this.text = text;
        this.important = important;
        this.popped = popped;
    }

    public Reminder(Reminder reminder) {
        this.expiration = reminder.expiration;
        this.text = reminder.text;
        this.important = reminder.important;
        this.popped = reminder.popped;
    }

    public Calendar getExpiration() {
        return expiration;
    }

    public void setExpiration(Calendar expiration) {
        this.expiration = expiration;
    }

    public String getText() {
        return text;
    }

    public void setText(String test) {
        this.text = text;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isPopped() {
        return popped;
    }

    public void setPopped(boolean popped) {
        this.popped = popped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reminder reminder = (Reminder) o;
        return expiration.equals(reminder.expiration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiration);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "expiration=" + expiration +
                ", text='" + text + '\'' +
                ", important=" + important +
                ", popped=" + popped +
                '}';
    }
}

