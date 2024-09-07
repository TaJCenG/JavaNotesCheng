package OOPSDay14;

public class RelationShip {
	
	/*
	 *  As part of application development we have to use few entities(class) per our application requirement
	 *  
	 *  By promoting relationship we can achieve
	 *  a. optimisation over our code (less lines of code)
	 *  b. code reusability
	 *  c. Execution time
	 *  d. shareability
	 * 
	 * Two types of relationships exists in java
	 *  a. IS-A (achieved through extends keyword)
	 *  b. HAS-A 
	 * 
	 * Difference IS-A        &     HAS-A 
	 *  a. It is able to define inheritance b/w 2-entity classes
	 *  a. It also promotes code reusability in java application
	 *  
	 *  b. It will define associations b/w 2 entities in java application
	 *  b. Through association b/w entities it will improve communication b/w 2 entities and data navigation
	 *      b/w 2 entities
	 * 
	 * Association in java in java we have 4 types of
	 * 1 to 1,   1 to many,   many to one,   many to many
	 * 
	 * To achieve association b/w entities we have to declare either single reference or array reference variable
	 * of an entity in another entity class
	 * 
	 * Ex:- class Entity{ int age;  int no;}
	 * 
	 * Key points of ASSOCIATION
	 * --------------------------
	 *   Dependency Injection
	 *      a. The process of injecting the dependent object into target object 
	 *   Target Object
	 *      a. The object which is been given to the developers for usage is 
	 *   Dependent Object
	 *      a. The object which is an helper for the target object 
	 *      
	 *     EX:- class Entity{} dependent object
	 *          class Student{} target object
	 * 
	 * How to perform dependency injection
	 * 2 ways
	 * a. constructor injection
	 * b. setter injection
	 * 
	 * when to use 
	 * Constructor :- If the dependent object is ready at the time of target object creation then perform
	 * Setter :- If the dependant object is not ready at the time of target creation then perform
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
