import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    private static Map<String, String> unliCallTextOfferMap = new HashMap<>();

    static {
        unliCallTextOfferMap.put("Smart", "No free calls or text, and you will be charged per use.");
        unliCallTextOfferMap.put("Globe", "Unlimited calls and text to subscribers within the network. Calls and text to other networks are charged extra.");
        unliCallTextOfferMap.put("Ditto", "Unlimited calls and texts to all networks within the country");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliCallTextOfferMap.get(telcoName);
    }
}
