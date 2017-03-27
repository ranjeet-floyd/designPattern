package com.futurefry.designPattern.iterator;

import java.util.Iterator;

/**
 *
 * @author ranjeet
 */
public interface Menu {

    Iterator<MenuItem> createIterator();

}
