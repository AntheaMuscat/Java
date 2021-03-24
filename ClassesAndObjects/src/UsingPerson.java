import java.util.Calendar;
import java.util.Date;

public class UsingPerson {
    public static void main(String[] args) {
        Person person = new Person("234567L", "Joe", "Borg",
                new Date(1967, Calendar.JULY, 12), "Safi, Malta");



        System.out.println(person.getId());
        person.setId("142364M");
        System.out.println(person.getId());
    }
}
