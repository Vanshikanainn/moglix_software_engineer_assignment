# Moglix Software Engineer Assignment

## Problem

Given a string containing only `'('` and `')'`, find the length of the longest valid (well-formed) parentheses substring.

### Example

**Input**
```text
s = ")()())"
```

**Output**
```text
4
```

## Constraints

- `0 <= s.length <= 3 * 10^4`

## Approaches

### Stack Based

Uses a stack to store the indices of brackets. Whenever a valid pair is found, the length of the current valid substring is calculated and the maximum length is updated.

- Time: `O(n)`
- Space: `O(n)`

### Two Traversal

Traverses the string from left to right and then from right to left while counting opening and closing brackets. The maximum valid length is updated whenever both counts become equal.

- Time: `O(n)`
- Space: `O(1)`

## Language

Java
