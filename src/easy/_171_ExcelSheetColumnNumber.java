package easy;

public class _171_ExcelSheetColumnNumber {
    /**
     * 171. Excel Sheet Column Number
     * @param columnTitle string
     * @return its corresponding column number
     */
    public int titleToNumber(String columnTitle) {
        int ans = columnTitle.charAt(0) - 64;

        if (columnTitle.length() == 1) {
            return ans;
        }

        for (int i = 1; i < columnTitle.length(); i++) {
            ans = ans * 26 + columnTitle.charAt(i) - 64;
        }

        return ans;
    }
}
