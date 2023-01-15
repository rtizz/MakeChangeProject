# MakeChangeProject

# Description

The overall purpose of this program is to provide exact change of two numbers(price and tendered amount) using dollar and cent denominations <= 20 dollars (20, 10, 5, 1, qtr, dime, nickel, penny).

# Instructions:
Follow the prompts on the screen.
1. Enter the value of your item
2. Enter the amount to be tendered.
3. See below for expected outcomes

EXPECTED OUTCOMES:
1. Tendered > Amount: Change message with denomination breakdown. 
2. Tendered < Amount: Error message.
3. Tendered + Amount: Perfect Change Message.


# Code breakdown:
Line
8 Declaring scanner 
12-20 Declaring variables for price and tender amount with prompts and scan.nextDouble to assign.
24-29 Reassining original values to individual whole numbers and declaring and assigning new variables for methods.
33-37 If statement for Expected outcomes above.
40-55 Change statement + calling dollar and change method to execute. (If statement added as more of an aesthetic touch. Doesnt affect calculation)

60-102 Method for breaking down dollars.
Broken down by individual denominations. Each given its respective variable and calling in "dollars" for its calculations. 

105-148 Method for breaking down cents.
Same concept as dollars except bulling in "cents"


# Technologies used

1. Java

2. Eclipse

# Lessons Learned
1. GET OUT OF MY HEAD. I spent way too much trying to use nested if statements (first commit) which worked at first but as it got bigger is was extremely hard to keep track. 
2. Took some trial and error and an assist from the TAs but separating the dollars and cents and turning them to whole numbers first helps a lot.
3. If "Hint: Mod Operator" is given, I shouldnt waste time with && / || if statements. Its provided for a reason. I wasted friday night and saturday morning. (I guess not wasted if I learned something).
4. Wait to add all the bells and whistles AFTER is it 100% functional. I got carried away worrying about things that had nothing to do with the primary problem. 



