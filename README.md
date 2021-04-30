# Property-based Testing

Using the framework jqwik, I wrote a few tests here
1. Validate with randomly generated integers that the sum of two integers is correct
2. Validate with randomly generated boundaries that the sum of all prime numbers in between that range are correct
3. And Validate that there is a bug (purposely introduced) using the same test as point 2

## To run the tests
```gradle clean test --info```