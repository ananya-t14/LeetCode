class Solution {
    public boolean isNumber(String s) {
        s=s.trim();
        if (s.isEmpty())
        return false;
        boolean num = false, dot = false, e=false;
        for (int i=0; i<s.length(); i++)
        {
            switch (s.charAt(i))
            {
                case '.':
                    if (dot || e)
                    return false;
                    dot = true;
                    break;
                case 'e':
                    case 'E':
                        if (e || !num)
                        return false;
                        e = true;
                        num = false;
                        break;
                case '+':
                    case '-':
                        if (i>0 && s.charAt(i-1) != 'e')
                        return false;
                        num = false;
                        break;
                default:
                    if(!Character.isDigit(s.charAt(i)))
                    return false;
                    num = true;
            }
        }
        return num;
    }
}