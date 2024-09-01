package _14_OOP._14_Constanta;

public class NumberMain {
}
// inheritance

// 1. Grandfather -> Dad

// 2. Grandfather -> Dad -> Son -> Grandson

// 3.           Chocolate
//     Twix      Rafaello       Bounty


// relationships
// 1. is a  ---> inheritance
//               merc [is a ] car
// 2. has a ---> merc [has a]  engine
//               1. Aggregation (engine)
//               2. Composition (merc[engine])

// interface,
// interface -> Printable
// class     -> Book
// class Book implements interface

// Book harryP = new Book();
// Printable akKeme = new Book();
// akKeme

// [is a] - class extends class
// HarryPotter [is a] book
// tulip       [is a] flower
// Bishkek     [is a ] city

// [is a] - class implements interface
// HarryPotter [is a] Printable
// Tulip       [is a] Blooming
// Bishkek     [is a] Developing

// Person                -> Doctor                -> Dentist
// Person = new Person
// Person = new Doctor
// Person = new Dentist

//    // class                = new classConstructor()
//    ArrayList<String> list1 = new ArrayList<>(); -> class -> constructor
//
//    // interface       = new classConstructor()
//    List<String> list2 = new ArrayList<>();      -> interface -> constructor
//
//    //Set<String> set1 = new ArrayList<>();      -> IMPOSSIBLE -> no connection with Set & ArrayList
//
//    Collection<String> col1 = new ArrayList<>(); -> interface -> constructor (global connection)
//    Collection<String> col2 = new HashSet<>();   -> interface -> constructor (global connection)
//
//    Object o1 = new StringBuilder();             -> supperClass -> constructor of SubClass
//    Object o2 = new TreeMap<>();                 -> supperClass -> constructor of SubClass
//
//    String str = new String("Hello");            -> class -> constructor
//    Object o3 = new String("Hello");             -> supperClass -> constructor of SubClass







