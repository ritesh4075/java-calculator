public class AdvCal {
    // Addition Method
    public static double add(double... nums){
        double sum = 0;
        for(double num : nums) {
            sum += num;
        }
        return sum;
    }
    // Subtraction Method
    public static double sub(double... nums){
        if(nums.length == 0) return 0;
        double result = nums[0];
        for(int i = 1;i < nums.length;i++){
            result -= nums[i];
        }
        return result;
    }
    // Multiplication Method
    public static double mul(double... nums){
        double prod = 1;
        for(double num : nums) {
            prod *= num;
        }
        return prod;
    }
    // Division Method
    public static double div(double... nums){
        if(nums.length == 0) return 0;
        double division = nums[0];
        for(int i = 1;i < nums.length;i++) {
            if(nums[i] == 0){
                throw new ArithmeticException("Can't devide by zero");
            }
            division /= nums[i];
        }
        return division;
    }
}
