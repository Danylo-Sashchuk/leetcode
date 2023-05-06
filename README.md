CheatList of used algorithms and data structures

## Stack

1) [Valid parentheses](https://leetcode.com/problems/valid-parentheses/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/d644e0491871f8b1782f2bf9ca9dcff345b8155d/src/ValidParentheses.java)
. Push opening, pop when ecounter closing & compare.

## Linked List
1) [Merge two sorted linked lists](https://leetcode.com/problems/merge-two-sorted-lists/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/43f02e3862063e3fcb0b34203e0de02fc14cb2ec/src/linkedlist/ListNode.java)
. Compare, then link.
2) [Add two numbers represented as nodes](https://leetcode.com/problems/add-two-numbers/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/571af55fc4c98c2ddd0b96f27251388214d7a778/src/linkedlist/AddTwoNumbersUsingNodes.java)
. Sum to the end, then sum what's left, watch out for overflow.  
## HashMap
1) [Valid anagram](https://leetcode.com/problems/valid-anagram/submissions/945234877/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/044578f20a2eb7b770e3d71dd38d90f7b9af170f/src/hashmap/ValidAnagram.java)
First string do <Character, numberOfMeetings>, then subtract chars from second string.
2) [Two sum](https://leetcode.com/problems/two-sum/description/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/c7440c269bd4795215a9e2c467456f783bb68eb0/src/hashset/TwoSum.java)
Compare residue with keys.
3) [Group anagrams](https://leetcode.com/problems/group-anagrams/submissions/945263799/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/24768a098f6ff46c53ad6c90b6e9dabb14db8511/src/hashset/GroupAnagrams.java)
Create a key from characters array and put same ones there.
4) [Top K frequent elements](https://leetcode.com/problems/top-k-frequent-elements/description/) - [{?}]() Create frequency table, reverse it through an array of the max length, do reverse traversal.
## Arrays
1) [Merge two sorted arrays](https://leetcode.com/problems/merge-sorted-array/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/364d9f5ecb0acd9195ea2cc41eccc13e5343150f/src/arrays/MergeSortedArray.java)
Make a pointer for each array and traverse through them
## HashSet
1) [Contains duplicate](https://leetcode.com/problems/contains-duplicate/description) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/af65bc8cfe6f118533f3fe23e4718fcd1ca1d342/src/arrays/ContainsDuplicate.java)
Put in set & compare.

## StreamAPI
1) [Top K frequent elements](https://leetcode.com/problems/top-k-frequent-elements/description/) - [{?}]() map.entrySet().stream().sorted(getValue).map(getMap). 