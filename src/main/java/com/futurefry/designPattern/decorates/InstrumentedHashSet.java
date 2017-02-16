package com.futurefry.designPattern.decorates;

import java.util.Collection;
import java.util.HashSet;

/**
 * Broken - Inappropriate use of inheritance | Count the number of attempted
 * element insertions.
 * 
 * @author ranjeet
 *
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

	private static final long serialVersionUID = 1L;
	// the number of attempted element insertions.
	private int addCount = 0;

	public InstrumentedHashSet(){
		super();
	}
	
	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap,loadFactor);
	}
	
	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}
	
	public int getAddCount() {
		return addCount;
	}
	

}
