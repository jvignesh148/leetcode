import java.util.*;

public class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Coupon> validCoupons = new ArrayList<>();
        Set<String> validBusinessLines = new HashSet<>(Arrays.asList("electronics", "grocery", "pharmacy", "restaurant"));

        for (int i = 0; i < code.length; i++) {
            if (isActive[i]
                && code[i] != null && !code[i].isEmpty() && code[i].matches("[a-zA-Z0-9_]+")
                && validBusinessLines.contains(businessLine[i])) {
                validCoupons.add(new Coupon(code[i], businessLine[i]));
            }
        }

        Map<String, Integer> businessPriority = new HashMap<>();
        businessPriority.put("electronics", 0);
        businessPriority.put("grocery", 1);
        businessPriority.put("pharmacy", 2);
        businessPriority.put("restaurant", 3);

        validCoupons.sort((a, b) -> {
            int cmp = Integer.compare(businessPriority.get(a.businessLine), businessPriority.get(b.businessLine));
            return cmp != 0 ? cmp : a.code.compareTo(b.code);
        });

        List<String> result = new ArrayList<>();
        for (Coupon c : validCoupons) {
            result.add(c.code);
        }

        return result;
    }

    class Coupon {
        String code;
        String businessLine;

        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}
