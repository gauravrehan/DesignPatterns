package com.home.designpatterns.pluralsignt.singleton;

/*
 * Gurantees single istance
 * lazily loaded
 * examples:
 * System.Runtime
 * Logger
 * Spring Beans by default are singleton
 * Graphics Manager
 * 
 * 
 * Static in nature but not necessary implemented as static class (thread safety an issue) Why?
 * private instance
 * private constructor
 * no parameters required - if required then it become factory patterns an no more a singleton pattern
 * 
 * differences with factory
 * singletons are not interface driven where as factory is interface driven.
 * singletons are always going to return same instance where as factory does not (mostly)
 * singletons have a single private construtor but factory may have many.
 */
public class DBSingleton {

	private static DBSingleton instance = null;

	private DBSingleton() {
	}

	public static DBSingleton getInstance() {
		if (instance == null) {
			synchronized (DBSingleton.class) {
				if (instance == null) {
					instance = new DBSingleton();
				}
			}
		}

		return instance;
	}
}
