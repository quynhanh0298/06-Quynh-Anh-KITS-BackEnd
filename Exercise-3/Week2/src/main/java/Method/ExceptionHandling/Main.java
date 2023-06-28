package Method.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3};
            int result = divide(numbers, 0);
            System.out.println("Result: " + result);
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException: " + ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println("Generic Exception: " + ex.getMessage());
        }finally {
            System.out.println("Cleanup code goes here");
        }
        //Nói chung là phải dùng finally để close file, dọn rác và đóng DB. các code nằm trong finally vẫn chạy, dù cho đã throw ra ngoài.
    //VD: ở trên mình mở file, trong lúc xử lý có ex, thì sẽ throw, thoát khỏi cái method luôn, thì finally vẫn thực hiện các code trong block đó, trong trường hợp này là đóng file, vì mình đã mở file ra rồi phải đóng file lại dù đã bị throw ra ngoài
    }

    //Throws để ném exception cho thằng khác xử lý, còn ko throw thì phải xử lý tại function nếu ko compile sẽ bắt bạn xử lý
    // throw vs throws
    public static int divide(int[] numbers, int divisor){
        int result = 0;
        try {
            result = numbers[0] / divisor;
        }catch (ArithmeticException ex){
            throw ex;
        }catch (ArrayIndexOutOfBoundsException ex){
            throw ex;
        }finally {
            result = 0;
        }
        return result;
    }
}
