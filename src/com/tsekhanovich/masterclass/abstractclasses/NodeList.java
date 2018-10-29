package com.tsekhanovich.masterclass.abstractclasses;

/**
 * @author Pavel Tsekhanovich 29.10.2018
 */

public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);
}
