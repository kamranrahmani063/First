class FSEIA {
    public static void main(String[] args)
    {
  
        // Either we can initialize array elements or can
        // get input from user. Always it is best to get
        // input from user and form the array
        int[] initializedArray = new int[] { 25, 110, 74, 75, 5 };
  
        System.out.println("Given array ");
  
        for (int i = 0; i < initializedArray.length; i++) {
  
            System.out.println(initializedArray[i]);
        }
  
        // Initialize minValue with first element of array.
        int minValue = initializedArray[0];
  
        // Loop through the array
        for (int i = 0; i < initializedArray.length; i++) {
  
            // Compare elements of array with minValue and
            // if condition true, make minValue to that
            // element
  
            if (initializedArray[i] < minValue)
  
                minValue = initializedArray[i];
        }
  
        System.out.println(
            "Smallest element present in given array: "
            + minValue);
    }
}
