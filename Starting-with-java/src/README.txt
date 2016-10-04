
Author(s): Atharva S Ghaisas

PURPOSE:
Program for assigning the courses to students based on their preferences.

FILES:
Included with this project are 9 files.

Driver.java             file containing driver program for taking in input and also contains main.
CourseAllocations.java  logic for assigning subject to students and dumping the results to output file. 
Student.java		file that holds all the student related information.
Subjects.java		Interface for different subjects.
SubjectA.java		file contains logic for creating list of Students assigned to class A.
SubjectB.java		file contains logic for creating list of Students assigned to class B.
SubjectC.java		file contains logic for creating list of Students assigned to class C.
SubjectD.java           file contains logic for creating list of Students assigned to class D.
README.txt		the Text file you are presently reading.


SAMPLE OUTPUT:

Student_1 A B C 6
Student_2 A B C 6
Student_3 A B D 6
Student_4 A B C 6
Student_5 A B C 6
Student_6 A B C 6
Student_7 A B C 6
Student_8 B C D 6
Student_9 A C D 7
Student_10 A B D 6
Student_11 B C D 6
Student_12 A C D 6
Average preference score is:6.0833335

TO COMPILE:
javac *.java


TO RUN:
java Driver Input.txt Output.txt

DATA STRUCTURES USED:
ArrayList - Array list takes O(1) time for Inserting data and O(n) as a worst case for searching for the data in the list.

