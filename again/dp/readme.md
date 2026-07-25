# DP Definition #

*** 
Dynamic Programming is a technique in computer programming that helps to efficiently
solve a class of problems that have overlapping subproblems and optimal substructure
property.
***

*** note :- we have not code for the fibonacci of memoization and tabulation ***

# what does mean of the memoization ? => it means that you use reccursion and an array 

# what does mean of the tabulation ? => it means that you use iteration and an array (where indexes serves a purpose or a meaning).

***
# how to solve problem with dp ?

 to solve a problem with dp you need to make sure that problem has already calculated problems calculated again also it has some overlapping problems to solve it.

 also make sure to find the purpose if you use tabulation (usually we find purpose as an index (what index represents in an array))

***

***
# memoization vs tabulation 

memoization means you stored and calculation happens by reccursion tree but you do not perform calculation again which are stored

tabulation means you find purpose of indexes and claculation and storing of an element happens inside an array 

example :- if (dp[n] != 0) {return dp[n]};     // memoization :- storing - calculation done by reccursion

example :- dp[n] = dp[n - 1] + dp[n - 2];  // tabulation :- calculation + storing 

***

***
# if iterative is easy approach then why do not we use it for every solution instead of reccursion ?

Answer is simple we need to use reccursion when we work with linked lists , graphs , relations and all so that's where we need to apply them clearly and code needed to solve the problem.

***