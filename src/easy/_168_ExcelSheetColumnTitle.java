package easy;

public class _168_ExcelSheetColumnTitle {
    /**
     * 168. Excel Sheet Column Title
     * @param columnNumber integer
     * @return its corresponding column title as it appears in an Excel sheet
     */
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
