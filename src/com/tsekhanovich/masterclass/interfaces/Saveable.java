package com.tsekhanovich.masterclass.interfaces;

import java.util.List;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public interface Saveable {

    void read(List<String> savedValues);

    List<String> write();
}
