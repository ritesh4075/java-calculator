import java.util.Scanner;
public class Calc extends AdvCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        // System.out.print("Choose1 Operation: ");
        // int choice = sc.nextInt();

        System.out.println("Available Operation: Add, Sub, Mul, Div");
        System.out.print("Choose Choice: ");
        String input = sc.nextLine();
        sc.close();
        Operation op;
        try{
            op = Operation.fromString(input);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid Opration");
            // sc.close();
            return;
        }

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        double[] values = new double[n];
        for(int i = 0;i < n;i++){ 
            System.out.println("Enter the Numbers: "+(i+1)+": ");
            values[i] = sc.nextDouble();
        }
        double result;
        switch(op){
            case ADD:
                result = AdvCal.add(values);
                break;

            case SUB:
                result = AdvCal.sub(values);
                break;

            case MUL:
                result = AdvCal.mul(values);
                break;

            case DIV:
                result = AdvCal.div(values);
                break;
            
                default:
                    throw new AssertionError("Undefined Operation ");
            }
            System.out.println("Result= "+ result);
            
    }
}
