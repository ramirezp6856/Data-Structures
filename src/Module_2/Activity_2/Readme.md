# Activity #2 

## You are about to design a voting application to select the next president. Every vote is represented as key-value pair (gender, key) in which gender represents the gender of the voter (male|female) and the key represents the code for presidential candidates. There are total of 5 candidates running for this election. 

### Suppose the information about the candidates is in a text file for 10 voters as follows:
    female, 2
    female, 2
    male , 3
    male , 5
    female, 2
    male , 5
    female , 5
    male, 2
    male, 4
    female, 5

### Also, there is another file that contains the name and code of candidates as follows:
    John Wayne , 1
    Sam Paul , 2
    Nina Thompson, 3
    Tatiana Shawn, 4
    Andrews Nelson, 5

### VotingApplication.java
    The method “getWinner” in this class determines who is the winner of the election in O(n) time. Provide documentation for your code and explain what algorithm you used. You must use the topics in Lecture02 for this exercise.

### What is provided to you and what you should implement:
#### You only need to complete the following method in VotingApplication.java:
    public static Candidate getWinner(Candidate[] candids, Voter[] voters). 

