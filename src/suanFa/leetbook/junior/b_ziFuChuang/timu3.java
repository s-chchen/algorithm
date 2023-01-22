package suanFa.leetbook.junior.b_ziFuChuang;

import java.util.HashMap;
import java.util.Map;
/*
* 字符串中的第一个唯一字符
* 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 */
public class timu3 {

    /*map*/
    public static int firstUniqChar(String s) {
        char[] cc=s.toCharArray();
        int len=cc.length;
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<len;i++){
            if (map.containsKey(cc[i])){
                int val=map.get(cc[i]);
                map.put(cc[i],val+1);
            }else{
                map.put(cc[i],1);
            }
        }
        for(int i=0;i<len;i++){
            if (map.get(cc[i])==1) return i;
        }
        return -1;
    }

    /*lastIndex index*/
    public static int firstUniqChar2(String s){
        for (int i=0;i<s.length();i++){
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }

}
