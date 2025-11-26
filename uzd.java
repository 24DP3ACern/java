public class chap44{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    }
  public static void uzd1(){
    System.out.print("Enter your name: ");
        String name = in.nextLine().trim();
        int spaceIndex = name.indexOf(" ");
        if (spaceIndex > 0) {  
            String firstName = name.substring(0, spaceIndex);
            String lastName = name.substring(spaceIndex + 1);
            lastName = lastName.toUpperCase();
            String result = firstName + " " + lastName;
            System.out.println(result);
        } else {
            System.out.println(name);
        }
    }
  public static void uzd2(){}
  public static void uzd3(){}
  public static void uzd4(){}
  public static void uzd5(){}
  public static void uzd6(){}
  public static void uzd7(){}
}