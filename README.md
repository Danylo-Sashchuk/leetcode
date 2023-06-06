CheatList of used algorithms and data structures

## Two Pointers/Sliding window
1) [Product of array except himself](https://leetcode.com/problems/product-of-array-except-self/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/b4ff7a44fd63d3e622dbb93abd1f6687bccafcfe/src/arrays/ProductOfArrayExceptSelf.java) Create two arrays of prefix and postfix products then multiply neighbors
2) [Longest consecutive sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/e48d0a89d38ceb9ba5ccb743205f718c3a702a80/src/arrays/LongestConsecutiveSequence.java) Take an element and find bigger, then smaller, simultaneously increment counter and delete elements that were counted
3) [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/81e67da0d9b96795f6f125fe25ef41e511b7a727/src/arrays/validPalindrome.java) first++ & last-- until correct element found then compare head and tail
4) [Two sum II - input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/c479d8fda0bffd240a950b6b0a197fd39b88359a/src/arrays/TwoSumInputArrayIsSorted.java) sum head and tail. If it is more than target - decrease head; if less - increase head until you find 
5) [3Sum](https://leetcode.com/problems/3sum/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/5b6d12e3837dd5869e072ca48f945aea36413150/src/arrays/SumOfThree.java) first pointer untouchable, move only second and third. if [first]+[second]+[third] < target - increase second; if sum > target - decrease third pointer. If second = third, increase first pointer. 
6) [Longest palindromic substring](https://leetcode.com/problems/longest-palindromic-substring/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/177fb49396ce853e9e1162cca64c4d37a8dcac46/src/arrays/LongestSubstringWithoutRepeatingCharacters.java) move the window until found element in set - move left pointer
## Stack
1) [Valid parentheses](https://leetcode.com/problems/valid-parentheses/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/d644e0491871f8b1782f2bf9ca9dcff345b8155d/src/ValidParentheses.java)
. Push opening, pop when encounter closing & compare.
2) [Largest Number At Least Twice of Others](https://leetcode.com/problems/largest-number-at-least-twice-of-others/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/2446d4195dc339b68bf8c4a0de136ffe6349466f/src/arrays/LargestNumberAtLeastTwiceofOthers.java) Create a Priority Queue with custom comparator. If there are more then 3 elements - poll().  

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
4) [Top K frequent elements](https://leetcode.com/problems/top-k-frequent-elements/description/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/ec9d3011b70efb103b3a6591aa62ef17c393b268/src/arrays/TopKFrequentElements.java) Create frequency table, reverse it through an array of the max length, do reverse traversal
5) [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/8ac234804efb360fe97b4ec6496c971c92c68178/src/SortCharactersByFrequency.java) Create frequency table, add Map.Entry to the priorityQueue
## Arrays
1) [Merge two sorted arrays](https://leetcode.com/problems/merge-sorted-array/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/364d9f5ecb0acd9195ea2cc41eccc13e5343150f/src/arrays/MergeSortedArray.java)
Make a pointer for each array and traverse through them
## HashSet
1) [Contains duplicate](https://leetcode.com/problems/contains-duplicate/description) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/af65bc8cfe6f118533f3fe23e4718fcd1ca1d342/src/arrays/ContainsDuplicate.java)
Put in set & compare.

## StreamAPI
1) [Top K frequent elements](https://leetcode.com/problems/top-k-frequent-elements/description/) - [{?}](https://github.com/Danylo-Sashchuk/leetcode/blob/ec9d3011b70efb103b3a6591aa62ef17c393b268/src/arrays/TopKFrequentElements.java) map.entrySet().stream().sorted(getValue).map(getMap). 