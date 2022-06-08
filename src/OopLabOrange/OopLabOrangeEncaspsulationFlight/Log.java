package OopLabOrange.OopLabOrangeEncaspsulationFlight;

import java.time.*;

public class Log {
    private long id;
    private String title;
    private String description;
    private long accountId;
    private LocalDateTime when = LocalDateTime.now();

    public Log() {
    }

    public Log(long id, String title, String description, long accountId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.accountId = accountId;
    }

    public Log(long id, String title, String description, long accountId, LocalDateTime when) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.accountId = accountId;
        this.when = when;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public void setWhen(LocalDateTime when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", accountId='" + accountId + '\'' +
                ", when=" + when +
                '}';
    }
}
