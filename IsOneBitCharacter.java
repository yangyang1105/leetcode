class IsOneBitCharacter {
    /**
     *  ��һ��������ֵΪ01���һλΪһλ�ַ�
     *  һλ�ַ���ʾ 0 ��λ�ַ���ʾ10����11 һ��ֵ��01���ַ����飬���һλΪ0
     *  ���ӣ�
     *      [1,0,0]  10Ϊ��λ�ַ���0Ϊһλ�ַ� ���� true
     *      [1,1,1,0] 11Ϊ��λ�ַ���10Ϊһλ�ַ� ����false
     * @param bits
     * @return
     */
    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length ; i++) {
            //�����ǰλΪ1 �϶�Ϊ��λ�ַ����ж������λ�ַ������һλ���򷵻�false�����򷵻�true
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