public class ThrowAndThrowsKeyword {
       public void ageValidate(int age)throws NullPointerException {
              if(int age < 18) {
                    throw new NullPointerException("Invaid Age");
              }
              else {
                    System.out.println("Welcome For Vote.");
              }
       }
       public static void main(String[] args) {
              int age = Integer.parseInt(args[0]);
              ThrowAndThrowsKeyword th= new ThrowAndThrowsKeyword();
              th.ageValidate(age);
       }
}