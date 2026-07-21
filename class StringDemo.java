class StringDemo {
    public static void main(String[] args) {
        String str = "Hello world";
        String newStr = "";
        for (int i = 0; i < str.length(); i += 2) {
            
            newStr += str.charAt(i);
        }
        System.out.println("input: " + str);
        System.out.println("output: " + newStr);
    }
}

     