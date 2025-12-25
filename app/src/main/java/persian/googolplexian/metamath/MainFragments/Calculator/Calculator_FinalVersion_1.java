package persian.googolplexian.metamath.MainFragments.Calculator;

public class Calculator_FinalVersion_1 {

    public static String[] AllOperations = {"+", "-", "*", "/"};
    public static String[] AllNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};
    public static String[] AllCharacters = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "+", "-", "*", "/"};
    public static String[] Operations = new String[0];
    public static double[] Numbers = new double[0];
    public static double Equal = 0;
    public static String MathExpression_Display = "";

    public static String[] Errors = {"E000:isBlank", "E001:WithoutOperation", "E002:Invalid input"};
    public static String[] Function = {"Filter_1", "Filter_2", "Filter_3", "Filter_4", "Filter_5", "Number_of_Operations", "Separator", "Show_MathExpression", "Calculation", "DeleteElement_Double", "DeleteElement_String"};

    public static String[] OutPut = {"MathExpression", "Calculation", "Errors"};

    public static void Calculator(String MathExpression) {
        try {
            if (!Filter_1(MathExpression).equals(Errors[0])) {
                MathExpression = Filter_1(MathExpression);
            } else {
                OutPut[0] = "";
                OutPut[1] = "";
                OutPut[2] = "«" + Function[0] + " => " + Errors[0] + "»\n";
                return;
            }

            if (!Filter_2(MathExpression).equals(Errors[0])) {
                MathExpression = Filter_2(MathExpression);
            } else {
                OutPut[0] = "";
                OutPut[1] = "";
                OutPut[2] = "«" + Function[1] + " => " + Errors[0] + "»\n";
                return;
            }

            if (!Filter_3(MathExpression).equals(Errors[0])) {
                MathExpression = Filter_3(MathExpression);
            } else {
                OutPut[0] = "";
                OutPut[1] = "";
                OutPut[2] = "«" + Function[2] + " => " + Errors[0] + "»\n";
                return;
            }

            if (!Filter_4(MathExpression).equals(Errors[1])) {
                MathExpression = Filter_4(MathExpression);
            } else {
                OutPut[0] = "";
                OutPut[1] = "";
                OutPut[2] = "«" + Function[3] + " => " + Errors[1] + "»\n";
                return;
            }

            if (!Filter_5(MathExpression).equals(Errors[0])) {
                MathExpression = Filter_5(MathExpression);
            } else {
                OutPut[0] = "";
                OutPut[1] = "";
                OutPut[2] = "«" + Function[4] + " => " + Errors[0] + "»\n";
                return;
            }

            Number_of_Operations(MathExpression);
            Separator(MathExpression);

            OutPut[0] = Show_MathExpression();
            OutPut[1] = Calculation(MathExpression).toString();
            OutPut[2] = "";

        } catch (Exception e) {
            OutPut[0] = "";
            OutPut[1] = "";
            OutPut[2] = Errors[2];
            return;
        }
    }

    public static void DeleteElement_Double(double arr[], int position) {
        int n = arr.length;
        int i;
        for (i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
//        return n - 1;
    }

    public static void DeleteElement_String(String arr[], int position) {
        int n = arr.length;
        int i;
        for (i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = "";
//        return n - 1;
    }

    public static String Filter_1(String MathExpression) {
        // Filter 1: Remove spaces & Replace All "×" , "÷"

        if (!MathExpression.isBlank()) {
            MathExpression = MathExpression.replaceAll(" ", "");
            MathExpression = MathExpression.replaceAll("×", "*");
            MathExpression = MathExpression.replaceAll("÷", "/");
            return MathExpression;
        } else {
            return Errors[0];
        }
    }

    public static String Filter_2(String MathExpression) {
        // Filter 2: Separate numbers and operations

        StringBuilder FilterMathExpression = new StringBuilder();
        for (int i = 0; i < MathExpression.length(); i++) {
            String Character = String.valueOf(MathExpression.charAt(i));
            for (int j = 0; j < 15; j++) {
                if (Character.equals(AllCharacters[j])) {
                    FilterMathExpression.append(Character);
                }
            }
        }
        if (!MathExpression.isBlank()) {
            return FilterMathExpression.toString();
        } else {
            return Errors[0];
        }
    }

    public static String Filter_3(String MathExpression) {
        // Filter 3: Removing operations at the beginning and end of the math expression

        String FirstCharacter = "";
        String SecondCharacter = "";
        String LastCharacter = "";
        String FilterMathExpression = MathExpression;
        while (true) {
            if (!FilterMathExpression.isBlank()) {
                FirstCharacter = FilterMathExpression.charAt(0) + "";
                if (FilterMathExpression.length() > 1) {
                    SecondCharacter = FilterMathExpression.charAt(1) + "";
                }
                if (FirstCharacter.equals(AllOperations[0]) || FirstCharacter.equals(AllOperations[2]) || FirstCharacter.equals(AllOperations[3])) {
                    FilterMathExpression = FilterMathExpression.substring(1, FilterMathExpression.length());
                } else if (FilterMathExpression.length() > 1 && FirstCharacter.equals(AllOperations[1])) {
                    if (SecondCharacter.equals(AllOperations[0]) || SecondCharacter.equals(AllOperations[1]) || SecondCharacter.equals(AllOperations[2]) || SecondCharacter.equals(AllOperations[3])) {
                        FilterMathExpression = FilterMathExpression.substring(1, FilterMathExpression.length());
                    } else {
                        FilterMathExpression = "#" + FilterMathExpression.substring(1, FilterMathExpression.length());
                    }
                } else {
                    break;
                }
            } else {
                return Errors[0];
            }
        }
        while (true) {
            if (!FilterMathExpression.isBlank()) {
                LastCharacter = FilterMathExpression.charAt(FilterMathExpression.length() - 1) + "";
                if (LastCharacter.equals(AllOperations[0]) || LastCharacter.equals(AllOperations[1]) || LastCharacter.equals(AllOperations[2]) || LastCharacter.equals(AllOperations[3])) {
                    FilterMathExpression = FilterMathExpression.substring(0, FilterMathExpression.length() - 1);
                } else {
                    break;
                }
            } else {
                return Errors[0];
            }
        }
        return FilterMathExpression;
    }

    public static String Filter_4(String MathExpression) {
        // Filter 4: Being without operation

        if (!MathExpression.contains(AllOperations[0]) && !MathExpression.contains(AllOperations[1]) && !MathExpression.contains(AllOperations[2]) && !MathExpression.contains(AllOperations[3])) {
            return Errors[1];
        } else {
            return MathExpression;
        }
    }

    public static String Filter_5(String MathExpression) {
        // Filter 5: Delete two operations in a row and Separate negative numbers
        int IndexFrom = 0;
        int IndexOf = 0;
        String CharAt_1 = "";
        String CharAt_2 = "";
        String FilterMathExpression = MathExpression;
        for (int i = 0; i < 4; i++) {
            IndexFrom = 0;
            while (IndexFrom < FilterMathExpression.length()) {
                IndexOf = FilterMathExpression.indexOf(AllOperations[i], IndexFrom) + 1;
                CharAt_1 = String.valueOf(FilterMathExpression.charAt(IndexOf));
                if (FilterMathExpression.length() > (IndexOf + 1)) {
                    CharAt_2 = String.valueOf(FilterMathExpression.charAt(IndexOf + 1));
                }
                if (CharAt_1.equals(AllOperations[0]) || CharAt_1.equals(AllOperations[2]) || CharAt_1.equals(AllOperations[3])) {
                    FilterMathExpression = FilterMathExpression.substring(0, IndexOf) + FilterMathExpression.substring(IndexOf + 1, FilterMathExpression.length());
                    IndexFrom = IndexOf - 1;
                } else if (FilterMathExpression.length() > 1 && CharAt_1.equals(AllOperations[1])) {
                    if (CharAt_2.equals(AllOperations[0]) || CharAt_2.equals(AllOperations[1]) || CharAt_2.equals(AllOperations[2]) || CharAt_2.equals(AllOperations[3])) {
                        FilterMathExpression = FilterMathExpression.substring(0, IndexOf) + FilterMathExpression.substring(IndexOf + 1, FilterMathExpression.length());
                    } else {
                        FilterMathExpression = FilterMathExpression.substring(0, IndexOf) + "#" + FilterMathExpression.substring(IndexOf + 1, FilterMathExpression.length());
                    }
                    IndexFrom = IndexOf - 1;
                } else {
                    IndexFrom++;
                }
            }
        }
        return FilterMathExpression;
    }

    public static void Number_of_Operations(String MathExpression) {
        int IndexFrom = 0;
        int Number_of_Operations = 0;
        for (int i = 0; i < 4; i++) {
            IndexFrom = 0;
            while (true) {
                if (MathExpression.indexOf(AllOperations[i], IndexFrom) != -1) {
                    Number_of_Operations++;
                    IndexFrom = MathExpression.indexOf(AllOperations[i], IndexFrom) + 1;
                } else {
                    break;
                }
            }
        }
        Operations = new String[Number_of_Operations];
        Numbers = new double[Number_of_Operations + 1];
    }

    public static void Separator(String MathExpression) {
        // Separation of operations and numbers

        int Index = 0;
        String TemporaryCharacter = "";
        String TemporaryNumber = "";
        for (int i = 0; i < MathExpression.length(); i++) {
            TemporaryCharacter = String.valueOf(MathExpression.charAt(i));
            switch (TemporaryCharacter) {
                case "+":
                    Operations[Index] = AllOperations[0];
                    TemporaryNumber = MathExpression.substring(0, i);
                    if (String.valueOf(TemporaryNumber.charAt(0)).equals("#")) {
                        Numbers[Index] = Double.parseDouble(MathExpression.substring(1, i)) * -1;
                    } else {
                        Numbers[Index] = Double.parseDouble(MathExpression.substring(0, i));
                    }
                    MathExpression = MathExpression.substring(i + 1);
                    Index++;
                    i = -1;
                    break;
                case "-":
                    Operations[Index] = AllOperations[1];
                    TemporaryNumber = MathExpression.substring(0, i);
                    if (String.valueOf(TemporaryNumber.charAt(0)).equals("#")) {
                        Numbers[Index] = Double.parseDouble(MathExpression.substring(1, i)) * -1;
                    } else {
                        Numbers[Index] = Double.parseDouble(MathExpression.substring(0, i));
                    }
                    MathExpression = MathExpression.substring(i + 1);
                    Index++;
                    i = -1;
                    break;
                case "*":
                    Operations[Index] = AllOperations[2];
                    TemporaryNumber = MathExpression.substring(0, i);
                    if (String.valueOf(TemporaryNumber.charAt(0)).equals("#")) {
                        Numbers[Index] = Double.parseDouble(MathExpression.substring(1, i)) * -1;
                    } else {
                        Numbers[Index] = Double.parseDouble(MathExpression.substring(0, i));
                    }
                    MathExpression = MathExpression.substring(i + 1);
                    Index++;
                    i = -1;
                    break;
                case "/":
                    Operations[Index] = AllOperations[3];
                    TemporaryNumber = MathExpression.substring(0, i);
                    if (String.valueOf(TemporaryNumber.charAt(0)).equals("#")) {
                        Numbers[Index] = Double.parseDouble(MathExpression.substring(1, i)) * -1;
                    } else {
                        Numbers[Index] = Double.parseDouble(MathExpression.substring(0, i));
                    }
                    MathExpression = MathExpression.substring(i + 1);
                    Index++;
                    i = -1;
                    break;
            }
        }
        if (String.valueOf(MathExpression.charAt(0)).equals("#")) {
            Numbers[Index] = Double.parseDouble(MathExpression.substring(1)) * -1;
        } else {
            Numbers[Index] = Double.parseDouble(MathExpression);
        }
    }

    public static String Show_MathExpression() {
        MathExpression_Display = Numbers[0] + "";
        for (int i = 0; i < Operations.length; i++) {
            String TemporaryOperation = Operations[i];

            switch (TemporaryOperation) {
                case "+":
                    MathExpression_Display += " + " + Numbers[i + 1];
                    break;

                case "-":
                    MathExpression_Display += " - " + Numbers[i + 1];
                    break;

                case "*":
                    MathExpression_Display += " × " + Numbers[i + 1];
                    break;

                case "/":
                    MathExpression_Display += " ÷ " + Numbers[i + 1];
                    break;
            }
        }
        return MathExpression_Display + " = ";
    }

    public static Double Calculation(String MathExpression) {
        String TemporaryOperation;
        int j = 0;
        while (j < Operations.length) {
            TemporaryOperation = Operations[j];
            if (TemporaryOperation.equals(AllOperations[2])) {
                Numbers[j] *= Numbers[j + 1];
                DeleteElement_Double(Numbers, j + 1);
                DeleteElement_String(Operations, j);
            } else if (TemporaryOperation.equals(AllOperations[3])) {
                Numbers[j] /= Numbers[j + 1];
                DeleteElement_Double(Numbers, j + 1);
                DeleteElement_String(Operations, j);
            } else {
                j++;
            }
        }

        Equal = Numbers[0];
        for (int i = 0; i < Operations.length; i++) {
            TemporaryOperation = Operations[i];

            if (TemporaryOperation.equals(AllOperations[0])) {
                Equal += Numbers[i + 1];
            } else if (TemporaryOperation.equals(AllOperations[1])) {
                Equal -= Numbers[i + 1];
            }
        }
        return Equal;
    }

    private String Digits_Separator(String number, boolean separator) {
//        if (separator){
////            double num = Double.parseDouble(number);
////            return new DecimalFormat("###,###,###,###,###").format(num);
//
//            try {
//                DecimalFormat decimalFormat = new DecimalFormat();
//                DecimalFormatSymbols decimalFormatSymbol = new DecimalFormatSymbols();
//                decimalFormatSymbol.setGroupingSeparator(',');
//                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbol);
//                return decimalFormat.format(number);
//            } catch (Exception ex) {
//                return String.valueOf(number);
//            }
//
//        }else {
//            return String.valueOf(number);
//        }
        return number;
    }
}
