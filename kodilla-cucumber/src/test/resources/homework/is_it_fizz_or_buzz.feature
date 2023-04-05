Feature:  Is it Fizz or Buzz?

  Scenario Outline: The number is divisible by 3 or 5 or 3 and 5
    Given The number is <number>
    When  I ask whether it's Fizz or Buzz
    Then  Answer is <answer>
    Examples:
      | number | answer     |
      | 1      | "None"     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 24     | "Fizz"     |
      | 35     | "Buzz"     |
      | 61     | "None"     |
      | 120    | "FizzBuzz" |