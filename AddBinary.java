public class AddBinary {
    public static void main(String[] args){
        String aa = "1110";
        String bb = "1111";


        AddBinary addBinary = new AddBinary();
        String res = addBinary.addBinary(aa,bb);
        System.out.print(res);
    }
    // String StringBuffer StringBuilder 区别
    // String类经过final修饰。字符串在拼接的过程中会生成很多的中间对象。String i = "aa" + "bb"; 直接生成"aabb"
    // StringBuffer 线程安全，方法采用的是synchronized修饰
    //StringBuilder 非线程安全。

    /**
     *  求两个二进制字符串的和
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        StringBuffer result = new StringBuffer();
        int carry = 0;
        int len = aa.length>bb.length?bb.length:aa.length;
        int i = aa.length - 1;//aa的下标
        int j = bb.length - 1;//bb的下标
        // 求得两个相加的部分
        while (len>0){
            // 将char类型中的123转化为整型的123
            int temp = aa[i]-'0' + bb[j]-'0' + carry;
            carry = temp/2;
            result.append(temp%2);
            i--;
            j--;
            len--;
        }
        //求其中一个与进位相加。
        while (j>=0){
           int temp = bb[j]-'0' + carry;
           carry = temp/2;
           result.append(temp%2);
           j--;
        }
        while ( i>= 0){
            int temp = aa[i]-'0' + carry;
            result.append(temp%2);
            carry = temp/2;
            i--;
        }
        // 如果进位一直存在的话需要进行保存。
        if(carry != 0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
