class a7
{
    
    static boolean areRotations(String str1, String str2)
    {
       
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
        
    }
     
    public static void main (String[] args)
    
    {
        String str1 = "ABACD";
        
        String str2 = "CDABA";
        
        System.out.println("The given strings are "+str2+" and "+str2);
        
        System.out.println("The concatenation of 1st string twice is: "+str1+str1);
        
        System.out.println("The 2nd string "+str2+" exists in the new string.");
        
        if (areRotations(str1, str2))
        
            System.out.println("Strings are rotations of each other");
        else
        
            System.out.printf("Strings are not rotations of each other");
    }
}