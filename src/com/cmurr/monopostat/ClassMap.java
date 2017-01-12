package com.cmurr.monopostat;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A way to store various objects and retrieve them in sets
 * according to what classes they're instances of.
 */
@SuppressWarnings("unchecked")
public class ClassMap {
	
	// for some reason, parameterizing this Set type
	// reference causes a syntax error with add
	@SuppressWarnings("rawtypes")
	private Map<Class<?>, Set> instances;
	
	public ClassMap() {
		instances = new HashMap<>();
	}
	
	public ClassMap(Iterable<?> coll) {
		this();
		for (Object obj : coll) {
			add(obj);
		}
	}
	
	private void internalAdd(Object obj, Class<?> clazz) {
		if (clazz == null) {
			return;
		}
		if (!instances.containsKey(clazz)) {
			instances.put(clazz, new HashSet<>());
		}
		instances.get(clazz).add(obj);
		internalAdd(obj, clazz.getSuperclass());
		for (Class<?> iclazz : clazz.getInterfaces()) {
			internalAdd(obj, iclazz);
		}
	}
	
	public void add(Object obj) {
		if (getOf(Object.class).contains(obj)) {
			return;
		}
		internalAdd(obj, obj.getClass());
	}
	
	private void internalRemove(Object obj, Class<?> clazz) {
		if (clazz == null) {
			return;
		}
		instances.get(clazz).remove(obj);
		internalRemove(obj, clazz.getSuperclass());
		for (Class<?> iclazz : clazz.getInterfaces()) {
			internalRemove(obj, iclazz);
		}
	}
	
	public void remove(Object obj) {
		if (!getOf(Object.class).contains(obj)) {
			return;
		}
		internalRemove(obj, obj.getClass());
	}
	
	public <T> Set<T> getOf(Class<T> clazz) {
		if (!instances.containsKey(clazz)) {
			return (Set<T>) Collections.EMPTY_SET;
		}
		return Collections.unmodifiableSet((Set<T>) instances.get(clazz));
	}
}
