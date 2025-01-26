class replace{
    public static void main(String[] args){
        String s1="suan";
        String s2="";
        s2=s1.replaceAll("[aeiou]","");
        System.out.print(""+s2);
    }
}