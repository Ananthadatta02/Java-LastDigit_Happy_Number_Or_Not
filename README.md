# Last Digit Happy Number Checker

This Java program determines whether the **last digit** of a given number is a **Happy Number** or an **Unhappy Number**.

## 📌 What is a Happy Number?

A **Happy Number** is a number which eventually reaches 1 when replaced by the **sum of the square of each digit** repeatedly.
If it falls into a cycle which does **not** include 1, it is called an **Unhappy Number**.

### Example:
- **Happy Number**: 7 → 7² = 49 → 4² + 9² = 97 → 9² + 7² = 130 → 1² + 3² + 0² = 10 → 1² + 0² = 1 ✅
- **Unhappy Number**: 4 → 4² = 16 → 1² + 6² = 1 + 36 = 37 → 3² + 7² = 9 + 49 = 58 → ... → loops back to 4 ❌

## 💻 Program Objective

Instead of checking the whole number, this program checks only the **last digit** of the entered number and determines whether that digit is happy or not.

## 🧠 How It Works

1. Takes an integer input from the user.
2. Extracts the last digit using `num % 10`.
3. Calls the `sum(int num)` method to compute the sum of the squares of the digits.
4. Repeats this process until the result is either:
   - **1** → prints "Happy Number"
   - **4** → prints "Un-Happy Number"

## 🧾 Code Explanation

```
package test_02_04_25;

import java.util.Scanner;

public class LastDigit_HappyNumber 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = s.nextInt();       // Input from user
        int ld = num % 10;           // Extract last digit

        while(ld > 0)
        {
            int value = sum(ld);     // Get square sum of digit(s)
            if(value < 9)
            {
                if(value == 1)
                {
                    System.out.println("Happy Number");
                    break;
                }
                else if(value == 4)
                {
                    System.out.println("Un-Happy Number");
                    break;
                }
            }
            else
            {
                ld = value;          // Continue checking until value is < 9
            }
        }
    }

    // Method to calculate sum of squares of digits
    public static int sum(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            int ld = num % 10;
            sum += ld * ld;
            num /= 10;
        }
        return sum;
    }
}
```

## 📘 Sample Input/Output

```
Enter the Number
49
Happy Number

Enter the Number
94
Un-Happy Number
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-LastDigit_Happy_Number_Or_Not.git
```
