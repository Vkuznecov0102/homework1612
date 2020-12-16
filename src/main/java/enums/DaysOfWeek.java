package enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum DaysOfWeek {
    SUNDAY("воскресенье"), MONDAY("понедельник"), TUESDAY("вторник"), WEDNESDAY("среда"), THURSDAY("четверг"), FRIDAY("пятница"), SATURDAY("суббота");

    private final String translate;

    DaysOfWeek(String translate) {
        this.translate = translate;
    }
}