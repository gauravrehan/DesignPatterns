package com.home.designpatterns.pluralsignt.prototype;

/*
 * Avoids costly creation
 * Avoids sub classing
 * Typically not uses "new"
 * Often uses an interface
 * Usually implemented with a Registry
 * Example:
 * java.lang.Object#clone()
 * 
 * Design
 * relies on Clone/Clonable
 * Although a copy, each instance is unique
 * Costly construction not handled by client
 * can still untilize parameters for construction
 * shallow or deep copy	
 * 
 * Pitfall:
 * sometimes not clear when to use
 * used with other patterns like Registry
 * Shallow Vs Deep Copy
 * 
 * Prototype vs Factory
 * Prototype: Lighter weight construction, copy constructor or clone, shallow vs deep copy, copy of itself, 
 * Factory: Flexible objects, multiple constructor, concrete instance, fresh instance,
 * 
 * 
 */
public class Prototype {

}
