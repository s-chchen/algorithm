package suanFa.leetbook.junior.b_ziFuChuang;

import java.util.Arrays;

/*
* 有效的字母异位词
* 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
*/
public class timu4 {

    /*copyValueOf*/
    public boolean isAnagram(String s, String t){
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        String ss=String.copyValueOf(cs);
        String st=String.copyValueOf(ct);
        if (ss.equals(st)) return true;
        return false;
    }

    /*Array.equals*/
    public boolean isAnagram2(String s, String t){
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        String ss=String.copyValueOf(cs);
        String st=String.copyValueOf(ct);
        return Arrays.equals(cs,ct);
    }

    /*一次for循环*/
    public boolean isAnagram3(String s, String t){
        if (s.length()!=t.length()) return false;
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        int[] map=new int[26];
        int count=0;
        for (int i=0;i<cs.length;i++){
            if (++map[cs[i]-'a']==1){
                count++;
            }
            if (--map[ct[i]-'a']==0){
                count--;
            }
        }
        if (count==0) return true;
        return false;
    }

}
