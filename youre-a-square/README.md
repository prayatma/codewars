# You're a square!
[*View on Codewars*](https://www.codewars.com/kata/youre-a-square)

## A square of squares
You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a _perfect square_.

## Task

Given an integral number, determine if it's a [square number](https://en.wikipedia.org/wiki/Square_number):

> In mathematics, a __square number__ or __perfect square__ is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

The tests will _always_ use some integral number, so don't worry about that in dynamic typed languages.

### Examples
```ruby
is_square (-1) # => false
is_square   3 # => false
is_square   4 # => true
is_square  25 # => true
is_square  26 # => false
```
```python
is_square (-1) # => false
is_square   3 # => false
is_square   4 # => true
is_square  25 # => true
is_square  26 # => false
```
```javascript
isSquare(-1) // => false
isSquare( 3) // => false
isSquare( 4) // => true
isSquare(25) // => true
isSquare(26) // => false
```
```typescript
isSquare(-1) // => false
isSquare( 3) // => false
isSquare( 4) // => true
isSquare(25) // => true
isSquare(26) // => false
```
```coffeescript
isSquare(-1) # => false
isSquare( 3) # => false
isSquare( 4) # => true
isSquare(25) # => true
isSquare(26) # => false
```
```haskell
isSquare (-1) `shouldBe` False
isSquare   3 `shouldBe` False
isSquare   4 `shouldBe` True
isSquare  25 `shouldBe` True
isSquare  26 `shouldBe` False
```
```java
Square.isSquare(-1) // => false
Square.isSquare( 3) // => false
Square.isSquare( 4) // => true
Square.isSquare(25) // => true
Square.isSquare(26) // => false
```
```csharp
Kata.isSquare(-1) // => false
Kata.isSquare( 3) // => false
Kata.isSquare( 4) // => true
Kata.isSquare(25) // => true
Kata.isSquare(26) // => false
```
```dart
isSquare(-1) // => false
isSquare( 3) // => false
isSquare( 4) // => true
isSquare(25) // => true
isSquare(26) // => false
```
```cpp
is_square (-1) // false
is_square (3)  // false
is_square (4)  // true
is_square (25) // true
is_square (26) // false
```

## Timeline
- Created: 2015-01-23
- Published: 2015-01-23
- Approved: 2015-01-28
- Completed: 2015-04-29