/*
118. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) l.add(1);
                else l.add( list.get(i-1).get(j-1) + list.get(i-1).get(j) );
            }
            list.add(l);
        }

        return list;
    }
}