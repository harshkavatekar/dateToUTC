import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DateToUTC {
    public String utcConvertor(String da) throws ParseException {
        DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter
                .ofPattern("yyyy/MM/dd'T'HH:mm:ss:SSSXXXXX");
        //Date string with offset information
        String dateString = da;
        //java instance with given offset
        OffsetDateTime instanceAtOffset = OffsetDateTime.parse(dateString, DATE_TIME_FORMATTER);
        //java instance in UTC
        OffsetDateTime odtInstanceAtUTC = instanceAtOffset.withOffsetSameInstant(ZoneOffset.UTC);
        //formatting to string
        String dateStringInUTC = odtInstanceAtUTC.format(DATE_TIME_FORMATTER);
        return dateStringInUTC;


    }
}
