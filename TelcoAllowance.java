import java.util.*;
public class TelcoAllowance implements UsagePromo{

    private static Map<String, Integer> dataAllowanceMap = new HashMap<>();

    static{
        dataAllowanceMap.put("Smart", 15);
        dataAllowanceMap.put("Globe", 10);
        dataAllowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        return dataAllowanceMap.get(telcoName) + "GB " + "for " + "₱" + promoPrice + " per month";
    }
}
