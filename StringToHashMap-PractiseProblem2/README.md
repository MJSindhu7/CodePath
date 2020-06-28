# 1 - Main.java

Write a program which takes as its input a String of natural language text and outputs a HashMap<String,Integer> whose keys are the unique words in the input and whose values are the number of times those words occur. The algorithm should be case-insensitive (e.g. "Program" and "program" would count as the same word) and ignore punctuation and whitespace.

Example: Given the input "To be or not to be, that is the question", the outputted HashMap would contain 8 entries, with two words having a count of 2 and six words having a count of 1:


"to"        → 2
"be"        → 2
"or"        → 1
"not"       → 1
"that"      → 1
"is"        → 1
"the"       → 1
"question"  → 1

# 2 - Main2.java

Question 3 - Multimaps
One common pattern when using hash tables requires building a Map whose values are Collection instances. In this challenge, we'll take the output of the previous challenge and invert it.

Write a program that takes as its input a HashMap<String,Integer> and returns a HashMap<Integer,HashSet<String>> containing the same data as the input map, only inverted, such that the input map's values are the output map's keys and the input map's keys are the output map's values.

Example: Consider the example output for Challenge #1. Using that map as the input, the output for this challenge would be:

2 → ["to", "be"]
1 → ["or", "not", "that", "is", "the", "question"]