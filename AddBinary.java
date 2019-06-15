public class AddBinary {
    public static void main(String[] args){
        String aa = "1110";
        String bb = "1111";


        AddBinary addBinary = new AddBinary();
        String res = addBinary.addBinary(aa,bb);
        System.out.print(res);
    }
    // String StringBuffer StringBuilder ����
    // String�ྭ��final���Ρ��ַ�����ƴ�ӵĹ����л����ɺܶ���м����String i = "aa" + "bb"; ֱ������"aabb"
    // StringBuffer �̰߳�ȫ���������õ���synchronized����
    //StringBuilder ���̰߳�ȫ��

    /**
     *  �������������ַ����ĺ�
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
        int i = aa.length - 1;//aa���±�
        int j = bb.length - 1;//bb���±�
        // ���������ӵĲ���
        while (len>0){
            // ��char�����е�123ת��Ϊ���͵�123
            int temp = aa[i]-'0' + bb[j]-'0' + carry;
            carry = temp/2;
            result.append(temp%2);
            i--;
            j--;
            len--;
        }
        //������һ�����λ��ӡ�
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
        // �����λһֱ���ڵĻ���Ҫ���б��档
        if(carry != 0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
