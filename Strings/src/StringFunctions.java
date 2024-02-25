public class StringFunctions {
    public static void main(String[] args) {
        String name = "Lavesh";
        String newName = "Lavesh";
        if(name.equals(newName)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Not same");
        }
        String name2 = "lavesh";
        if(name.equalsIgnoreCase(name2)){
            System.out.println("Both are same name");
        }
        String str1 = "La2ve45sh";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        String str2 = "       Lavesh     ";
        System.out.println(str2.trim());
        String str3 = "Hello World";
        str3.toUpperCase();
        System.out.println(str3);
    }
}
