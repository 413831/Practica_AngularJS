package imagen;
import java.util.Calendar;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int today = calendar.get(Calendar.DAY_OF_WEEK);

        if(today == Day.SATURDAY.ordinal() && today == Day.SUNDAY.ordinal())
        {
            Drink fernet = new Fernet();
            fernet.prepare();
            fernet.drink();
        }
        else
        {
            Drink coffee = new Coffee();
            coffee.prepare();
            coffee.drink();
        }
    }
}

