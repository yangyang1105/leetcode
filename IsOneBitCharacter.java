class IsOneBitCharacter {
    /**
     *  求一个数组中值为01最后一位为一位字符
     *  一位字符表示 0 二位字符表示10或者11 一个值是01的字符数组，最后一位为0
     *  例子：
     *      [1,0,0]  10为二位字符，0为一位字符 返回 true
     *      [1,1,1,0] 11为二位字符，10为一位字符 返回false
     * @param bits
     * @return
     */
    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length ; i++) {
            //如果当前位为1 肯定为二位字符，判断如果二位字符是最后一位，则返回false，否则返回true
            if(bits[i] == 1){
                i = i+2;
                if(i >= bits.length ){
                    return false;
                }
                i--;
            }
        }
        return true;
    }
}