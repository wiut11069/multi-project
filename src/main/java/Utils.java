public class Utils {
    public boolean isAllNumberPositive(String... strs){
        for (String str: strs) {
            if (!StringUtils.isPositiveNumber(str))
                return false;
        }
        return true;
    }
}
