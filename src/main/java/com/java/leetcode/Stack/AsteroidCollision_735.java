package com.java.leetcode.Stack;
/*
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.



Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.

 */
import java.util.Stack;

public class AsteroidCollision_735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid)) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}

/**
 * The asteroidCollision method takes an integer array asteroids as input and returns an array representing the state of the asteroids after all collisions.
 *
 * Create a stack, stack, to store the positive asteroids. The stack will only contain positive asteroids since they move in the same direction and will never collide.
 *
 * Iterate through each asteroid in the asteroids array.
 *
 * If the current asteroid is positive (asteroid > 0), push it onto the stack.
 *
 * If the current asteroid is negative (asteroid < 0), handle the collision scenarios:
 *
 * While the stack is not empty, the top asteroid on the stack is positive, and its size is smaller than the absolute value of the current asteroid, pop the top asteroid from the stack since it will be destroyed.
 *
 * If the top asteroid on the stack has the same size as the absolute value of the current asteroid, both asteroids will be destroyed, so pop the top asteroid from the stack.
 *
 * If the stack is empty or the top asteroid on the stack is negative (stack.peek() < 0), push the current asteroid onto the stack since it will not collide with any positive asteroids.
 *
 * After processing all asteroids, create an array, result, with the size of the stack.
 *
 * Iterate over the stack in reverse order and pop each asteroid, storing it in the result array.
 *
 * Return the result array representing the state of the remaining asteroids after collisions.
 */
