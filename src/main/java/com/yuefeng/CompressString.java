package main.java.com.yuefeng;

//字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
//
// 示例1:
//
//  输入：s1 = "waterbottle", s2 = "erbottlewat"
// 输出：True
//
//
// 示例2:
//
//  输入：s1 = "aa", s2 = "aba"
// 输出：False
//
//
//
//
//
// 提示：
//
//
// 字符串长度在[0, 100000]范围内。
//
//
// 说明:
//
//
// 你能只调用一次检查子串的方法吗？
//
// Related Topics 字符串 字符串匹配
// 👍 79 👎 0

public class CompressString {

    public static void main(String[] args) {
        String s1 = "ecuSqfAWBcdVjspEEqOHZYCjStNYswgBJdKtFHzPbySZqNUAcxlTmEfUyLnmTdFrIPrHNTspfWHGKDEVzIoyNyPzXOETwYgTCsvENvlfQtJLwHSnQgqgThiPtzdBoCWHtDolkxZwBdoAJAHieoUTNgRXkHGJRwdcFkRrxPbrCGJXQjTIjXPZdlQoNFBNFrpVkgOeqSlPZETCQhcRwHzHyyuDtrnbTLCwBaRiAKCRPZYXxNvXUiPMALZVXrGrikdGMTqcrgHaGzkVEyDfrvUpTFqRluvHlfKpcmFCTeBTPhMoxsvXMjdPHNiEvTAPvcAANOwzxAAdYuPBBLnkJvKpgGSVfGSmJQjQSBtPOYoxlfEkpEKPSKHKuoHpVttkmLNWtWoMoIjWCbhxMzlHnaOreblnqFysUcoJzyhjapzmVsHXGlmiScuhiVpEPZrSZuXQJCOHwOqlhlEHoDMQRTqtMSZwDEKesSFdWAOTGbQczLAUzJfVoZtcGsGofREWYqrLoGRXxhWdspeRSERmHLvVPZyfypEOsHKvCPdMHkSBlIpDgjMQmsHEDzuvCmqJHAVKolRjxHTdewBuLbilhBozYpgjBoGOKpzpasgaubAjbTgbkUsalAtmPlYjyqcoziDsAZwwDlCsaLwJnZkWrODduYdxfZguXBkFaXYJcyOvsowWjPtQWSUBKmJJCDLkMFbbBHOgqhRiqnsvBsWVWONajHNfdKHYpYaqJbVeCOLlXVArBAAXGHqbzCzJERGphuljzdAvANqUrGDsRYDyiDBZbUMXqOgyAkzzYEsFogzwKSNAcxHUeBRoMGsVeYcPtqARSjhlcywsXevsDwcSYKQobFMQmXyvVcKFyARRCRFWXlJYEZRCynwhxNKDuAUyAWlRfNNGtRHhISJjoGTSXMepCWAmfkQBvcgyZEKSnDwZeaTzxeclFvZbMJCxIHHyUTrpDvKqus";
        String s2 = "ecuSqfAWBcdVjspEEqOHZYCjStNYswgBJdKtFHzPbySZqNUAcxlTmEfUyLnmTdFrIPrHNTspfWHGKDEVzIoyNyPzXOETwYgTCsvENvlfQtJLwHSnQgqgThiPtzdBoCWHtDolkxZwBdoAJAHieoUTNgRXkHGJRwdcFkRrxPbrCGJXQjTIjXPZdlQoNFBNFrpVkgOeqSlPZETCQhcRwHzHyyuDtrnbTLCwBaRiAKCRPZYXxNvXUiPMALZVXrGrikdGMTqcrgHaGzkVEyDfrvUpTFqRluvHlfKpcmFCTeBTPhMoxsvXMjdPHNiEvTAPvcAANOwzxAAdYuPBBLnkJvKpgGSVfGSmJQjQSBtPOYoxlfEkpEKPSKHKuoHpVttkmLNWtWoMoIjWCbhxMzlHnaOreblnqFysUcoJzyhjapzmVsHXGlmiScuhiVpEPZrSZuXQJCOHwOqlhlEHoDMQRTqtMSZwDEKesSFdWAOTGbQczLAUzJfVoZtcGsGofREWYqrLoGRXxhWdspeRSERmHLvVPZyfypEOsHKvCPdMHkSBlIpDgjMQmsHEDzuvCmqJHAVKolRjxHTdewBuLbilhBozYpgjBoGOKpzpasgaubAjbTgbkUsalAtmPlYjyqcoziDsAZwwDlCsaLwJnZkWrODduYdxfZguXBkFaXYJcyOvsowWjPtQWSUBKmJJCDLkMFbbBHOgqhRiqnsvBsWVWONajHNfdKHYpYaqJbVeCOLlXVArBAAXGHqbzCzJERGphuljzdAvANqUrGDsRYDyiDBZbUMXqOgyAkzzYEsFogzwKSNAcxHUeBRoMGsVeYcPtqARSjhlcywsXevsDwcSYKQobFMQmXyvVcKFyARRCRFWXlJYEZRCynwhxNKDuAUyAWlRfNNGtRHhISJjoGTSXMepCWAmfkQBvcgyZEKSnDwZeaTzxeclFvZbMJCxIHHyUTrpDvKqus";
        System.out.println(isFlipedString(s1, s2));
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        boolean[] exits = new boolean[s1.length()];

        for (int i =0; i< s1.length(); i++) {
            for (int n=0; n< s2.length(); n++) {
                if (s1.charAt(i) == s2.charAt(n) && exits[n] == false) {
                    exits[n] = true;
                    break;
                }

                if (n == s2.length()-1) {
                    return false;
                }
            }
        }

        return true;
    }
}
