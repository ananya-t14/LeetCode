class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int s = word.charAt(0);
        if (Character.isUpperCase(s))
        {
            if (word.length()==1)
            return true;
            if (Character.isUpperCase(word.charAt(1)))
            {
                for (int i=2; i<word.length(); i++)
                {
                    if (Character.isLowerCase(word.charAt(i)))
                    return false;
                }
            }
            else if (Character.isLowerCase(word.charAt(1)))
            {
                for (int i=2; i<word.length(); i++)
                {
                    if (Character.isUpperCase(word.charAt(i)))
                    return false;
                }
            }
        }
        else if (Character.isLowerCase(s))
        {
            if (word.length()==1)
            return true;
            for (int i=1; i<word.length(); i++)
            {
                if (Character.isUpperCase(word.charAt(i)))
                return false;
            }
        }
        return true;
    }
}