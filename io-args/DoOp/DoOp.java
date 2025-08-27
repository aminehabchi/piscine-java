
public class DoOp {

    public static String operate(String[] args) {
        if (args.length != 3) {
            return "Error";
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            switch (args[1]) {
                case "+":
                    a += b;
                    break;
                case "-":
                    a -= b;
                    break;
                case "/":
                    if (b == 0) {
                        return "Error";
                    }
                    a /= b;
                    break;
                case "%":
                    if (b == 0) {
                        return "Error";
                    }
                    a %= b;
                    break;
                case "*":
                    a *= b;
                    break;
                default:
                    return "Error";
            }
            return Integer.toString(a);
        } catch (NumberFormatException e) {
            return "Error";
        }
    }
}
