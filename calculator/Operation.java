public enum Operation {
    ADD, SUB, MUL, DIV;
    public static Operation fromString(String input){
        return Operation.valueOf(input.trim().toUpperCase());
    }
}
