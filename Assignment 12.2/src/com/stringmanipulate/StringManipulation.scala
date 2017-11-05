//Given a list of strings - List[String] ("alpha", "gamma", "omega", "zeta", "beta")
//- find count of all strings with length 4
//- convert the list of string to a list of integers, where each string is mapped to its corresponding length
//- find count of all strings which contain alphabet ‘m’
//- find the count of all strings which start with the alphabet ‘a’

package com.stringmanipulate

object StringManipulation {

  def main(args: Array[String]): Unit = {
    var listString = List("alpha", "gamma", "omega", "zeta", "beta");
    print(listString);
    var listString4 = listString.filter(p => p.length() == 4)
    println();
    print("count of all strings with length 4:\t" + listString4.length);
    println();
    var listInt = listString.map(c => c.length)
    print("list of integers, where each string is mapped to its corresponding length:\t" + listInt);
    println();
    var listStringContainsM = listString.filter(p => p.contains("m") == true)
    print("count of all strings which contain alphabet ‘m’:\t" + listStringContainsM.length);
    println();
    var listStringStartWithA = listString.filter(p => p.startsWith("a") == true)
    print("count of all strings which start with the alphabet ‘a’:\t" + listStringStartWithA.length);

  }
}