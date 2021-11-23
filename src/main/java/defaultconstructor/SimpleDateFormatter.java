package defaultconstructor;

public class SimpleDateFormatter {
    CountryCode defaultCountryCode;

    public SimpleDateFormatter() {
        defaultCountryCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(defaultCountryCode, simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        switch (countryCode) {
            case HU:
                return String.format("%d-%d-%d", simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay());
            case EN:
                return String.format("%d-%d-%d", simpleDate.getDay(), simpleDate.getMonth(), simpleDate.getYear());
            case US:
                return String.format("%d-%d-%d", simpleDate.getMonth(), simpleDate.getDay(), simpleDate.getYear());
        }
        throw new IllegalArgumentException("Hibás országkód!");
    }
}
