# Real FizzBuzz 

[![Coverage Status](https://coveralls.io/repos/github/cokleisli/equal-experts/badge.svg?branch=master)](https://coveralls.io/github/cokleisli/equal-experts?branch=master)

This is the programming test that is set by Equal Experts to screen
candidates who are Scala developers. If you feel/think that Equal
Experts are a reputable/good company to work for then take a look at the
solution. 

## Technical description: 
 
### Step 1: 
Write some code that prints out the following for a contiguous range of numbers: 
* the number 
* 'fizz' for numbers that are multiples of 3 
* 'buzz' for numbers that are multiples of 5 
* 'fizzbuzz' for numbers that are multiples of 15 
 
e.g. if I run the program over a range from 1-20 I should get the
following output

 
1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz 
 
Archive this as a separate zip file then continue on to step two. 
 
### Step 2: 
Enhance your existing FizzBuzz solution to perform the following: 
 
* If the number contains a three you must output the text
  'lucky'. This overrides any existing behaviour e.g. if I run the
  program over a range from 1-20 I should get the following output

 
1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz 
 
Archive this as a separate zip file then continue on to step three 
 
### Step 3: 
Enhance your existing solution to perform the following: 
 
* Produce a report at the end of the program showing how many times
  the following were output 
  
** fizz 
** buzz 
** fizzbuzz 
** lucky 
** an integer 
 
e.g. if I run the program over a range from 1-20 I should get the following output 
 
1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz 

fizz: 4 
buzz: 3 
fizzbuzz: 1 
lucky: 2 
integer: 10
 
(Integer is 10 because there were 10 numbers that were not altered in any way). 
 
## Guidelines for offline code tests: 
 
You should not find this test to be particularly difficult. It is
designed to be a straightforward coding exercise, and it should take
you no more than 90 minutes. 

 
Things Equal Experts are looking for: 
 
One of our key technical values is: 
 
We value straightforward software that is easy to reason about,
refactor and test over the tersest possible code. 

While in general we agree that less lines of code is good, i.e. easier
to maintain and understand, we have seen examples where developers go
too far in the other direction. Creating extremely terse programmes
that have a very low line count, but are incredibly difficult to
decipher. We want less code, but not at the cost of clarity.

 
Note that simple does not mean shoddy, poor, or low quality. Our
developers often find that “simple” takes more effort, planning, and
skill than “complicated” does. 

 
Self-explanatory code: The solution you produce must speak for
itself. Multiple paragraphs explaining the solution are a sign that it
isn’t straightforward enough to understand purely by reading code, and
are not appropriate. 

 
Test Coverage: The solution should be developed “test-first”, and
should have excellent unit test coverage. 

